package maquina.suco.macho.menu;

import maquina.suco.macho.maquina.MaquinaSuco;
import maquina.suco.macho.suco.CopoSuco;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MenuTest {
    
    @Test
    public void testarValorInputMenu() {
        Menu menu = new Menu(new CopoSuco(), new MaquinaSuco());
        
        menu.funcionalidadePrincipal();
        
        assertEquals("O valor de açucar deveria ser 5", 5, menu.getCopoSuco().getAcucarAtual());
    }
    
}
