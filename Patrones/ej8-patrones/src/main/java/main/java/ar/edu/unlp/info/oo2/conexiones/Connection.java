package main.java.ar.edu.unlp.info.oo2.conexiones;

public abstract class Connection {
    private String pict;

    public Connection(String pict) {
        this.pict = pict;
    }

    public String getPict() {
        return pict;
    }

    public void setPict(String pict) {
        this.pict = pict;
    }

    public abstract String sendData(String data, long crc);
    public abstract String pict();
}
