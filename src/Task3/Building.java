package Task3;

import java.util.ArrayList;

public class Building {

    private final ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    Building (ArrayList<Room> hotel, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.rooms = hotel;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;

    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

}
