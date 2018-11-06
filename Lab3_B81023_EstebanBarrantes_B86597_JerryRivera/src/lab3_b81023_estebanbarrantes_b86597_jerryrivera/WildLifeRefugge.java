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
public class WildLifeRefugge extends ProtectedZones{
    /*Refugio de Vida Silvestre: Sus ingresos dependen si la reserva es propiedad del estado o es de
propiedad privada. En el caso de que sea del estado, sus ingresos provienen por subvención del
estado   de   un   porcentaje   de   0.005   del   monto   total   anual   obtenido   por   el   impuesto   de
combustibles. En el caso de que el refugio sea de propiedad privada sus ingresos anuales son
totalmente de ayuda no gubernamental por empresas privadas.*/
    private boolean statesProperty;
    private double privateIncomes;
    private double publicIncomes;
    private double gasolineTax;

    public WildLifeRefugge( String name, String location, double total,boolean statesProperty, double privateIncomes, double publicIncomes,double tax) {
        super(name, location, total);
        this.statesProperty = statesProperty;
        this.privateIncomes = privateIncomes;
        this.publicIncomes = publicIncomes;
        this.gasolineTax=tax;
    }

   public WildLifeRefugge(){
    this("","",0,false,0,0,0);
   }

    public boolean isStatesProperty() {
        return statesProperty;
    }

    public double getPrivateIncomes() {
        return privateIncomes;
    }

    public double getPublicIncomes() {
        return publicIncomes;
    }

    public void setStatesProperty(boolean statesProperty) {
        this.statesProperty = statesProperty;
    }

    public void setPrivateIncomes(double privateIncomes) {
        this.privateIncomes = privateIncomes;
    }

    public void setPublicIncomes(double publicIncomes) {
        this.publicIncomes = publicIncomes;
    }
   
    @Override
    public String toString() {
        return "WildLifeRefugge{" +super.toString()+ "statesProperty=" + statesProperty + ", privateIncomes=" + privateIncomes + ", publicIncomes=" + publicIncomes + '}';
    }
   
   public double totalIncomes(){
        super.setTotalIncomes(privateIncomes+publicIncomes);
        return super.getTotalIncomes();
    }
   public double publicIncomes(){
       if(this.statesProperty==true){
         this.publicIncomes=this.gasolineTax*000.5;
         return this.publicIncomes;
       }else return this.privateIncomes;
       
   }
    
    
}
