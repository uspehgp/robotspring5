package com.uspehgp.robotspring.impls.toshiba;

import com.uspehgp.robotspring.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHand implements Hand{
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
