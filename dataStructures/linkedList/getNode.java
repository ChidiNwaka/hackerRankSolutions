    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {

        // if (head == null) return 0; // Maybe throw an error.

        SinglyLinkedListNode p1 = head;
        SinglyLinkedListNode p2 = head;
        int i = 0;

        while (i++ <= positionFromTail){
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2.data;
    }

