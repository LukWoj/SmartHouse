import smarthouse.Room;
import smarthouse.SmartHouse;

public class Simulation {
    public static void main(String[] args) {
        SmartHouse smartTV = new SmartHouse();
       // smartTV.shutDownALLTV();
        smartTV.shutDownTV(Room.BATH_ROOM);
    }
}