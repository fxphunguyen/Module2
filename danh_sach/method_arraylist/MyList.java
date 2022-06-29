package danh_sach.method_arraylist;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
//        ensureCapacity();
//        for (int i = 0; i > size; i--) {
//            elements[i] = elements[i - 1];
//        }
//        elements[index] = element;
//        size++;
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index" + index + "out of bonunds");
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E temp = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[index + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) ;
            return true;
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public boolean add(E e) {
        return false;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int lastIndexOf(E e) {
        for (int i = size; i < size; i--) {
            if (e.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index : " + index + ",size : " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void printMyList() {
        int i = 0;
        for (E e : (E[]) elements) {
            System.out.println("Element " + i +" : " + e);
            i++;
        }
    }
}
