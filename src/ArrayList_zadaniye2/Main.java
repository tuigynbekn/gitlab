package ArrayList_zadaniye2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BankApplication b1 = new BankApplication("Kaspi");
        BankApplication b2 = new BankApplication("Sber");
        BankApplication b3 = new BankApplication("Halyk");
        b1.addAccount(new Account(1," Janel","MAysina",100000));
        b1.addAccount(new Account(2," Janel2","MAysina2",400000));
        b1.addAccount(new Account(3," Janel3","MAysina3",300000));
        b1.addAccount(new Account(4," Jane4","MAysina4",900000));
        b1.addAccount(new Account(5," Janel5","MAysina5",900000));
        b1.addAccount(new Account(6," Janel6","MAysina6",900000));
        b1.addAccount(new Account(7," Jane7","MAysina7",700000));
        b1.addAccount(new Account(8," Janel8","MAysina8",800000));
        b1.addAccount(new Account(9," Janel9","MAysina9",900000));
        b1.addAccount(new Account(10," Janel10","MAysina10",1000000));

        b2.addAccount(new Account(1," Galiya1","Zanina1",800000));
        b2.addAccount(new Account(2," Galiya2","Zanina2",600000));
        b2.addAccount(new Account(3," Galiya3","Zanina3",700000));
        b2.addAccount(new Account(4," Galiya4","Zanina4",800000));
        b2.addAccount(new Account(5," Galiya5","Zanina5",900000));
        b2.addAccount(new Account(6," Galiya6","Zanina6",1000000));
        b2.addAccount(new Account(7," Galiya7","Zanina7",100000));
        b2.addAccount(new Account(8," Galiya8","Zanina8",200000));
        b2.addAccount(new Account(9," Galiya9","Zanina9",300000));
        b2.addAccount(new Account(10," Galiya10","Zanina10",400000));

        b3.addAccount(new Account(1," Nurbolat1","Taishan1",900000));
        b3.addAccount(new Account(2," Nurbolat2","Taishan2",500000));
        b3.addAccount(new Account(3," Nurbolat3","Taishan3",900000));
        b3.addAccount(new Account(4," Nurbolat4","Taishan4",700000));
        b3.addAccount(new Account(5," Nurbolat5","Taishan5",800000));
        b3.addAccount(new Account(6," Nurbolat6","Taishan6",900000));
        b3.addAccount(new Account(7," Nurbolat7","Taishan7",9000000));
        b3.addAccount(new Account(8," Nurbolat8","Taishan8",100000));
        b3.addAccount(new Account(9," Nurbolat9","Taishan9",200000));
        b3.addAccount(new Account(10," Nurbolat10","Taishan10",300000));

        ArrayList<BankApplication> banks = new ArrayList<>();
        banks.add(b1);
        banks.add(b2);
        banks.add(b3);
        Collections.sort(banks);
        for (BankApplication a:banks
             ) {
            System.out.println(a.getBankData());
        }
        }
    }

