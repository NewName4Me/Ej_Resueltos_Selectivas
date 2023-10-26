package Selectivas;
import java.util.Scanner;

public class S4_Divide {
    public static void main(String[]args){
        /*
        division de dos numeros, en caso de que sea cero,pedir de nuevo
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        double dividendo;//necesito que sean dobles si no falla con las divisiones decimales
        double divisor;
        
        //programa
        System.out.print("Dame el numero a dividir(dividendo: )");
        dividendo=scanner.nextDouble();
        
        do{
            System.out.print("Dame el divisor: ");
            divisor=scanner.nextDouble();
        }while(divisor==0);//se asegura de que el divisor sea distinto de cero
        
        double resul=dividendo/divisor;
        
        System.out.println(resul);
    
    }
}
