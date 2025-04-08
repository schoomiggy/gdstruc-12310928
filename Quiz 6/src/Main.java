public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        System.out.println("In-order traversal:");
        tree.inOrderTraverse();

        System.out.println("\nIn-order descending traversal:");
        tree.traverseInOrderDescending();

        System.out.println("\nMinimum value: " + tree.getMin().getData());
        System.out.println("Maximum value: " + tree.getMax().getData());

        int searchValue = 10;
        System.out.println("\nNode for value " + searchValue + " = " + tree.get(searchValue));
    }
}