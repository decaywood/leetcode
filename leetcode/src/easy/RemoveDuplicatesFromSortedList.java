package easy;


import dataStructure.ListNode;

public class RemoveDuplicatesFromSortedList {

    /*
     *   Given a sorted linked list, delete all duplicates such that each element appear only once.
     *   For example,
     *   Given 1->1->2, return 1->2.
     *   Given 1->1->2->3->3, return 1->2->3.
     */
    

    
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2 != null) {
            if(p1.val == p2.val){
                if(p2.next != null){
                    p1.next = p2.next;
                    p2 = p2.next;  
                }
                else {
                    p1.next = null;
                    break;
                }
            }
            else {
                if(p2.next != null){
                    p1 = p1.next;
                    p2 = p2.next; 
                }
                else
                    break;
            }
        }
        return head;
    }
    
    public static void main(String[] args) {
        
    }
    
}
