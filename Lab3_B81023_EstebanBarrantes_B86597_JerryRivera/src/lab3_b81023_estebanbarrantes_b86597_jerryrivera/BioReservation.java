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
public class BioReservation extends ProtectedZones implements Income {
    private double publicIncome;
    private double totalIncomes;
    private double stateHelp;
    
    public BioReservation(String name, String location, double stateHelp){
        super(name,location);
        this.stateHelp = stateHelp;
    }
    public BioReservation(){
        this("","",0);
 
    }

    @Override
    public String toString() {
        return "BioReservation{"+super.toString() + "publicIncome=" + publicIncome + ", totalIncomes=" + totalIncomes + ", stateHelp=" + stateHelp + '}';
    }
    public double getPublicIncome() {
        return publicIncome;
    }

    public void setPublicIncome(double publicIncome) {
        this.publicIncome = publicIncome;
    } 
    @Override
    public double totalIncome() {
        this.totalIncomes=publicIncome;
        return this.totalIncomes;
    }
    
    @Override
    public double publicIncome(){
        this.publicIncome = this.stateHelp;
        return this.publicIncome;
    }
    public void privateIncome(){};
    
    
}