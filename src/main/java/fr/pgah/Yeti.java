package fr.pgah;

import java.awt.*;

public class Yeti extends Bestiole {

  private static final Color COULEUR = Color.GRAY;
  private static final int DUREE = 6;

  private int mouvements;

  public Yeti() {
    mouvements = 0;
  }

  public Action getAction(BestioleInfo info) {
    mouvements++;

    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.RIEN) {
      return Action.SAUTER;
    } else {
      return Action.DROITE;
    }
  }

  public Color getCouleur() {
    return COULEUR;
  }

  public String toString() {
    int phase = (mouvements / DUREE) % 4;
    if (phase == 0) {
      return "Y";
    } else if (phase == 1) {
      return "E";
    } else if (phase == 2) {
      return "T";
    } else {
      return "I";
    }
  }
}
