public class MergeTwoSortedLists_21 {

    public class ListNode {

      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    /**
     You are given the heads of two sorted linked lists list1 and list2.

     Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

     Return the head of the merged linked list.

     Input: list1 = [1,2,4], list2 = [1,3,4]
     Output: [1,1,2,3,4,4]
     **/

    public ListNode mergeTwoLists(ListNode curr1, ListNode curr2) {

        ListNode tempHead = new ListNode();

        ListNode prev = tempHead;

        while ( curr1!=null && curr2!=null){

            if (curr1.val <= curr2.val){
                prev.next = curr1;
                curr1 = curr1.next;

            }else {
                prev.next = curr2;
                curr2 = curr2.next;

            }
            prev = prev.next;
        }
        if (curr1 == null) prev.next = curr2;
        else prev.next = curr1;

        return tempHead.next;

    }

}
