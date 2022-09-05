import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, bool,newPassword;
        Scanner scanner=new Scanner(System.in);
        System.out.println("kullanıcı adınızı giriniz");
        userName=scanner.nextLine();
        System.out.println("şifreniz");
        password=scanner.nextLine();

        if (userName.equals("patika")&& password.equals("java123")){
            System.out.println("giriş yaptınız");
        }
        else {
            System.out.println("bilgiler yanlış\n şifrenizi sıfırlamak ister misiniz");
            bool=scanner.nextLine();
            if (bool.equals("evet")){
                System.out.println("yeni şifre giriniz");

                for (;;){
                    newPassword=scanner.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.println("Şifre oluşturulamadı lütfen başka bir şifre giriniz");

                    }else {
                        System.out.println("şifre oluşturuldu");
                        break;
                    }
                }

            }
        }
    }
}
