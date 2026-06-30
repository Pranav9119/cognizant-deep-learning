public class DI_Demo {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        Consumer consumer = new Consumer(service);
        consumer.doWork();
    }
}
