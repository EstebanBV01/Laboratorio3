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
   // private double publicIncomes;
    private double privateIncomes;
    private double localIncomes;
    public NationalMonument (String name,String location  , int nationalVisitors, int foreignVisitors){
        super(name, location, nationalVisitors, foreignVisitors);
        /*this.publicIncomes=publics;
        this.privateIncomes=privates;
        this.totalIncomes=total;*/
    }

    public NationalMonument() {
        this("", "", 0, 0);
    }
    public double getPrivateIncomes() {
        return privateIncomes;
    }

    public void setPrivateIncomes(double privateIncomes) {
        this.privateIncomes = privateIncomes;
    }
    /*Monumento Nacional: sus ingresos se obtienen totalmente de las entradas al parque, tomando
en cuenta los mismos criterios que para los Parques Nacionales. Existen algunos monumentos
que han sido declarados patrimonio cultural de la humanidad por lo que adicionalmente
reciben un monto anual de ayuda no gubernamental de parte de entidades internacionales que
corresponde al 0.002 por ciento del PIB(Producto Interno Bruto) del país.*/
    
    public double localIncome() {
        this.localIncomes=this.privateIncomes;
        return this.localIncomes;
    }

    @Override
    public double privateIncome() {
        this.privateIncomes=(super.getForeignVisitors()*6000)+(super.getNationalVisitors()*5000);
        return privateIncomes;
    }

    @Override
    public String toString() {
        return "NationalMonument{"+super.toString() +", totalIncomesMonumet=" + localIncomes + '}';
    }
     public void totalIncomeSuper() {
        super.setTotalIncomesSuper(localIncomes); //To change body of generated methods, choose Tools | Templates.
    }
    
}
