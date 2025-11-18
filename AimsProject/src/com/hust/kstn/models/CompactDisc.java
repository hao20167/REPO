package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
	private List<Track> tracks = new ArrayList<>();
	private String id, title, category;
	private float cost;
	public CompactDisc(List<Track> tracks, String id, String title, String category, float cost) {
		this.tracks = tracks;
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public void addTrack(Track track) {
		tracks.add(track);
		System.out.println("Added track[" + track.getTitle() + "] to CD[" + title + "]");
	}
	
	public void addTrack(Track ...tracks2) {
		for (Track track: tracks2) {
			tracks.add(track);
		}
	}
	
	public void removeTrack(Track track) {
		int pos = tracks.indexOf(track);
		if (pos == -1) {
			System.out.println("Track[" + track.getTitle() + "] not found in the CD[" + title + "], can not remove!");
			return;
		}
		tracks.remove(pos);
		System.out.println("Removed track[" + track.getTitle() + "] from CD[" + title + "]");
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
		return "CD[" + id + "][" + title + "][" + cost + "][" + category + "]" + "\nTracks: " + tracks + "\n[Total length: " + totalLength() + "]";
	}
}
