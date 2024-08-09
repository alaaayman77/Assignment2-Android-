package com.example.assignment2;

public class CourseItem {
    private int imageId;
    private String buttonText;

    public CourseItem(int imageId, String buttonText) {
        this.imageId = imageId;
        this.buttonText = buttonText;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }
}
