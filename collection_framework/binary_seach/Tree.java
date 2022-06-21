package collection_framework.binary_seach;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
