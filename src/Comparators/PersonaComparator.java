package Comparators;

import java.util.Arrays;

public class PersonaComparator {

    public static void main(String[] args) {

        System.out.println("Hola Comparators.Persona Comparator");
        Persona[] allPersona = new Persona[4];
        allPersona[0] = new Persona("Viggo", "Berto", 5);
        allPersona[1] = new Persona("Jano", "Avena", 32);
        allPersona[2] = new Persona("Xavier", "Mordor", 65);
        allPersona[3] = new Persona("Nicov", "Valdepeito", 16);

        //NombreComparator
        for (int i = 0; i < allPersona.length; i++) {
            System.out.println("Antes: " + allPersona[i].getNombre());
        }
        Arrays.sort(allPersona, new NombreComparator());
        for (int i = 0; i < allPersona.length; i++) {
            System.out.println("Despues: " + allPersona[i].getNombre());
        }

        //Apellidos
        for (int i = 0; i < allPersona.length; i++) {
            System.out.println("Antes: " + allPersona[i].getApellido());
        }
        Arrays.sort(allPersona, new ApellidoComparator());
        for (int i = 0; i < allPersona.length; i++) {
            System.out.println("Despues: " + allPersona[i].getApellido());
        }

        //Edad
        for (int i = 0; i < allPersona.length; i++) {
            System.out.println("Antes: " + allPersona[i].getEdad());
        }
        Arrays.sort(allPersona, new EdadComparator());
        for (int i = 0; i < allPersona.length; i++) {
            System.out.println("Despues: " +allPersona[i].getEdad());
        }
    }
}
