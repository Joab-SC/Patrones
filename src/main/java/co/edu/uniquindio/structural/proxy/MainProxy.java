package co.edu.uniquindio.structural.proxy;

public class MainProxy {
    public static void main(String[] args) {

        Video video = new ProxyVideo("pelicula.mp4");

        System.out.println("Video creado, pero aún no cargado");

        video.play(); // aquí recién se carga

        video.play(); // ya no vuelve a cargar
    }
}
