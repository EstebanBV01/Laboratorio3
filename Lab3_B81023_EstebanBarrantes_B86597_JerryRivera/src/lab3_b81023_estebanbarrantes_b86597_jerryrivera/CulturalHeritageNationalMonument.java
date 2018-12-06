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
    private double privateIncomes;
    private double totalIncomes;
    private double pib;
    public CulturalHeritageNationalMonument(String name, String location, int nationalVisitors, int foreignVisitors,double pib) {
        super(name, location, nationalVisitors,foreignVisitors);
        this.pib = pib;
    }
    
    @Override
    public double privateIncome(){
      super.setPrivateIncomes(this.pib*0.00002+(super.getForeignVisitors()*6000)+(super.getNationalVisitors()*50000));
     return super.getPrivateIncomes();
    }
    
    @Override
    public double totalIncome (){
        this.totalIncomes=this.privateIncomes;
        return super.totalIncome();
    }

    @Override
    public String toString() {
        return "CulturalHeritageNationalMonument{"+super.toString() + "privateIncomes=" + privateIncomes + ", totalIncomes=" + totalIncomes + ", pib=" + pib + '}';
    }
    public  void totalIncomeSuper(){}
    
}
