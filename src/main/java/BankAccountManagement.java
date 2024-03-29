
public class BankAccountManagement {
    public static void main(String[] args) {
        //Se crean las instancias de diferentes clases
        Bank bank = new Bank();
        Administrator administrator = new Administrator(bank);
        BankLoan bankLoan = new BankLoan();
        ApplyforLoan applyforLoan = new ApplyforLoan(bankLoan);

        // Se crean instancias de diferentes fábricas de opciones de menu
        MenuOptionFactory createAccountFactory = new CreateAccountFactory(administrator);
        MenuOptionFactory checkBalanceFactory = new CheckBalanceFactory(bank);
        MenuOptionFactory depositFactory = new DepositFactory(bank);
        MenuOptionFactory withdrawFactory = new WithdrawFactory(bank);
        MenuOptionFactory applyForLoanFactory = new ApplyForLoanFactory(applyforLoan);
        MenuOptionFactory payLoanFactory = new PayLoanFactory(bankLoan);
        MenuOptionFactory requestCredictCardFactory = new RequestCreditCardFactory(bankLoan,bank);

        // Se crean instancias de diferentes opciones de menú utilizando las fábricas correspondientes
        MenuOption createAccount = createAccountFactory.createOptionMenu();
        MenuOption checkBalance = checkBalanceFactory.createOptionMenu();
        MenuOption deposit = depositFactory.createOptionMenu();
        MenuOption withdraw = withdrawFactory.createOptionMenu();
        MenuOption applyForLoan = applyForLoanFactory.createOptionMenu();
        MenuOption payLoan = payLoanFactory.createOptionMenu();
        MenuOption requestCredictCard = requestCredictCardFactory.createOptionMenu();


        // Se crea un arreglo de opciones de menú que serán utilizadas en el MainMenu
        MenuOption[] options = new MenuOption[]{
                createAccount,
                checkBalance,
                deposit,
                withdraw,
                applyForLoan,
                payLoan,
                requestCredictCard

        };


        // Se crea una instancia del MainMenu, pasando las opciones de menu como argumento al constructor
        MainMenu mainMenu = new MainMenu(options);
        mainMenu.showMenu();

        /*
        * Principios SOLID
        *
        * 1- Principio de Responsabilidad Única (SRP - Single Responsibility Principle):
        *      -  cada clase tiene una responsabilidad clara y única
        *           por ejemplo la clase bank solo representara a banco y asi con las demas intancias
        * 2- Principio de Abierto/Cerrado (OCP - Open/Closed Principle):
        *       - para extender se hace mediante la creación de nuevas fábricas y una nueva opciones de menú sin modificar
        *           las clases. Por ejemplo, si se desea agregar una nueva operación bancaria, se puede lograr
        *            implementando de  una nueva fábrica y opción de menú sin modificar el código.
        * 3- Principio de Sustitución de Liskov (LSP - Liskov Substitution Principle):
        *       - no se presenta expecificamente ya que no hay herencia, pero se logra implementar de ciertamanera
        *         con la susticion de la instancias
        * 4- Principio de Segregación de Interfaces (ISP - Interface Segregation Principle):
        *       - no hay dependencia de interface
        * 5- Principio de Inversión de Dependencia (DIP - Dependency Inversion Principle):
        *       - las clases de alto nivel (como Administrator y ApplyforLoan) dependen de abstracciones (como Bank y BankLoan).
        *          Esto permite una mayor flexibilidad y facilita la modificación y extensión del código sin afectar las clases
        *          de alto nivel.
        *
        * */

        /*
        * Como se implemento factory Method a la aplicacion?
        *       1- primero se crea la interface
        *                   MenuOption: que define el contrato para las opciones de menú
        *                       ----- getDescription(): Este método devuelve la descripción de la opción de menú.
        *                       ----- void execute(): Este método ejecuta la acción asociada con la opción de menú.
        *
        *       2- Luego de haber creado la interface se crean las clases
        *               - CreateAccountOption: esta implementa de menu opcion y ejecuta los methodos de la interface
        *               - CheckBalanceOption:  esta implementa de menu opcion y ejecuta los methodos de la interface
        *               - otras mas
        *
        *       Ahora necesito crear la fabrica, como lo hago ??
        *       3-  primero defino mi contrado para la clase, es decir, creo mi interface MenuOptionFactory
        *           que esta contendra:
        *               createOptionMenu(): que me permitira crear la opcion
        *
        *       4- ahora necesito crear la factory para cada opcion del menu entonces creo:
        *               - CreateAccountFactory: creo mi fabrica y esta me crea mi opcion de menu
        *               - CheckBalanceFactory: asi mismo esta
        *               - otras mas
        *
        *       5- ahora que ya tengo creada mis opciones de menu, ahora necesito que la fabrica se
        *           encarge de hacerlo, como logro eso?
        *               - primero creo mi instancias de diferentes fábricas (linea 10)
        *               - luego creo mis instancias de diferentes opciones de menú asignandole la intancia de la fabrica (linea 19)
        *               - y luego creo el array que contendra mi menu (linea 30)
        *               - y luego muestro mi menu
        *
        *       asi es como eh aplicado los principios solid y el metodo de fabrica
         *
        *
        * */

    }


}