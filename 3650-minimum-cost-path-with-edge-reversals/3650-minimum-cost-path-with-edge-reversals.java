class Solution {
    public int minCost(int n, int[][] edges) {
        ArrayList<int[]>[] graph = new ArrayList[n];

        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        } 

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            graph[u].add(new int[]{v,w});
            graph[v].add(new int[]{u,2*w});
        }

        // { vtx, wsf }
        PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int [] b)->{
            return a[1] - b[1];
        });

        int[] dis = new int[n];
        Arrays.fill(dis, (int)(1e8));

        pq.add(new int[]{0,0});
        dis[0] = 0;

        while(pq.size() > 0){
            int[] top = pq.remove();
            int vtx = top[0];
            int wsf = top[1];

            if(dis[vtx] < wsf) continue;

            for(int[] nbrEdge: graph[vtx]){
                int nbr = nbrEdge[0];
                int wt = nbrEdge[1];

                if(dis[nbr] > wsf + wt){
                    dis[nbr] = wsf + wt;
                    pq.add(new int[]{nbr, wsf+wt});
                }
            }
        }

        return dis[n-1] == (int)(1e8) ? -1 : dis[n-1];
    }
}