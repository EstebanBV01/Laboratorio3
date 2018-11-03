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
    final static int SIZE=4;
    public Vector(ProtectedZones[] vector) {
        this.vector = vector;
    }
    public Vector(){
        vector=new ProtectedZones[SIZE];
    }
            
            
}
