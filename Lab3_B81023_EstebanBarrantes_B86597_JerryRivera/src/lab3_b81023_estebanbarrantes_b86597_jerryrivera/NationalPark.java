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
public class NationalPark extends ProtectedZones implements Income{
    double totalIncomes;
    double publicIncomes;
    double privateIncomes;
    private int electricityUsers;
    private int nationalVisitors;
    private int foreignVisitors;
    public NationalPark( String name, String location) {
        super(name, location);
    }
    public NationalPark(String name, String location,double publicIncomes, double privateIncomes) {
        super(name, location);
        this.publicIncomes = publicIncomes;
        this.privateIncomes = privateIncomes;
    }
    
    public NationalPark(String name,String location,int electricityUsers,int nationalVisitors, int foreignVisitors){
        super(name, location);
        this.electricityUsers = electricityUsers;
        this.foreignVisitors = foreignVisitors;
        this.nationalVisitors = nationalVisitors;
    }
    
    public NationalPark(int stateIncomes, int parkincomes) {
        this("","");        
    }
/////////////////////////////////////////7

    public int getElectricityUsers() {
        return electricityUsers;
    }

    public void setElectricityUsers(int electricityUsers) {
        this.electricityUsers = electricityUsers;
    }

    public int getNationalVisitors() {
        return nationalVisitors;
    }

    public void setNationalVisitors(int nationalVisitors) {
        this.nationalVisitors = nationalVisitors;
    }

    public int getForeignVisitors() {
        return foreignVisitors;
    }

    public void setForeignVisitors(int foreignVisitors) {
        this.foreignVisitors = foreignVisitors;
    }
    
    public double getTotalIncomes() {
        return totalIncomes;
    }
    
    public void setTotalIncomes(double publicIncomes,double privateIncomes) {
        this.totalIncomes =publicIncomes+privateIncomes;
    }
    
    public void setPrivateIncomes(int privateIncomes) {
        this.privateIncomes = privateIncomes;
    }
    
    public double getPrivateIncomes() {
        return privateIncomes;
    }
    
    public void setPublicIncomes(int incomes) {
        this.publicIncomes = incomes;
    }
    
    public double getPublicIncomes(){
        return publicIncomes;
    }
    
    @Override
    public String toString() {
        return "NationalPark{"+super.toString() +"publicIncomes "+publicIncomes+"  privateIncomes "+privateIncomes+'}';
    }
    /*Parque Nacional: reciben una parte de sus ingresos por subvención del estado y
    otra parte en
base al pago por entradas al parque. El valor correspondiente a la subvención corresponde a un
impuesto fijo de ¢1200 anuales que rebaja a cada uno de los clientes subscritos al servicio de
electricidad del estado en sus recibos. El cálculo del pago de entradas al parque corresponde a
la cantidad de personas que entraron al parque durante el año por un monto estipulado de
¢5000 para costarricenses y ¢6000 para extranjeros.*/
    @Override
    public void publicIncome(){
        publicIncomes=1200*electricityUsers;
    }
    
    @Override
    public void  privateIncome(){//ticketes para
        this.privateIncomes=(foreignVisitors*6000)+(nationalVisitors*50000);
    }
    
    public double totalIncomes(){
        this.totalIncomes=privateIncomes+publicIncomes;
        return totalIncomes;
    }

    
}
