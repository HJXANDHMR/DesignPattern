package com.example;

/**
 * Created by Administrator on 2016/6/11.
 */
public class WaterContext {
    private IWaterState mIWaterState;

    public IWaterState getIWaterState() {
        return mIWaterState;
    }

    public void setIWaterState(int i) {
        if (i == 0) {
            mIWaterState = new IceWaterState();
            return;
        }

        if (i == 1) {
            mIWaterState = new WarmWaterState();
            return;
        }

        if (i == 2) {
            mIWaterState = new BoilingWaterState();
            return;
        }
    }
}
