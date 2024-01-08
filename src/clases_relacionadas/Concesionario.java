package clases_relacionadas;

import java.util.Arrays;

public class Concesionario {
    private Automovil[] catalogoDeAutomoviles;

    public Concesionario() {
    }

    public void agregarAutomoviles(Automovil[] automoviles) {
        catalogoDeAutomoviles = automoviles;
    }

    public void mostrarAutomoviles() {
        if (catalogoDeAutomoviles.length > 0)
            for (int i = 0; i < catalogoDeAutomoviles.length; i++) {
                System.out.println((i + 1 ) + " - " + catalogoDeAutomoviles[i].descripcionConductor());
            }
    }

    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCategoria(Categoria.COUPE);
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        Persona conductorSubaru = new Persona("Lucía", "Martínez", Sexo.FEMENINO, 20);
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(new Rueda("Yokohama", 16, 7.5));

        Automovil mazda = new Automovil(
                "Mazda", "BT-50", Color.ROJO,
                new Motor(3.0, TipoMotor.DIESEL),
                Categoria.PICKUP
        );
        mazda.setEstanque(new Estanque(45));
        mazda.setConductor(new Persona("Patricia", "Rodríguez", Sexo.FEMENINO, 28));
        mazda.setRuedas( new Rueda("Michelin", 18, 10.5));

        Automovil nissan = new Automovil(
                "Nissan", "Navara",
                Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),
                Categoria.PICKUP, new Estanque(50),
                new Persona("Beatriz", "González", Sexo.FEMENINO, 32)
        );
        nissan.setRuedas(new Rueda("Pirelli", 20, 11.5));


        Automovil susuki = new Automovil(
                "Susuki", "Vitara",
                Color.AZUL,
                new Motor(3.5, TipoMotor.BENCINA),
                Categoria.SUV, new Estanque(50),
                new Persona("Lucas", "Rojas", Sexo.MASCULINO, 20)
        );
        susuki.setRuedas(new Rueda("Pirelli", 20, 11.5));

        Automovil chevrolet = new Automovil(
                "Chevrolet", "Cruze",
                Color.BLANCO,
                new Motor(3.5, TipoMotor.BENCINA),
                Categoria.SEDAN, new Estanque(50),
                new Persona("Alicia", "Sánchez", Sexo.FEMENINO, 20)
        );
        susuki.setRuedas(new Rueda("Pirelli", 20, 11.5));

        Automovil[] automoviles = new Automovil[5];
        automoviles[0] = subaru;
        automoviles[1] = mazda;
        automoviles[2] = susuki;
        automoviles[3] = nissan;
        automoviles[4] = chevrolet;

        Concesionario concesionario = new Concesionario();
        concesionario.agregarAutomoviles(automoviles);

        System.out.println("------ Sin Ordenar ------");
        concesionario.mostrarAutomoviles();

        Arrays.sort(automoviles);

        System.out.println("------ Ordenado por edad o nombre ------");
        concesionario.mostrarAutomoviles();

    }
}
