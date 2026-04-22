package co.edu.uniquindio.abstractFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {

        GUIFactory factory = new WindowsFactory();

        Boton boton = factory.crearBoton();
        CheckBox checkbox = factory.crearCheckbox();

        boton.render();
        checkbox.render();
    }
}