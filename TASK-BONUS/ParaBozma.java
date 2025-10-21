public class ParaBozma {
    public static void main(String[] args) {
        int miktar = 278;
        int yuz = miktar / 100;
        miktar %= 100;
        int elli = miktar / 50;
        miktar %= 50;
        int yirmi = miktar / 20;
        miktar %= 20;
        int bes = miktar / 5;
        miktar %= 5;
        int iki = miktar / 2;
        miktar %= 2;
        int bir = miktar;

        System.out.println("278 TL = ");
        System.out.println(yuz + " x 100");
        System.out.println(elli + " x 50");
        System.out.println(yirmi + " x 20");
        System.out.println(bes + " x 5");
        System.out.println(iki + " x 2");
        System.out.println(bir + " x 1");
    }
}
