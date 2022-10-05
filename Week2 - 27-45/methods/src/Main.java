public class Main {
    public static void main(String[] args) {
int aranacak =3;
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 3, 5, 7, 9, 0};
        int aranacak = 3;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Var");
        } else {
            System.out.println("Sayı yok.");
        }
    }
    public static void mesajVer(int aranacak){
        System.out.println("Var");
    }
}