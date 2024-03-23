public class ApplyForLoanFactory implements MenuOptionFactory{
    private  ApplyforLoan applyforLoan;

    public ApplyForLoanFactory(ApplyforLoan applyforLoan) {
        this.applyforLoan = applyforLoan;
    }

    @Override
    public MenuOption createOptionMenu() {
        return new ApplyForLoanOption(applyforLoan);
    }
}
