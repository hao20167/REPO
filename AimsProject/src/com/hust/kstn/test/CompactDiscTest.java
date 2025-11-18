package com.hust.kstn.test;

import java.util.ArrayList;
import java.util.List;

import com.hust.kstn.models.*;

public class CompactDiscTest {

	public static void main(String[] args) {
		List<Track> tracks = new ArrayList<>();
		CompactDisc CD = new CompactDisc(tracks, "007", "99%", "Pop", 99.36f);
		System.out.println(CD.toString());
		
		Track track1 = new Track("Chim soul", 236);
		CD.addTrack(track1);
		System.out.println(CD.toString());
		
		Track track2 = new Track("Va vao giai dieu nay", 311);
		CD.addTrack(track2);
		System.out.println(CD.toString());
		
		Track tracka = new Track("Fast & Furious 1" , 366);
		Track trackb = new Track("Fast & Furious 2" , 362);
		Track trackc = new Track("Fast & Furious 3" , 359);
		CD.addTrack(tracka, trackb, trackc);
		System.out.println(CD.toString());
		
		CD.removeTrack(trackc);
		System.out.println(CD.toString());
		
		CD.removeTrack(trackc);
		System.out.println(CD.toString());
	}

}
