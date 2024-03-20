
public class BankAccountManagement {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Administrator administrator = new Administrator(bank);
        BankLoan bankLoan = new BankLoan();
        ApplyforLoan applyforLoan = new ApplyforLoan(bankLoan);


        MenuOption[] options = new MenuOption[]{
                new CreateAccountOption(administrator),
                new CheckBalanceOption(bank),
                new DepositOption(bank),
                new WithdrawOption(bank),
                new ApplyForLoanOption(applyforLoan),
                new PayLoanOption(bankLoan),
                new RequestCreditCardOption(bankLoan, bank)
        };

        MainMenu mainMenu = new MainMenu(options);
        mainMenu.showMenu();


    }


}