package com.extendedclip.deluxemenus.cache;


public class TripleClickCache {

    private int clicks;
    private int slot;

    public TripleClickCache(int clicks, int slot) {
        this.clicks = clicks;
        this.slot = slot;
    }

    public int getClicks() {
        return this.clicks;
    }

    public int getSlot() {
        return this.slot;
    }

    public int setClicks(int clicks) {
        this.clicks = clicks;
        return this.clicks;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
