public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo = 70.0; // kg
        double boy = 1.75;  // metre
        double bmi = kilo / (boy * boy);

        System.out.printf("Kilo: %.1f kg, Boy: %.2f m\n", kilo, boy);
        System.out.printf("BMI = %.2f\n", bmi);
    }
}
