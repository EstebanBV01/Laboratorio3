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
public class ProtectedZones {
    private String name;
    private String location;
    private double totalIncomes;
    public ProtectedZones(String name, String location,double total) {
        this.name = name;
        this.location = location;
        this.totalIncomes=total;
    }
    public ProtectedZones(){
        this("","",0);
    }

    public String getName() {
        return name;
    }

    public  double getTotalIncomes() {
        return totalIncomes;
    }

    public  void setTotalIncomes(double  totalIncomes) {
        this.totalIncomes = totalIncomes;
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

    @Override
    public String toString() {
        return "ProtectedZones{" + "name=" + name + ", location=" + location + '}';
    }
  
}
