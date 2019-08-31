package com.zptioning.construction_style.e11_composite;
/**
 * @ClassName 组合模式
 * @Author zptioning
 * @Date 2019/8/31 18:04
 * @Version 1.0
 * @Description
 * 透明方式与安全方式：
 * 透明方式：树叶节点和树枝节点都派生于Component 例子就是这种方式。
 * 安全方式：Component中不去声明Add和Remove方法，在Composit中声名这两个方法。
 */
public class 组合模式 {
    public static void main(String[] args) {

        Component军人 汉中王 = new Composite将军("汉中王");

        Component军人 关羽 = new Composite将军("关羽");

        汉中王.Add(关羽);

        Component军人 jia = new Leaf步兵("步兵甲");
        Component军人 yi = new Leaf步兵("步兵乙");
        Component军人 bing = new Leaf步兵("步兵丙");
        Component军人 ding = new Leaf步兵("步兵甲");

        关羽.Add(jia);
        关羽.Add(yi);
        关羽.Add(bing);
        关羽.Add(ding);

        汉中王.Display(1);
    }
}
