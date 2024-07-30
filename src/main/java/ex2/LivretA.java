package ex2;

/**
 * Classe représentant un Livret A, héritant de CompteBancaire.
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur pour un livret A.
	 *
	 * @param solde            Le solde initial du livret A
	 * @param tauxRemuneration Le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0); // Découvert à 0 car non autorisé pour Livret A
		this.type = "LA";
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Applique la rémunération annuelle sur le solde du livret A.
	 */
	public void appliquerRemuAnnuelle() {
		this.solde += this.solde * this.tauxRemuneration / 100;
	}

	/**
	 * Getter for tauxRemuneration.
	 *
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter for tauxRemuneration.
	 *
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
