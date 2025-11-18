package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media {
	private List<Track> tracks = new ArrayList<>();
	
	public CompactDisc(List<Track> tracks, String id, String title, float cost, String category) {
		super(id, title, cost, category);
		this.tracks = tracks;
	}
	
	public void addTrack(Track track) {
		tracks.add(track);
		System.out.println("Added track[" + track.getTitle() + "] to CD[" + super.getTitle() + "]");
	}
	
	public void addTrack(Track ...tracks2) {
		for (Track track: tracks2) {
			tracks.add(track);
		}
	}
	
	public void removeTrack(Track track) {
		int pos = tracks.indexOf(track);
		if (pos == -1) {
			System.out.println("Track[" + track.getTitle() + "] not found in the CD[" + super.getTitle() + "], can not remove!");
			return;
		}
		tracks.remove(pos);
		System.out.println("Removed track[" + track.getTitle() + "] from CD[" + super.getTitle() + "]");
	}
	
	public int totalLength() {
		int len = 0;
		for (Track item: tracks) {
			len += item.getLength();
		}
		return len;
	}
	
	@Override
	public String toString() {
		if (tracks.size() < 1) {
			return "Empty CD";
		}
		return "CD-" + super.toString() + "\nTracks: " + tracks + "\n[Total length: " + totalLength() + "]";
	}
}
