public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardStrategy());
        cart.checkout(100.0);

        cart.setPaymentStrategy(new PayPalStrategy());
        cart.checkout(45.0);
    }
}
