//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 0; i < 10; i++) {
            System.out.printf(i + 1 + " ");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.printf(i + " ");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 8");
        int monthlyDeposit = 29000;
        int monthlySum = 0;
        for (int i = 1; i <= 12; i++) {
            monthlySum = monthlySum + monthlyDeposit;
            System.out.println("Сумма накоплений за " + i + "-ый  месяц равна " + monthlySum + " рублей");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 8");
        float monthlyDeposit1 = 29000F;
        float monthlySum1 = 0F;
        for (int i = 1; i <= 12; i++) {
            monthlySum1 = monthlySum1 + monthlyDeposit1;
            monthlySum1 = (float) (monthlySum1 + (monthlySum1 * 0.01));
            System.out.println("Сумма вклада за " + i + "-ый месяц равна " + monthlySum1 + " рублей");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 10");
        System.out.println("Таблица умножения на 2:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");

    }
}