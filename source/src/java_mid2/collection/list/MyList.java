package java_mid2.collection.list;

public interface MyList<E> {
    int size();

    void add(E e);

    void add(E e, int index);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    int indexOf(E o);
}
