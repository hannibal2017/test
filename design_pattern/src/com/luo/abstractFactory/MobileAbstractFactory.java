package com.luo.abstractFactory;

/**
 * 手机加工厂，给手机运营商加工手机，有苹果和三星。分别加工其手机电源，手机屏幕。有不同生产要求。
 * 
 * 此时如果获得小米的订单，继续创造小米工厂就好了。
 * @author luoluo
 *
 */
public abstract class MobileAbstractFactory {
	public abstract MobilePower doMobilePower();

	public abstract MobileScreen doMobileScreen();
	
}
