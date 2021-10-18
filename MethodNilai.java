import java.util.Scanner;

public class MethodNilai {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        
        System.out.println("-----------------------");
        System.out.println("|--- Rentang Nilai ---|" );
        System.out.println("-----------------------");
        System.out.println("|     A" + " : " +  "81 - 100    |" + "\n" +
                           "|     B" + " : " +  "61 - 80     |" + "\n" +
                           "|     C" + " : " +  "41 - 60     |"   + "\n" +
                           "|     D" + " : " +  "21 - 40     |" + "\n" +
                           "|     E" + " : " +  "0 - 20      |");
        System.out.println("-----------------------" + "\n");
        System.out.println("Silahkan masukkan nilai :  ");

        int nilai = data.nextInt();
        hasil(nilai);
    }
        
    static void hasil(int nilai){
        if(nilai >= 0 && nilai <= 20){
            System.out.println("Nilai Kamu adalah E");
        }else if(nilai >= 21 && nilai <= 40){
            System.out.println("Nilai Kamu adalah D");
        }else if (nilai >= 41 && nilai <= 60){
            System.out.println("Nilai Kamu adalah C");
        }else if (nilai >= 61 && nilai <= 80){
            System.out.println("Nilai Kamu adalah B");
        }else if (nilai >= 81 && nilai <= 100){
            System.out.println("Nilai Kamu adalah A");
        }else if (nilai >=100){
            System.out.println("Nilai yang kamu masukkan tidak sesuai");
        }

        }
}