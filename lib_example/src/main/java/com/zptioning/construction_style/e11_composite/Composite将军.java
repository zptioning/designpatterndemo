package com.zptioning.construction_style.e11_composite;

import java.util.ArrayList;
import java.util.List;

public class Composite将军 extends Component军人 {

    private List<Component军人> mComponent军人List = new ArrayList<>();

    public Composite将军(String name) {
        super(name);
    }

    @Override
    public void Add(Component军人 component军人) {
        mComponent军人List.add(component军人);
    }

    @Override
    public void remove(Component军人 component军人) {
        mComponent军人List.remove(component军人);
    }

    @Override
    public void Display(int level) {
        String context = "";
        for (int i = 0; i < level; i++) {
            context += "- ";
        }
        System.out.println(context + name);

        // 遍历子节点
        for (Component军人 component : mComponent军人List) {
            component.Display(level + 2);
        }
    }
}
