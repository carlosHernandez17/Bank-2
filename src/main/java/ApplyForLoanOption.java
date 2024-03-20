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
        applyforLoan.registerLoad(valueOf(1));
    }
}
