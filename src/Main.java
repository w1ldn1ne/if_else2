public class Main {
    public static void main(String[] args) {
        //Первое задание
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Второе задание
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear >= 2015 && clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Третье задание
        int year = 2024;
        if (year > 1584){
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            }
            else {
                System.out.println(year + " год не является високосным");
            }
        }
        else {
            System.out.println("Год не может быть меньше 1584");
        }

        //Четвертое задание
        int deliveryDistance = 95;
        int timeDelivery = 0;
        if (deliveryDistance <= 20){
            timeDelivery = 1;
            System.out.println("Потребуется дней: " + timeDelivery);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            timeDelivery = 2;
            System.out.println("Потребуется дней: " + timeDelivery);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100){
            timeDelivery = 3;
            System.out.println("Потребуется дней: " + timeDelivery);
        }
        if (deliveryDistance > 100){
            System.out.println("Слишком далеко, доставка не осуществима");
        }

        //Пятое задание
        int monthNumber = 12;
        if (monthNumber > 12){
            System.out.println("Месяцев не может быть больше 12");
        }
        switch (monthNumber){
            case 1, 2, 12:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Зима");
                break;
            case 3, 4, 5:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Весна");
                break;
            case 6, 7, 8:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Лето");
                break;
            case 9, 10, 11:
                System.out.println("Месяц " + monthNumber + " принадлежит сезону Осень");
                break;
        }
    }
}