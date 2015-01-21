import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class GamePanel extends JPanel implements Runnable {

	public static final int WIDTH = 578;
	public static final int HEIGHT = 15*40;
	public Rectangle rec[][];
	private Thread thread;
	private boolean running;
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private BufferedImage image;
	private Graphics2D g;
	private Game game;
	public boolean selec = true;
	private int FPS = 30;
	private int targetTime = 1000/ FPS;

	public TileMap tileMap;

	public GamePanel(){
		super();
		tileMap = new TileMap("src\\map.txt", 40);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();

		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				x2 = arg0.getX();
				y2 = arg0.getY();
				x2= x2 - x2%40;
				y2 = y2 - y2%40;
				if(selec == false & x2!=x1 || y2 !=y1){
					g.drawImage(tileMap.getTile(x1/40, y1/40).getImage(), x1, y1, null );
					g.setColor(Color.blue);
					g.setBackground(Color.blue);
					g.fillRect(x2, y2, 40, 40);
					setSelec(true);
				}
				TilesEdificios t = new TilesEdificios();
				TilesCarreteras c = new TilesCarreteras();
				t.loadTiles("src\\resis.gif");
				c.loadTiles("src\\carres.gif");
				//g.drawImage(t.tiles[4][2].getImage(), x1, y1, 40, 40, null);
				if(Game.variable == 1)
				g.drawImage(c.tiles[0][1].getImage(), x1, y1, 40, 40, null);
				if(Game.variable == 2)
					g.drawImage(c.tiles[0][2].getImage(), x1, y1, 40, 40, null);
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(selec == true){
					if(arg0.isShiftDown() == false){
						setSelec(false);
						g.drawImage(tileMap.getTile(x2/40, y2/40).getImage(), x2, y2, null );
					}
					x1 = arg0.getX();
					y1 = arg0.getY();
					x1= x1 - x1%40;
					y1 = y1 - y1%40;
					g.setColor(Color.blue);
					g.setBackground(Color.blue);			
					g.fillRect(x1, y1, 40, 40);

				}

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				/*int x = arg0.getLocationOnScreen().x;
				int y = arg0.getLocationOnScreen().y;
				x= x - x%40;
				y = y - y%40;
				g.setColor(Color.blue);
				g.setBackground(Color.blue);
				g.fillRect(x, y - 40, 40, 40);*/
			}
		});
	}


	public void addNotify(){
		super.addNotify();
		if(thread == null){
			thread = new Thread(this);
			thread.start();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		init();

		long startTime;
		long urdTime;
		long waitTime;

		render();
		while(running){

			startTime = System.nanoTime();
			draw();
			urdTime = (System.nanoTime() - startTime) / 1000000;
			waitTime = targetTime - urdTime;
			try {
				Thread.sleep(waitTime);
			}catch (Exception e){
			}
		}
	}

	private void init(){
		running = true;

		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();


		tileMap.loadTiles("src\\terrenos.gif");
	}

	private void update(){

		tileMap.update();
	}

	private void render(){

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		tileMap.draw(g);
	}


	private void draw(){

		Graphics g2 = getGraphics();
		g2.drawImage(image,0, 0, null );
		g2.dispose();
	}


	public boolean isSelec() {
		return selec;
	}


	public void setSelec(boolean selec) {
		this.selec = selec;
	}


}
