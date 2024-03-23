public class CheckBalanceFactory implements  MenuOptionFactory{

    private Bank bank;

    public CheckBalanceFactory(Bank bank) {
        this.bank = bank;
    }

    @Override
    public MenuOption createOptionMenu() {
        return new CheckBalanceOption(bank);
    }
}
