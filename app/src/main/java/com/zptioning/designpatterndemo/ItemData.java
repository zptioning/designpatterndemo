package com.zptioning.designpatterndemo;

/**
 * @ClassName ItemData
 * @Author zptioning
 * @Date 2019/8/22 14:20
 * @Version 1.0
 * @Description 展示的名字和要跳转页面的名字
 */
public class ItemData {
    private String name;
    private String className;

    public ItemData(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
