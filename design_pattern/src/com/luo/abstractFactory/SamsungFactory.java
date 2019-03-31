package com.luo.abstractFactory;

public class SamsungFactory extends MobileAbstractFactory {

	@Override
	public MobilePower doMobilePower() {
		return new SamsungMobilePower();
	}

	@Override
	public MobileScreen doMobileScreen() {
		return new SamsungMobileScreen();
	}

}
