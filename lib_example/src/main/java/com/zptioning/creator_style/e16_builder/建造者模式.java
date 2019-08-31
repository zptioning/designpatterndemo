package com.zptioning.creator_style.e16_builder;

public class 建造者模式 {
    public static void main(String[] args) {
        ShaoKao shaoKao = new SGShaokaoBuilder().setHaixian("生蚝").setRouchuan("羊肉串")
                .setZhushi("馒头").build();
        System.out.println(shaoKao);
    }
}
