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
    private int vectorCounter;
    public Vector(ProtectedZones[] vector) {
        this.vector = vector;
    }
    public Vector(){
        vector=new ProtectedZones[CONST];
    }
   /* public void addProtectedPlace(ProtectedZones place){
        if(place != null){
            if(vectorCounter==vector.length){
                this.biggerVector();
            }else if(vectorCounter==0){
                 for (int i = vectorCounter; i >0; i--) {
                    vector[i]=vector[i-1];
                }
                vector[0]=place;
            }else{
                
            }                        
        }
    }*/
    public void biggerVector(){
        ProtectedZones[] vector2= new ProtectedZones[CONST+1];
        for (int i = 0; i < vector.length; i++) {
            vector2[i]=this.vector[i];
        }
        vector2=vector;
    }
            
}
