package exia.BoulderDash.models;

import exia.BoulderDash.models.DisplayableElementModel;


/**
 * DirtModel
 *
 * Represents the dirt in the game.
 *
 */
public class DirtModel extends DisplayableElementModel {
	private static String spriteName;
	private static boolean isDestructible;
	private static boolean canMove;
	private static boolean impactExplosive;
	private static boolean animate;
	private static int priority;
	private static boolean falling;
	private static String collideSound;
	
    /**
     * Static dataset
     * Specifies the physical parameters of the object
     */
	static {
		spriteName = "dirt";
		isDestructible = true;
		canMove = false;
		impactExplosive = false;
		animate = false;
		priority = 0;
		falling = false;
		collideSound = null;
	}

    /**
     * Class constructor
     */
	public DirtModel() {
		super(isDestructible, canMove, spriteName, priority, impactExplosive, animate, falling, collideSound);

        this.loadSprite(spriteName);
	}
}