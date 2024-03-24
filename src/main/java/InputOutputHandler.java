import java.util.Scanner;

public class InputOutputHandler {

    private Scanner scanner;

    public InputOutputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public void printMenu(MenuOption[] options) {
        System.out.println("\n************* Bienvenido a nuestra banca en línea *****************\n");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ".- " + options[i].getDescription());
        }
        System.out.println("0.- Salir\n");
        System.out.println("Ingrese el numero de la opcion que desea obtener:");
    }

    public int getUserInput(int maxOption) {
        return scanner.nextInt();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printErrorMessage(String message) {
        System.out.println("\t\t ERROR!!!!!!");
        System.out.println(message);
    }

}
