package com.project;
import java.util.ArrayList;
import java.util.List;

public class PR450Magatzem {
    private List<PR450Producte> productes;
    private int capacitat;

    public PR450Magatzem() {
        // Constructor de la clase PR450Magatzem
        // Inicializa la lista de productos en el almacén como una lista vacía y establece la capacidad inicial en 10.
        productes = new ArrayList<>();
        capacitat = 10;
    }

    public void addProducte(PR450Producte producte) {
        // Método para agregar un producto al almacén
        if (capacitat > 0) {
            capacitat--;
            productes.add(producte);  // Agrega el producto a la lista
            System.out.println("S'ha afegit el producte amd id " + producte.getId() + " al magatzem, capacitat " + capacitat);
        }
    }

    public void removeProducte(int id, PR450Entregues entregues) {
        // Método para eliminar un producto del almacén por su ID y moverlo a la lista de entregas
        PR450Producte removedProducte = null;
        for (PR450Producte producte : productes) {
            if (producte.getId() == id) {
                capacitat++;
                System.out.println("S'ha esborrat el producte amd id " + id + " al magatzem, capacitat " + capacitat);
                entregues.addProducte(producte);  // Agrega el producto a la lista de entregas
                removedProducte = producte;
                break;
            }
        }

        if (removedProducte != null) {
            productes.remove(removedProducte);  // Elimina el producto del almacén
        }
    }

    @Override
    public String toString() {
        // Método para representar el almacén como una cadena
        StringBuilder result = new StringBuilder("Magatzem:[");
        for (PR450Producte producte : productes) {
            result.append(producte.getId()).append(" : ").append(producte.getNom()).append(",");
        }
        result.delete(result.length() - 1, result.length());  // Elimina la última coma
        result.append("]");
        return result.toString();  // Devuelve la representación en cadena del almacén
    }
}
