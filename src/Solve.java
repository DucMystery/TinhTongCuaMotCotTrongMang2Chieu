import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {

        int myArr [][] = {{1,2},{2,3},{3,4}};

        Scanner  scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao cot can tinh");
        int cols = scanner.nextInt();
        sumCols(myArr,cols);

    }

    public static void sumCols(int arr[][],int cot){
        int sum =0;
        for (int i =0;i<3;i++){
            for (int j=0;j<2;j++){
                if (j==cot){
                    sum +=arr[i][j];
                }
            }
        }
        System.out.printf("Tong cot %d co gia tri %d",cot,sum);
    }
}
