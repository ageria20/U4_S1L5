package playerMultimediale;

import interfaces.Volume;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        ElementoMultimediale[] lettoreMultimediale = new ElementoMultimediale[5];

        for (int i = 0; i < lettoreMultimediale.length; i++) {
            System.out.println("Che tipo di file vuoi creare?");
            System.out.println("Digita Audio");
            System.out.println("Digita Video");
            System.out.println("Digita Image");
            String type = scanner.nextLine();

            switch (type) {
                case "audio":
                    lettoreMultimediale[i] = audio();
                    break;
                case "video":
                    lettoreMultimediale[i] = video();
                    break;
                case "image":
                    lettoreMultimediale[i] = img();
                    break;
                default:
                    System.out.println("Inserisci il dato corretto");
                    i--;
                    break;


            }
        }

        while (true) {
            System.out.println("Scegli un opzione");
            System.out.println("1 - " + lettoreMultimediale[0].getTitle());
            System.out.println("2 - " + lettoreMultimediale[1].getTitle());
            System.out.println("3 - " + lettoreMultimediale[2].getTitle());
            System.out.println("4 - " + lettoreMultimediale[3].getTitle());
            System.out.println("5 - " + lettoreMultimediale[4].getTitle());
            int choosedValue = scanner.nextInt();

            if (choosedValue == 0) break;
            else {
                if (lettoreMultimediale[choosedValue - 1] instanceof Audio || lettoreMultimediale[choosedValue - 1] instanceof Video) {
                    ((Volume) lettoreMultimediale[choosedValue - 1]).play();
                } else {
                    ((Image) lettoreMultimediale[choosedValue - 1]).show();
                }
            }

        }

    }

    public static ElementoMultimediale audio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo");
        String title = scanner.nextLine();
        System.out.println("Inserisci una durata");
        int duration = scanner.nextInt();
        System.out.println("Inserisci un volume iniziale");
        int volume = scanner.nextInt();
        Audio audio = new Audio(title, duration, volume);

        return audio;
    }

    public static ElementoMultimediale video() {
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

        return video;
    }

    public static ElementoMultimediale img() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo");
        String title = scanner.nextLine();

        System.out.println("Inserisci una luminosita' iniziale");
        int brightness = scanner.nextInt();
        Image img = new Image(title, brightness);
        
        return img;
    }


}