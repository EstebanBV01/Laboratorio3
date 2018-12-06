/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_b81023_estebanbarrantes_b86597_jerryrivera;

/**
 *
 * @author estebanbv
 */
public abstract class ProtectedZones {
    private String name;
    private String location;
    private double totalIncomesSuper;
    
    public ProtectedZones(String name, String location) {
        this.name = name;
        this.location = location;
     
    }
    public ProtectedZones(){
        this("","");
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTotalIncomesSuper(double totalIncomesSuper) {
        this.totalIncomesSuper = totalIncomesSuper;
    }

    public double getTotalIncomesSuper() {
        return totalIncomesSuper;
    }
    
    public abstract void totalIncomeSuper();
    @Override
    public String toString() {
        return "ProtectedZones{" + "name=" + name + ", location=" + location + '}';
    }
    
  
}
