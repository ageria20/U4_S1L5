package playerMultimediale;

import interfaces.Brightness;

public class Image extends ElementoMultimediale implements Brightness {

    private int brightness;

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }


    public void show() {
        for (int i = 0; i < this.brightness; i++) {
            System.out.println(this.getTitle() + brightness());
        }
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


}
