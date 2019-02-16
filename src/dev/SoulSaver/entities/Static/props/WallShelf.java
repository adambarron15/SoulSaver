package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class WallShelf extends StaticEntity {

	public WallShelf(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.height = 74;
	}

	@Override
	public void tick() {
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.wallshelf, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height * 2, null);
	}

}
