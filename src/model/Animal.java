package model;

public class Animal {
    private String nombreAnimal;
    private String tipo;  // Terrestre, Aéreo, Acuático
    private String genero; // Masculino, Femenino

    // Constructor que asigna todos los atributos
    public Animal(String nombreAnimal, String tipo, String genero) {
        this.nombreAnimal = nombreAnimal;
        this.tipo = tipo;
        this.genero = genero;
    }

    // Getters y Setters
    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombreAnimal='" + nombreAnimal + '\'' +
                ", tipo='" + tipo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
