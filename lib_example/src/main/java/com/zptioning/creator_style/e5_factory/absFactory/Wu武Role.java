package com.zptioning.creator_style.e5_factory.absFactory;

public class Wu武Role extends 吴Role {
    public Wu武Role(String name) {
        super(name);
    }

    @Override
    public void comeOn() {
        System.out.println(name + " 在此，谁敢决一死战！！！");
    }
}
