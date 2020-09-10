package com.uspehgp.robotspring.impls.toshiba;

import com.uspehgp.robotspring.interfaces.Head;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHead implements Head{
	
	public void calc(){
		System.out.println("Thinking about Toshiba...");
	}

}
