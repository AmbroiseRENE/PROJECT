// cette classe c'est vraiment trop de la balle
@Entity
@Getter	@Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Employee extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nom;
	
	private String prenom;
	@Email
	private String email;

	private String pwd;
	
	private double salaire;
	
	@Enumerated(EnumType.ORDINAL)
	private Fonction fonction;

	private LocalDate dateRecrutement;	

	@ManyToMany(mappedBy = "employees")
	private Set<Projet> projetsE;
	
	@ManyToOne
	@JoinColumn(name = "id_Societe")
	private Societe societeE;
	
	
}
