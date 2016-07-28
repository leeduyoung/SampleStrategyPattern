package com.pattern.strategy;

import com.pattern.service.AttackStrategy;

public class MissileStrategy implements AttackStrategy
{

	@Override
	public void attack()
	{
		System.out.println("missile attack!!");
	}


}
