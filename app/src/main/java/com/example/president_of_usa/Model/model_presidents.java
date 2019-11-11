package com.example.president_of_usa.Model;

public class model_presidents {

    private String name;
    private int image;
    private String about;

    public model_presidents(String name, int image, String about) {
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
