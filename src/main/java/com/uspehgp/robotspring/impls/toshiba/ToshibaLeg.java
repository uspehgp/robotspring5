package com.uspehgp.robotspring.impls.toshiba;

import com.uspehgp.robotspring.interfaces.Leg;
import org.springframework.stereotype.Component;


@Component
public class ToshibaLeg implements Leg {
	
	public void go(){
		System.out.println("Go to Toshiba!");
	}

}
