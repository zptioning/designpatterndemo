package com.zptioning.creator_style.e5_factory.absFactory;

public class ConcreteRoleFactory extends AbsRoleFactory {
    @Override
    public 魏Role createWeiRole() {
        return new Wei文Role("郭嘉");
    }

    @Override
    public 蜀Role createShuRole() {
        return new Shu文Role("诸葛亮");
    }

    @Override
    public 吴Role createWuRole() {
        return new Wu武Role("周瑜");
    }
}
