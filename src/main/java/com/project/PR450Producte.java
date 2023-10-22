package com.project;

public class PR450Producte {
    private int id;
    private String nom;

    public PR450Producte(int id, String nom) {
        // Constructor de la clase PR450Producte
        // Inicializa un producto con un ID y un nombre proporcionados.
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        // Método para obtener el ID del producto.
        return id;
    }

    public void setId(int id) {
        // Método para cambiar el ID del producto.
        int oldId = this.id;
        this.id = id;
        System.out.println("El Producte ha camviat l'id de " + oldId + " a " + id);
        // Imprime un mensaje que indica el cambio de ID.
    }

    public String getNom() {
        // Método para obtener el nombre del producto.
        return nom;
    }

    public void setNom(String nom) {
        // Método para cambiar el nombre del producto.
        String oldNom = this.nom;
        this.nom = nom;
        System.out.println("El Producte ha camviat el nom de " + oldNom + " a " + nom);
        // Imprime un mensaje que indica el cambio de nombre.
    }
}
