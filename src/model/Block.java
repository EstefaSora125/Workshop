package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Block {

    private int hash;
    private int previusHash;

    private Transaction transaction;

    public Block(int previusHash) {
        this.previusHash = previusHash;
    }

    public void createTransaction(User sender, User receiver, double amount){
        transaction = new Transaction(generateIdTransaction(sender,receiver),amount, sender,receiver,LocalDateTime.now());
        this.hash = generateHash(sender);
    }

    private String generateIdTransaction(User sender, User receiver){
        return  sender.getId()+ "-" + receiver.getId() + "-" + UUID.randomUUID().toString();
    }


    private int generateHash(User sender){
        return  (sender.getId()+ "-" + UUID.randomUUID().toString()).hashCode();
    }

    public int getHash() {
        return hash;
    }

    @Override
    public String toString() {
        return "Información del bloque " + '\n' +
                " - Hash del bloque: " + hash + '\n' +
                " - Hash previo del bloque: " + previusHash + '\n' +
                transaction.toString() ;

    }
}
