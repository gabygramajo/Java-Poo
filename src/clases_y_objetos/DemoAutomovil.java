package clases_y_objetos;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoAutomovil {
    public static void main(String[] args) {

        ArrayList<Automovil> concesionaria = new ArrayList<Automovil>();

        Automovil auto1 = new Automovil("Mazda", TipoAutomovil.PICKUP, "BT-50", Color.ROJO, 3.0);
        Automovil auto2 = new Automovil("Chevrolet", TipoAutomovil.COUPE, "Camaro", Color.AMARILLO, 3.0);
        Automovil auto3 = new Automovil("Dodge", TipoAutomovil.COUPE, "Charger", Color.AZUL, 3.0);
        Automovil auto4 = new Automovil("BMW", TipoAutomovil.COUPE, "M3", Color.NARANJA, 3.0);
        Automovil auto5 = new Automovil("Mercedes Benz", TipoAutomovil.SEDAN, "A200", Color.NEGRO, 3.0);

        concesionaria.addAll(Arrays.asList(auto1, auto2, auto3, auto4, auto5));

        System.out.println("auto1 == auto2: " + (auto1 == auto2));
        System.out.println("auto1 equals auto2: " + (auto1.equals(auto2)));
        System.out.println("auto5.getId() = " + auto5.getId());
        System.out.println("Velocidad max: " + Automovil.VELOLIDAD_MAX_CARRETERA);
        System.out.println("Velocidad max: " + Automovil.VELOLIDAD_MAX_CIUDAD);

        for (Automovil auto :
                concesionaria) {
            System.out.println("auto = " + auto);
        }

    }
}
