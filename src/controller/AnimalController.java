package controller;

import model.Animal;

import java.util.Scanner;

public class AnimalController {

    Scanner sc = new Scanner(System.in);

    public Animal crearAnimal() {
        System.out.println("Ingresa el nombre del animal: ");
        String nombreAnimal = sc.nextLine();

        // Determinar el tipo de animal (terrestre, aéreo, acuático)
        String tipoAnimal = tipoAnimal();

        // Ingresar el género
        System.out.println("Ingresa el género del animal (masculino/femenino): ");
        String generoAnimal = sc.nextLine();

        // Crear el objeto Animal con los datos ingresados
        return new Animal(nombreAnimal, tipoAnimal, generoAnimal);
    }

    // Método para escoger el tipo de animal
    public String tipoAnimal() {
        String tipo;
        String tipoReturn = "";
        boolean continuar = false;

        System.out.println("Selecciona el tipo de animal:");
        System.out.println("1. Terrestre");
        System.out.println("2. Aéreo");
        System.out.println("3. Acuático");

        while (!continuar) {
            tipo = sc.nextLine();
            switch (tipo) {
                case "1":
                    tipoReturn = "Terrestre";
                    continuar = true;
                    break;
                case "2":
                    tipoReturn = "Aéreo";
                    continuar = true;
                    break;
                case "3":
                    tipoReturn = "Acuático";
                    continuar = true;
                    break;
                default:
                    System.out.println("Valor incorrecto, ingrésalo nuevamente.");
            }
        }

        return tipoReturn;
    }
}
