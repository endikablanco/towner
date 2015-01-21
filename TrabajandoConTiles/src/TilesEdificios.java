import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


public class TilesEdificios {

	private BufferedImage tileset;
	public Tile [][] tiles;
	private int tileSize = TileMap.tileSize;
	private int tileSize2 ;
	
	public void loadTiles(String s){
		
		try{
			tileSize2 = 595/6;
			tileset = ImageIO.read(new File(s));
			int numTilesAcross = (tileset.getWidth() + 1) / (tileSize2 + 1);
			
			
			tiles = new Tile[8][numTilesAcross];
			BufferedImage subimage;
			for(int col = 0; col< numTilesAcross; col++){
				subimage = tileset.getSubimage(col * tileSize2 + col, 0, tileSize2, tileSize2);
				tiles[0][col] = new Tile(subimage, false);
				subimage = tileset.getSubimage(col*tileSize2,tileSize2 , tileSize2, tileSize2);
				tiles[1][col] = new Tile(subimage, false);
				subimage = tileset.getSubimage(col*tileSize2, tileSize2*2, tileSize2, tileSize2);
				tiles[2][col] = new Tile(subimage, false);
				subimage = tileset.getSubimage(col*tileSize2, tileSize2*3, tileSize2, tileSize2);
				tiles[3][col] = new Tile(subimage, false);
				subimage = tileset.getSubimage(col*tileSize2, tileSize2*4, tileSize2, tileSize2);
				tiles[4][col] = new Tile(subimage, false);
				subimage = tileset.getSubimage(col*tileSize2, tileSize2*5, tileSize2, tileSize2);
				tiles[5][col] = new Tile(subimage, false);
				subimage = tileset.getSubimage(col*tileSize2, tileSize2*6, tileSize2, tileSize2);
				tiles[6][col] = new Tile(subimage, false);
				subimage = tileset.getSubimage(col*tileSize2, tileSize2*7, tileSize2, tileSize2);
				tiles[7][col] = new Tile(subimage, false);
				
			
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
