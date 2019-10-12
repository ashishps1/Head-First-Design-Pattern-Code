package Chapter6;

public class CeilingFan {
    String type;
    public CeilingFan() {
        type = "";
    }
    public CeilingFan(String type) {
        this.type = type;
    }
    public void on() {
        System.out.println(type + " Ceiling Fan is on");
    }
    public void off() {
        System.out.println(type + " Ceiling fan is off");
    }
}
