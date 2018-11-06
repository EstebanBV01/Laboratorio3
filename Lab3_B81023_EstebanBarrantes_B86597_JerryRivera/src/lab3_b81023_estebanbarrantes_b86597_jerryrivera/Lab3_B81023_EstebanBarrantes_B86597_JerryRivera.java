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
       WildLifeRefugge wild=new WildLifeRefugge("cahita", "puntarenas", 775);
       Vector vector=new Vector();
       
       vector.addProtectedPlace(natPark);
       vector.addProtectedPlace(natPark2);
       vector.addProtectedPlace(natMon);
       vector.addProtectedPlace(natMon2);
       vector.addProtectedPlace(natMonHeritage);
       vector.addProtectedPlace(natMonHeritage2);
       vector.addProtectedPlace(wild);
       vector.addProtectedPlace(bioreserv);
       vector.addProtectedPlace(bioreserv2);
       
       vector.vectString();
       natPark.publicIncome();
       natPark2.publicIncome();
       natMon.publicIncome();
       natMon2.publicIncome();
       natMonHeritage.publicIncome();
       natMonHeritage2.publicIncome();
       bioreserv.publicIncome();
       bioreserv2.publicIncome();
       
       vector.vectString();
       natPark.privateIncome();
       natPark2.privateIncome();
       natMon.privateIncome();
       natMon2.privateIncome();
       natMonHeritage.privateIncome();
       natMonHeritage2.privateIncome();
       
       vector.vectString();
       natPark.totalIncome();
       natPark2.totalIncome();
       natMon.totalIncome();
       natMon2.totalIncome();
       natMonHeritage.totalIncome();
       natMonHeritage2.totalIncome();
       bioreserv.totalIncome();
       bioreserv2.totalIncome();
       System.out.println("counter "+vector.getCounter());
       System.out.println("national park total incomes "+natPark.totalIncome());
      
    }
    
}
