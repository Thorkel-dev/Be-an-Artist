package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;

/**
 * Class {@linkplain VueEllipse} allowing the display of a line, from the class
 * {@linkplain Ellipse}.
 * 
 * @see Ellipse
 * @see VueForme
 * 
 * @author EdouardGautier
 * 
 * @since 0.3.3.7
 * 
 * @version 0.3.5.2
 */
public class VueEllipse extends VueForme {

    /*************************************************************************/
    /****************************** Constructs *******************************/
    /*************************************************************************/

    /**
     * Constructor of a new {@code VueEllipse}. The instance of the class is
     * initialized with the shape given in parameter.
     * 
     * @param ellipse The {@code Ellipse} that you wish to display.
     * 
     * @since 0.3.3.7
     */
    public VueEllipse(final Ellipse ellipse) {
        super(ellipse);
    }

    /*************************************************************************/
    /******************************* Functions *******************************/
    /*************************************************************************/

    /**
     * Function to display the {@form code} that you want to display.
     * 
     * @param g2d The graphical context in which you want the view to be displayed.
     * 
     * @since 0.3.3.7
     */
    @Override
    public void affiche(final Graphics2D g2d) {
        final Ellipse ellipse = (Ellipse) super.getForme();
        final Color colorOld = g2d.getColor(); // Save the current color

        g2d.setColor(ellipse.getCouleur()); // Use of the VueForme cast

        if (ellipse.estRempli()) {
            g2d.fillOval((int) ellipse.getPosition().getAbscisse(), (int) ellipse.getPosition().getOrdonnee(),
                    (int) ellipse.getLargeur(), (int) ellipse.getHauteur());
        }
        g2d.drawOval((int) ellipse.getCadreMinX(), (int) ellipse.getCadreMinY(), (int) ellipse.getLargeur(),
                (int) ellipse.getHauteur());

        g2d.setColor(colorOld); // We restore the color save
    }
}
