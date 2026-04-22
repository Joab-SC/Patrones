package co.edu.uniquindio.abstractFactory;


public class WindowsFactory implements GUIFactory {

    public Boton crearBoton() {
        return new BotonWindows();
    }

    public CheckBox crearCheckbox() {
        return new CheckboxWindows();
    }
}
