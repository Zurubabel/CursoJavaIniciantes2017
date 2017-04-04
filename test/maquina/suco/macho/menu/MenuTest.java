package maquina.suco.macho.menu;

import java.io.ByteArrayInputStream;
import maquina.suco.macho.maquina.MaquinaSuco;
import maquina.suco.macho.suco.CopoSuco;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MenuTest {
    
    @Test
    public void testarValorInputMenu() {
        Menu menu = new Menu(new CopoSuco(), new MaquinaSuco());
        
        String valorMenu = "1";
        
        System.setIn(new ByteArrayInputStream(valorMenu.getBytes()));
        menu.selecionarMenu();
       
        
        assertEquals("O valor de açucar deveria ser 5", 5, menu.getCopoSuco().getAcucarAtual());
    }
    
}
