package model;

import exceptions.OutOfMoney;
import exceptions.WalletNoExist;
import exceptions.WalletNotSame;

import java.util.ArrayList;

public class Exchange {

    private ArrayList<Wallet> wallets;
    private ArrayList<Block> blocks;

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

    public void createBlock(User sender, User receiver, double amount) throws WalletNoExist, OutOfMoney, WalletNotSame {
        Wallet senderWallet = null;
        Wallet receiverWallet = null;
        double send = amount;
        Block block;

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

        if (senderWallet == null && receiverWallet == null) {
            throw new WalletNoExist();
        }else if(senderWallet == receiverWallet){
            throw new WalletNotSame();
        }else if (senderWallet.getAmount() < send) {
            throw new OutOfMoney();
        }else {
            block = new Block(getLastHas());
            addBlock(block);
            block.createTransaction(sender,receiver,amount);

            senderWallet.setAmount(senderWallet.getAmount() - send);

            if(!senderWallet.getCoin().equals(receiverWallet.getCoin())){
                send = changeCoin(senderWallet.getCoin(), receiverWallet.getCoin(), send);
            }
            receiverWallet.setAmount(receiverWallet.getAmount() + send);
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

    private int getLastHas(){
        return (blocks.isEmpty() ? 0:  blocks.get(blocks.size()-1).getHash());
    }

    public void showWallets(){
        for (Wallet wallet : wallets) {
            System.out.println(wallet.showData());
        }
    }

    public void showBlocks() {
        for (Block block : blocks) {
            System.out.println(block.showData());
        }
    }

}
