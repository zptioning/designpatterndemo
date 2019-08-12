package com.zptioning.c07_adaptermode.adapter;

import java.util.Enumeration;
import java.util.Iterator;
/**
 * @ClassName EnumerationIterator
 * @Author ZPTION
 * @Date 2019/8/11 16:11
 * @Version 1.0
 * @Description 枚举器到迭代器的适配
 */
public class EnumerationIterator implements Iterator<Object> {

    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {

        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {

        return enumeration.nextElement();
    }

    @Override
    public void remove() {

        throw new UnsupportedOperationException();
    }

}
