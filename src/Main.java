import components.Menu;
import controller.AnimalController;
import model.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String optMenu;
        Map<String, List<Animal>> clasificacion = new HashMap<>();  // Mapa para almacenar los animales clasificados por tipo
        AnimalController animalC = new AnimalController();

        // Inicializar el Map con listas vacías para cada tipo de animal
        clasificacion.put("Terrestre", new ArrayList<>());
        clasificacion.put("Aéreo", new ArrayList<>());
        clasificacion.put("Acuático", new ArrayList<>());

        // Crear un menú
        Menu menuPrincipal = new Menu();
        optMenu = menuPrincipal.mostrarMenu();

        // Bucle para interactuar con el usuario
        while (!optMenu.equals("2")) {
            Animal animalNuevo = animalC.crearAnimal();  // Crear un nuevo animal

            // Clasificar el animal y agregarlo al Map correspondiente
            clasificacion.get(animalNuevo.getTipo()).add(animalNuevo);

            // Mostrar los animales clasificados al final
            imprimirClasificacion(clasificacion);

            // Volver a mostrar el menú
            optMenu = menuPrincipal.mostrarMenu();
        }

        System.out.println("Saliste del programa");
    }

    // Método para imprimir la clasificación de los animales
    public static void imprimirClasificacion(Map<String, List<Animal>> clasificacion) {
        System.out.println("\nClasificación de Animales:");

        // Recorremos el mapa e imprimimos los animales clasificados
        for (String tipo : clasificacion.keySet()) {
            System.out.println(tipo + ":");
            for (Animal animal : clasificacion.get(tipo)) {
                // Imprimir el nombre del animal con indentación
                System.out.println("    " + animal.getNombreAnimal());
            }
        }
    }
}
