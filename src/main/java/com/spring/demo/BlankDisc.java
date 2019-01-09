package com.spring.demo;

import java.util.List;

public class BlankDisc implements CompactDisc{

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc() {
    }


    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }


    public void play() {
        System.out.println("Playing "+title+" by" +artist);
        for (String string : tracks) {
            System.out.println("-Track :" +string);
        }
    }

    @Override
    public void playTrack(int trackNumber) {
        String s = tracks.get(trackNumber);
        System.out.println(s);
    }

}
