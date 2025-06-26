package main.java.ar.edu.unlp.info.oo2.file;

public class ModificacionDecorator extends FileDecorator{
    public ModificacionDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return this.component.prettyPrint() + " - " + this.getModificacion();
    }
}
