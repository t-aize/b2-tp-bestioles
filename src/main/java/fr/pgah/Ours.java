package fr.pgah;

import java.awt.*;

public class Ours extends Bestiole {

  private boolean polaire;
  private boolean slash;

  public Ours(boolean polaire) {
    this.polaire = polaire;
    this.slash = true;
  }

  public Action getAction(BestioleInfo info) {
    slash = !slash;

    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.RIEN) {
      return Action.SAUTER;
    } else {
      return Action.GAUCHE;
    }
  }

  public Color getCouleur() {
    if (polaire) {
      return Color.WHITE;
    } else {
      return Color.BLACK;
    }
  }

  public String toString() {
    if (slash) {
      return "/";
    } else {
      return "\\";
    }
  }
}
