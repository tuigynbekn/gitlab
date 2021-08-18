package ArrayList_zadaniye2;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;

public class BankApplication implements Comparable<BankApplication>{
    private String name;
    public BankApplication(String name) {
        this.name = name;
    }

    ArrayList<Account> accounts = new ArrayList();
   void addAccount(Account a){
       accounts.add(a);
   }
   void removeAccount(int i){
       accounts.remove(i);
   }
   Account getMaxAccount(){
       double max=Double.MIN_VALUE;
       Account a= null;
       for (Account acc:accounts
            ) {
           if(acc.getBalance()>max){
               max=acc.getBalance();
               a=acc;
           }
       }
      return a;
   }
   Double getAverageBalance(){
       int count=0;
       double sum = 0;
       for (Account acc:accounts
            ) {
           sum+=acc.getBalance();
           count++;
       }
       return sum/count;
   }


   double getTotalBalance(){
       double sum = 0;
       for (Account acc:accounts
             ) {
              sum+=acc.getBalance();
       }
       return sum;
   }
   int totalAccounts(){
       int t=0;
       for (Account acc:accounts
            ) {
             t++;
       }
       return t;
    }
    String getBankData(){

       return this.name+" "+totalAccounts()+" "+getTotalBalance()+" "+getAverageBalance();
    }

    @Override
    public int compareTo(@NotNull BankApplication o) {
        return this.getAverageBalance().compareTo(o.getAverageBalance());
    }
}

