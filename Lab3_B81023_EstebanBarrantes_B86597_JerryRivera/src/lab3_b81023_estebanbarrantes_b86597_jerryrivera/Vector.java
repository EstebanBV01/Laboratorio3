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
public class Vector {
    ProtectedZones[] vector;
    final static int CONST=4;
    //contador de ingresos al vector
    private int counter;
    public Vector(ProtectedZones[] vector) {
        this.vector = vector;
    }
    public Vector(){
        vector=new ProtectedZones[CONST];
    }
    public int getCounter(){
    return counter;
    }
    /////////////////
    public void addProtectedPlace(ProtectedZones place){
        if(place != null){
            if(counter==vector.length-1){
                //System.out.println("paso");
                this.biggerVector();
            }if(counter==0){
                 for (int i =counter; i >0; i--) {
                    vector[i]=vector[i-1];
                }
                vector[0]=place;
               counter++; 
            }else{
                vector[counter]=place;
                counter++;
            }                        
        }
    }
    private void biggerVector(){
        ProtectedZones[] vector2=new ProtectedZones[vector.length+1];
            for (int i = 0; i < vector.length; i++) {
                vector2[i]=this.vector[i];
        }
            this.vector=vector2;
    }
    public void vectString(){
        String storage="";
        for (int i = 0; i < vector.length; i++) {
            storage+=vector[i]+" \n";
        }
        System.out.println(storage+"\n");
    }
    public void suma(){
        double storage=0;
        for (int i = 0; i < vector.length-1; i++) {
            storage+=vector[i].getTotalIncomesSuper();
        }
        System.out.println(storage+"  es el total total total");
    }
    public String reporte1(){
        double result =0;
        String print = " ";
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                print = print +"\n"+ vector[i];
            }
        }
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                result = result + vector[i].getTotalIncomesSuper();
            }
        }
        return print + "\n"+"la suma es: "+result;
    }
        public String reporte2(){
        double subtotal = 0.0;
        double Total = 0.0;
        double noGovernment = 0.0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                if(vector[i] instanceof NationalPark){
                    NationalPark parque = (NationalPark)vector[i];
                    Total += parque.getNationalVisitors() +parque.getForeignVisitors();
                    subtotal += parque.getPublicIncomes();
                }else if(vector[i] instanceof BioReservation){
                    BioReservation reserva = (BioReservation)vector[i];
                    Total += reserva.publicIncome();
                }else if(vector[i] instanceof WildLifeRefugge){
                    WildLifeRefugge wild = (WildLifeRefugge)vector[i];
                    subtotal+= wild.getPublicIncomes();
                }else if(vector[i] instanceof NationalMonument){
                    NationalMonument monument = (NationalMonument)vector[i];
                    noGovernment += monument.localIncome();
                }else if(vector[i] instanceof CulturalHeritageNationalMonument){
                    CulturalHeritageNationalMonument cult = (CulturalHeritageNationalMonument)vector[i];
                    Total += cult.totalIncome() + cult.totalIncome();
                }  
            }
        }
        return "Total " + subtotal + ", entradas = "+ Total + ", no guvernamental " + noGovernment;
    }
}
