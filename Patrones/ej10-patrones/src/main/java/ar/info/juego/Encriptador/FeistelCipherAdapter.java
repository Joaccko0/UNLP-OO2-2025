package ar.info.juego.Encriptador;

public class FeistelCipherAdapter implements AlgoritmoCifrado{

    private FeistelCipher adaptee;

    public FeistelCipherAdapter(FeistelCipher adaptee) {
        this.adaptee = adaptee;
    }

    public String encriptar(String mensaje) {
        return this.adaptee.encode(mensaje);
    }

    public String desencriptar(String mensaje) {
        return this.adaptee.encode(mensaje);
    }
}
