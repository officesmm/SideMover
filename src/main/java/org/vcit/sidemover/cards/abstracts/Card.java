package org.vcit.sidemover.cards.abstracts;

import org.vcit.sidemover.coordinate.Vector2;
import org.vcit.sidemover.interfaces.ISelectable;
import org.vcit.sidemover.places.abstracts.Placement;

public abstract class Card implements ISelectable {
    public int hitPoint;

    public int placeCost = 1;
    public int moveCost = 1;
    public int shotCost = 1;

    public String symbol;

    public Card() {
    }

    public abstract Placement UseCard(Vector2 position);
    public abstract String fullDescription();
}
