package model;

public enum IdType {
    TI("Tarjeta Identidad"),
    CC("Cedula de Ciudadania"),
    CE("Cedula de Extranjeria"),
    RC("Registro Civil");
    private String name;

    // Constructor
    IdType(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}
