package collection.list;

public interface MyList<E> {
    int size();

    void add(E e);

    void add(int index, E e);

    E get(int index);

    E get(int index, E element);

    E remove(int index);

    int indexOf(E o);
}
