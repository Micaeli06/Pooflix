package app;

public class Websodio extends Episodio {

    public Websodio(int numero, String nombre, int duracionEnMinutos, String url) {
        super(numero, nombre, duracionEnMinutos);
        this.url = url;
    }

    private String url;

    @Override // Indica cuando se sobre-escribe ( redefinicion)
    public void reproducir() {
        System.out.println(" Reproduciendo websodio " + this.getNumero() + " " + this.getNombre() + "url:" + this.url);
    }

    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}