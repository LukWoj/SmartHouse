package smarthouse.printers;

import driver.LGPrinterDriver;

public class LGPrinter implements Printer{
    LGPrinterDriver driver;

    public LGPrinter(){
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
    public void shutDown() {
        System.out.println("LG printer mode - turned off");
    }
}
