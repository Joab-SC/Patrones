package co.edu.uniquindio.creational.abstractFactory;

public class MacFactory implements GUIFactory {

    public Boton crearBoton() {
        return new BotonMac();
    }

    public CheckBox crearCheckbox() {
        return new CheckboxMac();
    }
}