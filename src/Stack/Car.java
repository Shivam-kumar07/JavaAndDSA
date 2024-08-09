package Stack;

public class Car implements Comparable<Car>{
	int position;
	int speed;
	double time;
	
	public Car(int position, int speed, double time) {
		this.position = position;
		this.speed = speed;
		this.time = time;
		
	}
	
	@Override
	public int compareTo(Car o) {
		return this.position - o.position;
	}

	@Override
	public String toString() {
		return "Car [position=" + position + ", speed=" + speed + ", time=" + time + "]";
	}
	
	
}