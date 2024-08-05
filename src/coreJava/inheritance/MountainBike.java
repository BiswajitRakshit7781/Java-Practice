package coreJava.inheritance;

public class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int startHeight,int startSpeed, int startGear){
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }
}
