
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte pClientOS = 0;
        if (pClientOS == 0) {
            System.out.println("Установлена система IOS");
        } else {
            System.out.println("Установлена система Android");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte pClientOS = 1;
        int pClientDeviceYear = 2015;
        switch (pClientOS){
            case 0:
                if (pClientDeviceYear<2015) {
                    System.out.println("Установлена система IOS ранее 2015 года, установите облегченную версию программы");
                } else {
                    System.out.println("Установлена система IOS позднее 2014 года, установите обычную версию программы");
                }
                break;
            case 1:
                if (pClientDeviceYear<2015) {
                    System.out.println("Установлена система Android ранее 2015 года, установите облегченную версию программы");
                } else {
                    System.out.println("Установлена система Android позднее 2014 года, установите обычную версию программы");
                }
                break;
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int pYear = 1604;
        int pProverka = pYear%4;
        if (pProverka == 0) {
            switch (pProverka){
                case 0:
                    if (pYear%400 == 0){
                        System.out.println(pYear + " високосный год!");
                    } else if (pYear%100 == 0){
                        System.out.println(pYear + " не високосный год");
                    }else {
                        System.out.println(pYear + " високосный год");
                    }
                    break;
            }
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int pDeliveryDistance = 107;
        if (pDeliveryDistance<20) {
            System.out.println("срок доставки карты 1 день");
        } else if (pDeliveryDistance > 20 && pDeliveryDistance <60) {
            System.out.println("срок доставки карты 2 дня");
        } else if (pDeliveryDistance > 60 && pDeliveryDistance <100) {
            System.out.println("срок доставки карты 3 дня");
        } else if (pDeliveryDistance >100) {
            System.out.println("срок доставки карты не возможен");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int pMonthNumber = 1;
        switch (pMonthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(pMonthNumber + " Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(pMonthNumber + " Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(pMonthNumber + " Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(pMonthNumber + " Осень");
                break;
            default:
                System.out.println(pMonthNumber + " Такого месяца не существует");
        }

    }


}