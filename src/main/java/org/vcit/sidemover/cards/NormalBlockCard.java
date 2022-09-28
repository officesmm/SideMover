package org.vcit.sidemover.cards;

import org.vcit.sidemover.coordinate.Vector2;
import org.vcit.sidemover.places.NormalBlock;
import org.vcit.sidemover.places.abstracts.Placement;

public class NormalBlockCard extends BlockCard{
    public NormalBlockCard(int hitPoint) {
        super(hitPoint);
    }
    @Override
    public Placement UseCard(Vector2 position) {
        Placement plc = new NormalBlock(this, position);
        return plc;
    }

    @Override
    public String fullDescription() {
        return " (Normal) "+" PlacementCost: " +placeCost;
    }
}
