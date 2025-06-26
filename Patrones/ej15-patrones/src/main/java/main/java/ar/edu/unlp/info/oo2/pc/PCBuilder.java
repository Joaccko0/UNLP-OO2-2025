package main.java.ar.edu.unlp.info.oo2.pc;

public abstract class PCBuilder {

    protected PC pc;
    protected Catalogo catalogo;

    public PCBuilder(Catalogo catalogo) {
        this.pc = new PC();
        this.catalogo = catalogo;
    }

    public abstract void buildCPU();
    public abstract void buildMemory();
    public abstract void buildDisk();
    public abstract void buildGPU();
    public abstract void buildBox();

    public PC getPC() {
        return this.pc;
    }


}
