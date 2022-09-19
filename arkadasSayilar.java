public class Main {
    public static void main(String[] args) {

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for(int i=1;i<sayi1;i++){
            if (sayi1%i==0){
                toplam1 = toplam1 +i;
            }
        }
        for(int i=1;i<sayi2;i++){
            if (sayi2%i==0){
                toplam2 = toplam2 +i;
            }
        }
        if (sayi1==toplam2 && sayi2 == toplam1) {
            System.out.println("bu iki sayı arkadaştır.");
        }else{
            System.out.println("bu iki sayı arkadaş değildir");
        }

        /*
        //Kendi Yaptığım
        //220-284

        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++)
        {
            if (number1 % i == 0) {
                total1 = total1 + i;

            }
        }System.out.println(total1);

        for (int j = 1; j < number2; j++)
        {
            if (number2 % j == 0) {
                total2 = total2 + j;

            }
        }System.out.println(total2);

         */
    }

}