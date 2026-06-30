public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying cached image.");
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading real image from disk...");
    }
}
