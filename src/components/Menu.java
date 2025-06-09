package components;

import model.Animal;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public String mostrarMenu(){
        String optMenu = "";
        boolean continuar = false;
        while(!continuar){
            System.out.println("Selecciona una opción: ");
            System.out.println("1. Crear un animal: ");
            System.out.println("2. Salir: ");
            System.out.print("");

            optMenu = sc.nextLine();

            switch (optMenu){
                case "1":
                    System.out.println("Escoge el tipo de animal: ");
                    continuar = true;
                    break;
                case "2":
                    continuar = true;
                    break;
                default:
                    System.out.println("opcion incorrecta por favor vuelva a intentarlo");
                    break;
            }
        }
        return optMenu;
    }
}
