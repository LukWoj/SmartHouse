package smarthouse.printers;

public interface Printer {

    void print(String text);// printing
    void printInBlackWhite(String text);//black-white mode printing
    void shutDown();//shut down device
}
