import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     // Değişkenleri oluştur
     int mat, fizik, kimya, turkce, tarih, muzik;

      // Scanner sınfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6 ;
        System.out.println("Ortalamanız : " + ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçtiniz" : "Sınıfta kaldınız" ;
        System.out.println(sonuc);



            }
        }




