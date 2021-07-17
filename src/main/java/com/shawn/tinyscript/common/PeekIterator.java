package com.shawn.tinyscript.common;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class PeekIterator<T> implements Iterator<T>{





    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }

    public T peek(){
        return null;
    }

    public T peekBack(){
        return null;
    }

}
