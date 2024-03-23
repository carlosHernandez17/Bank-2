public class PayLoanFactory implements MenuOptionFactory{
    private BankLoan bankLoan;

    public PayLoanFactory(BankLoan bankLoan) {
        this.bankLoan = bankLoan;
    }

    @Override
    public MenuOption createOptionMenu() {
        return new PayLoanOption(bankLoan);
    }
}
