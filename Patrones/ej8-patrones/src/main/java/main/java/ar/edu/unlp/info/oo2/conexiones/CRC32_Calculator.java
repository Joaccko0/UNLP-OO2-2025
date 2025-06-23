package main.java.ar.edu.unlp.info.oo2.conexiones;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator{
    @Override
    public long crcFor(String data) {
        CRC32 crc = new CRC32();
        String datos = "un mensaje";
        crc.update(datos.getBytes());
        return crc.getValue();
    }
}
