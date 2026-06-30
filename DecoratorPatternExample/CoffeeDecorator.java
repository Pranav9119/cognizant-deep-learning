public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee innerCoffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.innerCoffee = coffee;
    }

    @Override
    public double getCost() {
        return innerCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return innerCoffee.getDescription();
    }
}
