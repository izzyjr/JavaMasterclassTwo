package com.israelmesa;

public class Song {

    private String title;
    private Double duration;

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public Double getDuration() {
        return duration;
    }

    public static Song createSong(String title, Double duration) {
        return new Song(title, duration);
    }
}
