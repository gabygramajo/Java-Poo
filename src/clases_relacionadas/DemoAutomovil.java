package clases_relacionadas;

public class DemoAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("subaru", "Impreza");
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


        Automovil nissan2 = new Automovil(
                "Nissan", "Navara", Color.AZUL,
                new Motor(3.5, TipoMotor.BENCINA),
                Categoria.PICKUP, new Estanque(50),
                new Persona("Lucas", "Rojas", Sexo.MASCULINO, 24)
        );
        nissan2.setRuedas(new Rueda("Pirelli", 20, 11.5));

        System.out.println("nissan2 = " + nissan2);
    }
}
