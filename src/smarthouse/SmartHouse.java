package smarthouse;

import smarthouse.tvs.*;
import smarthouse.music.*;
import smarthouse.printers.*;

public class SmartHouse {
    Printer printer;

    private TV[] tv;

    public SmartHouse() {// konstruktor
        printer = new HPPrinter();
        tv = new TV[2];
        tv[0] = new TVSony(Room.BATH_ROOM);
        tv[1] = new TVSamsung(Room.BIG_ROOM);
    }

    public void print(String text) {
        printer.print(text);
    }

    public void printBlackWhite(String text) {
        printer.printInBlackWhite(text);
    }

    public void shutDownAllDevices() {
        for (TV iterTV : tv) {
            iterTV.shutDown();
        }
        printer.shutDown();
    }




    public void shutDownTV(Room room) {
        for (TV iterTV : tv) {
            if(iterTV.getRoom()==room) {
                iterTV.shutDown();
            }
        }
    }

    public void turnOnTV(Room room) {
        for (TV iterTV : tv) {
            if(iterTV.getRoom()==room) {
                iterTV.turnOn();
            }
        }
    }
}
