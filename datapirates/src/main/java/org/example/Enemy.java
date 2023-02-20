package org.example;

import processing.core.PVector;

import java.awt.*;

public class Enemy extends Sprite {

  private static int health;

  public Enemy(PVector pos, PVector direction, float size, float speed, Color clr, Window scene) {
    super(pos, direction, size, speed, clr, scene);
  }

  public static void setHealth(int health) {
    Enemy.health = health;
  }

  public static int getHealth() {
    return health;
  }

  public void init(Enemy enemy) {}

  public void remove(Enemy enemy) {}

  public void update() {
    this.position = this.getPosition().add(this.getDirection().copy().mult(getSpeed()));
  }

}
