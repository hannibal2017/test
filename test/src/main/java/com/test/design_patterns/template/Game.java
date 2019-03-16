package com.test.design_patterns.template;
/**
 * 模板设计模式
 * @author luoluo
 *1，新建一个抽象类Game，先定义需要的方法。
 *2，新建子类实现。
 */
public abstract class Game {
	public final void play() {
		initial();
		startPlay();
		endPlay();
	}

	abstract void initial();

	abstract void startPlay();

	abstract void endPlay();
}
