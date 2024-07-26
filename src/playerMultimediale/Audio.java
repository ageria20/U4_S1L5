package playerMultimediale;

import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume {

    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title, duration);
        this.volume = volume;
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
        return "";
    }


    @Override
    public String volumeDown() {
        String volumeStr = "";
        this.volume -= 1;
        for (int i = 0; i > this.volume; i++) {
            volumeStr += "!";
        }
        return volumeStr;
    }

    @Override
    public void play() {

        for (int i = 0; i <= this.getDuration(); i++) {
            System.out.println(this.getTitle() + this.volume());
        }

    }
}
