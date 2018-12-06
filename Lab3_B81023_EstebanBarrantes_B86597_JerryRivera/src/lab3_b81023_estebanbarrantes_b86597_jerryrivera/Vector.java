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
}
