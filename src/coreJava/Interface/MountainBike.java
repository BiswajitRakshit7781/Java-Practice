package coreJava.Interface;

class MountainBike extends TwoWheeler implements Bicycle, Vehicle {
    private final int seatHeight;
    private final int gear;
    private int speed;
    public MountainBike(int startHeight, int startSpeed, int startGear){
        seatHeight = startHeight;
        gear = startGear;
        speed = startSpeed;
    }

    @Override
    public void canDrive() {
        System.out.println("Mountain bike can be driven");
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;    }

    @Override
    public void applyBreak(int decrement) {
        speed = speed - decrement;
    }
    public int getSeatHeight(){
        return seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
}
