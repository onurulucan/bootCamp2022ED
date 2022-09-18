public class Main {
    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;
        int totalNumber1 = 0;
        int totalNumber2 = 0;

        for (int i = 1; i<number1; i++){
            if (number1 % 2 == 0){
                totalNumber1 = totalNumber1 + i;
            }
        }
        for (int i = 1; i<number2; i++){
            if (number2 % 2 == 0){
                totalNumber2 = totalNumber2 + i;
            }
        }
        if (number1 == totalNumber2 && number2 == totalNumber1){
            System.out.println("Sayılar arkadaştır.");
        }






    }
}
