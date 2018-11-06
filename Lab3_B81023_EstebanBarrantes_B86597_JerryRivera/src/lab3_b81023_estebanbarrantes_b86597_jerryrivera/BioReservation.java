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
public abstract class BioReservation extends ProtectedZones {
    private static  double publicIncome;
    
    public BioReservation(String name, String location,int total, double publicIncome){
        super(name,location,0);
        this.publicIncome = publicIncome;
    }
    public BioReservation(){
        this("","",0,0);
 
    }
    public static double getPublicIncome() {
        return publicIncome;
    }

    public void setPublicIncome(double publicIncome) {
        this.publicIncome = publicIncome;
    } 
    @Override
    public double totalIncomes() {
        super.setTotalIncomes(publicIncome);
        return this.totalIncomes();
    }
    
}