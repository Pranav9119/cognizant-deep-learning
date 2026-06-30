public class BuilderDemo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .size("Large")
                .cheese(true)
                .pepperoni(true)
                .bacon(false)
                .build();
        System.out.println(pizza);
    }
}
