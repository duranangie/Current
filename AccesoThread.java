public class AccesoThread extends Thread {

    private Edificio edificio;
    private String nombre;
    private String entrada;

    public AccesoThread(Edificio edificio, String nombre, String entrada) {
        this.edificio = edificio;
        this.nombre = nombre;
        this.entrada = entrada;

    }

    @Override
    public void run() {
        edificio.acceso(nombre, entrada);

    }

}
