/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack <Integer> Stack1 = new Stack<>();
        Stack <Integer> Stack2 = new Stack<>();

        ListNode temp = l1;
        while(temp!=null){
            Stack1.push(temp.val);
            temp = temp.next;
        }
        ListNode temp2 = l2;
        while(temp2!=null){
            Stack2.push(temp2.val);
            temp2 = temp2.next;
        }
        int carry = 0;
        ListNode ans = null;
        while (!Stack1.isEmpty() || !Stack2.isEmpty() || carry !=0){
         int sum = carry;
         if(!Stack1.isEmpty()) sum+=Stack1.pop();
         if(!Stack2.isEmpty()) sum+=Stack2.pop();

         carry = sum/10;
         ListNode node = new ListNode(sum%10);
         node.next = ans;
         ans = node;
        }
        return ans;
    }
}