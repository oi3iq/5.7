public class App {
    public static void main(String[] args) {
        double tuition = 10000; // initial tuition
        double rate = 0.05; // 5% increase rate

        for (int year = 1; year <= 10; year++) {
            tuition += tuition * rate;
        }

        System.out.printf("The tuition in ten years will be: $%.2f%n", tuition);
    }
}
