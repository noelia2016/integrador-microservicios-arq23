package microservicios.model;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class DetalleAlquiler {
    
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id_detalle;
    
        @Column
        private Integer alquiler_id;

        /**
         * guarda por cada parada la hora y parada en la que paso el monopatin en el viaje
         */
        @Column
        private Integer parada_id;

         @Column
        private DateTimeAtCompleted hora_parada;

        /** detalle del total va calculado me parece */
                
        public DetalleAlquiler() {
            super();
        }
    
        public DetalleAlquiler(Integer user) {
            this.usuario_id = user;
    
        }
    
}
