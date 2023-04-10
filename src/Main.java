public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
    public static void task3 () {
        System.out.println();
        System.out.println("Задача 3");
        float population = 12000000f;
        float birthRate = 17/1000f;
        float deathRate = 8/1000f;
        for (int i = 1; i<11; i++){
            float birth = population * birthRate;
            float death = population * deathRate;
            population = population + birth - death;
            System.out.println("Год " + i + ". Население " + (int)population);
        }
    }
    public static void task4 () {
        System.out.println();
        System.out.println("Задача 4");
        int deposit = 15000;
        double percent = 0.07;
        int targetMoney = 12000000;
        for (int month = 1;deposit<=targetMoney; month++){
            deposit += deposit*percent;
            System.out.println("Месяц " + month + ", сумма накоплений " + deposit);
        }
    }
    public static void task5 () {
        System.out.println();
        System.out.println("Задача 5");
        int deposit = 15000;
        double percent = 0.07;
        int targetMoney = 12000000;
        for (int month = 1;deposit<=targetMoney; month++){
                deposit += deposit * percent;
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + deposit);
            }
        }
    }
    public static void task6 () {
        System.out.println();
        System.out.println("Задача 6");
        int deposit = 15000;
        double percent = 0.07;
        int targetMonth = 9 * 12;
        for (int month = 1;month<=targetMonth; month++){
            deposit += deposit * percent;
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + deposit);
            }
        }
    }
}