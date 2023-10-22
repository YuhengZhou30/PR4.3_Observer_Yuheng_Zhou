package com.project;
import java.util.ArrayList;
import java.util.List;

public class PR450Entregues {
    private List<PR450Producte> productes;

    public PR450Entregues() {
        // Constructor de la clase PR450Entregues
        // Inicializa la lista de productos entregados como una lista vacía.
        productes = new ArrayList<>();
    }

    public void addProducte(PR450Producte producte) {
        // Método para agregar un producto a la lista de entregas
        productes.add(producte);  // Agrega el producto a la lista
        System.out.println("S'ha afegit el producte amd id "+ producte.getId());
    }

    public void removeProducte(int id) {
        // Método para eliminar un producto de la lista de entregas por su ID
        PR450Producte removedProducte = null;

        for (PR450Producte producte : productes) {
            if (producte.getId() == id) {
                removedProducte = producte;  // Encuentra el producto con el ID proporcionado
                break;
            }
        }

        if (removedProducte != null) {
            productes.remove(removedProducte);  // Elimina el producto de la lista
        }
    }

    @Override
    public String toString() {
        // Método para representar la lista de entregas como una cadena
        StringBuilder result = new StringBuilder("Entregues:[");

        for (PR450Producte producte : productes) {
            result.append(producte.getId()).append(" : ").append(producte.getNom()).append(",");
        }

        result.delete(result.length() - 1, result.length());  // Elimina la última coma
        result.append("]");
        return result.toString();  // Devuelve la representación en cadena de la lista de entregas
    }
}
