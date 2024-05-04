package model;
public class User {
    // Atributos
    private String id;
    private String typeId;
    private String name;
    private String lastName;

    // Constructor
    public User(String id, String typeId, String name, String lastName) {
        this.id = id;
        this.typeId = typeId;
        this.name = name;
        this.lastName = lastName;
    }

    // Getter
    public String getId() {
        return id;
    }

    // Información
    public String getShowData() {
        return "Usuario{" +
                "idUser=" + id +
                ", typeId='" + typeId + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
