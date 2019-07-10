package org.dimigo.oop2;

public class MediaPlayer {
    private int volumne;
    private static MediaPlayer instance = new MediaPlayer();

    private MediaPlayer(){}

    public static MediaPlayer getInstance() {
        return instance;
    }

    public int getVolumne() {
        return volumne;
    }

    public void setVolumne(int volumne) {
        this.volumne = volumne;
    }


}
