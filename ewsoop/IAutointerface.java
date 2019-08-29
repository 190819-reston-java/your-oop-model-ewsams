package com.revature.ewsoop;

 interface IAutointerface {
	 void startEngine();
	 void revEngine();
	 void setCruiseControl(int speed); 
	 void placeInReverse(); 
	 void fillGas(String gas);
	 void autoDrive() throws Exception;
	}
