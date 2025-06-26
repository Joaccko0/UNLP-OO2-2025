package main.java.ar.edu.unlp.info.oo2.pc;

public class PCBasica extends PCBuilder{
    @Override
    public void buildCPU() {
        this.pc.agregarComponente(this.catalogo.getComponente("Procesador Basico"));
    }

    @Override
    public void buildMemory() {
        this.pc.agregarComponente(this.catalogo.getComponente("8 GB"));
    }

    @Override
    public void buildDisk() {
        this.pc.agregarComponente(this.catalogo.getComponente("HDD 500 GB"));
    }

    @Override
    public void buildGPU() {}

    @Override
    public void buildBox() {
        this.pc.agregarComponente(this.catalogo.getComponente("Estandar"));
    }
}
