package com.voroniak;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer{
    public Instrumentalist() {}
    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
    private String song;
    public void setSong(String song) {
        this.song = song;
    }
    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }
    @Autowired
    private Instrument instrument;
    @Autowired
    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }
}
