package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

    private String title="Sgt . Pepper 's Lonely Hearts Club Band";
    private String artist="The Beatles";

    @Override
    public void play() {
        System.out.println("Playing "+title+"by"+artist);
    }

    @Override
    public void playTrack(int trackNumber) {

    }

}

