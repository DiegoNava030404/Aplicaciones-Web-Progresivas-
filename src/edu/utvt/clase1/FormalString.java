package edu.utvt.clase1;

public class FormalString {
    public static void main(String[] args) {

        String name = "John Doe";
        String age = "15";

        String message = "hola " + name + " con tu edad actual " + age + ", ya eres mayor de edad.";
        System.out.println(message);

        // Uso de StringBuffer para construir cadenas
        StringBuffer sb = new StringBuffer();
        sb.append("Hola ");
        sb.append(name);
        sb.append(" con tu edad actual ");
        sb.append(age);
        sb.append(", ya eres mayor de edad.");

        System.out.println(sb.toString());

        // Uso de String.format
        String defaultMessage = "Hola %s con tu edad actual %s, ya eres mayor de edad.";
        String newMessage = String.format(defaultMessage, name, age);
        System.out.println(newMessage);
    }
}