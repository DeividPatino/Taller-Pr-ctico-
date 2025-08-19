
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RegistroServiceTest {

    @Test
    void testRegistroNuevoUsuario() {
        RegistroServiceTest registro = new RegistroServiceTest();
        assertTrue(registro.registrar("nuevoUser", "clave123"));
    }

    @Test
    void testRegistroUsuarioExistente() {
        RegistroServiceTest registro = new RegistroServiceTest();
        registro.registrar("admin", "1234");
        assertFalse(registro.registrar("admin", "otraClave"));
    }

    @Test
    void testUsuarioRegistrado() {
        RegistroServiceTest registro = new RegistroServiceTest();
        registro.registrar("maria", "pass");
        assertTrue(registro.estaRegistrado("maria"));
    }

    @Test
    void testUsuarioNoRegistrado() {
        RegistroServiceTest registro = new RegistroServiceTest();
        assertFalse(registro.estaRegistrado("desconocido"));
    }

    @Test
    void testValidarUsuarioCorrecto() {
        RegistroServiceTest registro = new RegistroServiceTest();
        registro.registrar("juan", "claveSegura");
        assertTrue(registro.validarUsuario("juan", "claveSegura"));
    }

    @Test
    void testValidarUsuarioConClaveIncorrecta() {
        RegistroServiceTest registro = new RegistroServiceTest();
        registro.registrar("ana", "claveReal");
        assertFalse(registro.validarUsuario("ana", "otraClave"));
    }
}
