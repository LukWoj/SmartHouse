package smarthouse.tvs;

import smarthouse.Room;
import smarthouse.devices.Device;

public interface TV extends Device {
    Room getRoom();
    void turnOn();

}

