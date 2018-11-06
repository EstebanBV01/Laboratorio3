/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_b81023_estebanbarrantes_b86597_jerryrivera;

/**
 *
 * @author  estebanbv
 */
public class WildLifeRefugge extends ProtectedZones implements Income{
    /*Refugio de Vida Silvestre: Sus ingresos dependen si la reserva es propiedad del estado o es de
propiedad privada. En el caso de que sea del estado, sus ingresos provienen por subvención del
estado   de   un   porcentaje   de   0.005   del   monto   total   anual   obtenido   por   el   impuesto   de
combustibles. En el caso de que el refugio sea de propiedad privada sus ingresos anuales son
totalmente de ayuda no gubernamental por empresas privadas.*/
    private double privateIncomes;
    private double publicIncomes;
    private double totalIncomes;
    private double gasolineTax;
    public WildLifeRefugge( String name, String location ,double tax) {
        super(name, location);
        this.gasolineTax=tax;
    }

   public WildLifeRefugge(){
    this("","",0);
   }


    public double getPrivateIncomes() {
        return privateIncomes;
    }

    public double getPublicIncomes() {
        return publicIncomes;
    }

    public void setPrivateIncomes(double privateIncomes) {
        this.privateIncomes = privateIncomes;
    }

    public void setPublicIncomes(double publicIncomes) {
        this.publicIncomes = publicIncomes;
    }
   
    @Override
    public String toString() {
        return "WildLifeRefugge{" +super.toString() + ", privateIncomes=" + privateIncomes + ", publicIncomes=" + publicIncomes + "total "+this.privateIncomes+'}';
    }
    public double publicIncome(){return-1;};
   public void privateIncome(){
    this.privateIncomes=gasolineTax*0.005;
   }
   public double totalIncome(){
        this.totalIncomes=publicIncomes+privateIncomes;
        return this.totalIncomes;
    }
  
    
    
}
