package org.gabyproject.generics_class;

public class DemoGenericsClass {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("relámpago","Caballo"));
        transporteCaballos.add(new Animal("spirit","Caballo"));
        transporteCaballos.add(new Animal("sardinilla","Caballo"));
        transporteCaballos.add(new Animal("tiro al blanco","Caballo"));
        transporteCaballos.add(new Animal("tornado","Caballo"));

        imprimirCamion(transporteCaballos);


        Camion<Maquinaria> transporteMaquinas = new Camion<>(3);
        transporteMaquinas.add(new Maquinaria("Bulldozer"));
        transporteMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transporteMaquinas);

        Camion<Automovil> transporteAuto = new Camion<>(3);
        transporteAuto.add(new Automovil("Toyota"));
        transporteAuto.add(new Automovil("Mitsubishi"));
        transporteAuto.add(new Automovil("Chevrolet"));

        imprimirCamion(transporteAuto);
    }

    public static <T> void imprimirCamion(Camion<T> camion) {
        for (T a : camion) {
            System.out.println(a);
        }
    }
}
