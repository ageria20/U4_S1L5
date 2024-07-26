package playerMultimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo");
        String title = scanner.nextLine();
        System.out.println("Inserisci una durata");
        int duration = scanner.nextInt();
        System.out.println("Inserisci il volume");
        int volume = scanner.nextInt();
        System.out.println("Inserisci la luminosita'  e premi invio per fare Play");
        int brightness = scanner.nextInt();

//        Audio audio = new Audio(title, duration, volume);
//        Video video = new Video(title, duration, volume, brightness);
//        video.play();
        Image img = new Image(title, brightness);
        img.show();


    }
}