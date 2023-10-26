package Selectivas;
import java.util.Scanner;

public class S8_CondicionesParaEntrar {
    public static void main(String[]args){
        /*
        pedir nota, sexo y edad. y segun que nos de mostrar aceptado, posible o no aceptado
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        int edad;
        String sexo="";//deberia hacerlo como char pero no se como hacerle el scanner entonces
        int nota;
        
        //programa
        System.out.print("Dime tu nota: ");
        nota=scanner.nextInt();
        System.out.print("Dime tu sexo: ");
        sexo=scanner.next();
        System.out.print("Dime tu edad: ");
        edad=scanner.nextInt();
        
        
        if (nota>=5 && sexo.equals("F") && edad>=18){
            System.out.println("Aceptada");
        }
        else if(nota>=5 && sexo.equals("M") && edad>=18){
            System.out.println("Posible");
        }
        else{
            System.out.println("Rechazada");
        }
    }
}
