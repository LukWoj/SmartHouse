package smarthouse.music;

public abstract class MusicPlayer {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public abstract void play();
    public abstract void stop();
    public abstract void next();
    public abstract void previous();
    public abstract void volume();
    public abstract void findTrack();


}
