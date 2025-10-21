public class Faktoriyel {
    public static void main(String[] args) {
        int n = 5;
        int sonuc = 1;

        System.out.print(n + "! = ");
        for (int i = n; i > 0; i--) {
            sonuc *= i;
            System.out.print(i);
            if (i != 1) System.out.print(" x ");
        }
        System.out.println(" = " + sonuc);
    }
}
