package co.edu.uniquindio.structural.composite;

public class MainComposite {
    public static void main(String[] args) {

        File file1 = new File("foto.jpg");
        File file2 = new File("documento.pdf");

        Folder folder1 = new Folder("Mis Archivos");
        folder1.add(file1);
        folder1.add(file2);

        File file3 = new File("notas.txt");

        Folder root = new Folder("Raiz");
        root.add(folder1);
        root.add(file3);

        root.show();
    }
}