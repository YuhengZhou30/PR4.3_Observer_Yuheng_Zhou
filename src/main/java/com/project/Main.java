package com.project;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la clase PR450Producte para representar productos
        PR450Producte p0 = new PR450Producte(0, "Llibre");
        PR450Producte p1 = new PR450Producte(1, "Llapis");
        PR450Producte p2 = new PR450Producte(2, "Rotulador");
        PR450Producte p3 = new PR450Producte(3, "Carpeta");
        PR450Producte p4 = new PR450Producte(4, "Motxilla");

        // Crear instancias de las clases PR450Magatzem y PR450Entregues
        PR450Magatzem magatzem = new PR450Magatzem();
        PR450Entregues entregues = new PR450Entregues();

        // Modificar algunos productos
        p0.setId(5);
        p0.setNom("Llibreta");
        p1.setNom("Boli");

        // Agregar productos al almacén
        magatzem.addProducte(p0);
        magatzem.addProducte(p1);
        magatzem.addProducte(p2);
        magatzem.addProducte(p3);
        magatzem.addProducte(p4);

        // Mover productos del almacén a la lista de entregas
        magatzem.removeProducte(2, entregues);
        magatzem.removeProducte(3, entregues);
        magatzem.removeProducte(4, entregues);

        // Eliminar productos específicos de la lista de entregas
        entregues.removeProducte(2);
        entregues.removeProducte(3);

        // Imprimir información del almacén y la lista de entregas
        System.out.println(magatzem);

        System.out.println(entregues);
    }
}
