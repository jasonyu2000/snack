package com.huawei.snake.listener;

/**
 * 
 * ��Ϸ������
 * 
 * @version 1.0, 01/01/08
 * 
 * @author SG
 * 
 */
public interface GameListener {

	/**
	 * ��Ϸ��ʼ��
	 */
	void gameStart();

	/**
	 * ��Ϸ������
	 */
	void gameOver();

	/**
	 * ��Ϸ��ͣ��
	 */

	void gamePause();

	/**
	 * ��Ϸ����
	 */
	void gameContinue();
}
