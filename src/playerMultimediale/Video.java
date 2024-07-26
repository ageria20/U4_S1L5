package playerMultimediale;

import interfaces.Brightness;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Brightness {

    private int brightness;
    private int volume;
    private int duration;

    public Video(String title, int duration, int volume, int brightness) {
        super(title);
        this.volume = volume;
        this.duration = duration;
        this.brightness = brightness;

    }


    @Override
    public String brightnessUp() {
        this.brightness++;
        String brightnessStr = "";
        for (int i = 0; i < this.brightness; i++) {
            brightnessStr += "*";
        }
        return brightnessStr;
    }

    @Override
    public String brightness() {
        String brightnessStr = "";
        for (int i = 0; i < this.brightness; i++) {
            brightnessStr += "*";
        }
        return brightnessStr;
    }

    @Override
    public String brightnessDown() {
        this.brightness--;
        String brightnessStr = "";
        for (int i = 0; i < this.brightness; i++) {
            brightnessStr += "*";
        }
        return brightnessStr;
    }

    @Override
    public void play() {

        for (int i = 0; i <= this.duration; i++) {
            System.out.println(this.getTitle() + this.volume() + this.brightness());
        }

    }

    @Override
    public String volumeUp() {
        this.volume++;
        String volumeStr = "";
        for (int i = 0; i < this.volume; i++) {
            volumeStr += "!";
        }
        return volumeStr;
    }

    @Override
    public String volume() {
        String volumeStr = "";
        for (int i = 0; i < this.volume; i++) {
            volumeStr += "!";
        }
        return volumeStr;
    }

    @Override
    public String volumeDown() {
        this.volume--;
        String volumeStr = "";
        for (int i = 0; i < this.volume; i++) {
            volumeStr += "!";
        }
        return volumeStr;
    }
}
