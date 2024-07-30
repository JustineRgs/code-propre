package ex2;

/**
 * Représente un compte bancaire de type compte courant (type=CC) ou livret A (type=LA).
 * @autor DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	protected double decouvert;

	/** Le type vaut soit CC=Compte courant, soit LA=Livret A */
	protected String type;

	/**
	 * Constructeur pour un compte courant.
	 *
	 * @param solde     Solde initial du compte
	 * @param decouvert Découvert autorisé pour le compte courant
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.type = "CC";
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Ajoute un montant au solde.
	 *
	 * @param montant Montant à ajouter
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Débite un montant du solde si les conditions le permettent.
	 *
	 * @param montant Montant à débiter
	 */
	public void debiterMontant(double montant) {
		if (type.equals("CC")) {
			if (this.solde - montant >= -decouvert) {
				this.solde -= montant;
			}
		} else if (type.equals("LA")) {
			if (this.solde - montant >= 0) {
				this.solde -= montant;
			}
		}
	}

	/**
	 * Getter for solde.
	 *
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter for solde.
	 *
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert.
	 *
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter for decouvert.
	 *
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * Getter for type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter for type.
	 *
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
