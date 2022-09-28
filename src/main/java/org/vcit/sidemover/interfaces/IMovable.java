package org.vcit.sidemover.interfaces;

import org.vcit.sidemover.coordinate.Board;
import org.vcit.sidemover.coordinate.Vector2;

public interface IMovable {
    public Vector2 move(Board board, Vector2.Directions direction);
}
