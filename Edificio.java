import java.time.LocalDateTime;

public class Edificio {
    public synchronized void acceso(String nombre, String entrada) {

        System.out.println(nombre + "esta accediendo desde la entrada " + entrada + LocalDateTime.now());
        try {
            System.out.println("Esta ingresando por la puerta x " + LocalDateTime.now());
            Thread.sleep(4000);  //4Sg
            System.out.println("Esta ingresando por la puerta z" + LocalDateTime.now());
        } catch (InterruptedException e ) {

            e.printStackTrace();
        }
        System.out.println(nombre+" ha accedido al edificio desde la entrada "+entrada + LocalDateTime.now());
    }

}
