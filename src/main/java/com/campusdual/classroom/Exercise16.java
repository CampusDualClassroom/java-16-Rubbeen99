package com.campusdual.classroom;

// Clase principal
public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		plane.start();
		plane.maintenance();
		plane.stop();

		tractor.start();
		tractor.maintenance();
		tractor.stop();

		plane.fly();
		tractor.forward();
	}
}
