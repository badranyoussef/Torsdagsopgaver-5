package Task3;

import java.util.ArrayList;

public class Main {

    public static int countLampsInBuilding(Building building) {
        //gennemløb listen af typen Room og tæl lamperne pr værelse
        int lampsTotal = 0;
        for (Room l : building.getRooms()) {
            lampsTotal += l.getNumberOfLamps();
        }
        return lampsTotal;
    }

    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() > building.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }

    public static void main(String[] args) {
        Room room1 = new Room(1, 3, 2);
        Room room2 = new Room(1, 4, 3);
        Room room3 = new Room(1, 2, 1);


        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);


        Building building = new Building(rooms, 2, 5, false);

        System.out.println("total number og lamps: " + countLampsInBuilding(building));

        isNormal(building);

    }
}
