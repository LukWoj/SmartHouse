package smarthouse;

import smarthouse.tvs.*;
import smarthouse.music.*;
import smarthouse.printers.*;

import java.util.ArrayList;
import java.util.List;

public class SmartHouse {
    Printer printer;
    List<TV>  tvList;


    public SmartHouse() {// konstruktor
        printer = new HPPrinter();
        tvList = new ArrayList<>();
        tvList.add(new TVSony(Room.BATH_ROOM));
        tvList.add(new TVSamsung(Room.BIG_ROOM));
    }

    public void print(String text) {
        printer.print(text);
    }

    public void printBlackWhite(String text) {
        printer.printInBlackWhite(text);
    }

    public void shutDownAllDevices() {
        for (TV iterTV : tvList) {
            iterTV.shutDown();
        }
        printer.shutDown();
    }




    public void shutDownTV(Room room) {
        for (TV iterTV : tvList) {
            if(iterTV.getRoom()==room) {
                iterTV.shutDown();
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
