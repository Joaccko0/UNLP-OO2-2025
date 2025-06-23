package main.java.ar.edu.unlp.info.oo2.conexiones;

public class FourGConnection {

    private String symb;

    public FourGConnection(String symb){
        this.symb = symb;
    }

    public String getSymb() {
        return symb;
    }

    public void setSymb(String symb) {
        this.symb = symb;
    }

    public String transmit(String data, long crc) {
        return "4G: " + data + " CRC: " + Long.toString(crc);
    }
}
