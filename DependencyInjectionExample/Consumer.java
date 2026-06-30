public class Consumer {
    private final Service service;

    public Consumer(Service service) {
        this.service = service;
    }

    public void doWork() {
        System.out.println("Consumer got service: " + service.getClass().getSimpleName());
        service.serve();
    }
}
