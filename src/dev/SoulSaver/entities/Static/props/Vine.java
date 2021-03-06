package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class Vine extends StaticEntity{

	public Vine(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.width = 0;
		bounds.height = 0;
	}

	@Override
	public void tick() {	
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.vine, (int) (x - handler.getGameCamera().getxOffset()),
			(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
