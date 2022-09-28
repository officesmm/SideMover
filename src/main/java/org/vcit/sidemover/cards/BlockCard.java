package org.vcit.sidemover.cards;

import org.vcit.sidemover.cards.abstracts.Card;
import org.vcit.sidemover.coordinate.Vector2;
import org.vcit.sidemover.places.NormalBlock;
import org.vcit.sidemover.places.abstracts.Placement;

public abstract class BlockCard extends Card {

    public BlockCard() {
        this.hitPoint = 1;
        symbol = "[B]";
    }

    public BlockCard(int hitPoint) {
        this.hitPoint = hitPoint;
        symbol = "[B]";
    }

    @Override
    public boolean selectionShow() {
//        TODO: input position data
        Vector2 position = new Vector2(2, 4); // dummy position data
        return false;
    }

    @Override
    public Placement UseCard(Vector2 position) {
        Placement plc = new NormalBlock(this, position);
        return plc;
    }
}
