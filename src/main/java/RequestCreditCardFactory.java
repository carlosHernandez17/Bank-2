public class RequestCreditCardFactory implements MenuOptionFactory{
    private BankLoan bankLoan;
    private Bank bank;


    public RequestCreditCardFactory(BankLoan bankLoan, Bank bank) {
        this.bankLoan = bankLoan;
        this.bank = bank;
    }

    @Override
    public MenuOption createOptionMenu() {
        return new RequestCreditCardOption(bankLoan,bank);
    }
}
