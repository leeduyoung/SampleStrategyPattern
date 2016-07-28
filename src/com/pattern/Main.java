package com.pattern;

import com.pattern.service.Robot;
import com.pattern.service.impl.Atom;
import com.pattern.service.impl.Sungard;
import com.pattern.service.impl.TaekwonV;
import com.pattern.strategy.FlyingStrategy;
import com.pattern.strategy.MissileStrategy;
import com.pattern.strategy.PunchStrategy;
import com.pattern.strategy.WalkingStrategy;

public class Main
{
	public static void main(String[] args)
	{
		Robot robot01 = new Atom("Atom");
		Robot robot02 = new TaekwonV("TaekwonV");
		Robot robot03 = new Sungard("Sungard");

		robot01.getName();
		robot01.attack();
		robot01.move();
		System.out.println();
		
		robot02.setMovingStrategy(new FlyingStrategy());
		robot02.setAttackStrategy(new MissileStrategy());
		robot02.getName();
		robot02.attack();
		robot02.move();
		System.out.println();
		
		robot03.setMovingStrategy(new WalkingStrategy());
		robot03.setAttackStrategy(new PunchStrategy());
		robot03.getName();
		robot03.attack();
		robot03.move();
		System.out.println();
		
		Robot robot04 = new Atom("Atom2", new WalkingStrategy(), new PunchStrategy());
		robot04.getName();
		robot04.attack();
		robot04.move();
	}
}
