package co.edu.uniquindio.structural.proxy;

class RealVideo implements Video {

    private String fileName;

    public RealVideo(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Cargando video desde disco: " + fileName);
    }

    public void play() {
        System.out.println("Reproduciendo video: " + fileName);
    }
}