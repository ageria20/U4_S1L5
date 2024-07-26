package playerMultimediale;

import interfaces.Brightness;

public class Image extends ElementoMultimediale implements Brightness {

    private int brightness;

    public Image(String title, int duration, int brightness) {
        super(title, duration);
        this.brightness = brightness;
    }

    public void show() {
        for (int i = 0; i < this.brightness; i++) {
            System.out.println();
        }
    }

    @Override
    public void brightnessUp() {
        for (int i = 0; i < this.brightness; i++) {
            System.out.println("*");
        }
    }

    @Override
    public void brightnessDown() {

    }


}
