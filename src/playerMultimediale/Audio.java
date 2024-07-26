package playerMultimediale;

import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume {

    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title, duration);
        this.volume = volume;
    }

    public String volumeUp() {
        String volumeStr = "";
        for (int i = 0; i < this.volume; i++) {
            volumeStr += "!";
        }
        return volumeStr;
    }


    // da capire
    public String volumeDown() {
        String volumeStr = "";
        for (int i = 0; i > this.volume; i--) {
            volumeStr += "";
        }
        return volumeStr;
    }

    @Override
    public String play() {
        String titleStr = "";
        for (int i = 0; i < this.getDuration(); i++) {
            titleStr += " " + this.getTitle();
        }
        return titleStr;
    }
}
