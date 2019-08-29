package com.zptioning.construction_style.e3_decorator;

public class Decorator九阴真经 extends Decorator秘籍 {

    public Decorator九阴真经(Component武林 m武林高手) {
        super(m武林高手);
    }

    @Override
    public void kongfu() {
        super.kongfu();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println(((Component武林高手) getM武林()).getName()
                + " 学会了 " + this.getClass().getSimpleName());
    }
}
