package smarthouse.printers;

public class NoPrinter implements Printer{

    @Override
    public void print(String text) {
        System.out.println("No printer");
    }

    @Override
    public void printInBlackWhite(String text) {
        print(text);
    }
}
