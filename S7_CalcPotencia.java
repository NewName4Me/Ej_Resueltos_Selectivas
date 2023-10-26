package Selectivas;
import java.util.Scanner;

public class S7_CalcPotencia {
    public static void main(String[]args){
        /*
        algoritmo que calcule la potencia teniendo en cuenta cuando el exponenete es 
        postivios,negativo y 0
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        double base;
        double expo;
        double resul;
        
        //programa
        System.out.print("Dame la base: ");
        base=scanner.nextDouble();
        System.out.print("Dame el exponente: ");
        expo=scanner.nextDouble();
        
        if (expo>0){
            resul=Math.pow(base,expo);
        }
        else if(expo<0){
            resul=1/Math.pow(base,-expo);//la inversa de la potencia
        }
        else {
            resul=1;
        }
        
        System.out.println(resul);
    }
}
