/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_b81023_estebanbarrantes_b86597_jerryrivera;

/**
 *
 * @author usuario
 */
public class CulturalHeritageNationalMonument extends NationalMonument implements Income {
    private double publicIncomes;
    private double privateIncomes;
    private double pib;
    public CulturalHeritageNationalMonument(String name, String location, double total , int nationalVisitors, int foreignVisitors, double pib) {
        super(name, location, total, nationalVisitors, foreignVisitors);
        this.pib = pib;
    }
    
    public void privateIncome(){
        super.setPrivateIncomes(pib*0.00002+(super.getForeignVisitors()*6000)+(super.getNationalVisitors()*50000));
        
    }
    
    @Override
    public double totalIncomes (){
        super.setTotalIncomes(this.privateIncomes);
        return super.totalIncomes();
    }
    
    
}
