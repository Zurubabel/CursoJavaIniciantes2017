package maquina.suco.macho.suco;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CopoSucoTest {
    
    @Test
    public void testarDoseIngrediente() {
        CopoSuco copoSuco = new CopoSuco();
        
        copoSuco.dosarIngrediente(CopoSuco.ACUCAR, 20);
        assertEquals(20, copoSuco.getAcucarAtual());
        
    }
    
}
