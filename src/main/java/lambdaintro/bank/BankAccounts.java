package lambdaintro.bank;

import exections.Account;
import exections.Bank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.*;
import java.util.function.Predicate;

public class BankAccounts {

    private List<BankAccount> bAccounts;

    public BankAccounts(List<BankAccount> bAccounts) {
        this.bAccounts = bAccounts;
    }

    public List<BankAccount> getbAccounts() {
        return bAccounts;
    }

    //accountNumber alapaján
    public List<BankAccount> sortByAccountNumber() {
        List<BankAccount> copyByAccountNumber = new ArrayList<>(bAccounts);
        copyByAccountNumber.sort(((o1, o2) -> o1.getAccountNumber().compareTo(o2.getAccountNumber())));
        return copyByAccountNumber;
    }

    public List<BankAccount> sortByBalance() {
        List<BankAccount> copyByAccountNumber = new ArrayList<>(bAccounts);
        copyByAccountNumber.sort((Comparator.comparingDouble(BankAccount::getBalance).reversed()));
        //azért kell a reversed() mert növekvő sorrendben adja vissza a listát alapból
        return copyByAccountNumber;
    }


    public List<BankAccount> sortByNameAndAccountNumber() {
        List<BankAccount> copyByAccountNumber = new ArrayList<>(bAccounts);
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
        copyByAccountNumber.sort( Comparator.comparing(BankAccount::getNameOfOwner, Comparator.nullsFirst(collator)).thenComparing(BankAccount::getAccountNumber));
        return copyByAccountNumber;

    }




    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("963", "Laci", 500.5);
        BankAccount b2 = new BankAccount("741", "Dávid", 425.7);
        BankAccount b3 = new BankAccount("111", "Sanyi", 75342.5);
        List<BankAccount> bAccounts = new ArrayList<>();
        bAccounts.add(b1);
        bAccounts.add(b2);
        bAccounts.add(b3);
        BankAccounts bAs = new BankAccounts(bAccounts);

        String path = "C:\\training-solutions\\training-solution\\src\\main\\java\\week15d05\\olvasásra";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(values[0]);
            }

        } catch (IOException ioe) {
            throw new IllegalArgumentException("File not found!", ioe);
        }
        }



}
