package playerMultimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un titolo");
        String title = scanner.nextLine();
        System.out.println("Inserisci una durata");
        int duration = scanner.nextInt();
        System.out.println("Inserisci il volume  e premi invio per fare Play");
        int volume = scanner.nextInt();

        Audio audio = new Audio(title, duration, volume);
        audio.play();
        audio.volumeUp();


    }
}