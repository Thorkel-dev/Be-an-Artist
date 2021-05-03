package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.Remplissable;

/**
 * class {@code Rectangle} allowing a representation of a rectangle.
 * <p>
 * A rectangle is characterized part:
 * <ul>
 * <li>A <i>position</i> corresponding to one of its ends.</li>
 * <li>A <i>hauteur</i> corresponding to that of the rectangle.</li>
 * <li>A <i>largeur</i> corresponding to that of the rectangle.</li>
 * </ul>
 * <p>
 * By default:
 * <ul>
 * <li>The <i>largeur</i> is initialized to
 * {@value Forme#LARGEUR_PAR_DEFAUT}.</li>
 * <li>The <i>hauteur</i> is initialized to
 * {@value Forme#HAUTEUR_PAR_DEFAUT}.</li>
 * <li>The <i>position</i> is initialized to
 * ({@value Coordinates#ABSCISSE_PAR_DEFAUT} ,
 * {@value Coordinate#ORDINATE_DEFAULT}).</li>
 * </ul>
 * <p>
 * For information refer to the class {@linkplain Forme} and the class
 * {@linkplain Coordonnees} class.
 * 
 * @see Coordonnees
 * @see Forme
 * 
 * @author EdouardGautier
 * 
 * @since 1.3.1
 */
public class Rectangle extends Forme implements Remplissable {

	/**
	 * Attribute allowing to save the filling state of the {@code rectangle}.
	 * 
	 * @since 1.3.1
	 */
	private boolean estRempli;

	/*************************************************************************/
	/****************************** Constructs *******************************/
	/*************************************************************************/

	/**
	 * Construct a new {@code Rectangle} from a position, a height and a width.
	 * height and width.
	 * 
	 * @param p_position A {@code Coordinates} corresponding to the upper corner of
	 *                   the rectangle
	 * @param p_largeur  A {@code double} corresponding to the width of the
	 *                   rectangle rectangle
	 * @param p_hauteur  The {@code double} corresponding to the height of the
	 *                   rectangle
	 * 
	 * @see Forme#Forme(Coordonnees, double, double)
	 * @see #Rectangle()
	 * @see #Rectangle(Coordonnees)
	 * @see #Rectangle(double, double)
	 * 
	 * @since 1.3.1
	 */
	public Rectangle(Coordonnees p_position, double p_largeur, double p_hauteur) {
		super(p_position, p_largeur, p_hauteur);
	}

	/**
	 * Construct a new {@code Rectangle} from a width and a height, the position
	 * being height, the position being initialized from the default values.
	 * 
	 * @param p_largeur The {@code double} corresponding to the width of the
	 *                  rectangle rectangle
	 * @param p_hauteur The {@double code} corresponding to the height of the
	 *                  rectangle
	 * 
	 * @see Forme#Forme(double, double)
	 * @see #Rectangle()
	 * @see #Rectangle(Coordonnees)
	 * @see #Rectangle(Coordonnees, double, double)
	 * 
	 * @since 1.3.1
	 */
	public Rectangle(double p_largeur, double p_hauteur) {
		super(p_largeur, p_hauteur);
	}

	/**
	 * Construct a new {@code Rectangle} from a point, the other attributes being
	 * attributes being initialized from the default values.
	 * 
	 * @param p_position A {@code Coordonnees} corresponding to the top left corner
	 *                   of the of the rectangle
	 * 
	 * @see Forme#Forme(Coordonnees)
	 * @see #Rectangle()
	 * @see #Rectangle(double, double)
	 * @see #Rectangle(Coordonnees, double, double)
	 * 
	 * @since 1.3.1
	 */
	public Rectangle(Coordonnees p_position) {
		super(p_position, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}

	/**
	 * Default constructor of the class {@linkplain RectangleTest}, initiates the
	 * attributes of the class from the default values.
	 * 
	 * @see Forme#Forme()
	 * @see #Rectangle(Coordonnees)
	 * @see #Rectangle(double, double)
	 * @see #Rectangle(Coordonnees, double, double)
	 * 
	 * @since 1.3.1
	 */
	public Rectangle() {
		super(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}

	/*************************************************************************/
	/*********************** Accessors and Mutators **************************/
	/*************************************************************************/

	/**
	 * {@inheritDoc}
	 * <p>
	 * 
	 * @param p_largeur width must be greater than 0.
	 * 
	 * @throws IllegalArgumentException Si la largeur est inférieur ou égale à 0.
	 * 
	 * @see #setHauteur(double)
	 * @see Forme#getLargeur()
	 * 
	 * @since 1.3.1
	 */
	@Override
	public void setLargeur(final double p_largeur) {
		if (p_largeur > 0) {
			super.setLargeur(p_largeur);
		} else {
			throw new IllegalArgumentException("La largeur de " + getClass().getSimpleName() + " doit être positive");
		}
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * 
	 * @param p_hauteur heigt must be greater than 0.
	 * 
	 * @throws IllegalArgumentException Si la largeur est inférieur ou égale à 0.
	 * 
	 * @see #setLargeur(double)
	 * @see Forme#getHauteur()
	 * 
	 * @since 1.3.1
	 */
	@Override
	public void setHauteur(final double p_hauteur) {
		if (p_hauteur > 0) {
			super.setHauteur(p_hauteur);
		} else {
			throw new IllegalArgumentException("La hauteur de " + getClass().getSimpleName() + " doit être positive");
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @since 1.3.1
	 */
	@Override
	public void setRempli(final boolean p_estRempli) {
		this.estRempli = p_estRempli;
	}

	/*************************************************************************/
	/******************************* Functions *******************************/
	/*************************************************************************/

	/**
	 * {@inheritDoc}
	 * 
	 * @since 1.3.1
	 */
	@Override
	public double perimetre() {
		return 2 * getLargeur() + 2 * getHauteur();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @since 1.3.1
	 */
	@Override
	public double aire() {
		return getLargeur() * getHauteur();
	}

	@Override
	public boolean contient(final Coordonnees p_point) {
		final double A = super.getHauteur() / 2;
		final double B = super.getLargeur() / 2;
		final double X = super.getPosition().getAbscisse() + B;
		final double Y = super.getPosition().getOrdonnee() + A;

		return Math.pow(((p_point.getAbscisse() - X)) / B, 2) + Math.pow(((p_point.getOrdonnee() - Y)) / A, 2) <= 1;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @since 1.3.1
	 */
	@Override
	public boolean estRempli() {
		return this.estRempli;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return {@code -Rempli"} if the rectangle is filled, "" otherwise.
	 * 
	 * @since 1.3.1
	 */
	@Override
	public String descriptionRemplissage() {
		if (this.estRempli) {
			return "-Rempli";
		} else {
			return "";
		}
	}

	/**
	 * Function returning a description of the rectangle in the form :
	 * <p>
	 * {@code [Rectangle<-Rempli>] pos : (abscissa , ordinate) dim width x hauteur 
	 * périmètre : <perimetre> aire : <aire> couleur = R<color code red>,
	 * G<green color code>,B<blue color code>
	 * 
	 * @return A {@code String}, ccorresponding to the description of the
	 * {@code Rectangle}.
	 * 
	 * @since 1.3.1
	 */
	@Override
	public String toString() {
		final DecimalFormat formater = new DecimalFormat("0.0#");
		return "[" + this.getClass().getSimpleName() + this.descriptionRemplissage() + "] : pos "
				+ this.getPosition().toString() + " dim " + formater.format(this.getLargeur()) + " x "
				+ formater.format(this.getHauteur()) + " périmètre : " + formater.format(this.perimetre()) + " aire : "
				+ formater.format(this.aire()) + this.descriptionCouleur();
	}
}
