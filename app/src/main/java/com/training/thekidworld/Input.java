package com.training.thekidworld;

public class Input {
    private String gifText;
    private int gifImages;

    public Input(int gifImages,String gifText){
        this.gifImages = gifImages;
        this.gifText = gifText;
    }

    public int getGifImages() {
        return gifImages;
    }

    public String getGifText() {
        return gifText;
    }
}
