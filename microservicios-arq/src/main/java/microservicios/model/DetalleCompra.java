package microservicios.model;

public class DetalleCompra {
    
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id_detalleComp;
    
        @Column
        private Integer compra_id;

        @Column
        private Integer producto_id;

        @Column
        private Integer cant_comprada;

        /** detalle del total va calculado me parece */
                
        public DetalleCompra() {
            super();
        }
    
        public DetalleCompra(Integer compra) {
            this.compra_id = compra;
    
        }
    
}
