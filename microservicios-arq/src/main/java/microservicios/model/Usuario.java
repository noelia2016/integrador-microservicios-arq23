package microservicios.model;

import java.util.List;

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_user;

   	@Column
	private String nombre;

	@Column
	private String celular;

	@Column
	private String email;

	/*
	 * Cuenta asociada a debitar cuando el usuario usa el monopatin
	 */
	@Column
	private Integer cuenta_asociada;
			
	public Usuario() {
		super();
	}

    public Usuario(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
    }


}
