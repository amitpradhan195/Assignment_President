package com.example.usa_presidents;

public class Presidents {

    private String name;
    private int image;
    private String about;

    public Presidents(String name, int image,String about) {
        this.name = name;
        this.image = image;
        this.about = about;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(String description) {
        this.image = image;
    }
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


}
