package model;

import java.time.LocalDateTime;

/**
 * Se defienen los atributos que corresponden a una transacción
 * @author Estefania Sora
 * @version 05/05/2024
 */
public class Transaction {
    private  String id;
    private double amount;
    private User sender;
    private User receiver;
    private LocalDateTime date;


    /**
     * Se define un constructor ocn la información correspondiente a la transacción
     * @param id Corresponde al identificador de la transacción
     * @param amount Corresponde a la cantidad que será transferida
     * @param sender Corresponde a la ihnformación del usuario que realiza la transferencia
     * @param receiver Corresponde a la ihnformación del usuario que recibe la transferencia
     * @param date Corresponde a la fecha y hora en la que se realiza la transacción
     */
    public Transaction(String id, double amount, User sender, User receiver, LocalDateTime date) {
        this.id = id;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
    }

    /**
     * Se mustra el formato de la fecha en la que se realiza la transacción
     * @return String
     */
    private String createDateFormat(){
        return + date.getDayOfMonth() + "/" + date.getMonth() + "/" + date.getYear() + " " + date.getHour()+ ":" +date.getMinute()+ ":" +date.getSecond();
    }

    /**
     * Se mustra la información de la transacción
     * @return String
     */
    public String showData() {
        return "Información transacción " + '\n'+
                " - N°: " + id + '\n' +
                " - Fecha transacción: " + createDateFormat() +'\n' +
                " - Monto enviado: " + amount + '\n' +
                " - Usuario que realiza la transacción : "+'\n' + sender.showBasicData() +'\n' +
                " - Usuario que recibe la transacción: "+'\n' + receiver.showBasicData()  ;
    }
}

