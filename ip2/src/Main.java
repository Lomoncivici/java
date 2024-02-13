import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        double rost, IMT, ves, voz, id_ves, dnev_norma_kaloriu;

        Scanner vvod = new Scanner(System.in);

        System.out.println("Введите свой вес в килограммах:");
        ves = vvod.nextDouble();

        System.out.println("Введите свой рост в метрах:");
        rost = vvod.nextDouble();

        System.out.println("Введите свой возраст:");
        voz = vvod.nextDouble();

        IMT = ves/(rost*rost);

        id_ves = 24.9*(rost*rost);

        double kall = 655.1 + (9.6 * ves) + (1.85 * rost) - (voz * 4.68);

        if (IMT > 24.9) {
            System.out.println("Ваш ИМТ:"+IMT+" Рекомендуется снизить вес для достижения идеального веса. Идеальный вес: ["+id_ves+"]. Необходимо сбросить: ["+(ves-id_ves)+"] кг. Рекомендуемый дневной прием калорий: "+(kall-500));
        }
        if (IMT < 18.5) {
            System.out.println("Ваш ИМТ:"+IMT+" Рекомендуется увеличить потребление пищи для набора веса. Идеальный вес: ["+id_ves+"]. Необходимо набрать: ["+(id_ves - ves)+"] кг. Рекомендуемый дневной прием калорий: "+(kall+500));
        }
        else if (IMT > 18.5 && IMT < 24.9) {
            System.out.println("Ваш ИМТ:"+IMT+"вес в норме."+" Рекомендуемый дневной прием калорий:"+kall);
        }
    }
}