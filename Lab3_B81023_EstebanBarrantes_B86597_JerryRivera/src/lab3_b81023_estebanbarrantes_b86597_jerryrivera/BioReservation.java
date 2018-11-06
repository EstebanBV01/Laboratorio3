/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_b81023_estebanbarrantes_b86597_jerryrivera;

/**
 *
 * @author Johan
 */
public  class BioReservation extends ProtectedZones {
    private double publicIncome;
    double totalIncome;
    
    public BioReservation(String name, String location, double publicIncome){
        super(name,location);
        this.publicIncome = publicIncome;
    }

    public double getPublicIncome() {
        return publicIncome;
    }

    public void setPublicIncome(double publicIncome) {
        this.publicIncome = publicIncome;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }
    
    
    @Override
    public double totalIncomes() {
        totalIncome = publicIncome;
        return totalIncome;
    }
    
}