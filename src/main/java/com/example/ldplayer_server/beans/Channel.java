package com.example.ldplayer_server.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Channel implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    private int categoryId;

    private String name;

    private String sourcePath;

    private String imagePath;

    private String detail;

    public Channel() {
    }

    public Channel(int id, int categoryId, String name, String sourcePath, String imagePath, String detail) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.sourcePath = sourcePath;
        this.imagePath = imagePath;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
