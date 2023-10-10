package microservicios.model;

public class Compra {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_compra;

   	@Column
	private Date fecha_compra;
			
	public Compra() {
		super();
	}

    public Compra(Date fecha) {
		this.fecha_compra = fecha;

	}
}
