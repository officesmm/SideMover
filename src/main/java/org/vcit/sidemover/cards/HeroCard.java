package org.vcit.sidemover.cards;

import org.vcit.sidemover.cards.abstracts.Card;
import org.vcit.sidemover.coordinate.Vector2;
import org.vcit.sidemover.places.Hero;
import org.vcit.sidemover.places.abstracts.Placement;

public class HeroCard extends Card {
    public int damage;

    public HeroCard(int hitPoint, int damage) {
        this.hitPoint = hitPoint;
        this.damage = damage;
        symbol = "[H]";
        placeCost = 2;
        shotCost = 2;
    }

    @Override
    public boolean selectionShow() {

        return false;
    }

    @Override
    public Placement UseCard(Vector2 position) {
        Placement plc = new Hero(this);
        return plc;
    }

    @Override
    public String fullDescription() {
        return " HitPoint: " + hitPoint + " Damage: " + damage + " PlacementCost: " +placeCost;
    }
}
