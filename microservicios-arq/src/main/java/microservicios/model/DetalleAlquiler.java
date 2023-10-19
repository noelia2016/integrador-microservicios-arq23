package microservicios.model;

public class DetalleAlquiler {
    
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id_detalle;
    
        @Column
        private Integer usuario_id;

        @Column
        private Integer monopatin_id;


        /** detalle del total va calculado me parece */
                
        public DetalleAlquiler() {
            super();
        }
    
        public DetalleAlquiler(Integer user) {
            this.usuario_id = user;
    
        }
    
}
