import java.util.Random;

public class Main3 {

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static String canGoOut(int age) {
        if (age >= 20 && age <= 45) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static void main(String[] args) {
        // Генерируем случайный возраст и температуру
        int randomAge = generateRandomAge();


        System.out.println("Возраст: " + randomAge);


        String result = canGoOut(randomAge);
        System.out.println(result);
    }
}

