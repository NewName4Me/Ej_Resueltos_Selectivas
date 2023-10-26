package Selectivas;
import java.util.Scanner;

public class S6_TieneMayusculas {
    public static void main(String[]args){
        /*
        le pedimos un texto y le indicamos si su texto contenia alguna minuscula
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        String texto="";
        
        //programa
        System.out.print("Dime lo que quieras: ");
        texto=scanner.next();
        
        String textoMayus=texto.toUpperCase();
        
        if (textoMayus.equals(texto)){
            System.out.println("Tu texto era todo mayusculas");
        }
        else{
            System.out.println("Tu texto contenía minusculas");
        }
    }
}
