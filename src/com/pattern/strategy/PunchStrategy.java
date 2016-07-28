package com.pattern.strategy;

import com.pattern.service.AttackStrategy;

public class PunchStrategy implements AttackStrategy
{

	@Override
	public void attack()
	{
		System.out.println("punch attack!!");
	}

}
