package co.edu.uniquindio.structural.composite;

// Hoja (Leaf)
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Archivo: " + name);
    }
}