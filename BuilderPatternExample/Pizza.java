public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;
    private Pizza(String size, boolean cheese, boolean pepperoni, boolean bacon) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.bacon = bacon;
    }
    public static class PizzaBuilder {
        private String size = "Medium";
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;
        public PizzaBuilder size(String size) { this.size = size; return this; }
        public PizzaBuilder cheese(boolean val) { this.cheese = val; return this; }
        public PizzaBuilder pepperoni(boolean val) { this.pepperoni = val; return this; }
        public PizzaBuilder bacon(boolean val) { this.bacon = val; return this; }
        public Pizza build() { return new Pizza(size, cheese, pepperoni, bacon); }
    }
    @Override
    public String toString() {
        return "Pizza [size=" + size + ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", bacon=" + bacon + "]";
    }
}
