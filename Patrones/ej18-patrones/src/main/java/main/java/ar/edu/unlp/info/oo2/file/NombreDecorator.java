package main.java.ar.edu.unlp.info.oo2.file;

public class NombreDecorator extends FileDecorator{
    public NombreDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return this.component.prettyPrint();
    }
}
