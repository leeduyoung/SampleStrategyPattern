package com.pattern.strategy;

import com.pattern.service.MovingStrategy;

public class FlyingStrategy implements MovingStrategy
{

	@Override
	public void move()
	{
		System.out.println("flying..");
	}

}
