public class EjerciciosTestFundaula {
    // Código relacionado con EjerciciosTestFundaula 
}

/*Una clase llamada "EjerciciosTestFundaula" que es pública. La palabra clave public indica que esta clase es accesible desde otros archivos.
 Esta clase parece ser un contenedor o una clase principal que puede contener otros códigos relacionados con los ejercicios de Fundaula. */

 /*Esta clase no es pública, lo que significa que solo es visible dentro de este archivo. El método main en esta clase es la entrada principal
 del programa. El código dentro del main utiliza un bucle do-while para imprimir números del 0 al 9 en la consola. */
class CodigoUno {
    public static void main(String[] args) {
        int x1 = 0;
        do {
            System.out.println(x1);
            x1++;
        } while (x1 < 10);
    }
}

/* Otra clase llamada "CodigoDos", que tampoco es pública. Al igual que en "CodigoUno", el método main de "CodigoDos" es la entrada principal
 del programa. En este caso, se utiliza un bucle while para imprimir números del 0 al 9 en la consola. */
class CodigoDos {
    public static void main(String[] args) {
        int y = 0;
        while (y < 10) {
            System.out.println(y);
            y++;
        }
    }
}

// Otro ejercicio
class CodigoTres {
    public static void main(String[] args) {
        for (int z = 0; z < 10; z = z + 1) {
            System.out.println(z);
        }
    }

}
// Otro ejercicio
class CodigoCuatro {
    public static void main(String[] args) {
        String curso = "Cuarto";
        int nAlumnos = 9;

        if (!curso.equals("Cuarto") && nAlumnos == 5) {
            System.out.println("Curso de Cuarto");
        } else if (curso.equals("Cuarto") && nAlumnos >= 5) {
            System.out.println("Curso de Quinto");
        } else {
            System.out.println("Curso de Sexto");
        }
    }
}
