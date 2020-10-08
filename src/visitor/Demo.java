package visitor;

public class Demo {
  
  public static void main(final String[] args) {  
    Car car = new Car();

    car.accept(new CarElementPrintVisitor());
    car.accept(new CarElementDoVisitor());
  }

}
