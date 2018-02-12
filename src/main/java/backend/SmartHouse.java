package backend;

import backend.devices.Device;
import backend.tvs.*;
import backend.printers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartHouse {
    private Printer printer;
    private List<Device> deviceList;
    private Map<Room, TV> roomToTV;


    public SmartHouse() {
        printer = new LGPrinter();
        TV tvSony = new TVSony();
        TV tvSamsung = new TVSamsung();

        deviceList = new ArrayList<>();

        deviceList.add(tvSony);
        deviceList.add(tvSamsung);
        deviceList.add(printer);


        roomToTV = new HashMap<>();
        roomToTV.put(Room.BATH_ROOM, tvSony);
        roomToTV.put(Room.BIG_ROOM, tvSamsung);

    }

    public void print(String text) {
        printer.print(text);
    }

    public void printBlackWhite(String text) {
        printer.printInBlackWhite(text);
    }

    public void turnOffAllDevices() {
        for (Device iterDevice : deviceList) {
            iterDevice.turnOff();
        }
    }

    public void turnOffTV(Room room) {
        roomToTV.get(room).turnOff();
    }

    public void turnOnTV(Room room) {
        roomToTV.get(room).turnOn();
    }

    public void plugoutPrinter() {
        printer = new NoPrinter();
    }

}
