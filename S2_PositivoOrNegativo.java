package Selectivas;
import java.util.Scanner;

public class S2_PositivoOrNegativo {
    public static void main(String[]args){
        /*
        Programa donde metas un numero y te diga 0,positivo o negativo
        */
        
        Scanner scanner=new Scanner(System.in);
        
        //variables
        int cuantosNum;
        
        //programa
        System.out.println("Cuantos numeros quieres ver");
        cuantosNum=scanner.nextInt();
        
        numeros(cuantosNum);
    }
    
    public static void numeros(int cuantosNum){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Dictame los numeros uno a uno");
        
        while(cuantosNum!=0){//comprobar los tres casos,mayor, menor o igual a 0
            int num=scanner.nextInt();
            if (num>0){
                System.out.println("Positivo");
            }
            else if (num<0){
                System.out.println("Negativo");
            }
            else{
                System.out.println("Zero 0");
            }
            cuantosNum--;//contador hasta que nos quedemos sin numeros a estudiar
        }
    }
}
