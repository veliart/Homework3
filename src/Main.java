public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int populationRussia = 143400000;
        byte countriesNorthAmerica = 23;
        short countriesWorld = 193;
        long populationWorld = 7888000000L;
        float averageHumanWeight = 74.8f;
        double bitcoinRate = 29635.2;
        System.out.println("Значение переменной " + "populationRussia " + "с типом " + "int " + "равно " + populationRussia);
        System.out.println("Значение переменной " + "countriesNorthAmerica " + "с типом " + "byte " + "равно " + countriesNorthAmerica);
        System.out.println("Значение переменной " + "countriesWorld " + "с типом " + "short " + "равно " + countriesWorld);
        System.out.println("Значение переменной " + "populationWorld " + "с типом " + "long " + "равно " + populationWorld);
        System.out.println("Значение переменной " + "averageHumanWeight " + "с типом " + "float " + "равно " + averageHumanWeight);
        System.out.println("Значение переменной " + "bitcoinRate " + "с типом " + "double " + "равно " + bitcoinRate);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float firstVariable = 27.12f;
        long secondVariable = 987678965549L;
        float thirdVariable = 2.786f;
        short fourthVariable = 569;
        short fifthVariable = -159;
        short sixthVariable = 27897;
        byte seventhVariable = 67;
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte firstClassStudents = 23;
        byte secondClassStudents = 27;
        byte thirdClassStudents = 30;
        int totalStudents = firstClassStudents + secondClassStudents + thirdClassStudents;   // Можем преобразовать в тип byte: byte totalStudents = (byte) (firstClassStudents + secondClassStudents + thirdClassStudents);
        short totalPaper = 480;
        int paperForStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottlesPerTwoMinutes = 16;
        int bottlesPerMinute = bottlesPerTwoMinutes / 2; // Производительность в минуту.
        int bottlesPerTwentyMinutes = bottlesPerMinute * 20; // Производительность за 20 минут.
        int bottlesPerDay = bottlesPerMinute * 60 * 24; // производительность за сутки.
        int bottlesPerThreeDays = bottlesPerDay * 3; // Производительность за 3 дня.
        int bottlesPerMounth = bottlesPerDay * 30;  // Производительность за месяц при условии, что в месяце 30 дней.
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottlesPerMounth + " штук бутылок.");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalPaint = 120; // Всего банок краски.
        byte whitePaintOnRoom = 2; // Расход белой краски на одну комнату.
        byte brownPaintOnRoom = 4; // Расход коричневой краски на одну комнату.
        int paintOnRoom = whitePaintOnRoom + brownPaintOnRoom; // Общий расход краски на одну комнату.
        int totalRoom = totalPaint / paintOnRoom; // Количество комнат, которые можем покрасить.
        int totalWhitePaint = totalRoom * whitePaintOnRoom; // Общее количество белой краски.
        int totalBrownPaint = totalRoom * brownPaintOnRoom; // Общее количество коричневой краски.
        System.out.println("В школе, где " + totalRoom + " классов, нужно "+ totalWhitePaint + " банок белой краски и " + totalBrownPaint +" банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte amountBananas = 5;
        byte weightBananas = 80;
        short amountMilk = 200;
        float weightMilk = 105 / 100f; // вес 1 мл молока
        byte amountIcecream = 2;
        byte weightIcecream = 100;
        byte amountEggs = 4;
        byte weightEggs = 70;
        float weightBreakfastGram = amountBananas * weightBananas + amountMilk * weightMilk + amountIcecream * weightIcecream + amountEggs * weightEggs;
        float weightBreakfastKilogram = weightBreakfastGram / 1000;
        System.out.println("Вес спортивного завтрака составляет " + weightBreakfastGram + " грамм или " + weightBreakfastKilogram + " килограмм.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte weightLossKilogram = 7;
        int weightLossGram = weightLossKilogram * 1000;
        short weightLossFirstDiet = 250;
        int dayFirstDiet = weightLossGram / weightLossFirstDiet;
        short weightLossSecondDiet = 500;
        int daySecondDiet = weightLossGram / weightLossSecondDiet;
        short averageWeightLoss = (250 + 500) / 2;
        float averageDayDiet = (float) weightLossGram / averageWeightLoss; // перевод во float, так как получается дробное значение. По логике следует округлить до целого большего числа метдом Math.ceil(), но мы это еще не проходили)
        System.out.println("Если спортсмен каждый день будет худеть на " + weightLossFirstDiet + " грамм, потребуется " + dayFirstDiet + " дней.");
        System.out.println("Если спортсмен каждый день будет худеть на " + weightLossSecondDiet + " грамм, потребуется " + daySecondDiet + " дней.");
        System.out.println("Если спортсмен каждый день будет худеть, в среднем, на " + averageWeightLoss + " грамм, потребуется " + averageDayDiet + " дней.");
    }
    public static void task8(){
        System.out.println("Задача 8");
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryCristina = 76230;
        int raiseSalaryMaria = (int) (salaryMaria * 1.1f); // Преобразовываем в int, потому что все заработные платы кратны 10, повышение на 10% будет целым числом.
        int yearSalaryMaria = salaryMaria * 12;
        int raiseYearSalaryMaria = raiseSalaryMaria * 12;
        int diffSalaryMaria = raiseYearSalaryMaria - yearSalaryMaria;
        int raiseSalaryDenis = (int) (salaryDenis * 1.1f); // Преобразовываем в int, потому что все заработные платы кратны 10, повышение на 10% будет целым числом.
        int yearSalaryDenis = salaryDenis * 12;
        int raiseYearSalaryDenis = raiseSalaryDenis * 12;
        int diffSalaryDenis = raiseYearSalaryDenis - yearSalaryDenis;
        int raiseSalaryCristina = (int) (salaryCristina * 1.1f); // Преобразовываем в int, потому что все заработные платы кратны 10, повышение на 10% будет целым числом.
        int yearSalaryCristina = salaryCristina * 12;
        int raiseYearSalaryCristina = raiseSalaryCristina * 12;
        int diffSalaryCristina = raiseYearSalaryCristina - yearSalaryCristina;
        System.out.println("Маша теперь получает " + raiseYearSalaryMaria + " рублей. Годовой доход вырос на " + diffSalaryMaria + " рублей.");
        System.out.println("Денис теперь получает " + raiseYearSalaryDenis + " рублей. Годовой доход вырос на " + diffSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + raiseYearSalaryCristina + " рублей. Годовой доход вырос на " + diffSalaryCristina + " рублей.");
    }
}