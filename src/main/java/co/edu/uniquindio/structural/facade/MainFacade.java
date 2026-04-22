package co.edu.uniquindio.structural.facade;

// MAIN
public class MainFacade {
    public static void main(String[] args) {

        HomeTheaterFacade home = new HomeTheaterFacade(
                new TV(),
                new Projector(),
                new Lights(),
                new SoundSystem()
        );

        home.watchMovie();

        System.out.println();

        home.endMovie();
    }
}