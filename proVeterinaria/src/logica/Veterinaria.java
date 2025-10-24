package logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan Sierra Arrieta - 0222420035
 */
public class Veterinaria {
    private ArrayList<Animal> animales;

    public Veterinaria() {
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Veterinaria:\n");
        for (Animal animal : animales) {
            sb.append(animal.toString()).append("\n");
        }
        return sb.toString();
    }
}
