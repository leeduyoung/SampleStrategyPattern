package com.pattern.service;

public abstract class Robot
{
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;
	
	public Robot(String name)
	{
		this.name = name;
	}
	
	public Robot(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy)
	{
		this.name = name;
		this.movingStrategy = movingStrategy;
		this.attackStrategy = attackStrategy;
	}
	
	public void getName()
	{
		System.out.println(this.name);
//		return this.name;
	}
	
	public void move()
	{
		if(movingStrategy == null)
		{
			System.out.println("기본이동..");
		}
		else
		{
			movingStrategy.move();
		}
	}
	
	public void attack()
	{
		if(attackStrategy == null)
		{
			System.out.println("기본공격..");
		}
		else
		{
			attackStrategy.attack();
		}
	}
	
	public void setMovingStrategy(MovingStrategy movingStrategy)
	{
		this.movingStrategy = movingStrategy;
	}
	
	public void setAttackStrategy(AttackStrategy attackStrategy)
	{
		this.attackStrategy = attackStrategy;
	}
}
