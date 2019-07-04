public class Person {
    private String name;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    private Mobile mobile;

    public void changeMobile(Mobile mobile) {
       this.mobile = mobile;
    }

    public String call(String message) {
        return this.mobile.call(message);
    }
}
