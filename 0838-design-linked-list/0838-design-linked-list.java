class MyLinkedList {
    private LinkedList<Integer> ls;

    public MyLinkedList() {
        ls = new LinkedList<>();
    }

    public int get(int index) {
        if (index < 0 || index >= ls.size())
            return -1;
        return ls.get(index);
    }

    public void addAtHead(int val) {
        ls.addFirst(val);
    }

    public void addAtTail(int val) {
        ls.addLast(val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > ls.size())
            return;
        ls.add(index, val);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= ls.size())
            return;
        ls.remove(index);
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