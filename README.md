Una superclase es una clase que contiene atributos y métodos generales que pueden ser compartidos por otras clases.
Su principal ventaja es la herencia, que permite definir variables y funciones una sola vez y reutilizarlas en múltiples clases sin necesidad de volver a escribirlas.

En pocas palabras:
La superclase te permite crear varias clases (subclases) que comparten los mismos atributos y comportamientos básicos.

El profesor pide:

Crear una superclase que contenga atributos comunes de un animal.
Crear al menos dos subclases que hereden de la superclase.
Definir en la superclase una función (acción genérica) y sobrescribirla en las subclases con @Override.

Ejemplo de atributos. En la superclase podemos incluir:
nombre
edad
peso
hábitat

Además, se puede definir un constructor para inicializar los valores:

public Animal(String nombre, int edad, double peso, String habitat) {
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.habitat = habitat;
}

Cómo crear una Subclase.
En otro archivo, heredamos los atributos con la palabra clave extends.
Ejemplo: Si mi clase principal se llama Animal, ahora haré esto:
public class Ocelote extends Animal {
    public Ocelote(String nombre, int edad, double peso, String habitat) {
        super(nombre, edad, peso, habitat);
    }
}

Acción a sobrescribir (@Override)

En la superclase se crea un método genérico, por ejemplo movimiento().
Luego, en cada subclase se utiliza la anotación @Override para redefinir la acción.

Ejemplo:

en archivo Animal.java

public void movimiento() {
  System.out.println("El animal se mueve");
}

en archivo Ocelote.java

@Override
public void movimiento() {
    System.out.println("El ocelote se mueve sigilosamente por la selva");
}

Ahora, cuando cree un objeto utilizando la clase Ocelote en un archivo main (Ocelote objeto = new Ocelote("","","",""); y ejecute objeto.movimiento();
el resultado será 
"El ocelote se mueve sigilosamente por la selva"
y no
"El animal se mueve"
Es decir, aún así este texto está en el sistema, desaparece de la ejecución

Esto se hace con fines didácticos: aunque la función no se use en un output real, demuestra cómo las subclases pueden modificar el comportamiento de una clase un nivel más arriba. Es decir, puedes cambiar un valor
de un archivo desde otro archivo sin manipular el archivo principal

Resumen

La superclase define atributos y un método genérico.
Las subclases heredan estos atributos sin necesidad de volver a definirlos.
Con @Override, cada subclase puede personalizar la acción del método heredado.
El objetivo de esto es demostrar herencia y transformación de variables en Java
