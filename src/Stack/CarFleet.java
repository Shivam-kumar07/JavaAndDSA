package Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {

	public static void main(String[] args) {
		int target = 100;
		int[] position = { 0,2,4 };
		int[] speed = { 4,2,1};
		System.out.println(carFleet(target , position, speed));

	}

	public static int carFleet(int target, int[] position, int[] speed) {
		int fleet = position.length;
		Car[] cars = new Car[position.length];
		Stack<Double> stack = new Stack<> ();
		
		for(int i = 0 ; i<position.length ; i++) {
			double time = (double) (target - position[i]) / speed[i];
			cars[i] = new Car(position[i] , speed[i], time);
//			System.out.println(cars[i]);
		} 
		Arrays.sort(cars);
		for( Car c : cars) {
			System.out.println(c);
		}
		int i= fleet-2;
		int j = fleet -1;
		while(i>=0) {
			if(cars[i].speed > cars[j].speed && cars[i].time <= cars[j].time) {
				fleet--;
				i--;
			}
			else {
				j= i;
				i--;
			}
		}
		
		return fleet;
		
	}
}
