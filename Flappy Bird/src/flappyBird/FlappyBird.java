package flappyBird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener, MouseListener, KeyListener {
	public static FlappyBird flappybird;
	public final int WIDTH = 1500, HEIGHT = 1500;
	public Renderer renderer;
	public Rectangle bird;
	public int ticks, yMotion, score, HiScore, reader;
	public ArrayList<Rectangle> columns;
	public Random rand;
	public boolean gameover, started;

	public FlappyBird() throws IOException {
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		renderer = new Renderer();
		rand = new Random();
		jframe.setTitle("mthrfckn flppbrd");
		jframe.add(renderer);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setVisible(true);
		jframe.addKeyListener(this);
		jframe.addMouseListener(this);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setResizable(false);
		bird = new Rectangle(WIDTH / 2 - 8, HEIGHT / 2 - 8, (WIDTH * 3) / 100, (HEIGHT * 3) / 100);
		columns = new ArrayList<Rectangle>();
		addColumn(true);
		addColumn(true);
		addColumn(true);
		addColumn(true);

		timer.start();

		Scanner in1 = new Scanner(
				new File("D:/Brukere/Preben/eclipse prosject/DAT100/Flappy Bird/FlappyHighscore.txt"));
		reader = in1.nextInt();
		HiScore = reader;
	}

	public void addColumn(boolean start) {
		int space = HEIGHT / 5;
		int width = WIDTH / 10;
		int height = 110 + rand.nextInt((int) (HEIGHT * 0.7));
		if (start) {
			columns.add(
					new Rectangle(WIDTH + width + columns.size() * WIDTH, HEIGHT - height - 0, width, height));
			columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * WIDTH, 0, width, HEIGHT - height - space));
		}
		else{
			columns.add(
					new Rectangle(columns.get(columns.size() - 1).x + WIDTH, HEIGHT - height - 0, width, height));
			columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0, width, HEIGHT - height - space));
		}
	}

	public void paintColumn(Graphics g, Rectangle column) {
		g.setColor(Color.green.darker());
		g.fillRect(column.x, column.y, column.width, column.height);
	}

	public void jump() {
		if (gameover) {
			bird = new Rectangle(WIDTH / 2 - 8, HEIGHT / 2 - 8, (WIDTH * 3) / 100, (HEIGHT * 3) / 100);
			columns.clear();
			addColumn(true);
			addColumn(true);
			addColumn(true);
			addColumn(true);
			yMotion = 0;
			score = 0;
			gameover = false;
		}
		if (!started) {
			started = true;
		}

		else if (!gameover) {
			if (yMotion > 0) {
				yMotion = 0;
			}
			yMotion -= 10;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int speed = (int) (WIDTH / 100);
		ticks++;
		if (started) {

		for (int i = 0; i < columns.size(); i++) {
			Rectangle column = columns.get(i);
			column.x -= speed;
		}

		if (ticks % 2 == 0 && yMotion < 15) {
			yMotion += 2;
		}

		for (int i = 0; i < columns.size(); i++) {
			Rectangle column = columns.get(i);
			if (column.x + column.width < 0) {
				columns.remove(column);
				if (column.y == 0) {
					addColumn(false);
				}
			}
		}

		bird.y += yMotion;

		for (Rectangle column : columns) {
				if (bird.x + bird.width / 2 > column.x + column.width / 2 - 10
						&& bird.x + bird.width / 2 < column.x + column.width / 2 + 10) {
					score++;
				}
			if (column.intersects(bird)) {
				gameover = true;
					bird.x = column.x - bird.width;
			}
		}
			if (bird.y > HEIGHT - 80 - bird.height || bird.y < 0) {
			gameover = true;
		}
			if (gameover) {
				bird.y = HEIGHT - 80 - bird.height;
				if (HiScore < score / 4) {
					HiScore = score / 4;

					try {
						PrintWriter writer = new PrintWriter(
								"D:/Brukere/Preben/eclipse prosject/DAT100/Flappy Bird/FlappyHighscore.txt", "UTF-8");
						writer.println(HiScore);
						writer.close();
					} catch (IOException t) {
						System.out.println("ERROR");
					}
				}
			}
		}
		renderer.repaint();
	}


	public void repaint(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		g.setColor(Color.orange);
		g.fillRect(0, HEIGHT - 80, WIDTH, 80);

		g.setColor(Color.green);
		g.fillRect(0, HEIGHT - 80, WIDTH, 10);

		g.setColor(Color.red);
		g.fillRect(bird.x, bird.y, bird.width, bird.height);

		for (Rectangle column : columns) {
			paintColumn(g, column);
		}

		g.setColor(Color.white);
		g.setFont(new Font("Arial", 1, 60));

		if (gameover) {
			g.drawString("Game Over!", 75, HEIGHT / 2 - 20);
		}

		if (!started) {
			g.drawString("Click to Start!", 60, HEIGHT / 2 - 20);
		}

		if (!gameover && started) {
			g.drawString(String.valueOf(score / 4), WIDTH / 2 - 25, 100);
		}

		g.setColor(Color.white);
		g.setFont(new Font("Arial", 1, 20));
		if (true) {
			g.drawString("HiScore: " + String.valueOf(HiScore), 1, 20);
	}
	}

	public static void main(String[] args) throws IOException {
		flappybird = new FlappyBird();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		jump();

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			jump();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

}
