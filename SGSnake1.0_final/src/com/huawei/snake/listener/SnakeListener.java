package com.huawei.snake.listener;

/**
 * 
 * �ߵļ�����
 * 
 * @version 1.0, 01/01/08
 * 
 * @author SG
 * 
 */
public interface SnakeListener {
	/**
	 * ���ƶ��¼�
	 */
	void snakeMoved();

	/**
	 * �߳Ե�ʳ���¼�
	 */
	void snakeEatFood();
}