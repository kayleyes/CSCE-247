package csce247.assignments.singelton;

public class JukeBox {
	private boolean empty = true;
	private static JukeBox jukebox;

	JukeBox() {}

	public static JukeBox getInstance() {
		if(jukebox == null) {
			System.out.println("Initalizing the JukeBox!!! Let's get Dancing :)");
			jukebox = new JukeBox();
		}
		return jukebox;
	}

	//play next song to jukebox
	public void playNextSong() {
		if(isEmpty()) {
			System.out.println("Playing the next song");
			empty = false;
			songQueue.enqueue();
		}

	}

	public void requestSong(String string) {
		int numItems = songQueue.size();
		songQueue.enqueue();
		System.out.println("You have " + numItems + " songs in front of you!");

	}
	
	public boolean hasMoreSongs() {
		int numItems = songQueue.size();
		System.out.println("You have " + numItems  + " songs in front of you");
		return false;

	}

	public boolean isEmpty() {
		return empty;
	}
}
