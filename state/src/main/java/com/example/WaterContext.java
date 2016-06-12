package com.example;

/**
 * 环境类
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
