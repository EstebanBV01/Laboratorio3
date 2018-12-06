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
public class Lab3_B81023_EstebanBarrantes_B86597_JerryRivera {

    public static void main(String[] args) {
       NationalPark natPark=new NationalPark("Sabana", "San jose", 5, 7, 100);
       NationalMonument natMon =new NationalMonument("Estatua", "Alajuela", 16, 5);
       Vector vector=new Vector();
       
       vector.addProtectedPlace(natPark);
       vector.addProtectedPlace(natMon);
       vector.vectString();
       natPark.publicIncome();  
       natMon.publicIncome(); 
       //
       natPark.privateIncome();  
       natMon.privateIncome();
       //
       natPark.totalIncome();
       natMon.totalIncome();
       System.out.println("counter "+vector.getCounter());
       System.out.println("national park total incomes "+natPark.totalIncome());
       System.out.println("national park total incomesTOTAAAL ");
      // vector.suma();
        System.out.println(vector.reporte1());
    }
    
}
