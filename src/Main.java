public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte pencil = 2;
        short people = 32500;
        int rubles = 2100000000;
        long atoms = 9875432154812L;
        float kilometres = 0.16412f;
        double kilograms = 8.2369745681568;
        boolean budgetSurplus = rubles > 10000;
        char plus = 43;

        //Задание 2
        double firstFighter = 78.2;
        double secondFighter = 82.7;
        double totalWeight = firstFighter + secondFighter;
        System.out.println("Общий вес бойцов составляет " + totalWeight + " кг.");
        double weightDifference = Math.abs(firstFighter - secondFighter);
        System.out.println("Разница между весами бойцов составляет " + weightDifference + " кг.");

        //Задание 3
        double bananas = 80;
        double milk = 105;
        double icecream = 100;
        double eggs = 70;
        double sum = bananas * 5 + milk * 2 + icecream * 2 + eggs * 4;
        double sumKg = sum / 1000;
        System.out.println("Общий веc завтрака составляет " + (sumKg) + " кг.");


        //Задание 4
        double kg = 7;
        double variant1 = 0.250;
        double variant2 =0.500;
        double variantAverage = (variant1 + variant2) / 2;
        double variant1NumberOfDays = kg / variant1;
        double variant2NumberOfDays = kg / variant2;
        double variantAverageNumberOfDays = kg / variantAverage;
        double variant1IncompleteDays = kg % variant1;
        double variant2IncompleteDays = kg % variant2;
        double variantAverageIncompleteDays = kg % variantAverage;
        int variant1NumberOfDaysInteger = (int) (variant1NumberOfDays);
        int variant2NumberOfDaysInteger = (int) (variant2NumberOfDays);
        int variantAverageNumberOfDaysInteger = (int) (variantAverageNumberOfDays);
        if (variant1IncompleteDays == 0) {
            System.out.println("Если терять по 250 гр в день, на похудение уйдет "  + variant1NumberOfDaysInteger + " дней.");
        } else {
            System.out.println("Если терять по 250 гр в день, на похудение уйдет " + (variant1NumberOfDaysInteger + 1) + " дней.");
        }
        if (variant2IncompleteDays == 0) {
            System.out.println("Если терять по 500 гр в день, на похудение уйдет "  + variant2NumberOfDaysInteger + " дней.");
        } else {
            System.out.println("Если терять по 500 гр в день, на похудение уйдет " + (variant2NumberOfDaysInteger + 1) + " дней.");
        }
        if (variantAverageIncompleteDays == 0) {
            System.out.println("В среднем на похудение уйдет "  + variantAverageNumberOfDaysInteger + " дней.");
        } else {
            System.out.println("В среднем на похудение уйдет " + (variantAverageNumberOfDaysInteger + 1) + " дней.");
        }

        //Задание 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryNewMasha = salaryMasha * 110 / 100;
        int salaryNewDenis = salaryDenis * 110 / 100;
        int salaryNewKristina = salaryKristina * 110 / 100;
        int differenceAnnualIncomeMasha = (salaryNewMasha - salaryMasha) * 12;
        int differenceAnnualIncomeDenis = (salaryNewDenis - salaryDenis) * 12;
        int differenceAnnualIncomeKristina = (salaryNewKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + salaryNewMasha + " рублей. Годовой доход вырос на " + differenceAnnualIncomeMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryNewDenis + " рублей. Годовой доход вырос на " + differenceAnnualIncomeDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryNewKristina + " рублей. Годовой доход вырос на " + differenceAnnualIncomeKristina + " рублей.");

    }
}