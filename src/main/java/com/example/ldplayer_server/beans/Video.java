package com.example.ldplayer_server.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Video implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String artist;

    private String path;

    private float duration;

    public Video() {
    }

    public Video(String name, String artist, String path, float duration) {
        this.name = name;
        this.artist = artist;
        this.path = path;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
