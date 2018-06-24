package com.huawei.snake.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import com.huawei.snake.entities.Food;
import com.huawei.snake.entities.Ground;
import com.huawei.snake.entities.Snake;
import com.huawei.snake.util.Global;

/**
 * ��Ϸ����ʾ����<BR>
 * ������ setBackgroundColor() ������Ϸ�ı���ɫ
 * 
 * @version 1.0, 01/01/08
 * 
 * @author SG
 * 
 */
public class GamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Image oimg;

	private Graphics og;

	public static final Color DEFAULT_BACKGROUND_COLOR = new Color(0xcfcfcf);
	/**
	 * ������ɫ
	 */
	private Color backgroundColor = DEFAULT_BACKGROUND_COLOR;

	public GamePanel() {
		/* ���ô�С�Ͳ��� */
		this.setSize(Global.WIDTH * Global.CELL_WIDTH, Global.HEIGHT
				* Global.CELL_HEIGHT);
		this.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		this.setFocusable(true);
	}

	/**
	 * ������ʾ Ground, Shape
	 * 
	 * @param ground
	 * @param snake
	 */
	public synchronized void redisplay(Ground ground, Snake snake, Food food) {

		/* ������ʾ */
		if (og == null) {
			oimg = createImage(getSize().width, getSize().height);
			if (oimg != null)
				og = oimg.getGraphics();
		}
		if (og != null) {
			og.setColor(backgroundColor);
			og.fillRect(0, 0, Global.WIDTH * Global.CELL_WIDTH, Global.HEIGHT
					* Global.CELL_HEIGHT);
			if (ground != null)
				ground.drawMe(og);
			snake.drawMe(og);
			if (food != null)
				food.drawMe(og);
			this.paint(this.getGraphics());
		}
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(oimg, 0, 0, this);
	}

	/**
	 * �õ���ǰ�ı�����ɫ
	 * 
	 * @return
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * ���õ�ǰ�ı�����ɫ
	 * 
	 * @param backgroundColor
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

}
