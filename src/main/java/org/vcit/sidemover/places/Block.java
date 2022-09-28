package org.vcit.sidemover.places;

import org.vcit.sidemover.cards.BlockCard;
import org.vcit.sidemover.coordinate.Vector2;
import org.vcit.sidemover.places.abstracts.Placement;

public abstract class Block extends Placement {

    public Block(BlockCard card, Vector2 position) {
        this.card = card;
        this.position = position;
        symbol = "B";
    }

}
