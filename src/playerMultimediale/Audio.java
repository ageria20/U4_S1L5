package playerMultimediale;

import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume {

    private int volume;
    private int duration;

    public Audio(String title, int duration, int volume) {
        super(title);
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

        for (int i = 0; i > this.volume; i++) {
            volumeStr += "!";
        }
        return volumeStr;
    }

    @Override
    public void play() {

        for (int i = 0; i <= this.duration; i++) {
            System.out.println(this.getTitle() + this.volume());
        }

    }
}
