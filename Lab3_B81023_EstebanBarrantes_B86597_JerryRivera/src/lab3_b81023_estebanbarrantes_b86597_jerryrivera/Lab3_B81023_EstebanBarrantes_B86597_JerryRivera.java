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
       NationalPark natPark2=new NationalPark("Sta Rosa", "Limon",45,67, 2);
       NationalMonument natMon =new NationalMonument("Estatua", "Alajuela", 16, 5);
       NationalMonument natMon2 =new NationalMonument("Obelisco", "Cartago" ,6, 11);
       CulturalHeritageNationalMonument natMonHeritage =new CulturalHeritageNationalMonument("Tortuga", "Guanacaste" ,44, 1,7);
       CulturalHeritageNationalMonument natMonHeritage2 =new CulturalHeritageNationalMonument("Chacho", "Puntarenas",3, 221,5);
       BioReservation bioreserv = new BioReservation("Paquera", "Jaco", 500);
       BioReservation bioreserv2 = new BioReservation("Chiles", "San carlos", 123);
       Vector vector=new Vector();
       
       vector.addProtectedPlace(natPark);
       vector.addProtectedPlace(natPark2);
       vector.addProtectedPlace(natPark2);
       
       vector.vectString();
       natPark.publicIncome();
       System.out.println("counter "+vector.getCounter());
       System.out.println("national park total incomes "+natPark.totalIncomes());
      
    }
    
}
