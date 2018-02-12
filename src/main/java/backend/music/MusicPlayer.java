package backend.music;

import backend.devices.Device;

public abstract class MusicPlayer implements Device {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
    @Override
    public void turnOff(){
        stop();
    }

    public abstract void play();
    public abstract void stop();
    public abstract void next();
    public abstract void previous();
    public abstract void volume();
    public abstract void findTrack();


}
