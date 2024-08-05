package coreJava.Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20,40,3);
        System.out.println("Seat height is : "+mountainBike.getSeatHeight());
        System.out.println("Bike speed is : "+mountainBike.getSpeed());
        System.out.println("Gear is : "+mountainBike.getGear());
        mountainBike.canRotate();
        mountainBike.canDrive();
        mountainBike.applyBreak(5);
        System.out.println("Bike speed after applying break is : "+mountainBike.getSpeed());
        mountainBike.speedUp(8);
        System.out.println("Bike new speed after increment is : "+mountainBike.getSpeed());
    }
}
