package collection_and_generics.generics.limitationsOfGenerics;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Account<Integer> acc1 = new Account<Integer>(1000, 3434);
        Account<String> acc2 = new Account<String>(1000, "2ewrfe33f3");

        Account<Integer> acc3 = new Account<Integer>(1000, 2333);

        Transactions<Account> transactionsBetween = new Transactions<Account>(acc1, acc2, 600);
        transactionsBetween.execute();
        transactionsBetween = new Transactions<Account>(acc2, acc1, 203);
        transactionsBetween.execute();
    }
}

class Transactions <S extends Account & Accountable>{
    private S from;     // с какого счета (S это аккаунт)
    private S to;       // на какой счет
    private int sum;    // сумма перевода

    public Transactions(S from, S to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute(){
        if (from.getSum() > sum) {
            from.setSum(from.getSum()-sum);
            to.setSum(to.getSum()+sum);
            System.out.printf("Account %s: %d%nAccount %s: %d   %s%n",from.getId(), from.getSum(), to.getId(),
                    to.getSum(), to.date());
        }
        else System.out.println("Operation is invalid "+to.date());
    }
}
class Person{


}
class Account<T> extends Person implements Accountable {
    private int sum;
    private String id;

    public Account(int sum, T id) {
        this.sum = sum;
        this.id = id.toString();
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    @Override
    public Date newDate() {
        return new Date();
    }

    String date() {
        return newDate().toString();
    }
}


interface Accountable{
    Date newDate();
}
