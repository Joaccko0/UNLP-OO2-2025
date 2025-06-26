package main.java.ar.edu.unlp.info.oo2.file;

public class SizeDecorator extends FileDecorator{
    public SizeDecorator(FileComponent component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return this.component.prettyPrint() + " - " + this.getSize() + " MB";
    }
}
