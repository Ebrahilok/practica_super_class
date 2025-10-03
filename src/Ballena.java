public class Ballena extends Animales{


    public Ballena(String nombre, String especie, String color) {
        super(nombre, especie, color);
    }

    @Override
    public void movimiento() {
        System.out.println("La ballena se mueve nadando por el agua");
    }
}
