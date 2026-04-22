package co.edu.uniquindio.structural.proxy;

class ProxyVideo implements Video {

    private RealVideo realVideo;
    private String fileName;

    public ProxyVideo(String fileName) {
        this.fileName = fileName;
    }

    public void play() {
        if (realVideo == null) {
            realVideo = new RealVideo(fileName);
        }
        realVideo.play();
    }
}