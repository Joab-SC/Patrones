package co.edu.uniquindio.structural.facade;

class HomeTheaterFacade {

    private TV tv;
    private Projector projector;
    private Lights lights;
    private SoundSystem sound;

    public HomeTheaterFacade(TV tv, Projector projector, Lights lights, SoundSystem sound) {
        this.tv = tv;
        this.projector = projector;
        this.lights = lights;
        this.sound = sound;
    }

    public void watchMovie() {
        System.out.println("Preparando película...");
        lights.dim();
        projector.on();
        sound.on();
        tv.on();
    }

    public void endMovie() {
        System.out.println("Apagando sistema...");
        tv.off();
        projector.off();
        sound.off();
        lights.on();
    }
}