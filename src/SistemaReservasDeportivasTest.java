import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SistemaReservasDeportivasTest { // Nombre corregido
    static SistemaReservasDeportivas sistemasReservas; // Nombre corregido

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        sistemasReservas = new SistemaReservasDeportivas(); // Nombre corregido
    }

    @Test
    void testReservarPista() {
        assertTrue(sistemasReservas.reservarPista(1, "21-03-2025 12:00", 60)); // Método corregido
        assertFalse(sistemasReservas.reservarPista(1, "21-03-2025 12:00", 60));
        assertTrue(sistemasReservas.reservarPista(2, "21-03-2025 12:00", 60));
        assertTrue(sistemasReservas.reservarPista(3, "22-03-2025 12:00", 60));
        assertTrue(sistemasReservas.reservarPista(10, "22-03-2025 12:00", 60));
    }
    @Test
    void testCancelarReserva() {
    	assertTrue(sistemasReservas.reservarPista(1, "21-03-2025", 60));
    	assertTrue(sistemasReservas.cancelarReserva(0));
    }
}
