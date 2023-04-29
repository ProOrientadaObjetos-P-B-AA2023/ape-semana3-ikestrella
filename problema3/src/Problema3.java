public class Problema3 {
    public static void main(String[] args) {
        InstitucionEducativa educativa= new InstitucionEducativa("Schubert","Privada", 2000,40,2,1500);
        educativa.calcularPresupuesto();
        System.out.println(educativa);
    }
}
class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlum;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectados;
    private double presupuesto;

    public InstitucionEducativa(){}
    public InstitucionEducativa(String nombre, String tipoInstitucion, int numeroAlum, int numeroDocentes, int numeroSedes, double gastosProyectados) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlum = numeroAlum;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosProyectados = gastosProyectados;
    }

    public void calcularPresupuesto(){
        this.presupuesto= numeroAlum * gastosProyectados;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTipoInstitucion(String tipoInstitucion){
        this.tipoInstitucion=tipoInstitucion;
    }
    public void setNumeroAlumnos(int numeroAlum){
        this.numeroAlum=numeroAlum;
    }
    public void setNumeroDocentes(int numeroDocentes){
        this.numeroDocentes=numeroDocentes;
    }
    public void setNumeroSedes(int numeroSedes){
        this.numeroSedes=numeroSedes;
    }
    public void serPresup(double presupuesto){
        this.presupuesto=presupuesto;
    }
    public String getNombre() {
        return this.nombre;
    }

    public String getTipoInstitucion() {
        return this.tipoInstitucion;
    }

    public int getNumeroAlumnos() {
        return this.numeroAlum;
    }

    public int getNumeroDocentes() {
        return this.numeroDocentes;
    }

    public int getNumeroSedes() {
        return this.numeroSedes;
    }

    public double getGastosProyectados() {
        return this.gastosProyectados;
    }

    public double getPresupuesto() {
        return this.presupuesto;
    }

    @Override
    public String toString() {
        String msj = String.format("INSTITUCIONES EDUCATIVAS" +
                        "\nNombre: %s" +
                        "\nTipo: %s" +
                        "\nNumero Alumnos: %d" +
                        "\nNumero Docentes: %d" +
                        "\nNumero Sedes: %d" +
                        "\nGastos Proyectados: %.2f" +
                        "\nPresupuesto: %.2f", this.getNombre(), this.getTipoInstitucion(), this.getNumeroAlumnos(), this.getNumeroDocentes(), this.getNumeroSedes(),
                this.getGastosProyectados(), this.getPresupuesto());
        return msj;
    }
}

