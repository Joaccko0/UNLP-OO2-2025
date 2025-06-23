package main.java.ar.edu.unlp.info.oo2.conexiones;

public class Dispositivo {

    private Calculator crcCalculator;
    private Connection connection;
    private Ringer ringer;
    private Display display;

    public Dispositivo() {
        this.crcCalculator = new CRC16_Calculator();
        this.connection = new WifiConn("WIFI");
        this.ringer = new Ringer();
        this.display = new Display();
    }

    public void configurarCRC(Calculator calculator) {
        this.crcCalculator = calculator;
    }

    public void conectarCon(Connection connection) {
        this.connection = connection;
        this.display.showBanner(this.connection.getPict());
        this.ringer.ring();
    }

    public String send(String data) {
        long crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, crc);
    }

}
