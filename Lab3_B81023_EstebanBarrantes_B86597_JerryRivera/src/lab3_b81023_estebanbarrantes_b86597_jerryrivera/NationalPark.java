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
public abstract class NationalPark extends ProtectedZones implements Income{
    private double publicIncomes;
    private double privateIncomes;
    private int electricityUsers;
    private int nationalVisitors;
    private int foreignVisitors;
    public NationalPark(String name,String location,double total,int electricityUsers,int nationalVisitors, int foreignVisitors){
        super(name, location,total);
        this.electricityUsers = electricityUsers;
        this.foreignVisitors = foreignVisitors;
        this.nationalVisitors = nationalVisitors;
    }
    
    public NationalPark() {
        this("","",0,0,0,0);        
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
    @Override
    public void publicIncome(){
        publicIncomes=1200*electricityUsers;
    }
    
    @Override
    public void  privateIncome(){//ticketes para
        this.privateIncomes=(foreignVisitors*6000)+(nationalVisitors*50000);
    }
    
    public double totalIncomes(){
        super.setTotalIncomes(privateIncomes+publicIncomes);
        return super.getTotalIncomes();
    }

    
}
