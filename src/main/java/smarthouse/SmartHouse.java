package smarthouse;

import smarthouse.devices.Device;
import smarthouse.tvs.*;
import smarthouse.printers.*;

import java.util.ArrayList;
import java.util.List;

public class SmartHouse {
    Printer printer;
    List<TV>  tvList;
    List<Device>  deviceList;



    public SmartHouse() {// konstruktor
        printer = new HPPrinter();
        tvList = new ArrayList<>();

        TV tvSony = new TVSony(Room.BATH_ROOM);
        tvList.add(tvSony);
        TV tvSamsung = new TVSamsung(Room.BIG_ROOM);
        tvList.add(tvSamsung);

        deviceList = new ArrayList<>();
        deviceList.add(tvSamsung);
        deviceList.add(tvSony);
        deviceList.add(printer);

    }

    public void print(String text) {
        printer.print(text);
    }

    public void printBlackWhite(String text) {
        printer.printInBlackWhite(text);
    }

    public void shutDownAllDevices() {
        for (Device iterDevice : deviceList) {
            iterDevice.turnOff();
        }
    }

    public void shutDownTV(Room room) {
        for (TV iterTV : tvList) {
            if(iterTV.getRoom()==room) {
                iterTV.turnOff();
            }
        }
    }

    public void turnOnTV(Room room) {
        for (TV iterTV : tvList) {
            if(iterTV.getRoom()==room) {
                iterTV.turnOn();
            }
        }
    }
}
