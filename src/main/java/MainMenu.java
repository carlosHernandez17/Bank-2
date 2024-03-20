import java.util.Scanner;

public class MainMenu {

    private  MenuOption[] options ;

    public MainMenu(MenuOption[] options) {
        this.options = options;
    }


    public void showMenu() {
        Scanner entrada = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n************* Bienvenido a nuestra banca en línea *****************\n");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ".- " + options[i].getDescription());
            }
            System.out.println("0.- Salir\n");
            System.out.println("Ingrese el numero de la opcion que desea obtener:");
            option = entrada.nextInt();

            if (option == 0) {
                System.out.println("\n Gracias, hasta luego !!!!!");
            } else if (option > 0 && option <= options.length) {
                options[option - 1].execute();
            } else {
                System.out.println("\t\t ERROR!!!!!!");
                System.out.println("Ingrese un numero entre 1 al " + options.length);
            }

        } while (option != 0);
    }
}