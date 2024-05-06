package runner;

import exceptions.OutOfMoney;
import exceptions.WalletNoExist;
import exceptions.WalletNotSame;
import model.*;

/**
 * Se realizan las pruebas de funcionamiento por consola de la aplicación
 */
public class Main {
    public static void main(String[] args) throws WalletNoExist, OutOfMoney, WalletNotSame {

        User usuarioEnzo = new User("1234", IdType.CC.getName(), "Enzo", "Morales");
        User usuarioTefa = new User("345", IdType.CC.getName(), "Tefa", "Sora");
        User usuarioRaul = new User("987", IdType.CC.getName(), "Raul", "Mora");

        Wallet walletEnzo =  new Wallet(200, usuarioEnzo, CoinType.YEN.getName());
        Wallet walletTefa =  new Wallet(100, usuarioTefa, CoinType.PESO_CO.getName());
        //Wallet walletRaul =  new Wallet(500, usuarioRaul, CoinType.DOLAR.getName());

        Exchange exchange = new Exchange();

        exchange.addWallet(walletEnzo);
        exchange.addWallet(walletTefa);
        //exchange.addWallet(walletRaul);

        System.out.println("Saldo de Enzo: " + walletEnzo.getAmount() + " " + walletEnzo.getCoin());
        System.out.println("Saldo de Tefa: " + walletTefa.getAmount()+ " " + walletTefa.getCoin());
        //System.out.println("Saldo de Raul: " + walletTefa.getAmount()+ " " + walletRaul.getCoin());



        exchange.createBlock(usuarioEnzo, usuarioTefa, 50);
        /*exchange.createBlock(usuarioEnzo, usuarioTefa, 1);
        exchange.createBlock(usuarioEnzo, usuarioRaul, 20);
        exchange.createBlock(usuarioRaul, usuarioTefa, 30);
        exchange.createBlock(usuarioRaul, usuarioEnzo, 59);
        exchange.createBlock(usuarioTefa, usuarioRaul, 40);*/


        System.out.println("-----");

        System.out.println("Saldo de Enzo: " + walletEnzo.getAmount() + " " + walletEnzo.getCoin());
        System.out.println("Saldo de Tefa: " + walletTefa.getAmount()+ " " + walletTefa.getCoin());
        //System.out.println("Saldo de Raul: " + walletTefa.getAmount()+ " " + walletRaul.getCoin());


       exchange.showBlocks();
    }
}
