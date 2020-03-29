package domaci_zadaci.testNG;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public Account openAccount(String name){
        Account account = new Account(name);
        accounts.add(account);
        return account;
    }

    public void closeAccount(Account account)
    {
        accounts.remove(account);
    }

    public boolean transferMoney(String accountNumberFrom, String accountNumberTo, Double amount)
    {
        Account from = getAccount(accountNumberFrom);
        if(from!=null)
            from.setAmount(from.getAmount()-amount);
        Account to = getAccount(accountNumberFrom); //accountNumberTo
        if(to!=null)
            to.setAmount(to.getAmount()+amount);
        return true;
    }

    public void payInMoney(String accountNumber, Double amount){
        Account account = getAccount(accountNumber);
        if(account!=null)
            account.setAmount(account.getAmount()+amount);
    }

    public Account getAccount(String accountNumber){
        for(Account acc:accounts)
            if(acc.getNumber()==accountNumber)
                return acc;

        return null;
    }


    public Double getSumMoney(){
        Double res=0d;
        for (int i = 1; i < accounts.size(); i++) { // i=0
            res+=accounts.get(i).getAmount();
        }
        return res;
    }

    public void reset(){
        accounts.clear();
    }
}
