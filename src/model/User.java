package model;
public class User {
    // Atributos
    private String idUser;
    private String typeId;
    private String name;
    private String lastName;

    // Constructor
    public User(String idUser, String typeId, String name, String lastName) {
        this.idUser = idUser;
        this.typeId = typeId;
        this.name = name;
        this.lastName = lastName;
    }

    // Getter
    public String getIdUser() {
        return idUser;
    }
    public String getTypeId() {
        return typeId;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

    // Información
    public String getShowData() {
        return "Usuario{" +
                "idUser=" + idUser +
                ", typeId='" + typeId + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
