package ar.info.juego.Encriptador;

public class RC4Adapter implements AlgoritmoCifrado{

    private RC4 adaptee;
    private String key;

    public RC4Adapter(String key, RC4 adaptee) {
        this.adaptee = adaptee;
        this.key = key;
    }

    public RC4Adapter(RC4 adaptee, String key) {
        this.adaptee = adaptee;
        this.key = key;
    }

    public String encriptar(String mensaje) {
        return this.adaptee.encriptar(mensaje, this.key);
    }

    public String desencriptar(String mensaje) {
        return this.adaptee.desencriptar(mensaje, key);
    }

}
