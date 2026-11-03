package fr.pgah;

import java.awt.*;
import java.util.Random;

public class Tigre extends Bestiole {

  private static final String AFFICHAGE = "G";

  private Color couleur;
  private int mouvements;
  private Random hasard;

  public Tigre() {
    hasard = new Random();
    couleur = choisirCouleur();
    mouvements = 0;
  }

  public Action getAction(BestioleInfo info) {
    mouvements++;
    if (mouvements % 3 == 0) {
      couleur = choisirCouleur();
    }

    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.MUR || info.getADroite() == Voisin.MUR) {
      return Action.GAUCHE;
    } else if (info.getEnFace() == Voisin.MEME) {
      return Action.DROITE;
    } else {
      return Action.SAUTER;
    }
  }

  public Color getCouleur() {
    return couleur;
  }

  public String toString() {
    return AFFICHAGE;
  }

  private Color choisirCouleur() {
    int tirage = hasard.nextInt(3);
    if (tirage == 0) {
      return Color.RED;
    } else if (tirage == 1) {
      return Color.GREEN;
    } else {
      return Color.BLUE;
    }
  }
}
