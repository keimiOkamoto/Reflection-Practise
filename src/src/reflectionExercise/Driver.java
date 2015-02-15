package reflectionExercise;

public class Driver {
    public static void main(String[] args) {
        Storage<BankAccount> aBankStorage = new Storage<>();
        Storage<String> aStringStorage = new Storage<>();

        System.out.println(aBankStorage.getValue());

        Class<BankAccount> baCls = BankAccount.class;
        try {
            BankAccount myAccount = baCls.newInstance();
            aBankStorage.setValue(myAccount);
            // Deposit
            myAccount.deposit(15);
        } catch(InstantiationException e ) {
            // ...
        } catch(IllegalAccessException e ) {
            // .
        }

        System.out.println(aBankStorage.getValue().showBalance());

        if (aBankStorage.getClass() == aBankStorage.getClass()) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
