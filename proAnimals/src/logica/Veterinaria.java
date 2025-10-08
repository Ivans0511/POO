package logica;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private List<Animal> animales;

    public Veterinaria() {
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public List<Animal> getAnimales() {
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

