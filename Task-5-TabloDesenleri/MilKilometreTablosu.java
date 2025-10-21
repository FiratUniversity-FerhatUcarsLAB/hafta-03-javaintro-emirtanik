public class MilToKm {
    public static void main(String[] args) {
        double mil[] = {1, 5, 10, 20, 50};
        System.out.println("Mil     Kilometre");
        System.out.println("------------------");
        for (int i = 0; i < mil.length; i++) {
            double km = mil[i] * 1.609;
            System.out.printf("%.0f     %.3f\n", mil[i], km);
        }
    }
}
