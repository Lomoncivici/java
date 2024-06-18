//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main
    {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner vvod = new Scanner(System.in);
            System.out.println("рецепт пельменей");
            System.out.println("Введите граммовку для ингредиентов:\n");

            String a, b, c, d, f, y;

            System.out.println("тесто:");
            System.out.println("1) мука");
            System.out.println("2) дрожжи");
            System.out.println("3) вода\n");
            System.out.println("пельмени:");
            System.out.println("1) тесто");
            System.out.println("2) мясо");
            System.out.println("3) вода\n");
            System.out.println("введите граммовку по очереди\n");

            d = vvod.next();
            f = vvod.next();
            y = vvod.next();
            a = vvod.next();
            b = vvod.next();
            c = vvod.next();

            PrintWriter gg = new PrintWriter ("Рецепт.txt");
            gg.println("рецепт пельменей\n\nтесто:\n1) мука "+d+" гр\n2) дрожжи "+f+" гр\n3) вода "+y+" мл\n\n"+"пельмени:\n1) тесто "+a+" гр\n2) мясо "+b+" гр\n3) вода "+c+" мл");
            gg.close();
        }
    }
