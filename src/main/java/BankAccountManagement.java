
public class BankAccountManagement {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Administrator administrator = new Administrator(bank);
        BankLoan bankLoan = new BankLoan();
        ApplyforLoan applyforLoan = new ApplyforLoan(bankLoan);

        MenuOptionFactory createAccountFactory = new CreateAccountFactory(administrator);
        MenuOptionFactory checkBalanceFactory = new CheckBalanceFactory(bank);
        MenuOptionFactory depositFactory = new DepositFactory(bank);
        MenuOptionFactory withdrawFactory = new WithdrawFactory(bank);
        MenuOptionFactory applyForLoanFactory = new ApplyForLoanFactory(applyforLoan);
        MenuOptionFactory payLoanFactory = new PayLoanFactory(bankLoan);
        MenuOptionFactory requestCredictCardFactory = new RequestCreditCardFactory(bankLoan,bank);

        MenuOption createAccount = createAccountFactory.createOptionMenu();
        MenuOption checkBalance = checkBalanceFactory.createOptionMenu();
        MenuOption deposit = depositFactory.createOptionMenu();
        MenuOption withdraw = withdrawFactory.createOptionMenu();
        MenuOption applyForLoan = applyForLoanFactory.createOptionMenu();
        MenuOption payLoan = payLoanFactory.createOptionMenu();
        MenuOption requestCredictCard = requestCredictCardFactory.createOptionMenu();



        MenuOption[] options = new MenuOption[]{
<<<<<<< HEAD
                new CreateAccountOption(administrator),
                new CheckBalanceOption(bank),
                new DepositOption(bank),
                new WithdrawOption(bank),
                new ApplyForLoanOption(applyforLoan),
                new PayLoanOption(bankLoan),
                new RequestCreditCardOption(bankLoan, bank)
=======
                createAccount,
                checkBalance,
                deposit,
                withdraw,
                applyForLoan,
                payLoan,
                requestCredictCard
>>>>>>> carlos
        };

        MainMenu mainMenu = new MainMenu(options);
        mainMenu.showMenu();


    }


}