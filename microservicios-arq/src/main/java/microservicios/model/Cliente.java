package microservicios.model;

import java.util.List;

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_cliente;

   	@Column
	private String nombre;
			
	public Cliente() {
		super();
	}

    public Cliente(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
    }


}
