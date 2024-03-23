public class DepositFactory implements MenuOptionFactory{

    private Bank bank;

    public DepositFactory(Bank bank) {
        this.bank = bank;
    }

    @Override
    public MenuOption createOptionMenu() {
        return new DepositOption(bank);
    }
}
