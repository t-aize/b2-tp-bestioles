package fr.pgah;

import java.awt.*;

public class ChatNinja extends Bestiole {

  private static final Color COULEUR = Color.ORANGE;
  private static final String AFFICHAGE = "N";

  public ChatNinja() {
  }

  public Action getAction(BestioleInfo info) {
    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.RIEN) {
      return Action.SAUTER;
    } else if (info.getAGauche() == Voisin.RIEN) {
      return Action.GAUCHE;
    } else {
      return Action.DROITE;
    }
  }

  public Color getCouleur() {
    return COULEUR;
  }

  public String toString() {
    return AFFICHAGE;
  }
}
