/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_b81023_estebanbarrantes_b86597_jerryrivera;

/**
 *
 * @author estebanbv,
 */
public class NationalPark extends ProtectedZones{
    int stateIncomes;
    int privateIncomes;
    public NationalPark( String name, String location,int stateIncomes, int privateIncomes) {
        super(name, location);
        this.stateIncomes = stateIncomes;
        this.privateIncomes = privateIncomes;
    }

    public NationalPark(int stateIncomes, int parkincomes) {
        this("","",0,0);        
    }

    public int getStateIncomes() {
        return stateIncomes;
    }

    public int getParkincomes() {
        return privateIncomes;
    }

    public void setStateIncomes(int stateIncomes) {
        this.stateIncomes = stateIncomes;
    }

    public void setParkincomes(int parkincomes) {
        this.privateIncomes = parkincomes;
    }

    @Override
    public String toString() {
        return "NationalPark{" + "stateIncomes=" + stateIncomes + ", parkincomes=" + privateIncomes + '}';
    }
    /*Parque Nacional: reciben una parte de sus ingresos por subvención del estado y
    otra parte en
base al pago por entradas al parque. El valor correspondiente a la subvención corresponde a un
impuesto fijo de ¢1200 anuales que rebaja a cada uno de los clientes subscritos al servicio de
electricidad del estado en sus recibos. El cálculo del pago de entradas al parque corresponde a
la cantidad de personas que entraron al parque durante el año por un monto estipulado de
¢5000 para costarricenses y ¢6000 para extranjeros.*/
    public double stateIncome(){
        //supongo que 1200*2millones
        int total=0;
        total=1200*2000000;
        return total;
    }
    public double  privateIncome(int intTickets,int natTickets){//ticketes para
        int total=0;                                    //interacionalesy nacionales   
        total=(intTickets*6000)+(natTickets*50000);       
        return total;
    }
    
}
