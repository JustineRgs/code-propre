package ex1;

import java.util.Date;

/**
 * La classe Entreprise représente une entreprise avec des informations de base comme le SIRET, le nom, l'adresse et la date de création.
 */
public class Entreprise {

	/** Le numéro SIRET de l'entreprise. */
	private int siret;

	/** Le nom de l'entreprise. */
	private String nom;

	/** L'adresse de l'entreprise. */
	private String adresse;

	/** La date de création de l'entreprise. */
	private Date dateCreation;

	/** Le capital maximum autorisé pour l'entreprise. */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Affiche le statut de l'entreprise.
	 * Cette méthode doit être implémentée pour afficher des informations pertinentes sur l'entreprise.
	 */
	public void afficherStatut() {
		// Implémentation à ajouter pour afficher le statut de l'entreprise
	}

	// Getters et setters pour les attributs de l'entreprise

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
