public class Problema4 {
    public static void main(String[] args) {
        Celular cel= new Celular("Android",3.5,450,15,"213sad243","wqe1298j9a");
        System.out.println(cel);
    }
}
class Celular{
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoFinal;
    private String direccionMac;
    private String infoIMEI;
    public Celular(String sistemaOperativo, double tamanioPantalla, double costoInicial,double ivaPorcentaje,String direccionMac, String infoIMEI){
        this.sistemaOperativo=sistemaOperativo;
        this.tamanioPantalla=tamanioPantalla;
        this.costoInicial=costoInicial;
        this.ivaPorcentaje=ivaPorcentaje;
        ivaCostoFinal=(costoInicial*(ivaPorcentaje/100))+costoInicial;
        this.direccionMac=direccionMac;
        this.infoIMEI=infoIMEI;
    }

    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo=sistemaOperativo;
    }
    public void setTamanioPantalla(double tamanioPantalla){
        this.tamanioPantalla=tamanioPantalla;
    }
    public void setCostoInicial(double costoInicial){
        this.costoInicial=costoInicial;
    }
    public void setIvaPorcentaje(double ivaPorcentaje){
        this.ivaPorcentaje=ivaPorcentaje;
    }
    public void setIvaCostoFinal(double costoFinal){
        this.ivaCostoFinal=ivaCostoFinal;
    }
    public void setDireccionMac(String direccionMac){
        this.direccionMac=direccionMac;
    }
    public void setInfoIMEI(String infoIMEI){
        this.infoIMEI=infoIMEI;
    }

    public String getSistemaOperativo(){
        return this.sistemaOperativo;
    }
    public double getTamanioPantalla(){
        return this.tamanioPantalla;
    }
    public double getCostoInicial(){
        return this.costoInicial;
    }
    public double getIvaPorcentaje(){
        return this.ivaPorcentaje;
    }
    public double getIvaCostoFinal(){
        return this.ivaCostoFinal;
    }
    public String getDireccionMac(){
        return this.direccionMac;
    }
    public String getInfoIMEI(){
        return this.infoIMEI;
    }
    public String toString(){
        String msj= String.format("DISPOSITIVOS ELECTRONICOS"+
                "\nSistema Operativo: %s"+
                "\nTamanio Pantalla: %.2f"+
                "\nCosto Inicial: %.2f"+
                "\nIva en Porcentaje:%.2f" +
                "\nIva Costo Final: %.2f" +
                "\nDireccion MAC: %s" +
                "\nInfo IMEI: %s",
                this.getSistemaOperativo(),this.getTamanioPantalla(),this.costoInicial, this.ivaPorcentaje, this.ivaCostoFinal,
                this.direccionMac, this.getInfoIMEI());

        return msj;
    }
}
