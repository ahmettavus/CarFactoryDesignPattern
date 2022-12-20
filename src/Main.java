import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CarFactory factory = new CarFactory();
        InsuranceFactory insuranceFactory = new InsuranceFactory();
        CarSelection selector = new CarSelection(scanner, factory,insuranceFactory );
        selector.selectCar();
    }
}



