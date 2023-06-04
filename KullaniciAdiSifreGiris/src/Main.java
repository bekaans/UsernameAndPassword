import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yeni üyelik için kullanıcı adınızı giriniz :");
        String username = input.nextLine();
        System.out.print("Yeni üyelik için şifrenizi giriniz :");
        String password = input.nextLine();

        System.out.print("Üyeliğiniz Başarılı Tekrar Giriş Yapmanız Gerek \nKullanıcı Adı :");
        String denemeisim = input.nextLine();
        System.out.print("Şifre :");
        String denemesifre = input.nextLine();

        if (username.equals(denemeisim) && password.equals(denemesifre)) {
            System.out.println("Hoşgeldiniz");
        } else {
            System.out.println("Bilgileriniz Hatalı");
        }
    }
}