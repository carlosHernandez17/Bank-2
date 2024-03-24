    import java.util.Scanner;

    public class MainMenu {

        private  MenuOption[] options ;

        public MainMenu(MenuOption[] options) {
            this.options = options;
        }


        public void showMenu() {
            InputOutputHandler inputOutputHandler = new InputOutputHandler();
            int option;

            do {
                inputOutputHandler.printMenu(options);
                option = inputOutputHandler.getUserInput(options.length);

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