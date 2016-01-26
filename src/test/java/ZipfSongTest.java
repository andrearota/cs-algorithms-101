import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.general.spotify.ZipfSong;


public class ZipfSongTest {

	@Test
	public void test() {
		
		ZipfSong solver = new ZipfSong();
		

solver.add(1, 30, "one"); //30
solver.add(2, 30, "two"); //15
solver.add(3, 15, "three"); //5
solver.add(4, 25, "four"); //6.25

String[] result = solver.getBestSongs(2);
String[] expecteds = {"four", "two"};

assertArrayEquals(expecteds, result);

/*
		
		solver.add(four
solver.add(two
solver.add(Sample input 2
solver.add(15 3
solver.add(197812 re_hash
solver.add(78906 5_4
solver.add(189518 tomorrow_comes_today
solver.add(39453 new_genious
solver.add(210492 clint_eastwood
solver.add(26302 man_research
solver.add(22544 punk
solver.add(19727 sound_check
solver.add(17535 double_bass
solver.add(18782 rock_the_house
solver.add(198189 19_2000
solver.add(13151 latin_simone
solver.add(12139 starshine
solver.add(11272 slow_country
solver.add(10521 m1_a1
solver.add(Sample output 2
solver.add(19_2000
solver.add(clint_eastwood
solver.add(tomorrow_comes_today
*/
		
		
		fail("Not yet implemented");
	}

}
