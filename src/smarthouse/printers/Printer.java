package smarthouse.printers;

import smarthouse.devices.Device;

public interface Printer extends Device{

    void print(String text);// printing
    void printInBlackWhite(String text);//black-white mode printing

}
