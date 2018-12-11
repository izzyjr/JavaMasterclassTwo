package com.israelmesa;

import java.util.LinkedList;

public class Album {

    private String albumName;
    private LinkedList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new LinkedList<Song>();
    }

    public static Album createAlbum(String albumName) {
        return new Album(albumName);
    }
}
