package smarthouse;

import smarthouse.tvs.*;
import smarthouse.music.*;
import smarthouse.printers.*;

public class SmartHouse {
    Printer printer;
    Deezer deezer;
    Spotify spotify;

    private TV[] tv;

    public SmartHouse() {
        printer = new HPPrinter();
        deezer = new Deezer();
        spotify = new Spotify();
        tv = new TV[2];
        tv[0] = new TVSony(Room.BATH_ROOM);
        tv[1] = new TVSamsung(Room.BIG_ROOM);

    }

    public void print(String text, Room room) {
        printer.print(text);
    }

    public void printBlackWhite(String text) {
        printer.printInBlackWhite(text);
    }

    public void shutDownALLTV() {
        for (TV iterTV : tv) {
            iterTV.shutDown();
        }
    }

    public void shutDownTV(Room room) {
        for (TV iterTV : tv) {
            if(iterTV.getRoom()==room) {
                iterTV.shutDown();
            }
        }
    }

}
