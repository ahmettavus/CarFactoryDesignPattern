public class InsuranceFactory {
    public Insurance createBasicInsurance() {
        return new Insurance.Builder()
                .type("Basic")
                .price(200)
                .build();
    }

    public Insurance createFullInsurance() {
        return new Insurance.Builder()
                .type("Full")
                .price(1000)
                .build();
    }
}
