/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos.streetfighter;


public class Street {
    
    public static void main(String args[]) {
        
        Ryu ryu = new Ryu();
        ryu.pular();
        
        
        ryu.meiaLuaChute();
        ryu.meiaLuaSoco();
        
        Guile guile = new Guile();
        guile.pular();
        
        guile.meiaLuaSoco();
                
    }
    
}
