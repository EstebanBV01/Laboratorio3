/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_b81023_estebanbarrantes_b86597_jerryrivera;

/**
 *
 * @author Usuario
 */
public class NationalMonument extends NationalPark implements Income {
    private double publicIncomes;
    private double privateIncomes;
    private double totalIncomes;
    
   
    public NationalMonument (String name,String location  , int nationalVisitors, int foreignVisitors){
        super(name, location, nationalVisitors, foreignVisitors);
        
    }

    public double getPublicIncomes() {
        return publicIncomes;
    }

    public void setPublicIncomes(double publicIncomes) {
        this.publicIncomes = publicIncomes;
    }

    public double getPrivateIncomes() {
        return privateIncomes;
    }

    public void setPrivateIncomes(double privateIncomes) {
        this.privateIncomes = privateIncomes;
    }
    
    @Override
    public double totalIncome() {
        this.totalIncomes=this.privateIncomes;
        return this.totalIncomes;
    }

    @Override
    public void privateIncome() {
        this.privateIncomes=(super.getForeignVisitors()*6000)+(super.getNationalVisitors()*5000);
    }
    
}
