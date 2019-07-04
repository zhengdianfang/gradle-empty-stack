public class IPhone extends Mobile {
    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String message) {
        return String.format("<iPhone>%s", super.call(message));
    }

    @Override
    public int limitMessageLength() {
        return 15;
    }
}
