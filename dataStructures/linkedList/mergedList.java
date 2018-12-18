/*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        if (head1 == null) return head2;
        if (head2 == null) return head1;

        SinglyLinkedListNode p1 = head1;
        SinglyLinkedListNode p2 = head2;

        SinglyLinkedListNode dummyHead = new SinglyLinkedListNode(0);

        if (p1.data < p2.data) dummyHead.next = p1;
        else dummyHead.next = p2;

        SinglyLinkedListNode curr = dummyHead;

        while (p1 != null && p2 != null){

            if (p1.data < p2.data){
                curr.next = p1;
                curr = curr.next;
                p1 = p1.next;

            } else {
                curr.next = p2;
                curr = curr.next;
                p2 = p2.next;
            }
        }

        if (p1 == null) {
            curr.next = p2;
        }    

        if (p2 == null) {
            curr.next = p1;
        }                                                            

        return dummyHead.next;
   }

