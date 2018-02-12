package backend.driver;

public class HPPrinterDriver {

    public void print(String text){// printer backend.driver starter
        System.out.println("HP - print command: " + text);
    }

    public void printInBlackWhite(String text){
        System.out.println("HP print command (black - white mode)" + text);
    }
}
