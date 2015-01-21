import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


public class TilesCarreteras {

	private BufferedImage tileset;
	public Tile [][] tiles;
	private int tileSize = TileMap.tileSize;
	private int tileSize2 ;

	public void loadTiles(String s){

		try{
			tileSize2 = 305/3 ;
			tileset = ImageIO.read(new File(s));
			int numTilesAcross = (tileset.getWidth() + 1) / (tileSize2 + 1);


			tiles = new Tile[8][numTilesAcross];
			BufferedImage subimage;
			for(int col = 0; col< numTilesAcross; col++){
				subimage = tileset.getSubimage(col * tileSize2 + col, 0, tileSize2, 100);
				tiles[0][col] = new Tile(subimage, false);
				
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


