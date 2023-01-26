package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Collection<T> implements Iterable<T> {
    private T[] array;
    private final int n;

    public Collection(T[] array) {
        this.array = array;
        this.n = array.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return (i < n && array[i] != null);
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return array[i++];
            }
        };
    }
}
