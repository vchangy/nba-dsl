package com.company;

/**
 * Created by franklong on 4/22/17.
 */

//TODO make the hashmap of players, take in CSV here or somewhere else, make the getters and comparators
public class Player {

    //TODO CSV constructor?
    public Player() {
    }

    //standard counting stats
    private double points;
    private double rebounds;
    private double assists;
    private double blocks;
    private double steals;

    //percentages
    private double fieldGoalPercentage;
    private double threePointPercentage;
    private double freeThrowPercentage;

    //makes
    private int fieldGoalsMade;
    private int threePointMade;
    private int freeThrowMade;

    //attempts
    private int fieldGoalAttempts;
    private int threePointAttempts;
    private int freeThrowGoalAttempts;

    //negative stats
    private double turnovers;
    private double fouls;

    //Getters
    public double getPoints() {
        return points;
    }

    public double getRebounds() {
        return rebounds;
    }

    public double getAssists() {
        return assists;
    }

    public double getBlocks() {
        return blocks;
    }

    public double getSteals() {
        return steals;
    }

    public double getFieldGoalPercentage() {
        return fieldGoalPercentage;
    }

    public double getThreePointPercentage() {
        return threePointPercentage;
    }

    public double getFreeThrowPercentage() {
        return freeThrowPercentage;
    }

    public int getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    public int getThreePointMade() {
        return threePointMade;
    }

    public int getFreeThrowMade() {
        return freeThrowMade;
    }

    public int getFieldGoalAttempts() {
        return fieldGoalAttempts;
    }

    public int getThreePointAttempts() {
        return threePointAttempts;
    }

    public int getFreeThrowGoalAttempts() {
        return freeThrowGoalAttempts;
    }

    public double getTurnovers() {
        return turnovers;
    }

    public double getFouls() {
        return fouls;
    }

    //Setters
    public void setPoints(double points) {
        this.points = points;
    }

    public void setRebounds(double rebounds) {
        this.rebounds = rebounds;
    }

    public void setAssists(double assists) {
        this.assists = assists;
    }

    public void setBlocks(double blocks) {
        this.blocks = blocks;
    }

    public void setSteals(double steals) {
        this.steals = steals;
    }

    public void setFieldGoalPercentage(double fieldGoalPercentage) {
        this.fieldGoalPercentage = fieldGoalPercentage;
    }

    public void setThreePointPercentage(double threePointPercentage) {
        this.threePointPercentage = threePointPercentage;
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public void setFieldGoalsMade(int fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }

    public void setThreePointMade(int threePointMade) {
        this.threePointMade = threePointMade;
    }

    public void setFreeThrowMade(int freeThrowMade) {
        this.freeThrowMade = freeThrowMade;
    }

    public void setFieldGoalAttempts(int fieldGoalAttempts) {
        this.fieldGoalAttempts = fieldGoalAttempts;
    }

    public void setThreePointAttempts(int threePointAttempts) {
        this.threePointAttempts = threePointAttempts;
    }

    public void setFreeThrowGoalAttempts(int freeThrowGoalAttempts) {
        this.freeThrowGoalAttempts = freeThrowGoalAttempts;
    }

    public void setTurnovers(double turnovers) {
        this.turnovers = turnovers;
    }

    public void setFouls(double fouls) {
        this.fouls = fouls;
    }
}
