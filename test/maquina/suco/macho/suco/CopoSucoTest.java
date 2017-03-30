package maquina.suco.macho.suco;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CopoSucoTest {
    
    @Test
    public void testarDoseIngrediente() {
        CopoSuco copoSuco = new CopoSuco();
        
        copoSuco.dosarIngrediente(CopoSuco.ACUCAR, 20);
        assertEquals(20, copoSuco.getAcucarAtual());
        
        copoSuco.dosarIngrediente(CopoSuco.ACUCAR, -20);
        assertEquals(0, copoSuco.getAcucarAtual());
        
        copoSuco.dosarIngrediente(CopoSuco.AGUA, 20);
        assertEquals(20, copoSuco.getAguaAtual());
        
        copoSuco.dosarIngrediente(CopoSuco.AGUA, -20);
        assertEquals(0, copoSuco.getAguaAtual());
        
        copoSuco.dosarIngrediente(CopoSuco.SUCO, 20);
        assertEquals(20, copoSuco.getSucoAtual());
        
        copoSuco.dosarIngrediente(CopoSuco.SUCO, -20);
        assertEquals(0, copoSuco.getSucoAtual());
    }
    
    @Test
    public void testarValorDoseNegativo() {
        CopoSuco copoSuco = new CopoSuco();
        
        copoSuco.dosarIngrediente(CopoSuco.ACUCAR, 20 * -1);
        assertEquals("O valor de açucar tem que ser 0", 0, copoSuco.getAcucarAtual());
        
        copoSuco.dosarIngrediente(CopoSuco.AGUA, 20 * -1);
        assertEquals("O valor de açucar tem que ser 0", 0, copoSuco.getAguaAtual());
        
        copoSuco.dosarIngrediente(CopoSuco.SUCO, 20 * -1);
        assertEquals("O valor de açucar tem que ser 0", 0, copoSuco.getSucoAtual());
    }
    
}
