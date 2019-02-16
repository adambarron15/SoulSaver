package dev.SoulSaver.entities.Static.props;

import java.awt.Graphics2D;

import dev.SoulSaver.Handler;
import dev.SoulSaver.entities.Static.StaticEntity;
import dev.SoulSaver.gfx.Assets;
import dev.SoulSaver.tiles.Tile;

public class FancyTable extends StaticEntity {

	public FancyTable(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.y = 64;
		bounds.height = 64;
		bounds.width = 192;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawImage(Assets.table, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width * 3, height * 2, null);
	}

}
