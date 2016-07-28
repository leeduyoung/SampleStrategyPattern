package com.pattern.strategy;

import com.pattern.service.MovingStrategy;

public class WalkingStrategy implements MovingStrategy
{

	@Override
	public void move()
	{
		System.out.println("walking..");
	}

}
