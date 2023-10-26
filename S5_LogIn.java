package Selectivas;
import java.util.Scanner;

public class S5_LogIn {
    public static void main(String[]args){
        /*
        Programa donde pide usuario y contraseña, si estas no son igual a Pepe y asdasd, que no le de acceso
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        String user="Pepe";
        String password="asdasd";
        String newUser="";
        String newPassword="";
        
        //programa
        System.out.print("Nombre: ");
        newUser=scanner.next();
        System.out.print("Contraseña: ");
        newPassword=scanner.next();
        
        if (user.equals(newUser) && password.equals(newPassword)){//comprueba que sean iguales 
            System.out.println("Bienvenido");
        }
        else{
            System.out.println("Error");
        }

    }
}
