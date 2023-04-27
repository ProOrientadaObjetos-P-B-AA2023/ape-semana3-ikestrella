import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        EquivalenteHora eqh = new EquivalenteHora();
        System.out.println(eqh);
    }
}

class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private float dias;

    public EquivalenteHora() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas: ");
        horas = sc.nextInt();

        minutos = horas * 60;
        segundos = horas * 3600;
        dias = (float) (horas / 24.0);
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
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public float getDias() {
        return dias;
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