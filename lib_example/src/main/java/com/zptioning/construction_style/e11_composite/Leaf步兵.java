package com.zptioning.construction_style.e11_composite;

public class Leaf步兵 extends Component军人 {
    public Leaf步兵(String name) {
        super(name);
    }

    @Override
    public void Add(Component军人 component军人) {

    }

    @Override
    public void remove(Component军人 component军人) {

    }

    @Override
    public void Display(int level) {
        String context = "";
        for (int i = 0; i < level; i++) {
            context += "- ";
        }
        System.out.println(context + name);
    }
}
