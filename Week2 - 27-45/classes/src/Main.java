public class Main {
    public static void main(String[] args) {
        // REFERENCE TYPE
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();


        // "integer" değer tipte olduğu için çıktısı 30'dur
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi1);


        // "Array" olduğu için referans tiptir ve çıktısı 10'dur
        int[] sayilar1 = {1,2,3};
        int[] sayilar2 = {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

    }
}

