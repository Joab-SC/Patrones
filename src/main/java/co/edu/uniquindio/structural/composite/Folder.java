package co.edu.uniquindio.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void show() {
        System.out.println("Carpeta: " + name);
        for (FileSystemComponent c : children) {
            c.show();
        }
    }
}
