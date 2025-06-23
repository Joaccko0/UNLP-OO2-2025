package main.java.ar.edu.unlp.info.oo2.conexiones;

public class WifiConn extends Connection {

    public WifiConn(String pict) {
        super(pict);
    }

    @Override
    public String sendData(String data, long crc) {
        return "WIFI: " + data + " CRC: " + Long.toString(crc);
    }

    @Override
    public String pict() {
        return this.getPict();
    }
}
