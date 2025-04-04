public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0)/ 3;
        System.out.println(media);

        /* Este es un Text Block */
        String sinopsis = """
                Matriz es una paradoja
                La mejor película del fin del milenio
                Fué lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        /* Castear con (int) la operacion debido a que la variable media es de tipo doblue */
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);



    }
}