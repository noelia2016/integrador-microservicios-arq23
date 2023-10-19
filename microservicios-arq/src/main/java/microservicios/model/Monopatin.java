package microservicios.model;

public class Monopatin {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_monopatin;

	/** 
	 * Marca si esta habilitado para su uso, esta ocuapdo o en mantenimiento
	 */
    @Column
	private String estado;

    @Column
	private String ubicacion;

	@Column
	private Integer kmDeRodaje;

	@Column
	private Integer tiempoUsado;

	/** el tiempo de uso y la cant de kilometros es calculado recorriendo los viajes asociados
	 * que tiene el monopatin
	 */
			
	public Monopatin() {
		super();
	}

    public Monopatin(String nombre, String descripcion, Double precio, Integer cant) {
		this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = cant;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
    }

}
