public class ObserverDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("A"));
        subject.attach(new ConcreteObserver("B"));

        subject.setState(10);
        subject.setState(20);
    }
}
