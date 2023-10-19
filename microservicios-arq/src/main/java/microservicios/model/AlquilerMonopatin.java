package microservicios.model;

public class AlquilerMonopatin {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_alquiler;

   	@Column
	private Date fecha_uso;

	@Column
	private TIme hora_finalizado_uso;

	@Column
	private Integer kilometrosRecorridos;
			
	public AlquilerMonopatin() {
		super();
	}

    public AlquilerMonopatin(Date fecha) {
		this.fecha_uso = fecha;

	}
}
