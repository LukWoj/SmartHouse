import smarthouse.Room;
import smarthouse.SmartHouse;

public class Simulation {
    public static void main(String[] args) {
        SmartHouse house = new SmartHouse();
        house.turnOnTV(Room.BIG_ROOM);
        house.print("Print hello");
        house.shutDownAllDevices();

        

    }
}
