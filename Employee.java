
@Entity
public class Employee {

	@id
	private int id;
	
	private String nom;
	
	private String prenom;
	
	@column(unique ="true")
	private String email;
	
	private String pwd;
}