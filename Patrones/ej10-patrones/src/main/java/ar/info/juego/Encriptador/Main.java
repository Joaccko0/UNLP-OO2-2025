package ar.info.juego.Encriptador;

/* Al momento de enviar un mensaje, ¿con cuantos algoritmos de cifrado puede trabajar el mensajero al mismo tiempo?
 * Se puede trabajar con sólo un algoritmo de cifrado a la vez.
 * */

public class Main {

    public static void main(String[] args) {
        FeistelCipherAdapter feistelCipher = new FeistelCipherAdapter(new FeistelCipher("nashe"));
        Mensajero mensajero = new Mensajero(feistelCipher);
        mensajero.enviar("HolaaAAAAA!");

        RC4Adapter rc4 = new RC4Adapter("nashe", new RC4());
        mensajero.setEstrategia(rc4);
        mensajero.enviar("HolaaaaaAAA!");
    }

}
