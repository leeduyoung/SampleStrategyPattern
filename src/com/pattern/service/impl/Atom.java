package com.pattern.service.impl;

import com.pattern.service.AttackStrategy;
import com.pattern.service.MovingStrategy;
import com.pattern.service.Robot;

public class Atom extends Robot
{

	public Atom(String name)
	{
		super(name);
	}
	
	public Atom(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy)
	{
		super(name, movingStrategy, attackStrategy);
	}
}
