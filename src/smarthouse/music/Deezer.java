package smarthouse.music;

public class Deezer extends MusicPlayer {

    @Override
    public void play() {
        System.out.println("Deezer - play");
    }

    @Override
    public void stop() {
        System.out.println("Deezer - stop");
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
