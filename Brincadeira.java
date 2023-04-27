package brincadeira;
import robocode.*;
import java.awt.Color;
/**
 * Brincadeira - a class by (Rafaela)
 */
public class Brincadeira extends Robot
{
	public void run(){
		while(true){
			setColors(Color.red, Color.blue, Color.magenta, Color.orange, Color.black);
			first();
			second();
			third();
		}
	}
	//quando ver um robo
	public void onScannedRobot(ScannedRobotEvent e){
		if (getGunHeat() == 0) {
 			fire(Rules.MAX_BULLET_POWER);
		}
		fire(2);
	}
	//quando for atingido por uma bala
	public void onHitByBullet(HitByBulletEvent e){
		back(100);
		turnLeft(90);
		ahead(50);
		turnLeft(90);
		ahead(50);
	}
	//quando for atingido por uma parede
	public void onHitWall(HitWallEvent e){
		back(100);
		turnLeft(90);
	}

	public void first(){
			scan();
			ahead(50);
			scan();
			ahead(50);
			scan();
			ahead(50);
			turnRight(90);
			scan();
			ahead(50);
			scan();
			ahead(50);
			scan();
			ahead(50);
			turnRight(90);
			scan();
			ahead(50);
			scan();
			ahead(50);
			scan();
			ahead(50);
			turnRight(90);
	}
	
	public void second(){
			scan();
			ahead(50);
			scan();
			ahead(50);
			scan();
			ahead(80);
			turnRight(90);
			scan();
			ahead(50);
			scan();
			ahead(50);
			scan();
			ahead(80);scan();
			ahead(50);
			scan();
			ahead(50);
			scan();
			ahead(80);
			turnRight(90);
			scan();
			ahead(50);
			scan();
			ahead(50);
			scan();
			ahead(80);
			turnRight(90);
	}

	public void third(){
			scan();
			ahead(50);
			scan();
			ahead(50);
			turnRight(90);
			scan();
			ahead(50);
			scan();
			ahead(50);
			turnRight(90);
			scan();
			ahead(50);
			scan();
			ahead(50);
			turnRight(90);
	}
}
