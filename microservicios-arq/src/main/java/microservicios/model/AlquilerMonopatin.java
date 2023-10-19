package microservicios.model;

import java.util.TimeZone;

public class AlquilerMonopatin {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_alquiler;

   	@Column
	private Date fecha_inicial;

	@Column
	private TimeZone hora_inicial;

	@Column
	private Integer usuario_id;	

	@Column
	private Integer monopatin_id;

	@Column
	private TIme hora_finalizado_uso;

	@Column
	private Integer kmRecorridos_viaje;  // este es calculado supongo
			
	public AlquilerMonopatin() {
		super();
	}

    public AlquilerMonopatin(Date fecha) {
		this.fecha_uso = fecha;

	}
}
