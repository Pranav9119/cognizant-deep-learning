public class MVCDemo {
    public static void main(String[] args) {
        Model model = new Model("Hello MVC");
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.updateView();
        controller.setData("Updated MVC Data");
        controller.updateView();
    }
}
