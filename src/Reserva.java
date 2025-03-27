import java.time.LocalDateTime; // Agregamos esta libreria para que no falle y ponemos en cada uno que ponia String LocalDateTime en vez de String

/** 
 *Clase que representa la reserva de las pistas
  *Contiene información sobre la pista reservada, la fecha y la duración de la reserva.
 */
public class Reserva { 
    private int idPista;
    private LocalDateTime fecha;
    private int duracion;
    
    /**
     * Realiza una reserva de pista
     *
     * @param idPista Identificador de la pista a reservar
     * @param fecha Fecha de la reserva
     * @param duracion Duración de la reserva
     **/ 

    public Reserva(int idPista, LocalDateTime fecha, int duracion) {
        this.idPista = idPista;
        this.fecha = fecha;
        this.duracion = duracion;
        
        /**
         * * Constructor de la clase Reserva.
         * 
         * @param idPista Es el identificador único de la pista reservada
         * @param fecha La fecha de la reserva en formato String
         * @param duracion Representa la duración de la reserva
         */
    }
    public int getIdPista() {
        return idPista;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }
}