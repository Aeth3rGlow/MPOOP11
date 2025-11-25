/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author aeth3rglow
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("########## FileOutputStream ##########");
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba texto para el archivo");
            String texto = br.readLine();

            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            salida.println("Hola mundo desde el código");

            for (int i = 0; i < 10; i++) {
                salida.println("Linea " + i);
            }

            salida.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("##### File Reader #####");
        try {
            BufferedReader br;
            FileReader fr = new FileReader("archivo.txt");
            br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

            br.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("##### StringTokenizer #####");

        System.out.println("Cadena a tokenizar por espacios: ");
        String cadena = "El perro come cereal con cuchara";
        System.out.println(cadena);

        StringTokenizer st = new StringTokenizer(cadena, " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
