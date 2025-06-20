package ar.edu.unlp.info.oo2.media;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    private List<Media> media;

    public MediaPlayer(List<Media> media) {
        this.media = new ArrayList<Media>(media);
    }

    public void play() {
        this.media.stream().forEach(media -> media.play());
    }
}
