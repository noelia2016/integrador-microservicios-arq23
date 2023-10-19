public class Cuenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_cuenta;

    @Column
    private String titular;

    @Column
    private String nro_cuenta;

    @Column
    private Date fecha_alta;

    @Column
    private Integer saldo;

    /** detalle del saldo va calculado a medida que se carga saldo */
            
    public Cuenta() {
        super();
    }

    public Cuenta(String titular, String cbu) {

        this.titular = titular;
        this.nro_cuenta = cbu;

    }
}
