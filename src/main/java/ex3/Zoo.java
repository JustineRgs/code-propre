package ex3;
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;

	// Constructeur du Zoo
	public Zoo(String nom){
		this.nom = nom;
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
	}

	// Méthode pour ajouter un animal
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		// Vérifier si les zones sont initialisées avant d'ajouter des animaux
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")){
			if (zoneCarnivore != null) {
				zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
			}
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			if (savaneAfricaine != null) {
				savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
			}
		}
		else if (typeAnimal.equals("REPTILE")){
			if (fermeReptile != null) {
				fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
			}
		}
		else if (typeAnimal.equals("POISSON")){
			if (aquarium != null) {
				aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
			}
		}
	}

	// Méthode pour afficher la liste des animaux
	public void afficherListeAnimaux(){
		// Vérifier si les zones sont initialisées avant d'afficher la liste des animaux
		if (savaneAfricaine != null) {
			savaneAfricaine.afficherListeAnimaux();
		}
		if (zoneCarnivore != null) {
			zoneCarnivore.afficherListeAnimaux();
		}
		if (fermeReptile != null) {
			fermeReptile.afficherListeAnimaux();
		}
		if (aquarium != null) {
			aquarium.afficherListeAnimaux();
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
