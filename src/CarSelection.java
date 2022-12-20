import java.util.Scanner;

public class CarSelection {
    private Scanner scanner;
    private CarFactory factory;
    private InsuranceFactory insuranceFactory;

    public CarSelection(Scanner scanner, CarFactory factory, InsuranceFactory insuranceFactory) {
        this.scanner = scanner;
        this.factory = factory;
        this.insuranceFactory = insuranceFactory;
    }

    public void selectCar() {
        System.out.println("Welcome to the Car Selection tool! \n" +
                "Please indicate the selection below! ");
        while (true) {
            System.out.println("Please fill in the car selection below: \n" +
                    "1. Ford  \n" +
                    "2. Mercedes");

            int choice = scanner.nextInt();

            Car car = factory.createCar(choice);

            if (car != null) {
                System.out.println("Selected Car Brand: " + car.getBrand() + "\n" +
                        "Selected Car Model: " + car.getModel() + "\n" +
                        "Selected Car Price: " + car.getPrice() + " Euros");

                System.out.println("Please select the Insurance model: \n " +
                        "1- Basic Coverage" +
                        "2- Full Coverage");

                int insuranceChoice = scanner.nextInt();
                Insurance insurance= null;

                if (insuranceChoice == 1) {
                    insurance = insuranceFactory.createBasicInsurance();
                } else if (insuranceChoice == 2) {
                    insurance = insuranceFactory.createFullInsurance();
                }

                if (insurance != null) {
                    System.out.println("Selected insurance  : " + insurance.getType());
                    System.out.println("Selected insurance price " + insurance.getPrice());

                    int totalPrice = car.getPrice() + insurance.getPrice();
                    System.out.println("Total payable price = " + totalPrice + " EUROS");
                    break;
                } else {
                    System.out.println("Please control the selection");

                }


            } else {
                System.out.println("Please control the selections one more time");
            }
        }
    }
}