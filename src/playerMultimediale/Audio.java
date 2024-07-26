package playerMultimediale;

public class Audio extends ElementoMultimediale {

    private int volume;

    public Audio(String title, int duration, int volume) {
        super(title, duration);
        this.volume = volume;
    }

    public void volumeUp() {
        for (int i = 0; i < this.volume; i++) {
            System.out.println("!");
        }
    }

    // da capire
    public void volumeDown() {
        for (int i = 0; i > this.volume; i--) {
            System.out.println("!");
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < this.getDuration(); i++) {
            System.out.println(this.getTitle());
        }
    }
}
