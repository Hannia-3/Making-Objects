public class Main {
  
    public static void main(String[] args) {
      Car Car = new Car(60, 30, 5);
      Car.start();
      Car.displayFuel();
      Car.honk();
      Car.getNumberOfDoors();
      Car.stop();
      System.out.println();

      Bicycle Bike = new Bicycle(30, 20, true);
      Bike.start();
      Bike.displayFuel();
      Bike.ringBell();
      Bike.getHasBell();
      Bike.stop();
    }
}
        
