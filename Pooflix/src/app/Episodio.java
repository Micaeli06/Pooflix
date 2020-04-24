package app;

public class Episodio {

    public Episodio(int numero, String nombre, int duracionEnMinutos) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracionEnMinutos = duracionEnMinutos;

    }

    private int numero;
    private String nombre;
    private int duracionEnMinutos;
    private String descripcion;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero( int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionEnMinutos() {
        return this.numero;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getdescripcion() {
        return this.descripcion;

    }

    public void setDescripcion( String descripcion) {
        this.descripcion = descripcion;
    }

    public void reproducir() {
        System.out.println(" Reproduciendo episodio " + this.numero + " " + this.nombre);

    }

}