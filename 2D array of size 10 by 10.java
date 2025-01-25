//2D array of size 10 by 10
import.java.util.scanner;
public class TwoDArrayInput{
    public static void main(String[]args){
        int [][] arrays = new int [10][10];
        Scanner scanner = new scanner  (System.ln);
        System.out.println("Enter value for a 10 * 10 2D array:");
        for(int i=0; i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print("Enter value for position ["+i"] ["+j"]:");
                arrat[i][j]=Scanner.nextline();
                }
            }
            System.out.println("The vaue entered in the 10 * 10 2D array are :")
            for(int []row:array){
                for(int value:row){
                    System.out.print(value + "")
                }
                System.out.println();
            }
            scanner.close();
        }
    }