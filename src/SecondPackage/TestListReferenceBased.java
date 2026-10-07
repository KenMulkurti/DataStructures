package SecondPackage;

public class TestListReferenceBased {

    // displays items in the list
    public static void displayList(ListReferenceBased list) {

        System.out.print("List: ");

        if (list.isEmpty()) {
            System.out.println("list is empty");
            return;
        }

        for (int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i));

            if (i < list.size()) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Creates a new list
        ListReferenceBased list = new ListReferenceBased();

        // Test isEmpty()
        System.out.println("Test isEmpty()");
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("");

        // Test size()
        System.out.println("Test size()");
        System.out.println("List size: " + list.size());
        System.out.println("");

        // Test add()
        System.out.println("Test add()");

        list.add(1, "Apple");
        list.add(2, "Banana");
        list.add(3, "Orange");

        list.displayList();
        System.out.println("List size: " + list.size());
        System.out.println("");

        // Test add() index
        System.out.println("Test add() index");

        list.add(1, "Mango");

        list.displayList();
        System.out.println("");

        // Test get()
        System.out.println("Testing get()");

        System.out.println("Item at position 1: " + list.get(1));
        System.out.println("Item at position 3: " + list.get(3));
        System.out.println("");

        // Test remove()
        System.out.println("Testing remove()");
        System.out.println("Removing item at position 3");

        list.remove(3);

        list.displayList();
        System.out.println("");

        // Test removeAll()
        System.out.println("Testing removeAll()");

        list.removeAll();

        list.displayList();
        System.out.println("");

        // Test isEmpty() after removeAll()
        System.out.println("Testing isEmpty() after removeAll()");
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("");

        // Test size() after removeAll()
        System.out.println("Testing size() after removeAll()");
        System.out.println("List size: " + list.size());
    }
}