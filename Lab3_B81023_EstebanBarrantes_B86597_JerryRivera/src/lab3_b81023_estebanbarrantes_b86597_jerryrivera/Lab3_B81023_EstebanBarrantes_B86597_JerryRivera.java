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
       NationalPark natPark=new NationalPark("poas volcano", "alajuala,poas",340,600, 700);
       NationalPark natPark2=new NationalPark("Sta Rosa", "guanacaste,liberia",45,677, 888);
       Vector vector=new Vector();
       ////////////////////////
       vector.addProtectedPlace(natPark);
       vector.addProtectedPlace(natPark2);
       vector.addProtectedPlace(natPark2);
       vector.addProtectedPlace(natPark2);
       vector.vectString();
       System.out.println("counter "+vector.getCounter());
       System.out.println("national park total incomes "+natPark.getTotalIncomes());
       BioReservation.getPublicIncome();
    }
    
}
