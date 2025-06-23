package ar.edu.unlp.info.oo2.conexiones;

import static org.junit.jupiter.api.Assertions.*;

import main.java.ar.edu.unlp.info.oo2.conexiones.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {

    private Dispositivo dispositivo;

    @BeforeEach
    void setUp() throws Exception {
        this.dispositivo = new Dispositivo();
    }

    @Test
    void testSendCRC16Wifi() {
        assertEquals("WIFI: PATOPUTO CRC: 9766", this.dispositivo.send("PATOPUTO"));
    }

    @Test
    void testSendCRC32Wifi() {
        this.dispositivo.configurarCRC(new CRC32_Calculator());
        assertEquals("WIFI: PATOPUTO CRC: 2553470133", this.dispositivo.send("PATOPUTO"));
    }

    @Test
    void testSendCRC164G() {
        this.dispositivo.conectarCon(new FourGConnectionAdapter(new FourGConnection("nashe")));
        assertEquals("4G: PATOPUTO CRC: 9766", this.dispositivo.send("PATOPUTO"));
    }

    @Test
    void testSendCRC324G() {
        this.dispositivo.conectarCon(new FourGConnectionAdapter(new FourGConnection("nashe")));
        this.dispositivo.configurarCRC(new CRC32_Calculator());
        assertEquals("4G: PATOPUTO CRC: 2553470133", this.dispositivo.send("PATOPUTO"));
    }

}