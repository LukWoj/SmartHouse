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
        driver.printInBlackWhite(text);
    }

    @Override
    public void shutDown() {
        System.out.println("HP printer mode - turned off");
    }
}
