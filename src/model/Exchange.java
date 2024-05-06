package model;

import exceptions.OutOfMoney;
import exceptions.WalletNoExist;
import exceptions.WalletNotSame;

import java.util.ArrayList;

/**
 * Se realizan las acciones principales de creación de la cartera y el bloque asociado a una transacción
 * @author Estefania Sora
 * @version 05/05/2024
 */

public class Exchange {

    private ArrayList<Wallet> wallets;
    private ArrayList<Block> blocks;

    /**
     * Constructor para la creación de la clase que gestiona la lógica principal de la aplicación
     */
    public Exchange(){
        wallets = new ArrayList<>();
        blocks = new ArrayList<>();
    }

    /**
     * Se añaden las carteras al compendio de carteras
     * @param wallet Este parámetro corresponde a un objeto Cartera
     */
    public void addWallet(Wallet wallet){
        wallets.add(wallet);
    }

    /**
     * Se añaden los bloques al compendio de bloques
     * @param block Este parámetro corresponde a un objeto de tipo Bloque
     */
    private void addBlock(Block block){
        blocks.add(block);
    }

    /**
     * Realiza la creación de los bloques
     * @param sender Este parámetro corresponde a la información del usuario que envía el dinero
     * @param receiver Este parámetro corresponde a la información del usuario que recibe el dinero
     * @param amount Este parámetro corresponde al monto que se enviará
     * @throws WalletNoExist Excepción que surge cuando la cartera que se ingresa no se encuentra registrada
     * @throws OutOfMoney Excepción que surge cuando la cartera desde la que se envía el dinero no tiene fondos suficientes
     * @throws WalletNotSame Excepción que surge cuando las carteras de la que se envía dinero a la que recibe son las mismas
     */

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

    /**
     * Permite realizar el cambio de divisa
     * @param senderType Este parámetro corresponde al tipo de divisa de la cartera de la cual se extrae el dinero.
     * @param reciverType Este parámetro corresponde al tipo de divisa de la cartera de la cual llega el dinero.
     * @param coin Este prámetro corresponde al monto que se va a enviar
     * @return double
     */
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

    /**
     * Permite Obtener el hash dle bloque anterior
     * @return int
     */

    private int getLastHas(){
        return (blocks.isEmpty() ? 0:  blocks.get(blocks.size()-1).getHash());
    }

    /**
     * Muestra la lista de carteras que se tiene almacenadas
     */
    public void showWallets(){
        for (Wallet wallet : wallets) {
            System.out.println(wallet.showData());
        }
    }

    /**
     * Muestra la lista de bloques que se tienen almacenados
     */

    public void showBlocks() {
        for (Block block : blocks) {
            System.out.println(block.showData());
        }
    }

}
