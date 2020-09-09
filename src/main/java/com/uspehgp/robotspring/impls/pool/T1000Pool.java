package com.uspehgp.robotspring.impls.pool;

import java.util.Collection;
import java.util.Map;

import com.uspehgp.robotspring.interfaces.Robot;
import com.uspehgp.robotspring.interfaces.RobotPool;

public class T1000Pool implements RobotPool {

	private Collection<Robot> robotCollection;

	public T1000Pool(Collection<Robot> robotCollection) {
		super();
		this.robotCollection = robotCollection;
	}

	@Override
	public Collection<Robot> getRobotCollection() {
		return robotCollection;
	}

	public void beginShow() {
		for (Robot robot : robotCollection) {
			robot.action();
		}
	}
}
