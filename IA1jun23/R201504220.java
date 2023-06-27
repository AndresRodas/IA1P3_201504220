package IA1jun23;
import robocode.*;
import java.awt.Color;

public class R201504220 extends Robot
{
	boolean derecha = true;
	boolean frente = true;
	public void run() {
	
		setBodyColor(new Color(153,50,204));		
		setGunColor(new Color(0,0,0));
		setRadarColor(new Color(248,248,255));
		
		while(true) {
			if(derecha){
				ahead(200);
				turnRight(200);
				turnRight(200);
				turnRight(200);
			}else{
				ahead(200);
				turnLeft(200);
				turnLeft(200);
				turnLeft(200);
			}
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	public void onHitByBullet(HitByBulletEvent e) {

		if(derecha){
			derecha = false;
		}else{
			derecha = true;
		}
	}
	
	public void onHitWall(HitWallEvent e) {
		
		if(frente){
			back(400);
			if(derecha){
				turnLeft(100);
			}else{
				turnRight(100);
			}
		}else{
			ahead(400);
			if(derecha){
				turnLeft(100);
			}else{
				turnRight(100);
			}
		}
		
		if(derecha){
			derecha = false;
		}else{
			derecha = true;
		}
	}	
}
