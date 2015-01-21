import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.imageio.ImageIO;


public class TileMap {

	private int x;
	private int y;
	public static int tileSize;
	private int [][] map;
	private int [][] tileType;
	int mapWidth;
	int mapHeight;
	public Rectangle rec[][];
	private BufferedImage tileset;
	public Tile[][] tiles;
	public Tile [][] tileTable;

	public TileMap(String s, int tileSize){

		this.tileSize = tileSize;

		try{



			BufferedReader br = new BufferedReader(new FileReader(s));
			tileTable = new Tile[mapHeight][mapWidth];
			mapWidth = Integer.parseInt(br.readLine());
			mapHeight = Integer.parseInt(br.readLine());
			map = new int[mapHeight][mapWidth];
			String delimiters = "\\s+";


			for(int row = 0; row < mapHeight; row++){
				String line = br.readLine();
				String[] tokens = line.split(delimiters);
				for(int col = 0; col < mapWidth; col++){
					map[row][col] = Integer.parseInt(tokens[col]);


				}
			}


			for(int row = 0; row < 10; row++){
				for(int col = 0; col < 10; col++){
					rec[row][col] = new Rectangle(row*tileSize + tileSize, col*tileSize + tileSize);
				}
			}

		}catch(Exception e){}
	}

	public void loadTiles(String s){
		try{

			tileset = ImageIO.read(new File(s));
			int numTilesAcross = (tileset.getWidth() + 1) / (570/4 + 1);
			

			tileType = new int[4][numTilesAcross];
			tiles = new Tile[3][numTilesAcross];
			BufferedImage subimage;
			for(int col = 0; col< numTilesAcross; col++){
				subimage = tileset.getSubimage(col * tileSize + col, 0, tileSize, tileSize);
				tiles[0][col] = new Tile(subimage, false);
				tileType[0][col] = new Integer(1*col);
				subimage = tileset.getSubimage(col*tileSize,tileSize , tileSize, tileSize);
				tiles[1][col] = new Tile(subimage, false);
				tileType[1][col] = new Integer(2*col);
				subimage = tileset.getSubimage(col*tileSize, tileSize*2, tileSize, tileSize);
				tiles[2][col] = new Tile(subimage, false);
				tileType[3][col] = new Integer(3*col);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public int getx(){
		return x;
	}
	public int gety(){
		return y;
	}

	public int getColTile(int x){
		return x/ tileSize;
	}
	public int getRowTile(int y){
		return y /tileSize;
	}
	public int getTilePos(int row, int col){
		return map[row][col];
	}

	public int getTileSize(){
		return tileSize;
	}


	public BufferedImage getTileset() {
		return tileset;
	}

	public void setTileset(BufferedImage tileset) {
		this.tileset = tileset;
	}

	public Tile[][] getTileTable() {
		return tileTable;
	}

	public void setTileTable(Tile[][] tileTable) {
		this.tileTable = tileTable;
	}

	public Tile getTile(int row, int col) {
		int rc = map[row][col];
		int r = rc/tiles[0].length;
		int c = rc % tiles[0].length;
		return tiles[r][c];
	}

	public boolean isBlocked(int row, int col){
		int rc = map[row][col];
		int r = rc/tiles[0].length;
		int c = rc % tiles[0].length;
		return tiles[r][c].isBlocked();
	}

	public void update(){

	}

	public void draw(Graphics2D g){

		for(int row = 0; row< mapHeight; row++){
			for(int col = 0; col < mapWidth; col++){
				int rc = map[row][col];
				int r = rc/ tiles[0].length;
				int c = rc % tiles[0].length;
				//g.drawImage(tiles[r][c].getImage(), x + col* tileSize, y + row * tileSize, null );
				g.drawImage(tiles[r][c].getImage(), x + col* tileSize, y + row * tileSize, tileSize, tileSize, null);
			}
		}
		
	}

	
}
