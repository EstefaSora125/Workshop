package runner;

import exceptions.OutOfMoney;
import exceptions.WalletNoExist;
import model.*;

public class Main {
    public static void main(String[] args) throws WalletNoExist, OutOfMoney {

        User usuarioEnzo = new User("1234", IdType.CC.getName(), "Enzo", "Morales");
        User usuarioTefa = new User("345", IdType.CC.getName(), "Tefa", "Sora");

        Wallet walletEnzo =  new Wallet(200, usuarioEnzo, CoinType.YEN.getName());
        Wallet walletTefa =  new Wallet(100, usuarioTefa, CoinType.PESO_CO.getName());

        Exchange exchange = new Exchange();

        exchange.addWallet(walletEnzo);
        exchange.addWallet(walletTefa);

        System.out.println("Saldo de Enzo: " + walletEnzo.getAmount());
        System.out.println("Saldo de Tefa: " + walletTefa.getAmount());

       // exchange.createTransaction(usuarioEnzo, usuarioTefa, 50);
        //gestor.createTransaction(usuarioEnzo, usuarioTefa, 1);
        //gestor.createTransaction(usuarioEnzo, usuarioTefa, 10);


        //gestor.createTransaction(usuarioTefa, usuarioEnzo, 10);


        System.out.println("-----");

        System.out.println("Saldo de Enzo: " + walletEnzo.getAmount());
        System.out.println("Saldo de Tefa: " + walletTefa.getAmount());


       // exchange.showTransaction();
    }
}
