package org.javaturk.oofp.ch03.flyer;

import java.util.ArrayList;
import java.util.List;

import org.javaturk.oofp.ch03.flyer.driver.*;
import org.javaturk.oofp.ch03.flyer.vehicle.*;

public class TestFlyer {

	public static void main(String[] args) {
		SeaPlane seaPlane = new SeaPlane("Akin's SeaPlane");
		Floatable floatable = seaPlane;
		Airplane airplane = seaPlane;
		AbstractVehicle abstractVehicle = seaPlane;
		Vehicle vehicle = seaPlane;
		Flyer flyer = seaPlane;
		Object object = seaPlane;
		
		
////////////////////////////////////////////////////////////////

		Pilot pilot = new Pilot("Akin");
		pilot.drive(seaPlane);   // Vehicle

		Hangar hangar = new Hangar("Macaron's Hangar");
		hangar.store(seaPlane);  // Airplane

		Harbour harbour = new Harbour("Ayvalik Harbour");
		harbour.enter(seaPlane); // Floatable
		
		List list = new ArrayList();
		list.add(seaPlane);	// Object

		UniversalDriver universalDriver = new UniversalDriver("Selim");
		universalDriver.drive(seaPlane);  // Vehicle 
	}

}
