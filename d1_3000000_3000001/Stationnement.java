import java.io.File;
import java.util.Scanner;

/**
 * @auteur Mehrdad Sabetzadeh, Université d'Ottawa
 */
public class Stationnement {
	/**
	 * Le délimiteur qui sépare les valeurs
	 */
	private static final String SEPARATEUR = ",";

	/**
	 * Le délimiteur qui sépare la section décrivant la conception du stationnement
	 * de la section
	 * contenant les données des voitures stationnées
	 */
	private static final String SECTIONNEUR = "###";

	/**
	 * Variable d’instance pour stocker le nombre de rangées dans un stationnement
	 */
	private int nombreRangees;

	/**
	 * Variable d’instance pour stocker le nombre de places par rangée dans un
	 * stationnement
	 */
	private int nombrePlacesParRangee;

	/**
	 * Variable d’instance (tableau à deux dimensions) pour stocker la conception du
	 * stationnement
	 */
	private TypeVoiture[][] conceptionStationnement;

	/**
	 * Variable d’instance (tableau à deux dimensions) pour stocker l’information
	 * d’occupation
	 * des places dans le stationnement
	 */
	private Voiture[][] occupation;

	/**
	 * Construit un stationnement en chargeant un fichier
	 * 
	 * @param nomFichier est le nom du fichier
	 */
	public Stationnement(String nomFichier) throws Exception {

		if (nomFichier == null) {
			System.out.println("Le nom du fichier ne peut pas être nul.");
			return;
		}

		// déterminer nombreRangees et nombrePlacesParRangee; vous pouvez le faire en
		// écrivant votre propre code ou, alternativement, en complétant la méthode
		// privée calculerDimensionsStationnement(...) que j’ai fournie
		calculerDimensionsStationnement(nomFichier);

		// instancier les variables conceptionStationnement et occupation !
		// ÉCRIVEZ VOTRE CODE ICI !

		// remplir conceptionStationnement et occupation; vous pouvez le faire en
		// écrivant votre propre code ou, alternativement, en complétant la méthode
		// privée remplirDepuisFichier(...) que j’ai fournie
		remplirDepuisFichier(nomFichier);
	}

	/**
	 * Stationne une voiture (v) à un emplacement donné (i, j) dans le
	 * stationnement.
	 * 
	 * @param i est l’indice de la rangée de stationnement
	 * @param j est l’indice de la place dans la rangée i
	 * @param v est la voiture à stationner
	 */
	public void stationner(int i, int j, Voiture v) {
		// ÉCRIVEZ VOTRE CODE ICI !
	}

	/**
	 * Retire la voiture stationnée à un emplacement donné (i, j) dans le
	 * stationnement
	 * 
	 * @param i est l’indice de la rangée de stationnement
	 * @param j est l’indice de la place dans la rangée i
	 * @return la voiture retirée; la méthode retourne null lorsque i ou j sont hors
	 *         limites, ou lorsqu’il n’y a aucune voiture stationnée à (i, j)
	 */
	public Voiture retirer(int i, int j) {
		// ÉCRIVEZ VOTRE CODE ICI !
		return null; // SUPPRIMEZ CETTE INSTRUCTION APRÈS AVOIR IMPLÉMENTÉ CETTE MÉTHODE

	}

	/**
	 * Vérifie si une voiture (ayant un certain type) est autorisée à stationner à
	 * l’emplacement (i, j)
	 * 
	 * @param i est l’indice de la rangée de stationnement
	 * @param j est l’indice de la place dans la rangée i
	 * @return true si la voiture v peut stationner à (i, j) et false sinon
	 */
	public boolean peutStationnerA(int i, int j, Voiture v) {
		// ÉCRIVEZ VOTRE CODE ICI !
		return false; // SUPPRIMEZ CETTE INSTRUCTION APRÈS AVOIR IMPLÉMENTÉ CETTE MÉTHODE

	}

	/**
	 * @return la capacité totale du stationnement en excluant les places qui ne
	 *         peuvent pas être
	 *         utilisées pour stationner (c.-à-d., en excluant les places qui
	 *         pointent vers TypeVoiture.NA)
	 */
	public int getCapaciteTotale() {
		// ÉCRIVEZ VOTRE CODE ICI !
		return -1; // SUPPRIMEZ CETTE INSTRUCTION APRÈS AVOIR IMPLÉMENTÉ CETTE MÉTHODE

	}

	/**
	 * @return l’occupation totale du stationnement (c.-à-d., le nombre total de
	 *         voitures
	 *         stationnées dans le stationnement)
	 */
	public int getOccupationTotale() {
		// ÉCRIVEZ VOTRE CODE ICI !
		return -1; // SUPPRIMEZ CETTE INSTRUCTION APRÈS AVOIR IMPLÉMENTÉ CETTE MÉTHODE
	}

	private void calculerDimensionsStationnement(String nomFichier) throws Exception {

		Scanner scanner = new Scanner(new File(nomFichier));

		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			// ÉCRIVEZ VOTRE CODE ICI !
		}

		scanner.close();
	}

	private void remplirDepuisFichier(String nomFichier) throws Exception {

		Scanner scanner = new Scanner(new File(nomFichier));

		// VOUS DEVEZ PEUT-ÊTRE DÉFINIR DES VARIABLES LOCALES ICI !

		// boucle while pour lire la conception du stationnement
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			// ÉCRIVEZ VOTRE CODE ICI !
		}

		// boucle while pour lire les données d’occupation
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			// ÉCRIVEZ VOTRE CODE ICI !
		}

		scanner.close();
	}

	/**
	 * Produit une représentation sous forme de chaîne de caractères du
	 * stationnement
	 * 
	 * @return Chaîne de caractères contenant l’information du stationnement
	 */
	public String toString() {
		// NOTE : L’implémentation de cette méthode est complète. Vous n’avez PAS besoin
		// de
		// la modifier pour le devoir.
		StringBuffer buffer = new StringBuffer();
		buffer.append("==== Conception du stationnement ====").append(System.lineSeparator());

		for (int i = 0; i < conceptionStationnement.length; i++) {
			for (int j = 0; j < conceptionStationnement[0].length; j++) {
				buffer.append((conceptionStationnement[i][j] != null)
						? Utilitaire.getLibelleParTypeVoiture(conceptionStationnement[i][j])
						: Utilitaire.getLibelleParTypeVoiture(TypeVoiture.NA));
				if (j < nombrePlacesParRangee - 1) {
					buffer.append(", ");
				}
			}
			buffer.append(System.lineSeparator());
		}

		buffer.append(System.lineSeparator()).append("==== Occupation du stationnement ====")
				.append(System.lineSeparator());

		for (int i = 0; i < occupation.length; i++) {
			for (int j = 0; j < occupation[0].length; j++) {
				buffer.append("(" + i + ", " + j + "): "
						+ ((occupation[i][j] != null) ? occupation[i][j] : "Inoccupé"));
				buffer.append(System.lineSeparator());
			}

		}
		return buffer.toString();
	}

	/**
	 * <b>main</b> de l’application. La méthode lit d’abord depuis l’entrée standard
	 * le nom du fichier à traiter. Ensuite, elle crée une instance de
	 * Stationnement.
	 * Finalement, elle affiche sur la sortie standard des informations à propos de
	 * l’instance de Stationnement qui vient d’être créée.
	 * 
	 * @param args paramètres de ligne de commande (non utilisés dans le corps de la
	 *             méthode)
	 * @throws Exception
	 */

	public static void main(String args[]) throws Exception {

		InfoEtudiant.afficher();

		System.out.print("Veuillez entrer le nom du fichier à traiter : ");

		Scanner scanner = new Scanner(System.in);

		String nomFichier = scanner.nextLine();

		Stationnement stationnement = new Stationnement(nomFichier);

		System.out.println("Nombre total de places de stationnement utilisables (capacité) : "
				+ stationnement.getCapaciteTotale());

		System.out.println("Nombre de voitures actuellement stationnées dans le stationnement : "
				+ stationnement.getOccupationTotale());

		System.out.print(stationnement);

	}
}
