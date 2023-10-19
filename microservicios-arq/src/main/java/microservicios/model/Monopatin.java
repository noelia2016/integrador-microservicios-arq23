package microservicios.model;

public class Monopatin {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_producto;

   	@Column
	private String nombre;

    @Column
	private String descripcion;

    @Column
	private Double precio;

    @Column
	private Integer stock;
			
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
