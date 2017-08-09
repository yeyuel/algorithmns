package list;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        LinkedList linkedList = new LinkedList();
        for (int number: array) {
            linkedList.addToTail(number);
        }
        System.out.println(linkedList.toString());

        linkedList.revert();
        System.out.println(linkedList.toString());

        CircleLinkedList circleLinkedList = new CircleLinkedList();
        for (int number: array) {
            circleLinkedList.addToTail(number);
        }
        System.out.println(circleLinkedList.toString());
    }
}
