class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {

        Node curr = head;

        for (int i = 0; i < index; i++) {
            if (curr == null)
                return -1;

            curr = curr.next;
        }

        if (curr == null)
            return -1;

        return curr.val;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node curr = head;

        for (int i = 0; i < index - 1; i++) {

            if (curr == null)
                return;

            curr = curr.next;
        }

        if (curr == null)
            return;

        Node newNode = new Node(val);

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteAtIndex(int index) {

        if (head == null)
            return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node curr = head;

        for (int i = 0; i < index - 1; i++) {

            if (curr.next == null)
                return;

            curr = curr.next;
        }

        if (curr.next == null)
            return;

        curr.next = curr.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */