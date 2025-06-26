package main.java.ar.edu.unlp.info.oo2.pc;

public class PCGamer extends PCBuilder{
    @Override
    public void buildCPU() {
        this.pc.agregarComponente(this.catalogo.getComponente("Procesador Gamer"));
    }

    @Override
    public void buildMemory() {
        this.pc.agregarComponente(this.catalogo.getComponente("32GB"));
        this.pc.agregarComponente(this.catalogo.getComponente("32GB"));
    }

    @Override
    public void buildDisk() {
        this.pc.agregarComponente(this.catalogo.getComponente("SSD 500GB"));
        this.pc.agregarComponente(this.catalogo.getComponente("SSD 1 TB"));
    }

    @Override
    public void buildGPU() {
        this.pc.agregarComponente(this.catalogo.getComponente("RTX 4090"));
    }

    @Override
    public void buildBox() {
        this.pc.agregarComponente(this.catalogo.getComponente("Gabinete Gamer"));
    }
}
