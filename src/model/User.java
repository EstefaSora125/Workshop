package model;

/**
 * Se establecen los atributos de la clase usuario
 * @author Estefania Sora
 * @version 05/05/2024
 */
public class User {
    private String id;
    private String typeId;
    private String name;
    private String lastName;

    /**
     * Se define el constructor para la creación del usuario
     * @param id Corresponde al número de identificación del usuario
     * @param typeId Corresponde al tipo de identificación del usuario
     * @param name Corresponde al nómbre dle usuario
     * @param lastName Corresponde al apellido del usuario
     */
    public User(String id, String typeId, String name, String lastName) {
        this.id = id;
        this.typeId = typeId;
        this.name = name;
        this.lastName = lastName;
    }

    /**
     * Permite obtener la identificación del usuario
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Muestra la información básica del usuario
     * @return String
     */
    public String showBasicData() {
        return "Información Usuario" + '\n' +
                " - Nombre: " + name + '\n' +
                " - Apellido: " + lastName;
    }

    /**
     * Muestra la información completa del usuario
     * @return String
     */
    public String showAllData() {
        return "Información Usuario" + '\n' +
                " - Número de identificación: " + id +'\n' +
                " - Tipo de identificación: " + typeId + '\n' +
                " - Nombre: " + name + '\n' +
                " - Apellido: " + lastName;
    }
}
