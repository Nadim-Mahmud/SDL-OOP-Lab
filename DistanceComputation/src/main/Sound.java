package main;

public class Sound {
	
	private double time_interval;
	private double speed;
	
	public void setData(double time_interval,double speed) {
		
		this.time_interval = time_interval;
		this.speed = speed;
	}
	
	public double distance() {
		
		double dis;
		dis = speed * time_interval;
		return dis;
	}
	
}
