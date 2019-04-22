package com.jakeesveld.android_inheritance_shopping;

public class ShoppingItem {
    private int colorId;
    private String name;

    public ShoppingItem(int colorId, String name) {
        this.colorId = colorId;
        this.name = name;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}