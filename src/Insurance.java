public class Insurance {
    private String type;
    private int price;

    public Insurance(Builder builder) {
        this.type = builder.type;
        this.price = builder.price;
    }

    public String getType() {
        return this.type;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static class Builder {
        private String type;
        private int price;

        public Builder() {
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Insurance build() {
            return new Insurance(this);


        }
    }
}