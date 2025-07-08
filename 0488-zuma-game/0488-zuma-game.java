class Solution {
    public int findMinStep(String board, String hand) {
        // Convert hand to a frequency map for easy access
        Map<Character, Integer> handCount = new HashMap<>();
        for (char c : hand.toCharArray()) {
            handCount.put(c, handCount.getOrDefault(c, 0) + 1);
        }
        
        // Use BFS to explore all possible states
        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        
        queue.offer(new State(board, handCount, 0));
        visited.add(board + handCount.toString());
        
        while (!queue.isEmpty()) {
            State current = queue.poll();
            String currentBoard = current.board;
            Map<Character, Integer> currentHand = current.hand;
            int steps = current.steps;
            
            // Try each position to insert each available ball
            for (int i = 0; i <= currentBoard.length(); i++) {
                for (char ball : currentHand.keySet()) {
                    if (currentHand.get(ball) <= 0) {
                        continue;  // Skip if we've used all of this color
                    }
                    
                    // Only insert if helpful: next to same color or between two same colors
                    if ((i > 0 && currentBoard.charAt(i-1) == ball) ||
                        (i < currentBoard.length() && currentBoard.charAt(i) == ball) ||
                        (i > 0 && i < currentBoard.length() && 
                         currentBoard.charAt(i-1) == currentBoard.charAt(i))) {
                        
                        // Create new board with ball inserted
                        String newBoard = currentBoard.substring(0, i) + ball + currentBoard.substring(i);
                        newBoard = removeConsecutive(newBoard);
                        
                        // If board is empty, we found a solution
                        if (newBoard.isEmpty()) {
                            return steps + 1;
                        }
                        
                        // Create new hand with one fewer ball
                        Map<Character, Integer> newHand = new HashMap<>(currentHand);
                        newHand.put(ball, newHand.get(ball) - 1);
                        
                        // Create unique state ID
                        String stateId = newBoard + newHand.toString();
                        
                        // Add to queue if not visited
                        if (!visited.contains(stateId)) {
                            visited.add(stateId);
                            queue.offer(new State(newBoard, newHand, steps + 1));
                        }
                    }
                }
            }
        }
        
        return -1;  // Cannot clear the board
    }
    
    // Helper class to represent a game state
    private class State {
        String board;
        Map<Character, Integer> hand;
        int steps;
        
        State(String board, Map<Character, Integer> hand, int steps) {
            this.board = board;
            this.hand = hand;
            this.steps = steps;
        }
    }
    
    // Helper method to remove consecutive groups of 3+ balls
    private String removeConsecutive(String board) {
        boolean removed = true;
        while (removed) {
            removed = false;
            int i = 0;
            while (i < board.length()) {
                int j = i;
                while (j < board.length() && board.charAt(j) == board.charAt(i)) {
                    j++;
                }
                
                if (j - i >= 3) {
                    board = board.substring(0, i) + board.substring(j);
                    removed = true;
                } else {
                    i = j;
                }
            }
        }
        return board;
    }
}