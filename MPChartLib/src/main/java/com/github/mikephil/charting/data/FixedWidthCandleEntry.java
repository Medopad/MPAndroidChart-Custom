package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

public class FixedWidthCandleEntry extends CandleEntry {
    private float width = 0f;
    private float mShadowHigh = 0f;
    private float mShadowLow = 0f;
    private float mClose = 0f;
    private float mOpen = 0f;

    public FixedWidthCandleEntry(float x, float width, float shadowH, float shadowL, float open, float close) {
        super(x, shadowH, shadowL, open, close);

        this.width = width;
        this.mShadowHigh = shadowH;
        this.mShadowLow = shadowL;
        this.mOpen = open;
        this.mClose = close;
    }

    public FixedWidthCandleEntry(float x, float width, float shadowH, float shadowL, float open, float close,
                       Object data) {
        super(x, shadowH, shadowL, open, close, data);

        this.width = width;
        this.mShadowHigh = shadowH;
        this.mShadowLow = shadowL;
        this.mOpen = open;
        this.mClose = close;
    }

    public FixedWidthCandleEntry(float x, float width, float shadowH, float shadowL, float open, float close,
                       Drawable icon) {
        super(x,shadowH, shadowL, open, close, icon);

        this.width = width;
        this.mShadowHigh = shadowH;
        this.mShadowLow = shadowL;
        this.mOpen = open;
        this.mClose = close;
    }

    public FixedWidthCandleEntry(float x, float width, float shadowH, float shadowL, float open, float close,
                       Drawable icon, Object data) {
        super(x, shadowH, shadowL, open, close, icon, data);

        this.width = width;
        this.mShadowHigh = shadowH;
        this.mShadowLow = shadowL;
        this.mOpen = open;
        this.mClose = close;
    }

    @Override
    public float getY() {
        return super.getY();
    }

    public FixedWidthCandleEntry copy() {

        FixedWidthCandleEntry c = new FixedWidthCandleEntry(getX(), width, mShadowHigh, mShadowLow, mOpen,
                mClose, getData());

        return c;
    }

    public float getShadowRange() {
        return Math.abs(mShadowHigh - mShadowLow);
    }

    public float getBodyRange() {
        return Math.abs(mOpen - mClose);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public float getHigh() {
        return mShadowHigh;
    }

    public void setHigh(float mShadowHigh) {
        this.mShadowHigh = mShadowHigh;
    }

    public float getLow() {
        return mShadowLow;
    }

    public void setLow(float mShadowLow) {
        this.mShadowLow = mShadowLow;
    }

    public float getClose() {
        return mClose;
    }

    public void setClose(float mClose) {
        this.mClose = mClose;
    }

    public float getOpen() {
        return mOpen;
    }

    public void setOpen(float mOpen) {
        this.mOpen = mOpen;
    }
}
