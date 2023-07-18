package atm;

public class Main {
    public static void main(String[] args) {
        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
        DataSourceDB dataSourceDB = new DataSourceDB();
        Bank kuBank = new Bank("KU Bank",dataSourceFile);
        ATM atm = new ATM(kuBank);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();
    }
}
