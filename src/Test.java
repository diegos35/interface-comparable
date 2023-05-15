public class Test {
    public static void main(String[] args) {
        /*Comunicador t1  = new TelefonoCelular();
        Comunicador t2 = new PalomaMensajera();
        Comunicador t3 = new TelefonoCelular();
        t1.enviarMensaje("hell");*/

        Comunicador c = ComunicadorManager.crearComunicador();
        c.enviarMensaje("Hello, este es mi mensaje");

    }
}
