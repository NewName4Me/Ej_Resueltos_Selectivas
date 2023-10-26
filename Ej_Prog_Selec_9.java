package Selectivas;
import java.util.Scanner;

public class Ej_Prog_Selec_9 {
    public static void main(String[]args){
        /*
        Ordenador de tres numeros
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables 
        int num1;
        int num2;
        int num3;        
        int temp;        
        
        //programa
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();
        
         for(int i=0;i==2;i++){
             if (num1<num2){
                 temp=num2;
                 num2=num1;
                 num1=temp;
             }
             else if(num2<num3){
                 temp=num3;
                 num3=num2;
                 num2=temp;
             }
         }
         System.out.println(num1);
         System.out.println(num2);
         System.out.println(num3);
    }
}
