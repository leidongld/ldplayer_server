package com.example.ldplayer_server.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Theme implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String detail;

    private String imagePath;

    public Theme() {
    }

    public Theme(int id, String name, String detail, String imagePath) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + detail + '\'' +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
