public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String call(String message) {
        return String.format("Message: %s", message);
    }

    public String getInformation() {
        return String.format("name: %s, color: %s, brand: %s", name, color, brand);
    }
}
