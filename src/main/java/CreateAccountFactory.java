public class CreateAccountFactory implements  MenuOptionFactory{

    private Administrator administrator;

    public CreateAccountFactory(Administrator administrator) {
        this.administrator = administrator;
    }

    @Override
    public MenuOption createOptionMenu() {
        return new CreateAccountOption(administrator);
    }
}
