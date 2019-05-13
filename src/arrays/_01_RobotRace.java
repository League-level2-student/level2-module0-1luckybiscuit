package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	//2. create an array of 5 robots.
		Robot[] racers = new Robot[15];
	//3. use a for loop to initialize the robots.
		for(int i = 0; i < racers.length;i++) {
			racers[i] = new Robot();
			racers[i].setSpeed(100);
		//4. make each robot start at the bottom of the screen, side by side, facing up
			racers[i].setX(i*100 + 100);
			racers[i].setY(1000);
			racers[i].setWindowSize(i*100 + 200, 1000);
		}
	//5. use another for loop to iterate through the array and make each robot move 
		//while() {
	//   a random amount less than 50.
		boolean breaker = true;
		while(breaker) {
			for(int i = 0;i<racers.length;i++) {
				Random value = new Random();
				int distance = value.nextInt(50);
				racers[i].move(distance);
				if(racers[i].getY() < 0) {
					JOptionPane.showMessageDialog(null, "Robot " + (i+1) + " is the winner!");
					breaker = false;
					break;
				}
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
