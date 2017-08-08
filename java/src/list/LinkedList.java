package list;

/**
 * Implementation of linked list
 */
public class LinkedList {

    private ListNode first;

    public ListNode getFirst() {
        return first;
    }

    /**
     * Add element to tail
     * @param data
     */
    public void addToTail(int data) {
        ListNode current = this.first;

        ListNode insertNode = new ListNode(data, null);

        if (current == null) {
            this.first = insertNode;
            return;
        }
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(insertNode);
    }

    /**
     * Revert linked list
     */
    public void revert() {
        if (this.first == null || this.first.getNext() == null) {
            return;
        }
        ListNode current = this.first;
        ListNode next = current.getNext();
        current.setNext(null);
        while (next != null) {
            this.first = next;
            next = next.getNext();
            this.first.setNext(current);
            current = this.first;
        }

    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        ListNode current = this.first;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        return sb.toString();
    }
}
