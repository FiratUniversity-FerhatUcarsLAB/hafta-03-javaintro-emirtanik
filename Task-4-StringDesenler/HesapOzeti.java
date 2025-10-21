public class AlisverisOzeti {
    public static void main(String[] args) {
        String urun1 = "Ekmek";
        String urun2 = "Süt";
        String urun3 = "Yumurta";

        int miktar1 = 2, miktar2 = 1, miktar3 = 10;
        double fiyat1 = 5.0, fiyat2 = 15.5, fiyat3 = 2.0;

        System.out.println("======================================");
        System.out.println(" ÜRÜN          MİKTAR     FİYAT     TOPLAM");
        System.out.println("======================================");
        System.out.printf(" %-12s %4d %10.2f %10.2f\n", urun1, miktar1, fiyat1, miktar1 * fiyat1);
        System.out.printf(" %-12s %4d %10.2f %10.2f\n", urun2, miktar2, fiyat2, miktar2 * fiyat2);
        System.out.printf(" %-12s %4d %10.2f %10.2f\n", urun3, miktar3, fiyat3, miktar3 * fiyat3);
        System.out.println("======================================");
    }
}
