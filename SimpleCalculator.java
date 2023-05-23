import java.util.Scanner;

public class SimpleCalculator {

        public static void main(String[] args){
            Scanner scanner= new Scanner(System.in);
            System.out.println("***************************");
            String islemler = "1.Toplama işlemi\n"
                    + "2.Çıkarma işlemi\n"
                    + "3.Çarpma işlemi\n"
                    + "4.Bölme işlemi";
            System.out.println(islemler);
            System.out.println("***************************");
            System.out.println("İşlemi seçiniz");
            String islem = scanner.nextLine();
            int a;
            int b;

            switch(islem){
                case "1":
                    System.out.println("Birinci sayı");
                    a = scanner.nextInt();
                    System.out.println("İkinci sayı");
                    b = scanner.nextInt();
                    System.out.println("Toplam:"+(a+b));
                    break;

                case "2":
                    System.out.println("Birinci sayı");
                    a = scanner.nextInt();
                    System.out.println("İkinci sayı");
                    b = scanner.nextInt();
                    System.out.println("Fark:"+(a-b));
                    break;

                case "3":
                    System.out.println("Birinci sayı");
                    a = scanner.nextInt();
                    System.out.println("İkinci sayı");
                    b = scanner.nextInt();
                    System.out.println("Çarpım:"+(a*b));
                    break;

                case "4":
                    System.out.println("Birinci sayı");
                    a = scanner.nextInt();
                    System.out.println("İkinci sayı");
                    b = scanner.nextInt();
                    System.out.println("Bölüm:"+((double)a/b));
                    break;
                default:
                    System.out.println("Geçersiz sayı...");
            }
        }
    }
