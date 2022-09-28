package org.vcit.sidemover.bullet;

import org.vcit.sidemover.coordinate.Vector2;
import org.vcit.sidemover.places.abstracts.Placement;

public class Bullet extends Placement {
    Vector2.Directions direction;
    public int damage;
    public int bulletRange;

    public Bullet(Vector2 startPosition, Vector2.Directions direction, int damage) {
        this.position = startPosition;
        this.direction = direction;
        this.damage = damage;
        this.bulletRange = 5;
        symbol = "o";
    }

    public Bullet(Vector2 startPosition, Vector2.Directions direction, int damage, int bulletRange) {
        this.position = startPosition;
        this.direction = direction;
        this.damage = damage;
        this.bulletRange = bulletRange;
        symbol = "o";
    }

    public void move() {
        position = Vector2.Move(null, position, direction);
    }
}
