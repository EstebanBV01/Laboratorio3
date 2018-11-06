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
public abstract class NationalMonument extends NationalPark implements Income {
    private double publicIncomes;
    private double privateIncomes;
    
   
    public NationalMonument (String name,String location, double total, double publicIncomes, double privateIncomes, int electricityUsers, int nationalVisitors, int foreignVisitors){
        super(name, location, total, electricityUsers, nationalVisitors, foreignVisitors);
        this.privateIncomes = privateIncomes;
        this.publicIncomes = publicIncomes;
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
    public double totalIncomes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void privateIncome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
