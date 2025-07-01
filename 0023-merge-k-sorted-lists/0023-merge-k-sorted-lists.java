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
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1 != null && temp2 != null){
            if(temp1.val<=temp2.val){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
        }
        else{
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        }
        if(temp1 == null) temp.next = temp2;
        if(temp2 == null) temp.next = temp1;
        return head.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        if(lists.length==1) return lists[0];
        ListNode d1 = merge(lists[0], lists[1]);
        for(int i = 2; i<lists.length;i++){
        d1 = merge(d1,lists[i]);
      }
      return d1;
    }
}