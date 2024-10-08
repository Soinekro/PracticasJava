package inicio;
public class Main {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999; 
        String nombre = "Matrix";
        String director = "Hermanas Wachowski";
        String protagonistas = "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss, Hugo Weaving";
        String genero = "Ciencia Ficcion";
        String sinopsis = nombre + """
             es un pirata informático llamado Neo 
            descubre la verdad sobre la realidad 
            y su papel en ella.
            Fue lanzada en """ + fechaDeLanzamiento + """
            y dirigida por """ + director + """
            y protagonizada por """ + protagonistas + """
            Es de género """ + genero + ".";

        System.out.println(sinopsis);
    }
}