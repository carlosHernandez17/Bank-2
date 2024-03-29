    import java.util.Scanner;

    public class MainMenu {

        private  MenuOption[] options ;

        public MainMenu(MenuOption[] options) {
            this.options = options;
        }

        /*
        SOLID
        1- Menu tiene la responsabilida de solo mostrar el menu de opciones
        2- esta abierto a la extencion pero cerrado a la modificacion
        3- define métodos cohesivos y específicos para las opciones de menú
        * */

        public void showMenu() {

            //Crea un handler para que sea responsable de capturar los valores del cliente y este implementa diferentes metodos
            InputOutputHandler inputOutputHandler = new InputOutputHandler();
            int option;

            do {

                inputOutputHandler.printMenu(options);// se imprimime el menu
                // se captura el valor que el cliente ingrese y lo manda ejecutar la opcion elegida
                option = inputOutputHandler.getUserInput(options.length);

                //se crea la validacion para option para seguir
                if (option == 0) {
                    inputOutputHandler.printMessage("Gracias, hasta luego !");
                } else if (option > 0 && option <= options.length) {
                    options[option - 1].execute();
                } else {
                    inputOutputHandler.printErrorMessage("Ingrese un numero entre 1 al " + options.length);
                }
            } while (option != 0);
        }
    }