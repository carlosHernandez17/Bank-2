public class WithdrawFactory implements MenuOptionFactory{

    private Bank bank;

    public WithdrawFactory(Bank bank) {
        this.bank = bank;
    }

    @Override
    public MenuOption createOptionMenu() {
        return new WithdrawOption(bank);
    }
}
