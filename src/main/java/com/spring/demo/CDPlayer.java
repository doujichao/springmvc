package com.spring.demo;

public class CDPlayer {

    private CompactDisc compactDisc;
    /**
     * @param compactDisc
     */
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc=compactDisc;
    }

    public void play() {
        compactDisc.play();
    }
}
