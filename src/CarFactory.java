public class CarFactory {
    Car createCar(int choice){
        if (choice == 1){
            return new Ford("Focus");
        }
        else if (choice == 2){
            return new Mercedes("A-Class");
        }else {
            return null;
        }
    }
}

