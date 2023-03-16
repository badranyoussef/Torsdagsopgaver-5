package Task3;

public class Room {

    //3.a Create a Room.java class with the following fields
    // (use appropriate types and make them private):
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfLamps = numberOfLamps;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
