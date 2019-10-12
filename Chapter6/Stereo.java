package Chapter6;

public class Stereo {
    private int volume;
    String type;
    public Stereo() {
        type = "";
    }
    public Stereo(String type) {
        this.type = type;
    }
    public void on() {
        System.out.println(type + " Stereo is on");
    }
    public void off() {
        System.out.println(type + " Stereo is off");
    }
    public void setCd() {
        System.out.println("CD is set");
    }
    public void setDvd() {
        System.out.println("DVD is set");
    }
    public void setRadio() {
        System.out.println("Radio is set");
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
