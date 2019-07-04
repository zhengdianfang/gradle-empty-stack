public class AndroidMobile extends Mobile {
    public AndroidMobile(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String message) {
        return String.format("<Android>%s", super.call(message));
    }
}
