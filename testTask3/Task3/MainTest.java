package Task3;
import org.junit.jupiter.api.BeforeAll;
import java.util.ArrayList;
import static Task3.Main.countLampsInBuilding;
import static Task3.Main.isNormal;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {
    public static Building hotel1;

    @BeforeAll
    static void beforeAll() {
        Room room2 = new Room(1, 4, 3);
        Room room1 = new Room(1, 3, 2);
        Room room3 = new Room(1, 2, 1);


        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);


        hotel1 = new Building(rooms, 2, 5, false);
    }

    @org.junit.jupiter.api.Test
    void testCountLampsInBuilding() {
        countLampsInBuilding(hotel1);
        assertEquals(9,countLampsInBuilding(hotel1));
    }



    @org.junit.jupiter.api.Test
    void testIsNormal() {
        assertEquals(true, isNormal(hotel1));
    }
}