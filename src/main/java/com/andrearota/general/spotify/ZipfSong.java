package com.andrearota.general.spotify;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ZipfSong {

	private class Song {
		int pos, played;
		float q;
		String title;
		
		@Override
		public String toString() {
			return title;
		}
	}
	
	private PriorityQueue<Song> pq;
	
	public ZipfSong() {
		pq = new PriorityQueue<ZipfSong.Song>(1, new Comparator<ZipfSong.Song>() {

			public int compare(Song o1, Song o2) {
				
				if(o1.q == o2.q) {
					return o1.pos > o2.pos? -1 : 1;
				} else if (o1.q > o2.q) {
					return 1;
				} else {
					return 0;
				}
			}
		});
	}
	
	public void add(int pos, int played, String title) {
		
		Song s = new Song();
		s.pos = pos;
		s.played = played;
		s.title = title;
		s.q = (float)s.pos/played;
		
		pq.add(s);
		
	}

	public String[] getBestSongs(int results) {
		
		String[] titles = new String[results];
		
		for(int i=0; i<results; i++) {
			titles[i] = pq.poll().title;
		}
		
		return titles;
		
	}

}
