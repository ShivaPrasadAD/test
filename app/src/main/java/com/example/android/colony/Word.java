package com.example.android.colony;

public class Word {
    private int ItemName;
    private int ItemDetails;
    private int imge;

    public Word(int itemName, int itemDetails, int image) {
        ItemDetails = itemDetails;
        ItemName = itemName;
        imge = image;
    }

    public int getItemName() {
        return ItemName;
    }

    public int getItemDetails() {
        return ItemDetails;
    }

    public int getImageId() {
        return imge;
    }
}