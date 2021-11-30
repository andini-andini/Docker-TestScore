import java.util.Scanner;

public class Matriks_kali {
    public  static  void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Baris Matriks A");
        int b = input.nextInt();

        System.out.println("Masukkan Kolom Matriks A");
        int k = input.nextInt();

        int[][] A = new int[b][k];

        for (int a = 0; a < A.length; a++){
            for (int c = 0; c < A[a].length; c++){
                System.out.print("Nilai Matriks A[" + a + "]" + "[" + c + "] : ");
                A[a][c] = input.nextInt();
            }
        }

        for (int a = 0; a < A.length; a++){
            for (int c = 0; c < A[a].length; c++){
                System.out.print(A[a][c] + "\t");
            }
            System.out.println("");
        }

        System.out.println("Masukkan Baris Matriks B");
        int b2 = input.nextInt();

        System.out.println("Masukkan Kolom Matriks b");
        int k2 = input.nextInt();


        if (k != b2){
            System.out.println("Maaf, kolom matriks A dan baris Matriks B tidak sama");
        }else {

            int sum =0;
            int[][] B = new int[b2][k2];

            for (int a = 0; a < B.length; a++) {
                for (int c = 0; c < B[a].length; c++) {
                    System.out.print("Nilai Matriks B[" + a + "]" + "[" + c + "] : ");
                    B[a][c] = input.nextInt();
                }
            }

            for (int a = 0; a < B.length; a++) {
                for (int c = 0; c < B[a].length; c++) {
                    System.out.print(B[a][c] + "\t");
                }
                System.out.println("");
            }

            int[][] C = new int[b][k2];

            for (int i = 0; i < C.length; i++){
                for (int j = 0; j < C[i].length ; j++){
                    for (int K = 0; K < b2;K++){
                        sum += A[i][K] * B[K][j];
                    }
                    C[i][j] = sum;
                    sum = 0;
                }
            }

            System.out.println("Hasil Perkalian Matriks A dan B");
            for (int i = 0; i < C.length; i++){
                for (int j = 0; j < C[i].length ; j++){
                   System.out.print(C[i][j] + "\t");
                }
                System.out.println("");
            }

        }

    }
}
