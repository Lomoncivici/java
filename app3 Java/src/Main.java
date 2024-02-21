import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean DA = true;

        while (DA == true)
        {
            Scanner vvod = new Scanner(System.in);
            System.out.println("Введите строку:");

            String gg = vvod.nextLine();

            gg = gg.replaceAll("\\s+", "").toLowerCase();

            for (int i = 0; i < gg.length() / 2; i++) {
                if (gg.charAt(i) != gg.charAt(gg.length() - i - 1)) {
                    DA = false;
                    break;
                }
            }

            if (DA) {
                System.out.println("палиндром.");
            } else {
                System.out.println("не палиндром.");

            }
        }
    }
}