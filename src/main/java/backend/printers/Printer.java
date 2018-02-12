package backend.printers;

import backend.devices.Device;

public interface Printer extends Device{

    void print(String text);// printing
    void printInBlackWhite(String text);

}
