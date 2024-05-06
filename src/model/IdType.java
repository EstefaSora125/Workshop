package model;

/**
 * En este enumerados se establecen los tipos de identificación que puede tener un usuario
 * @author Estefania Sora
 * @version 05/05/2024
 */
public enum IdType {
    TI("Tarjeta Identidad"),
    CC("Cedula de Ciudadania"),
    CE("Cedula de Extranjeria"),
    RC("Registro Civil");
    private String name;

    /**
     * Constructor que obtiene el nombre descrito del tipo de identificación
     * @param name Corresponde al nombre del tipo de identificación
     */
    IdType(String name) {
        this.name = name;
    }

    /**
     * Permite obtener el nombre del tipo de identificación
     * @return String
     */
    public String getName() {
        return name;
    }
}
