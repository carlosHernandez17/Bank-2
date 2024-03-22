import java.util.Scanner;

import static java.lang.String.valueOf;

public  class ApplyForLoanOption implements MenuOption {
    private final ApplyforLoan applyforLoan;

    public ApplyForLoanOption(ApplyforLoan applyforLoan) {
        this.applyforLoan = applyforLoan;
    }

    @Override
    public String getDescription() {
        return "Solicitar prestamo";
    }

    @Override
    public void execute() {
        Scanner entrada = new Scanner(System.in);
        double amount;
        System.out.println("Ingrese los datos para el prestamo");
        System.out.println("Cuanto desea prestar?: ");
        amount = entrada.nextDouble();
        applyforLoan.registerLoad(amount);
    }
}
