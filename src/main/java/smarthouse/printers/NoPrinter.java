package smarthouse.printers;

public class NoPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println("There is no printer connected int the house");
    }

    @Override
    public void printInBlackWhite(String text) {
        print(text);
    }

    @Override
    public void turnOff() {

    }
}
