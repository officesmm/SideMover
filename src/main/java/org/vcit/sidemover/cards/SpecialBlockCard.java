package org.vcit.sidemover.cards;

import org.vcit.sidemover.coordinate.Vector2;
import org.vcit.sidemover.places.abstracts.Placement;
import org.vcit.sidemover.places.SpecialBlock;

public class SpecialBlockCard extends BlockCard {
    public SpecialBlockCard() {
        super(1);
        placeCost = 2;
    }

    @Override
    public Placement UseCard(Vector2 position) {
        Placement plc = new SpecialBlock(this, position);
        return plc;
    }

    @Override
    public String fullDescription() {
        return " (Special) "+" PlacementCost: " +placeCost;
    }
}
