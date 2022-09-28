package org.vcit.sidemover.places;

import org.vcit.sidemover.bullet.Bullet;
import org.vcit.sidemover.cards.HeroCard;
import org.vcit.sidemover.coordinate.Board;
import org.vcit.sidemover.coordinate.Vector2;
import org.vcit.sidemover.interfaces.IDestroyable;
import org.vcit.sidemover.interfaces.IMovable;
import org.vcit.sidemover.interfaces.ISelectable;
import org.vcit.sidemover.interfaces.IShootable;
import org.vcit.sidemover.places.abstracts.Placement;

public class Hero extends Placement implements IShootable, IMovable, IDestroyable, ISelectable {

    public Hero(HeroCard card) {
        this.card = card;
        position = new Vector2(3, 1);
        symbol = "H";
    }

    @Override
    public Bullet shoot(Vector2.Directions direction) {
        return new Bullet(position, direction, 2);
    }

    @Override
    public Vector2 move(Board board, Vector2.Directions direction) {
        Vector2 newPosition = Vector2.Move(board, position, direction);
        if(newPosition != null) {
            this.position = Vector2.Move(board, position, direction);
            return this.position;
        }else {
            return null;
        }
    }

    @Override
    public boolean selectionShow() {
        return false;
    }

    @Override
    public int hit(int damage) {
        return 0;
    }

    @Override
    public boolean isDead() {
        return false;
    }

}
