public class Car extends Vehicle {
  private int numberOfDoors;

  public Car(int speed, int fuel, int numberOfDoors) {
      super(speed, fuel);
      this.numberOfDoors = numberOfDoors;
  }

  @Override
  public void start() {
      System.out.println("Car is starting");
  }

  public void honk() {
      System.out.println("Beep Beep!");
  }

  public int getNumberOfDoors() {
      System.out.println("Number of doors: " + numberOfDoors);
      return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
      this.numberOfDoors = numberOfDoors;
  }
}
