package com.luo.abstractFactory;

public class Test {

	public static void main(String[] args) {
		MobileAbstractFactory maf1 = new AppleFactory();
		MobilePower mobilePower1 = maf1.doMobilePower();
		MobileScreen mobileScreen1 = maf1.doMobileScreen();
		mobilePower1.mobilePower();
		mobileScreen1.mobileScreen();
		
		MobileAbstractFactory maf2 = new SamsungFactory();
		MobilePower mobilePower2 = maf2.doMobilePower();
		MobileScreen mobileScreen2 = maf2.doMobileScreen();
		mobilePower2.mobilePower();
		mobileScreen2.mobileScreen();
	}

}
