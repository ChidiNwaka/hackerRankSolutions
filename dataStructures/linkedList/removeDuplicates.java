 /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if (head == null) return head;

        SinglyLinkedListNode curr = head;

        while (curr.next != null){
            if ( curr.data == curr.next.data) curr.next = curr.next.next;
            else curr = curr.next;
        }

        return head;
    }



