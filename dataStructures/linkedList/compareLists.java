static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        if (head1 == null && head2 == null) return true;        

        SinglyLinkedListNode p1 = head1;
        SinglyLinkedListNode p2 = head2;

        while ((p1 != null) && (p2 != null)){

            if (p1.data != p2.data) return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        if (p1 != p2) return false;
        
        return true;
    }
