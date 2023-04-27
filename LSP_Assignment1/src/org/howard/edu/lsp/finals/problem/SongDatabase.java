package org.howard.edu.lsp.finals.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SongDatabase {
	private Map<String, HashSet<String>> map = new HashMap<String,HashSet<String>>();


	public void addSong(String genre, String songTitle) {
		HashSet<String> tempSet = map.get(genre);
		if (tempSet == null) {
			map.put(genre, new HashSet<String>(Arrays.asList(songTitle))); 
		}
		else{
			tempSet.add(songTitle);
			map.put(genre, tempSet);
		}
	}
	
	public Set<String> getSongs(String genre){
		return map.get(genre);
	}
	
	public String getGenreOfSong(String songTitle) {
		for (Entry<String, HashSet<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            HashSet<String> value = entry.getValue();
            if (value.contains(songTitle)) {
            	return key;
            }
          
        }
		return "Song not found";
	}
	

}
