package vista;

// Clase que contendrá el método principal (main) para ejecutar el programa.

import logica.*;

public class main{ 

    /**
     * Función que demuestra el polimorfismo.
     * Puede recibir cualquier objeto que herede de Vehiculo.
     *
     * @param vehiculo El objeto Vehiculo a probar (puede ser Carro o Moto).
     */
    public static void probarArranque(Vehiculo vehiculo) {
        System.out.println("\n--- Probando Arranque ---");
        System.out.println("Vehículo recibido: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        
        // El método encender() se llama de forma uniforme, 
        // pero la acción es la definida en la clase base (Vehiculo).
        vehiculo.encender(); 
        
        // El método mostrarInfo() se llama de forma uniforme, 
        // pero Java ejecuta el método **sobrescrito** de la clase real del objeto (Carro o Moto).
        System.out.println(vehiculo.mostrarInfo()); 
    }

    /**
     * Método principal para ejecutar el programa y las pruebas.
     */
    public static void main(String[] args) {
        
        // Crear instancias de las clases hijas
        Carro miCoche = new Carro("Toyota", "Corolla", 2020, 4);
        Moto miMoto = new Moto("Honda", "CBR", 2023, true);

        System.out.println("--- Pruebas de Métodos Específicos ---");
        miCoche.tocarBocina();
        miMoto.hacerCaballito(); // Debe decir si está apagada inicialmente

        // -----------------------------------------------------------
        // 1. Demostración del POLIMORFISMO
        // -----------------------------------------------------------
        
        // La misma función 'probarArranque' opera con diferentes tipos de objetos.
        // Cuando recibe miCoche, llama a Carro.mostrarInfo().
        probarArranque(miCoche); 
        
        // Cuando recibe miMoto, llama a Moto.mostrarInfo().
        probarArranque(miMoto); 
        
        // -----------------------------------------------------------
    }
}
