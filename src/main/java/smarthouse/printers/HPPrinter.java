package smarthouse.printers;

import driver.HPPrinterDriver;

public class HPPrinter implements Printer {

    private HPPrinterDriver driver;

    public HPPrinter() {
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
    public void turnOff() {
        System.out.println("HP printer - turned off");
    }
}
