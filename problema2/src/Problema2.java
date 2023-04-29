import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        EquivalenteHora eqh = new EquivalenteHora(2);
        eqh.calcularDias();
        eqh.calcularMinutos();
        eqh.calcularSegundos();
        eqh.toString();
        System.out.println(eqh);
    }
}

class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private float dias;

    public EquivalenteHora(int horas) {
        this.horas=horas;
    }


    public void calcularMinutos(){
        this.minutos = this.horas * 60;
    }
    public void calcularSegundos(){
        this.segundos = this.horas * 3600;
    }
    public void calcularDias(){
        this.dias = (float) (this.horas / 24.0);
    }


    public void setHoras(){
        this.horas=horas;
    }
    public void setMinutos(){
        this.minutos=minutos;
    }
    public void setSegundos(){
        this.segundos=segundos;
    }
    public void setDias(){
        this.dias=dias;
    }



    public int getHoras() {
        return this.horas;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public float getDias() {
        return this.dias;
    }

    @Override
    public String toString() {
        String msj = String.format("Conversor: " +
                        "\nDias: %.2f" +
                        "\nHoras: %d" +
                        "\nMinutos: %d" +
                        "\nSegundos: %d",
                getDias(), getHoras(), getMinutos(), getSegundos());

        return msj;
    }
}
