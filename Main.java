public class Main {
    public static void main(String[] args) {

        Edificio edificio = new Edificio();
        AccesoThread entrada1 = new AccesoThread(edificio, "angie ", "entrada1 ");
        AccesoThread entrada2 = new AccesoThread(edificio, "angie ", "entrada2 ");

        entrada1.start();
        entrada2.start();

        try {
            entrada1.join();
            entrada2.join();
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }

    }
}
