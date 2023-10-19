package microservicios.model;

public class AlquilerMonopatin {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_compra;

   	@Column
	private Date fecha_compra;
			
	public AlquilerMonopatin() {
		super();
	}

    public AlquilerMonopatin(Date fecha) {
		this.fecha_compra = fecha;

	}
}
