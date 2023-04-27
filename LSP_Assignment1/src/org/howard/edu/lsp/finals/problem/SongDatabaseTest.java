package org.howard.edu.lsp.finals.problem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class SongDatabaseTest {


	
	@Test
	void testGetSongs() {
		
		// Check if the correct set of songs is returned
		Set expectedPopSet = new HashSet<String>();
		expectedPopSet.add("Apple");
		expectedPopSet.add("Ball");
		
		SongDatabase db = new SongDatabase();
		
		db.addSong("Pop", "Apple");
		db.addSong("Pop", "Ball");
		assertEquals(db.getSongs("Pop"),expectedPopSet);	
		
		// Check if the correct set of songs is returned
		Set expectedRapSet = new HashSet<String>();
		expectedRapSet.add("Cat");
		db.addSong("Rap", "Cat");
		assertEquals(db.getSongs("Rap"),expectedRapSet);
		
		// Check that getSongs returns null when there are no songs in the genre
		assertEquals(db.getSongs("Country"), null);
		
		
	}
	@Test
	void testGetSongGenre() {
		Set expectedPopSet = new HashSet<String>();
		expectedPopSet.add("Apple");
		expectedPopSet.add("Ball");
		
		SongDatabase db = new SongDatabase();
		
		db.addSong("Pop", "Apple");
		db.addSong("Pop", "Ball");
		assertEquals(db.getGenreOfSong("Apple"), "Pop");	
		
		Set expectedRapSet = new HashSet<String>();
		expectedRapSet.add("Cat");
		db.addSong("Rap", "Cat");
		assertEquals(db.getGenreOfSong("Cat"),"Rap");	
		
		// Get the genre of a song that doesn't exist
		assertEquals(db.getGenreOfSong("Dog"),"Song not found");	
		
		
	}
	
	@Test
	void testAddSong() {
		
		
		// Check if the correct set is generated and it is assigned to the right key
		Set expectedPopSet = new HashSet<String>();
		expectedPopSet.add("Baby");
		expectedPopSet.add("Happy");
		
		SongDatabase db = new SongDatabase();
		
		db.addSong("Pop", "Baby");
		db.addSong("Pop", "Happy");
		assertEquals(db.getSongs("Pop"),expectedPopSet);	
		assertEquals(db.getGenreOfSong("Baby"),"Pop");	
		assertEquals(db.getGenreOfSong("Happy"),"Pop");	
		
		
		// Check if the correct set is generated and it is assigned to the right key
		Set expectedRapSet = new HashSet<String>();
		expectedRapSet.add("Sathi");
		db.addSong("Rap", "Sathi");
		assertEquals(db.getSongs("Rap"),expectedRapSet);	
		assertEquals(db.getGenreOfSong("Sathi"),"Rap");	
	}


}
