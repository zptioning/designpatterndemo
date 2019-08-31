package com.zptioning.construction_style.e8_facade;

public class Facade诸葛亮 {
    private SubSystem关羽 mSubSystem关羽;
    private SubSystem张飞 mSubSystem张飞;
    private SubSystem赵云 mSubSystem赵云;

    public Facade诸葛亮() {
        mSubSystem关羽 = new SubSystem关羽();
        mSubSystem张飞 = new SubSystem张飞();
        mSubSystem赵云 = new SubSystem赵云();
    }

    // 提供给外部访问的方法。
    public void 活捉曹操() {
        mSubSystem关羽.活捉曹操();
        mSubSystem张飞.活捉曹操();
        mSubSystem赵云.活捉曹操();
    }
}
