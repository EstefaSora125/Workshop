package model;

public class Main {
    public static void main(String[] args) {
        User usuarioEnzo = new User("1234", IdType.CC.getName(), "Enzo", "Morales");
        System.out.println(usuarioEnzo.getShowData());
    }
}
