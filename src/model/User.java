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
    public String showBasicData() {
        return "Información Usuario" + '\n' +
                " - Nombre: " + name + '\n' +
                " - Apellido: " + lastName;
    }

    public String showAllData() {
        return "Información Usuario" + '\n' +
                " - Número de identificación: " + id +'\n' +
                " - Tipo de identificación: " + typeId + '\n' +
                " - Nombre: " + name + '\n' +
                " - Apellido: " + lastName;
    }
}
