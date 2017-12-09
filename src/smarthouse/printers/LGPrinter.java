package smarthouse.printers;

import driver.LGPrinterDriver;

public class LGPrinter implements Printer{
    LGPrinterDriver driver;

    public LGPrinter(){
        driver = new LGPrinterDriver();
    }
    @Override
    public void print(String text) {
        driver.printNow(text);
    }

    @Override
    public void printInBlackWhite(String text) {
        System.out.println("HP Printer does not print in black");
    }
}
