package org.javaturk.oofp.ch03.multipleInheritance;

public class MusicianActor implements Actor,Musician {

	@Override
	public void play() {
		System.out.println("MusicianActor plays!");
		
	}

}
