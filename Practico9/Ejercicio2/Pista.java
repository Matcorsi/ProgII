package Practico9.Ejercicio2;

public class Pista extends Coleccion{
    private static int contador = 0;
    private int id;
    private double duracion;
    private String artista;
    private String album;
    private int anio;
    private String genero;

    public Pista(String titulo, double duracion, String artista, String album, int anio, String genero){
        super(titulo);
        this.id = contador;
        contador++;
        this.duracion = duracion;
        this.artista = artista;
        this.album = album;
        this.anio = anio;
        this.genero = genero;
    }

    public int getId(){
        return id;
    }

    public String getTitulo() {
        return super.getNombre();
    }

    public void setTitulo(String titulo) {
        super.setNombre(titulo);
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public double duracionTotal(){
        return duracion;
    }

}
