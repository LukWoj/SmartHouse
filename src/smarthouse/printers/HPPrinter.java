package smarthouse.printers;

import driver.HPPrinterDriver;

public class HPPrinter implements Printer{

    HPPrinterDriver driver;

    public HPPrinter(){
       this.driver = new HPPrinterDriver();
    }
    @Override
    public void print(String text) {
        driver.print(text);
    }

    @Override
    public void printInBlackWhite(String text) {
        System.out.println("HP Printer does not print in black-white mode");
    }
}
