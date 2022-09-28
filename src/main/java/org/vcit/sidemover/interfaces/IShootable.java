package org.vcit.sidemover.interfaces;

import org.vcit.sidemover.bullet.Bullet;
import org.vcit.sidemover.coordinate.Vector2;

public interface IShootable{

    public Bullet shoot(Vector2.Directions direction);
}
