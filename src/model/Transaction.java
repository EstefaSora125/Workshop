package model;

import java.time.LocalDateTime;

public class Transaction {

    private  String id;
    private double amount;
    private User sender;
    private User receiver;
    private LocalDateTime date;

    public Transaction(String id, double amount, User sender, User receiver, LocalDateTime date) {
        this.id = id;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
    }

    private String createDateFormat(){
        return + date.getDayOfMonth() + "/" + date.getMonth() + "/" + date.getYear() + " " + date.getHour()+ ":" +date.getMinute()+ ":" +date.getSecond();
    }
    public String toString() {
        return "Información transacción " + '\n'+
                " - N°: " + id + '\n' +
                " - Fecha transacción: " + createDateFormat() +'\n' +
                " - Monto enviado: " + amount + '\n' +
                " - Usuario que realiza la transacción : "+'\n' + sender.showBasicData() +'\n' +
                " - Usuario que recibe la transacción: "+'\n' + receiver.showBasicData()  ;
    }
}
