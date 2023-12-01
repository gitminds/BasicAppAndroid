package com.training.thekidworld;

public class TextInput {
    private String gifText;
    private String gifImages;

    public TextInput(String gifImages,String gifText){
        this.gifImages = gifImages;
        this.gifText = gifText;
    }

    public String getGifImages() {
        return gifImages;
    }

    public String getGifText() {
        return gifText;
    }
}
