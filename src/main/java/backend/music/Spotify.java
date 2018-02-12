package backend.music;

public class Spotify extends MusicPlayer {

    @Override
    public void play() {
        System.out.println("Spotify - play");
    }

    @Override
    public void stop() {
        System.out.println("Spotify - stop");
    }

    @Override
    public void next() {

    }

    @Override
    public void previous() {

    }

    @Override
    public void volume() {
        setVolume(getVolume() + 1);
    }

    @Override
    public void findTrack() {

    }
}
