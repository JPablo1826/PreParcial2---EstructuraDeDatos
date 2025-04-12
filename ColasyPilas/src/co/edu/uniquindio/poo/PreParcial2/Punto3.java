package co.edu.uniquindio.poo.PreParcial2;

import java.util.LinkedList;
import java.util.Queue;

public class Punto3 {
    public static class Persona {
        private String nombre;
        private int edad;
        private char sexo; // 'M' para masculino, 'F' para femenino

        public Persona(String nombre, int edad, char sexo) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
        }

        public int getEdad() {
            return edad;
        }

        public char getSexo() {
            return sexo;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public String toString() {
            return nombre + " (" + edad + ", " + sexo + ")";
        }
    }
    public static Queue<Persona> filtrarCola(Queue<Persona> colaOriginal) {
        Queue<Persona> colaFiltrada = new LinkedList<>();

        while (!colaOriginal.isEmpty()) {
            Persona persona = colaOriginal.poll();

            if (!(persona.getSexo() == 'M' && persona.getEdad() >= 30 && persona.getEdad() <= 50)) {
                colaFiltrada.add(persona);
            }
        }

        return colaFiltrada;
    }
    public static void main(String[] args) {
        Queue<Persona> personas = new LinkedList<>();
        personas.add(new Persona("Juan", 52, 'M'));
        personas.add(new Persona("Jhan", 25, 'F'));
        personas.add(new Persona("Carlos", 45, 'M'));
        personas.add(new Persona("Emi", 32, 'F'));

        Queue<Persona> resultado = Punto3.filtrarCola(personas);

        for (Persona p : resultado) {
            System.out.println(p);
        }

    }
}
