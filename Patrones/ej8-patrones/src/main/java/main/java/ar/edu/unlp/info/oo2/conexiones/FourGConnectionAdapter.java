package main.java.ar.edu.unlp.info.oo2.conexiones;

public class FourGConnectionAdapter extends Connection {
    private FourGConnection adaptee;

    public FourGConnectionAdapter(FourGConnection fourGConnection) {
        super(fourGConnection.getSymb());
        this.adaptee = fourGConnection;
    }

    @Override
    public String sendData(String data, long crc) {
        return this.adaptee.transmit(data, crc);
    }

    @Override
    public String pict() {
        return this.adaptee.getSymb();
    }
}
