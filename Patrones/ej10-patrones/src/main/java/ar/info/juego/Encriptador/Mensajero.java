package ar.info.juego.Encriptador;

public class Mensajero {

    private AlgoritmoCifrado estrategia;

    public Mensajero(AlgoritmoCifrado estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(AlgoritmoCifrado estrategia) {
        this.estrategia = estrategia;
    }

    public void enviar(String mensaje) {
        this.estrategia.encriptar(mensaje);
    }

    public void recibir(String mensaje) {
        this.estrategia.desencriptar(mensaje);
    }
}
