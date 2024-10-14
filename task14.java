package week6;

public class task14 {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 1.07;
        int years = 0;

        while (tuition < 20000) {
            tuition *= rate;
            years++;
        }
        System.out.println("Tuition will be doubled in " + years + " years");
        System.out.printf("Tuition will be $%.2f in " + years + " years%n", tuition);
    }
}
