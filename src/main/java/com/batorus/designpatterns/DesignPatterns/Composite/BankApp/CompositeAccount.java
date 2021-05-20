package com.batorus.designpatterns.DesignPatterns.Composite.BankApp;

public class CompositeAccount extends Component {

    private float totalBalance;
    private AccountStatement compositeStmt, individualStmt;

    public float getBalance() {
        totalBalance = 0;
        for (Component f : list) {
            totalBalance  += f.getBalance();
        }
        return totalBalance;
    }

    public AccountStatement getStatement() {
        for (Component f : list) {
            individualStmt = f.getStatement();

            System.out.println(individualStmt.toString());
           // compositeStmt.merge(individualStmt);
        }
        return compositeStmt;
    }
}