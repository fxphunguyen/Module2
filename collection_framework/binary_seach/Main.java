package collection_framework.binary_seach;

public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Thiện");
        tree.insert("Tài");
        tree.insert("Phú");
        tree.insert("Anh");
        tree.insert("Ánh");
        tree.insert("Chính");
        tree.insert("Căn");

        System.out.println("Inorder (sorted):");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
