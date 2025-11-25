/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actextrapoop11;

/**
 *
 * @author aeth3rglow
 */
public class ActExtraPOOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear lista con 10 objetos alumno
        System.out.println("--- Creando a los alumnos ---");
        Alumno[] alumnos = new Alumno[10];
        alumnos[0] = new Alumno("Juan", "Perez", "Lopez", "123456789", 20);
        alumnos[1] = new Alumno("Maria", "Gomez", "Sanchez", "987654321", 21);
        alumnos[2] = new Alumno("Pedro", "Hernandez", "Diaz", "456123789", 22);
        alumnos[3] = new Alumno("Ana", "Martinez", "Ruiz", "789123456", 19);
        alumnos[4] = new Alumno("Luis", "Garcia", "Torres", "321654987", 23);
        alumnos[5] = new Alumno("Sofia", "Rodriguez", "Vazquez", "654987321", 20);
        alumnos[6] = new Alumno("Carlos", "Lopez", "Jimenez", "159753468", 21);
        alumnos[7] = new Alumno("Elena", "Diaz", "Moreno", "753159852", 22);
        alumnos[8] = new Alumno("Miguel", "Sanchez", "Alvarez", "852456951", 19);
        alumnos[9] = new Alumno("Lucia", "Torres", "Romero", "951753852", 23);

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

        // 2. Exportar a CSV
        System.out.println("\n--- Exportando al archivo alumnos.csv ---");
        String nombreArchivo = "alumnos.csv";
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(nombreArchivo))) {
            for (Alumno alumno : alumnos) {
                String linea = alumno.getNombre() + "," +
                        alumno.getApPat() + "," +
                        alumno.getApMat() + "," +
                        alumno.getNumCuenta() + "," +
                        alumno.getEdad();
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Archivo creado exitosamente.");
        } catch (java.io.IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }

        // 3. Leer archivo y tokenizar
        System.out.println("\n--- Leyendo de alumnos.csv y tokenizando ---");
        Alumno[] alumnosLeidos = new Alumno[10];
        int contador = 0;

        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null && contador < 10) {
                java.util.StringTokenizer tokenizador = new java.util.StringTokenizer(linea, ",");

                if (tokenizador.countTokens() >= 5) {
                    String nombre = tokenizador.nextToken();
                    String apPat = tokenizador.nextToken();
                    String apMat = tokenizador.nextToken();
                    String numCuenta = tokenizador.nextToken();
                    String edadStr = tokenizador.nextToken();
                    int edad = Integer.parseInt(edadStr);

                    Alumno alumno = new Alumno(nombre, apPat, apMat, numCuenta, edad);
                    alumnosLeidos[contador] = alumno;
                    contador++;
                }
            }
        } catch (java.io.IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        // 4. Mostrar alumnos leídos
        System.out.println("\n--- Alumnos inflados desde el archivo ---");
        for (Alumno alumno : alumnosLeidos) {
            if (alumno != null) {
                System.out.println(alumno);
            }
        }
    }

}
