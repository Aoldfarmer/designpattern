package builder;

public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product createAProduct() {
        builder.setPart("腾讯", "Q1");
        return builder.getProduct();
    }

    public Product createBProduct() {
        builder.setPart("宝马", "X7");
        return builder.getProduct();
    }
}
