public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.png");
        image.display();
        image.display();
    }
}
