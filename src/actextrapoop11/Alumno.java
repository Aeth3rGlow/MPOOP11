package actextrapoop11;

/**
 * 
 * @author aeth3rglow
 */
public class Alumno {
    private String nombre;
    private String apPat;
    private String apMat;
    private String numCuenta;
    private int edad;

    public Alumno() {
    }

    public Alumno(String nombre, String apPat, String apMat, String numCuenta, int edad) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apPat=" + apPat + ", apMat=" + apMat + ", numCuenta=" + numCuenta
                + ", edad=" + edad + '}';
    }
}
