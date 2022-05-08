package danh_sach.method_arraylist;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        for (int i = size; i > index; i--)
            elements[i] = elements[i - 1];
        elements[index] = element;
        size++;

    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }


    public E remove(int index) {
        checkIndex(index);
        E temp = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return this.size;
    }

    @Override
    public MyList clone() {
        MyList<E> clone = new MyList<E>(elements.length);
        for (E e : (E[]) elements) {
            clone.add(e);
        }
        return clone;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i]))
                return true;
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i])) return i;
        return -1;
    }

    public boolean add(E e) {

            return false;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public int lastIndexOf(E o) {
        for (int i = size - 1; i >= 0; i--) if (o.equals(elements[i])) return i;
        return -1;
    }

    public E get(int index) {
        if (index >= size|| index < 0){
            throw new IndexOutOfBoundsException("Index : " + index + ",size : " + index);
        }
        return (E) elements[index] ;
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void printMyList(){
        int i = 0 ;
        for( E e : (E[]) elements){
            System.out.println( "Element " + i +" : " + e);
            i++;
        }
    }
}
