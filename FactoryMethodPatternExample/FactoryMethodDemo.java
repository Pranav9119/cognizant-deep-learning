public class FactoryMethodDemo {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.createProduct().use();
        Creator creatorB = new ConcreteCreatorB();
        creatorB.createProduct().use();
    }
}
