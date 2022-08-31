package com.lesson116_122;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    private Song findSong(String title) {
        for(Song s : songs) {
            if(s.getTitle().equals(title)) {
                return s;
            }
        }

        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if((index >= 0) && (index < songs.size())) {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("This album does not have track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song s = findSong(title);
        if(s != null) {
            playlist.add(s);
            return true;
        }

        System.out.println("Song " + title + " is not in this album.");
        return false;
    }

}
