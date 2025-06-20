package ar.edu.unlp.info.oo2.media;

public class VideoStreamAdapter implements Media{

    private VideoStream videoStream;

    public VideoStreamAdapter(VideoStream videoStream) {
        this.videoStream = videoStream;
    }

    public void play() {
        this.videoStream.reproduce();
    }

}
