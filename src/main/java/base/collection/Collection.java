package base.collection;

import java.util.Iterator;

public interface Collection<E> extends Iterable<E> {
    //返回集合元素数量
    int size();

    //
    boolean isEmpty();

    //
    boolean contains(Object o);

    @Override
    Iterator<E> iterator();

    Object[] toArray();

    <T> T[] toArray(T[] a);

    boolean add(E e);

    boolean remove(Object o);

    boolean containsAll(Collection<?> c);

    boolean addAll(Collection<? extends E> c);

    boolean removeAll(Collection<? extends E> c);


}
