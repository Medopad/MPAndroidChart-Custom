package com.github.mikephil.charting.data;

/**
 * Created by ludwig on 12/03/2017.
 */

public class FixedSizeBubbleEntry extends BubbleEntry {
    private int value;

    public FixedSizeBubbleEntry(float x, float y, float size, int value) {
        super(x, y, size);
        this.value = value;
    }

    public FixedSizeBubbleEntry(float x, float y, float size, int value, Object data) {
        super(x, y, size, data);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
