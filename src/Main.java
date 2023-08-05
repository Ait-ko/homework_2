public class Main {


    public static void main(String[] args) {
        int age = 25;
        double temperature = 25;
        String result = checkWeather(age, temperature);
        System.out.println(result);
    }

    public static String checkWeather(int age, double temperature) {

        if (age < 0 || temperature < -60 || temperature > 90) {
            return "Некорректный Ответ";
        } else if (age < 18 && temperature > 30) {
            return "На улице жарко, лучше оставайтесь дома";
        } else if (age >= 18 && temperature < 0) {
            return "На улице холодно, оденьтесь по теплее";
        } else {
            return "На улице погода нормальная, можно идти гулять";
        }
    }

}





