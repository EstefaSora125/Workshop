package model;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Esta clase crea la transacción y define cómo se creará un bloque
 * @author Estefania Sora
 * @version 05/05/2024
 */

public class Block {

    private int hash;
    private int previusHash;

    private Transaction transaction;

    /**
     * Constructor para la creación del bloque
     * @param previusHash Este parámetro define el hash correspondiente al bloque anterior que se ha creado
     */
    public Block(int previusHash) {
        this.previusHash = previusHash;
    }

    /**
     * Método que crea la transacción
     * @param sender Este parámetro corresponde al obteto de tipo usuario que envía el dinero de la transacción
     * @param receiver Este parámetro corresponde al obteto de tipo usuario que recibe el dinero de la transacción
     * @param amount Este parámetro hace referencia a la cantidad de dinero a enviar
     */
    public void createTransaction(User sender, User receiver, double amount){
        transaction = new Transaction(generateIdTransaction(sender.getId(),receiver.getId()),amount, sender,receiver,LocalDateTime.now());
        this.hash = generateHash(sender);
    }

    /**
     *Método que genera un identificador único universal para la transacción junto con el id del usuario
     * que envía el dinero y de quien recibe el monto
     * @param idUserSender Este parámetro permite obtener el id del usuario
     * @param idUserReceiver Este parámetro permite obteenr
     * @return  String
     */
    private String generateIdTransaction(String idUserSender, String idUserReceiver){
        return  idUserSender+ "-" + idUserReceiver+ "-" + UUID.randomUUID().toString();
    }

    /**
     * Este
     * @param sender
     * @return
     */
    private int generateHash(User sender){
        return  (sender.getId()+ "-" + UUID.randomUUID().toString()).hashCode();
    }

    public int getHash() {
        return hash;
    }

    public String showData() {
        return "Información del bloque " + '\n' +
                " - Hash del bloque: " + hash + '\n' +
                " - Hash previo del bloque: " + previusHash + '\n' +
                transaction.showData() ;

    }
}
