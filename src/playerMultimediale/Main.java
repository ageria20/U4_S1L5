package playerMultimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Che cosa vuoi riprodurre o vedere?");

        ElementoMultimediale[] lettoreMultimediale = new ElementoMultimediale[5];
//        System.out.println("Inserisci una durata");
//        int duration = scanner.nextInt();
//        System.out.println("Inserisci il volume");
//        int volume = scanner.nextInt();
//        System.out.println("Inserisci la luminosita'  e premi invio per fare Play");
//        int brightness = scanner.nextInt();

        for (int i = 0; i < lettoreMultimediale.length; i++) {
            System.out.println("Che tipo di file vuoi creare?");
            String type = scanner.nextLine();
            switch (type) {
                case "audio":
                    audio();
                    break;
                case "video":
                    video();
                    break;
                case "image":
                    img();
                    break;

                default:
                    break;

            }
        }

//        Audio audio = new Audio(title, duration, volume);
//        Video video = new Video(title, duration, volume, brightness);
//        video.play();


    }

    public static void audio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo");
        String title = scanner.nextLine();
        System.out.println("Inserisci una durata");
        int duration = scanner.nextInt();
        System.out.println("Inserisci un volume iniziale");
        int volume = scanner.nextInt();
        Audio audio = new Audio(title, duration, volume);
        audio.play();
    }

    public static void video() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo");
        String title = scanner.nextLine();
        System.out.println("Inserisci una durata");
        int duration = scanner.nextInt();
        System.out.println("Inserisci un volume iniziale");
        int volume = scanner.nextInt();
        System.out.println("Inserisci una luminosita' iniziale");
        int brightness = scanner.nextInt();
        Video video = new Video(title, duration, volume, brightness);
        video.play();
    }

    public static void img() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo");
        String title = scanner.nextLine();

        System.out.println("Inserisci una luminosita' iniziale");
        int brightness = scanner.nextInt();
        Image img = new Image(title, brightness);
        img.show();
    }


}