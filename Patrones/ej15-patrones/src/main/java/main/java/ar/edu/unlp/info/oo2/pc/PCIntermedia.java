package main.java.ar.edu.unlp.info.oo2.pc;

public class PCIntermedia extends PCBuilder{
    @Override
    public void buildCPU() {
        this.pc.agregarComponente(this.catalogo.getComponente("Procesador Intermedio"));
    }

    @Override
    public void buildMemory() {
        this.pc.agregarComponente(this.catalogo.getComponente("16 GB"));
    }

    @Override
    public void buildDisk() {
        this.pc.agregarComponente(this.catalogo.getComponente("SSD 500 GB"));
    }

    @Override
    public void buildGPU() {
        this.pc.agregarComponente(this.catalogo.getComponente("GTX 1650"));
    }

    @Override
    public void buildBox() {
        this.pc.agregarComponente(this.catalogo.getComponente("Intermedio Fuente 800 W"));
    }
}