package fr.pgah;

import java.awt.*;

public class TigreBlanc extends Tigre {

  private boolean aInfecte;

  public TigreBlanc() {
    super();
    aInfecte = false;
  }

  public Action getAction(BestioleInfo info) {
    Action action = super.getAction(info);
    if (action == Action.INFECTER) {
      aInfecte = true;
    }
    return action;
  }

  public Color getCouleur() {
    return Color.WHITE;
  }

  public String toString() {
    if (aInfecte) {
      return "B";
    } else {
      return "b";
    }
  }
}
