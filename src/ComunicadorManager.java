public class ComunicadorManager {

    public static Comunicador crearComunicador()
    {
        // una "paloma mensajera" es un "comunicador"
        //return new PalomaMensajera();
        return new TelefonoCelular();
    }
}
