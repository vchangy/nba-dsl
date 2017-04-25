//package com.company;
//
///**
// * Created by franklong on 4/22/17.
// */
//public class Comparisons {
//
//    //TODO deal with equals case
//
//    //Basic stat comparisons
//    public static Player pointsComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getPoints() > b.getPoints()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player reboundsComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getRebounds() > b.getRebounds()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player assistsComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getAssists() > b.getAssists()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player blocksComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getBlocks() > b.getBlocks()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player stealsComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getSteals() > b.getSteals()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player fieldGoalPercentageComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getFieldGoalPercentage() > b.getFieldGoalPercentage()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player threePointPercentageComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getThreePointPercentage() > b.getThreePointPercentage()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player fieldGoalAttemptsComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getFieldGoalAttempts() > b.getFieldGoalAttempts()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player threePointAttemptsComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getThreePointAttempts() > b.getFreeThrowGoalAttempts()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player freeThrowGoalAttemptsComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getFreeThrowGoalAttempts() > b.getFreeThrowGoalAttempts()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player turnoversComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getTurnovers() > b.getTurnovers()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    public static Player foulsComparison(Player a, Player b) {
//        Player winner = new Player();
//        if(a.getFouls() > b.getFouls()) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    //more complex comparisons
//
//    //uses "effective field goal percentage" - (2pt FGM + 1.5 * 3pt FGM) / FGA
//    public static Player effectiveFieldGoalComparison(Player a, Player b) {
//        Player winner = new Player();
//
//        if(NBAHelpers.calculateEFG(a) > NBAHelpers.calculateEFG(b)) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    //a generalized efficiency stat taking effective field goal percentage with other stats
//    public static Player efficiencyComparison(Player a, Player b) {
//        double aEfficiency = NBAHelpers.calculateEFG(a) * a.getFieldGoalAttempts()
//                + 1.5 * a.getAssists() + .5 * a.getRebounds();
//        double bEfficiency = NBAHelpers.calculateEFG(b) * b.getFieldGoalAttempts()
//                + 1.5 * b.getAssists() + .5 * b.getRebounds();
//
//        Player winner = new Player();
//
//        if(aEfficiency > bEfficiency) winner = a;
//        else winner = b;
//        return winner;
//    }
//
//    //how many ____ would they get in ____ minutes?
//
//}
