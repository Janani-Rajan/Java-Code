//Janani Rajan, 8/24/19

import java.util.Scanner;
import java.io.*;

public class CreateSongs {
	public static void main(String[] args) {

		// Set number of songs in list to three
		int numberOfSongs = 3;

		Song[] arr = new Song[numberOfSongs];

		// Set a value to all data attributes to the first two songs in the song array
		arr[0] = new Song("Game of Survival", "Ruelle", "Pop");
		arr[0].setDate(5, 12, 2017);
		arr[1] = new Song("I'll Be Waiting For You", "Demi Lovato", "Pop");
		arr[1].setDate(4, 18, 2018);

		Scanner input = new Scanner(System.in);

		// Prompt the user for the file path
		System.out.println("Please type a file path name below.");
		System.out.println("i.e. C:\\\\Downloads\\\\SerializeSongs.bin");
		String pathname = input.nextLine();

		// Prompt the user for values for the data attributes of the third song
		System.out.println("Please type a song title");
		String title = input.nextLine();
		System.out.println("Please type the artist");
		String artist = input.nextLine();
		System.out.println("Please type the genre for your song");
		String genre = input.nextLine();
		System.out.println("Please type the month your song was released as an integer");
		int month = input.nextInt();
		System.out.println("Please type the day your song was released as an integer");
		int day = input.nextInt();
		System.out.println("Please type the year your song was released as an integer");
		int year = input.nextInt();

		// Close input
		input.close();

		// Set the song's attributes to the values given by the user
		arr[2] = new Song(title, artist, genre);
		arr[2].setDate(month, day, year);

		// Create a file with the specified pathname
		File Serialize_Songs = new File(pathname);

		try {
			// Create ObjectOutputStream for the file and write all songs to the file
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Serialize_Songs));
			for (int i = 0; i < numberOfSongs; i++) {
				out.writeObject(arr[i]);
			}
			// Create ObjectInputStream for the file
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(Serialize_Songs));
			for (int i = 0; i < numberOfSongs; i++) {
				// Read each serialized song object and invoke the display method for each song
				Song s = (Song) in.readObject();
				display(s);
			}
			// Close ObjectOutputStream and ObjectInputStream
			out.close();
			in.close();
			// Handle ClassNotFoundException and IOException
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	// Display the title, artist, genre, and release date of each song in separate
	// lines.
	public static void display(Song s) {
		System.out.println(s.getTitle() + "\n" + s.getArtist() + "\n" + s.getGenre() + "\n" + s.getDate() + "\n");
	}

}
