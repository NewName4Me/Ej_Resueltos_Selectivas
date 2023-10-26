package Selectivas;
import java.util.Scanner;

public class S3_ParOImpar {
    public static void main(String[]args){
        /*
        Lee una lista de numeros e indica si es par o impar
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        int cuantosNum;
        
        //programa
        System.out.print("Cuántos números quieres ver?:");
        cuantosNum=scanner.nextInt();
        
        pares(cuantosNum);

    }
    
    public static void pares(int cuantosNum){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dictame los numeros uno a uno");
        
        while(cuantosNum!=0){//vemos los dos casos posibles
            int num=scanner.nextInt();
            if (num%2==0){
                System.out.println("par");
            }
            else{
                System.out.println("Impar");
            }
            cuantosNum--;//restamos uno a uno hasta que nos quedamos sin numeros a estudiar
        }
    }
}
