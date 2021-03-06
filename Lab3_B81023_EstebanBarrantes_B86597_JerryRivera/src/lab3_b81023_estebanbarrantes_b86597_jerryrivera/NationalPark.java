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
    private double localIncomes;
    private double publicIncomes;
    private double privateIncomes;
    private int nationalVisitors;
    private int foreignVisitors;
    private int electricityUsers;
    public NationalPark(String name,String location,int nationalVisitors, int foreignVisitors,int elecUsers){
        super(name, location);
        this.foreignVisitors = foreignVisitors;
        this.nationalVisitors = nationalVisitors;
        this.electricityUsers=elecUsers;
    }
        public NationalPark(String name,String location,int nationalVisitors, int foreignVisitors){
        super(name, location);
        this.foreignVisitors = foreignVisitors;
        this.nationalVisitors = nationalVisitors;
       
    }
    public NationalPark() {
        this("","",0,0,0);        
    }
/////////////////////////////////////////7


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
    public double publicIncome(){
        publicIncomes=1200*this.electricityUsers;
        return this.publicIncomes;
    }
    
   
    public double  privateIncome(){
      this.privateIncomes=(foreignVisitors*6000)+(nationalVisitors*50000);
        return privateIncomes; 
    }
    
    public double totalIncome(){
        this.localIncomes=privateIncomes+publicIncomes;
        return this.localIncomes;
    }
    public void totalIncomeSuper() {
        super.setTotalIncomesSuper(localIncomes); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString() {
        return "NationalPark{"+super.toString() +"publicIncomes "+publicIncome()+"  privateIncomes "+privateIncome()+" localIncomes"+totalIncome()+'}';
    }
    

    
}
