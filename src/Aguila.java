public class Aguila extends Animales {

    // Constructore

    public Aguila(String nombre, String especie, String color) {
        super(nombre, especie, color);
    }

    @Override
    public void movimiento() {
        System.out.println("El aguila se mueve volando por el viento");
    }
}
