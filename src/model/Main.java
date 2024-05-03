package model;

public class Main {
    public static void main(String[] args) {
        // Creación Usuarios
        User usuarioEnzo = new User("1234", IdType.CC.getName(), "Enzo", "Morales");
        User usuarioAndrea = new User("5678", IdType.RC.getName(), "Andrea", "Ropero");
        System.out.println(usuarioEnzo.getShowData());
        System.out.println(usuarioEnzo.getShowData());

        // Creación Wallet
        Wallet walletEnzo = new Wallet(1000000, usuarioEnzo);
        Wallet walletAndrea = new Wallet(500000, usuarioAndrea);
        System.out.println(walletEnzo.getShowData());
        System.out.println(walletAndrea.getShowData());
    }
}
