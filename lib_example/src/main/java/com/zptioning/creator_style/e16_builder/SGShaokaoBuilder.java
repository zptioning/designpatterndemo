package com.zptioning.creator_style.e16_builder;

public class SGShaokaoBuilder extends Builder {
    private SGShaokao mSGShaokao = new SGShaokao();

    @Override
    public Builder setZhushi(String zhushi) {
        mSGShaokao.setZhushi(zhushi);
        return this;
    }

    @Override
    public Builder setHaixian(String haixian) {
        mSGShaokao.setHaixian(haixian);
        return this;
    }

    @Override
    public Builder setRouchuan(String rouchuan) {
        mSGShaokao.setRouchuan(rouchuan);
        return this;
    }

    @Override
    public ShaoKao build() {
        return mSGShaokao;
    }
}
