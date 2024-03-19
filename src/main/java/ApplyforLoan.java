import java.util.Scanner;

public class ApplyforLoan {

    private BankLoan request;

    public ApplyforLoan() {
        this.request = request;
    }

    public Object registerLoad(String s){
        Scanner entrada = new Scanner(System.in);
        double amount;

        System.out.println("Ingrese los datos para el prestamo");
        System.out.println("Cual es la mondeda? ");
        String moneda = entrada.next();
        System.out.println("Cuanto desea prestar?: ");
        amount = entrada.nextDouble();
        System.out.println("Ingrese el numero de solicitud de prestamo: ");
        String number = entrada.next();
        System.out.println("cual es la Fecha de inicio de Prestamo? ");
        String start = entrada.next();
        System.out.println("cual es la Fecha de inicio de Prestamo? ");
        String end = entrada.next();

        Loan newLoan = new Loan(
                moneda,
                amount,
                number,
                start,
                end
        );

        request.addLoan(newLoan);

        System.out.println("request registered successfully.");
        return 1;
    }
}
