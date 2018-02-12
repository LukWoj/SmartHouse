package backend.printers;

import backend.driver.LGPrinterDriver;

public class LGPrinter implements Printer {
    private LGPrinterDriver driver;

    public LGPrinter() {
        driver = new LGPrinterDriver();
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
        System.out.println("LG printer - turned off");
    }
}
