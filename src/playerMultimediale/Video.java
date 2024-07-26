package playerMultimediale;

import interfaces.Brightness;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Brightness {

    private int brightness;
    private int volume;

    public Video(String title, int duration, int volume, int brightness) {
        super(title, duration);
        this.volume = volume;
        this.brightness = brightness;

    }


    @Override
    public void brightnessUp() {

    }

    @Override
    public void brightnessDown() {

    }

    @Override
    public String play() {
        return "";
    }

    @Override
    public String volumeUp() {
        return "";
    }

    @Override
    public String volumeDown() {
        return "";
    }
}
