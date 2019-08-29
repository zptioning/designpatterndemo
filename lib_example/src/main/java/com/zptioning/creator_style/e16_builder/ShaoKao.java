package com.zptioning.creator_style.e16_builder;

public abstract class ShaoKao {
    protected String name;
    private String zhushi;
    private String haixian;
    private String rouchuan;

    public ShaoKao() {
    }

    public String getZhushi() {
        return zhushi;
    }

    public void setZhushi(String zhushi) {
        this.zhushi = zhushi;
    }

    public String getHaixian() {
        return haixian;
    }

    public void setHaixian(String haixian) {
        this.haixian = haixian;
    }

    public String getRouchuan() {
        return rouchuan;
    }

    public void setRouchuan(String rouchuan) {
        this.rouchuan = rouchuan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ShaoKao{" +
                "name='" + name + '\'' +
                ", zhushi='" + zhushi + '\'' +
                ", haixian='" + haixian + '\'' +
                ", rouchuan='" + rouchuan + '\'' +
                '}';
    }
}
