

/*
 * 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SeaCreatures {
public static void main(String[] args) {
	
}
	private String name;

	
	
	SeaCreatures(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					"/Users/League/Google Drive/league-sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	SeaCreatures spongebob = new SeaCreatures("spongebob");
	
	public void consume() {
		System.out.println(spongebob+ " is eating krabby patties");
	}

	public void chuckle() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					"/Users/League/Google Drive/league-sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	SeaCreatures  patrick = new SeaCreatures("patrick");
	SeaCreatures squidward= new SeaCreatures("squidward");
	
	public void ingest() {
		System.out.println(patrick+ " is eating krabby patties");
	}

	public void swallow() {
		System.out.println(squidward+ " is eating krabby patties")
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

