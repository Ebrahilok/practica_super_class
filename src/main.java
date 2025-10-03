public class main {
    public static void main(String[] args) {
        Aguila a = new Aguila("Aguila", "Voladora", "Roja");
        a.movimiento();
        Ballena b = new Ballena("Ballena", "Agua", "Blanca");
        b.movimiento();
        showAguila(a);
        showBallena(b);
    }
        public static void showAguila(Aguila a) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Nombre: " + a.nombre + "Especie: " + a.especie + "Color: " + a.color);
            System.out.println("-------------------------------------------------------------------------");
        }
        public static void showBallena(Ballena b) {
            System.out.println("Nombre: " + b.nombre + "Especie: " + b.especie + "Color: " + b.color);
            System.out.println("-------------------------------------------------------------------------");
        }

    }
