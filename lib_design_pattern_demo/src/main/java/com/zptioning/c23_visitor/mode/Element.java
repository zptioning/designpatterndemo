package com.zptioning.c23_visitor.mode;

/**
 * @ClassName Element
 * @Author zptioning
 * @Date 2019/9/1 15:09
 * @Version 1.0
 * @Description 
 */
public abstract class Element {
	abstract public void Accept(Visitor visitor);
}
