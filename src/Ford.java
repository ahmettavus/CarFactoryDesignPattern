public class Ford implements Car{
    private String model;
    public Ford(String model){
        this.model = model;

    }

    @Override
    public String getBrand() {
        return "Ford";
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getPrice() {
        return 10000;
    }
}
