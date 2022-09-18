public class Main {
    public static void main(String[] args) {
        // MÜKEMMEL SAYI : KENDİNDEN BAŞKA POZİTİF TAM BÖLENLERİN SAYISI KENDİSİNE EŞİT OLAN SAYI

        int perfectNumber = 27;
        int total = 0;

        for (int  i= 1; 1<perfectNumber; i++) {
            if (perfectNumber % i == 0){
                total = total + i;
                if(total == perfectNumber){
                    System.out.println("Sayı mükemmeldir.");
                }else {
                    System.out.println("Sayı mükemmel değildir.");
                    break;
                }

            }

            }
        }

    }
