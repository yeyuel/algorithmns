package list;

public class CircleLinkedList {

    private ListNode first;

    public ListNode getFirst() {
        return first;
    }

    /**
     * Add node to circle linked list
     * @param data
     */
    public void addToTail(int data) {
        ListNode current = this.first;
        ListNode insertNode = new ListNode(data, this.first);

        if (current == null) {
            this.first = insertNode;
            this.first.setNext(this.first);
            return;
        }

        while (current.getNext() != first) {
            current = current.getNext();
        }
        current.setNext(insertNode);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        ListNode current = this.first;
        if (current != null) {
            while (current.getNext() != this.first) {
                sb.append(current.getData());
                sb.append(", ");
                current = current.getNext();
            }
            sb.append(current.getData());
        }
        return sb.toString();
    }
}
