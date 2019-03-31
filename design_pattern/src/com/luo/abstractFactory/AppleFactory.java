package com.luo.abstractFactory;

public class AppleFactory extends MobileAbstractFactory {

	@Override
	public MobilePower doMobilePower() {
		return new AppleMobilePower();
	}

	@Override
	public MobileScreen doMobileScreen() {
		return new AppleMobileScreen();
	}

}
