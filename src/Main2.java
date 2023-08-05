public class Main2 {
    public static String canGoOut(int age, double temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }


    public static void main(String[] args) {

        int age1 = 35;
        double temperature1 = 15;
        System.out.println(canGoOut(age1, temperature1));

        int age2 = 18;
        double temperature2 = 50;
        System.out.println(canGoOut(age2, temperature2));

        int age3 = 50;
        double temperature3 = 20;
        System.out.println(canGoOut(age3, temperature3));

        int age4 = 30;
        double temperature4 = 35;
        System.out.println(canGoOut(age4, temperature4));

        int age5 = 25;
        double temperature5 = 5;
        System.out.println(canGoOut(age5, temperature5));
    }
}
