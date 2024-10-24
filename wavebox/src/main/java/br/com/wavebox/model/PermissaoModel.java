package br.com.wavebox.model;

	import java.io.Serializable;
	import java.util.List;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.ManyToMany;
	import jakarta.persistence.Table;

	import org.springframework.security.core.GrantedAuthority;



	@Entity
	@Table(name = "permissoes" , schema = "wavebox")
	public class PermissaoModel implements Serializable,GrantedAuthority {

		private static final long serialVersionUID = 1L;	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idpermission")
		private Long id;
		
		@Column(name = "nome")
		private String nome;
		

		@ManyToMany(mappedBy = "permissoes")
	    private List<User> usuarios;
		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}


		public List<User> getUsuarios() {
			return usuarios;
		}

		public void setUsuarios(List<User> usuarios) {
			this.usuarios = usuarios;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		

		@Override
		public String getAuthority() {
			// TODO Auto-generated method stub
			return this.nome;
		}
		
	}
