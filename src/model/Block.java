package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Block {

    private String hash;
    private String previusHash;

    private Transaction transaction;

    public Block(String previusHash, Transaction transaction) {
        this.hash = generateHash(transaction);
        this.previusHash = previusHash;
        this.transaction = transaction;
    }

    public Block(Transaction transaction) {
        this.hash = generateHash(transaction);
        this.transaction = transaction;
    }

    public void createTransaction(User sender, User receiver, double amount){
        transaction =  new Transaction(generateIdTransaction(sender, receiver), amount, sender, receiver, LocalDateTime.now());
    }

    private String generateIdTransaction(User sender, User receiver){
        return  sender.getId()+ "-" + receiver.getId() + "-" + UUID.randomUUID().toString();
    }

    private String generateHash(Transaction transaction){
        return  transaction.getId()+ "-" + UUID.randomUUID().toString();
    }

    public String getHash() {
        return hash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "hash='" + hash + '\'' +
                ", previusHash='" + previusHash + '\'' +
                ", transaction=" + transaction.toString() +
                '}';
    }
}
