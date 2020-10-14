//Janani Rajan, 8/24/19

import java.io.*;

public class Song implements java.io.Serializable{

	//Version number
	static final long serialVersionUID = 1;
	
	// Song member variables
	private String title;
	private String artist;
	private String genre;
	private Date releaseDate = new Date();

	// Class constructor for everything else
	public Song(String t, String a, String g) {
		title = t;
		artist = a;
		genre = g;
	}

	// Title/artist/genre/Date getter methods
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getGenre() {
		return genre;
	}

	public String getDate() {
		return releaseDate.getDate();
	}

	// Date setter method
	public void setDate(int m, int d, int y) {
		releaseDate.setDate(m, d, y);
	}

	// writeObject/readObject methods - these are necessary because the releaseDate
	// class member is not serializable.
	private void writeObject(ObjectOutputStream out) throws IOException, ClassNotFoundException {
		// Write title, artist, genre strings
		out.writeObject(title);
		out.writeObject(artist);
		out.writeObject(genre);
		// Month, Day, and Year are written separately as integers because Date as a
		// whole is not serializable.
		out.writeInt(releaseDate.getMonth());
		out.writeInt(releaseDate.getDay());
		out.writeInt(releaseDate.getYear());
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		// Read title, artist, genre strings
		title = (String) in.readObject();
		artist = (String) in.readObject();
		genre = (String) in.readObject();

		// Month, Day, and Year are read separately as integers because Date as a whole
		// is not serializable.
		int m = in.readInt();
		int d = in.readInt();
		int y = in.readInt();
		// Make releaseDate a new date and set it to m, d, and y
		releaseDate = new Date();
		releaseDate.setDate(m, d, y);
	}
}
