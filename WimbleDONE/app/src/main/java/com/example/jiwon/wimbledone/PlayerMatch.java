package com.example.jiwon.wimbledone;

import android.location.Location;

/**
 * Yoon's proj3 Card-View Implementation of Landmarks
 * Used as a template for matched players.
 */

public class PlayerMatch {
    public String name;
    public int age;
    public String userNtrp;
    public String playerNtrp;
    public String gender;
    public double distPref;
    public double distance;
    public Boolean isMatch;
    private double latitude;
    private double longitude;

    PlayerMatch(String name, int age, String userNtrp, String playerNtrp, String gender, double distPref, double latitude, double longitude, double fromLat, double fromLong) {
        this.name = name;
        this.age = age;
        this.userNtrp = userNtrp;
        this.playerNtrp = playerNtrp;
        this.gender = gender;
        this.distPref = distPref;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = calculateDistance(fromLat, fromLong);
        this.isMatch = calculateMatch(distPref, this.distance, userNtrp, playerNtrp);
    }

    public double calculateDistance(double fromLat, double fromLon) {
        Location landmarkLoc = new Location("");
        Location currLoc = new Location("");
        landmarkLoc.setLatitude(latitude);
        landmarkLoc.setLongitude(longitude);
        currLoc.setLatitude(fromLat);
        currLoc.setLongitude(fromLon);

        return Math.round(currLoc.distanceTo(landmarkLoc));
    }

    public Boolean calculateMatch(double distPref, double distance, String userNtrp, String playerNtrp) {
        Boolean result = false;
        if (userNtrp.equals(playerNtrp)) {
            result = true;
        }
        return result;
    }
}
