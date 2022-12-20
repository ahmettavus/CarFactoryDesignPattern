public class Mercedes implements Car{
    private String model;
    public Mercedes(String model){
        this.model = model;

    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getPrice() {
        return 20000;
    }
}
