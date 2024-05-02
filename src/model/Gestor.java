package model;

import exceptions.OutOfMoney;
import exceptions.WalletNoExist;

import java.time.LocalDateTime;

public class Gestor {

    private Wallet[] wallets;
    private Transaction[] transactions;
    private int numWallet;
    private int numTransaction;
    private int idTransaction;

    public Gestor(){
        wallets = new Wallet[10];
        transactions = new Transaction[10];
    }

    public void addWallet(Wallet wallet){
        wallets[numWallet] = wallet;
        numWallet++;
    }

    private void addTransaction(Transaction transaction){
        transactions[numTransaction] = transaction;
        numTransaction++;
    }

    public void createTransaction(User sender, User receiver, double amount) throws WalletNoExist, OutOfMoney {
        Wallet senderWallet = null;
        Wallet receiverWallet = null;

        for (Wallet wallet : wallets) {
            if (wallet != null) {
                if (wallet.getNumWallet().equals(sender.getIdUser())) {
                    senderWallet = wallet;
                }
                if (wallet.getNumWallet().equals(receiver.getIdUser())) {
                    receiverWallet = wallet;
                }
            }
        }

        if (senderWallet == null || receiverWallet == null) {
            throw new WalletNoExist();
        }else if (senderWallet.getAmount() < amount) {
            throw new OutOfMoney();
        }else {
            Transaction transaction = new Transaction(generateIdTransaction(sender, receiver), amount, sender, receiver, LocalDateTime.now());

            senderWallet.setAmount(senderWallet.getAmount() - amount);

            if(senderWallet.getCoin() != receiverWallet.getCoin()){
                changeCoin(senderWallet.getCoin(), receiverWallet.getCoin(), amount);
            }

            receiverWallet.setAmount(receiverWallet.getAmount() + amount);
            addTransaction(transaction);
        }
    }

    private double options(){
        return 0;
    }
    private double changeCoin(String senderType, String reciverType,double coin){


        switch (senderType){
            case "EURO":
                switch (reciverType){
                    case "DOLAR":
                        return 0 ;
                    case  "YEAR":
                        break;

                    case "PESO_CO":
                        break;

                }
                break;

            case "DOLAR":
                break;
            case  "YEAR":
                break;

            case "PESO_CO":
                break;





        }
        return 0;
    }

    private String generateIdTransaction(User sender, User receiver){
        return (idTransaction++)+ "-" + sender.getIdUser()+ "-" + receiver.getIdUser() ;
    }


    public void showWallets(){
        for (int i = 0; i < wallets.length; i++) {
            System.out.println(wallets[i].toString());
        }
    }
    public void showTransaction(){
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i]!=null){
                System.out.println(transactions[i].toString());

            }
        }
    }
}
