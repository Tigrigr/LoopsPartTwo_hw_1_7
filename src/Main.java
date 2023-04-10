public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int money = 15000;
        double percent = 0.01;
        int targetMoney = 2459000;
        int total = 0;
        int month = 1;

        while (total<targetMoney) {
            total += money + total * percent;
            System.out.println("Месяц " + month + ", количество накоплений " + total);
            month++;
        }
    }
    public static void task2 () {
        System.out.println();
        System.out.println("Задача 2");
        int total = 1;
        while (total < 11){
            System.out.print(total + " ");
            total += 1;
        }
        System.out.println();
        for (int i = 10; i > 0;i--){
            System.out.print(i + " ");
        }
    }
}