public class TelefonoCelular extends  Telefono implements Comunicador{
    public void enviarMensaje(String mensaje)
    {
        // hacer lo que corresponda aqui...
        System.out.println(mensaje+ " Telefono");
    }
}
