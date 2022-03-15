import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        double ortalama;
        String sonuc;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Matematik Notunuzu Girin:");
        mat = input.nextInt();
        System.out.println("Lütfen Fizik Notunuzu Girin:");
        fizik = input.nextInt();
        System.out.println("Lütfen Kimya Notunuzu Girin:");
        kimya = input.nextInt();
        System.out.println("Lütfen Türkçe Notunuzu Girin:");
        turkce = input.nextInt();
        System.out.println("Lütfen Tarih Notunuzu Girin:");
        tarih = input.nextInt();
        System.out.println("Lütfen Müzik Notunuzu Girin:");
        muzik = input.nextInt();
        ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Not Ortalamanız:");
        System.out.println(ortalama);
        sonuc = ortalama > 60.0 ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
