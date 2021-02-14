package lambdaintro.bank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountsTest {



    @Test
    public void testSortByAll() {
        BankAccount b1 = new BankAccount("963", "Laci", 500.5);
        BankAccount b2 = new BankAccount("741", "Dávid", 425.7);
        BankAccount b3 = new BankAccount("111", "Sanyi", 75342.5);
        List<BankAccount> bAccounts = new ArrayList<>();
        bAccounts.add(b1);
        bAccounts.add(b2);
        bAccounts.add(b3);
        BankAccounts bAs = new BankAccounts(bAccounts);
        //accountNumber
        assertEquals("Sanyi", bAs.sortByAccountNumber().get(0).getNameOfOwner());

        //balance
        assertEquals("Sanyi", bAs.sortByBalance().get(0).getNameOfOwner());
        assertEquals("111", bAs.sortByBalance().get(0).getAccountNumber());
        System.out.println(bAs.sortByBalance().get(0));

        //név alapján ha eggyezik akkor accnumber alapkán
        BankAccount b4 = new BankAccount("122", "Sanyi", 33.3);
        bAccounts.add(b4);
        assertEquals("[AccountNumber: 741, NameOfOwner: Dávid, Balance: 425.7\n" +
                ", AccountNumber: 963, NameOfOwner: Laci, Balance: 500.5\n" +
                ", AccountNumber: 111, NameOfOwner: Sanyi, Balance: 75342.5\n" +
                ", AccountNumber: 122, NameOfOwner: Sanyi, Balance: 33.3\n" +
                "]", bAs.sortByNameAndAccountNumber().toString());
    }
}