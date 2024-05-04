package model;

import exceptions.OutOfMoney;
import exceptions.WalletNoExist;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Exchange {

    private ArrayList<Wallet> wallets;
    private ArrayList<Block> blocks;
    private int numWallet;
    private int numBlock;

    public Exchange(){
        wallets = new ArrayList<>();
        blocks = new ArrayList<>();
    }

    public void addWallet(Wallet wallet){
        wallets.add(wallet);
    }

    private void addBlock(Block block){
        blocks.add(block);
    }

    public void createBlock(User sender, User receiver, double amount) throws WalletNoExist, OutOfMoney {
        Wallet senderWallet = null;
        Wallet receiverWallet = null;
        double send = amount;
        String [] hasBlock;
        String[] idWallet;

        for (Wallet wallet : wallets) {
            if (wallet != null) {
                if (wallet.getId().equals(sender.getId())) {
                    senderWallet = wallet;
                }
                if (wallet.getId().equals(receiver.getId())) {
                    receiverWallet = wallet;
                }
            }
        }

        if (senderWallet == null || receiverWallet == null) {
            throw new WalletNoExist();
        }else if(senderWallet == receiverWallet){
            throw new WalletNoExist();
        }else if (senderWallet.getAmount() < send) {
            throw new OutOfMoney();
        }else {

            for (int i = 0; i < blocks.size(); i++) {
                for (int j = 0; j < wallets.size(); j++) {
                    hasBlock = blocks.get(i).getHash().split("-");
                    idWallet = wallets.get(j).getId().split("-");
                    //if (hasBlock[0].equals(idWallet[])){

                    //}
                }

            }

            senderWallet.setAmount(senderWallet.getAmount() - send);

            if(!senderWallet.getCoin().equals(receiverWallet.getCoin())){
                send = changeCoin(senderWallet.getCoin(), receiverWallet.getCoin(), send);

            }
            receiverWallet.setAmount(receiverWallet.getAmount() + send);
           // addTransaction(transaction);
        }
    }

    private double changeCoin(String senderType, String reciverType,double coin){
        switch (senderType.toUpperCase()) {
            case "EURO":
                switch (reciverType.toUpperCase()) {
                    case "DOLAR ESTADOUNIDENSE":
                        return coin * CoinType.EURO.getPercentajeDolar();
                    case "YEN":
                        return coin * CoinType.EURO.getPercentajeYen();
                    case "PESO COLOMBIANO":
                        return coin * CoinType.EURO.getPercentajePesoCol();
                }
                break;
            case "DOLAR ESTADOUNIDENSE":
                switch (reciverType) {
                    case "EURO":
                        return coin * CoinType.DOLAR.getPercentajeEuro();
                    case "YEN":
                        return coin * CoinType.DOLAR.getPercentajeYen();
                    case "PESO COLOMBIANO":
                        return coin * CoinType.DOLAR.getPercentajePesoCol();
                }
                break;
            case "YEN":
                switch (reciverType.toUpperCase()) {
                    case "EURO":
                        return coin * CoinType.YEN.getPercentajeEuro();
                    case "DOLAR ESTADOUNIDENSE":
                        return coin * CoinType.YEN.getPercentajeDolar();
                    case "PESO COLOMBIANO":
                        return coin * CoinType.YEN.getPercentajePesoCol();
                }
                break;
            case "PESO COLOMBIANO":
                switch (reciverType) {
                    case "EURO":
                        return coin * CoinType.PESO_CO.getPercentajeEuro();
                    case "DOLAR ESTADOUNIDENSE":
                        return coin * CoinType.PESO_CO.getPercentajeDolar();
                    case "YEN":
                        return coin * CoinType.PESO_CO.getPercentajeYen();
                }
                break;
        }
        return 0;
    }




    public void showWallets(){
        for (int i = 0; i < wallets.size(); i++) {
            System.out.println(wallets.get(i).toString());
        }
    }
    public void showBlock(){
        for (int i = 0; i < blocks.size(); i++) {
            System.out.println(blocks.get(i).toString());

        }
    }
}
