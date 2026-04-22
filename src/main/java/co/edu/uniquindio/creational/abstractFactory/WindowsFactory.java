package co.edu.uniquindio.creational.abstractFactory;


public class WindowsFactory implements GUIFactory {

    public Boton crearBoton() {
        return new BotonWindows();
    }

    public CheckBox crearCheckbox() {
        return new CheckboxWindows();
    }
}
