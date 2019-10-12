package Chapter6;

public class Light {
    String type;

    public Light() {
        type = "";
    }
    public Light(String type) {
        this.type = type;
    }
    public void on() {
        System.out.println(type + " Light is on");
    }
    public void off() {
        System.out.println(type + " Light is off");
    }
}
