package Selectivas;
import java.util.Scanner;

public class S1_MayorMenorIgual {
    public static void main(String[]args){
        /*
        metes dos numeros y te indica cual es mayor
        */
        Scanner scanner=new Scanner(System.in);

        //variables
        int num1;
        int num2;

        //programa
        System.out.println("tell me two numbers");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        
        
        mayores(num1,num2); 
    }
    
    public static void mayores(int num1, int num2){//comprobamos los tres casos posibles, mayor, igual o menor
        if (num1>num2){
            System.out.println(num1+" es mayor");
        }
        else if (num2>num1){
             System.out.println(num2+" es mayor");
        }
        else{
             System.out.println("son iguales");
        }
    }
}
