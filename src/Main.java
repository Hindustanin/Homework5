//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        short clientDeviceYear = 2017;
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        short year = 2021;
        if (year < 1584) {
            System.out.println("В " + year + " году понятия 'високосным год' не существовало");
        } else if (year % 4 == 0 && year % 400 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задача 4
        System.out.println();
        System.out.println("Задача 4");

        int deliveryDistance = 95 ;
        byte deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance  <= 60) {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не осуществляется");
        }
        // Задача 5
        System.out.println();
        System.out.println("Задача 5");

        byte monthNumber = 5;
        switch (monthNumber) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Зима");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Весна");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Лето");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}