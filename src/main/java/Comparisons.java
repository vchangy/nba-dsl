package com.company;

/**
 * Created by franklong on 4/22/17.
 */
public class Comparisons {
    //TODO deal with equals case
    //Basic stat comparisons
    public static Player compareMP(Player a, Player b) {
        Player winner;
        if(a.MP > b.MP) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareFG(Player a, Player b) {
        Player winner;
        if(a.FG > b.FG) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareFGA(Player a, Player b) {
        Player winner;
        if(a.FGA > b.FGA) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareFGP(Player a, Player b) {
        Player winner;
        if(a.FGP > b.FGP) winner = a;
        else winner = b;
        return winner;
    }

    public static Player comparethreeP(Player a, Player b) {
        Player winner;
        if(a.threeP > b.threeP) winner = a;
        else winner = b;
        return winner;
    }

    public static Player comparethreePA(Player a, Player b) {
        Player winner;
        if(a.threePA > b.threePA) winner = a;
        else winner = b;
        return winner;
    }

    public static Player comparethreePP(Player a, Player b) {
        Player winner;
        if(a.threePP > b.threePP) winner = a;
        else winner = b;
        return winner;
    }

    public static Player comparetwoP(Player a, Player b) {
        Player winner;
        if(a.twoP > b.twoP) winner = a;
        else winner = b;
        return winner;
    }

    public static Player comparetwoPA(Player a, Player b) {
        Player winner;
        if(a.twoPA > b.twoPA) winner = a;
        else winner = b;
        return winner;
    }

    public static Player comparetwoPP(Player a, Player b) {
        Player winner;
        if(a.twoPP > b.twoPP) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareeFG(Player a, Player b) {
        Player winner;
        if(a.eFG > b.eFG) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareFT(Player a, Player b) {
        Player winner;
        if(a.FT > b.FT) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareFTA(Player a, Player b) {
        Player winner;
        if(a.FTA > b.FTA) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareFTP(Player a, Player b) {
        Player winner;
        if(a.FTP > b.FTP) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareORB(Player a, Player b) {
        Player winner;
        if(a.ORB > b.ORB) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareDRB(Player a, Player b) {
        Player winner;
        if(a.DRB > b.DRB) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareTRB(Player a, Player b) {
        Player winner;
        if(a.TRB > b.TRB) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareAST(Player a, Player b) {
        Player winner;
        if(a.AST > b.AST) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareSTL(Player a, Player b) {
        Player winner;
        if(a.STL > b.STL) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareBLK(Player a, Player b) {
        Player winner;
        if(a.BLK > b.BLK) winner = a;
        else winner = b;
        return winner;
    }

    public static Player compareTOV(Player a, Player b) {
        Player winner;
        if(a.TOV > b.TOV) winner = a;
        else winner = b;
        return winner;
    }

    public static Player comparePF(Player a, Player b) {
        Player winner;
        if(a.PF > b.PF) winner = a;
        else winner = b;
        return winner;
    }

    public static Player comparePTS(Player a, Player b) {
        Player winner;
        if(a.PTS > b.PTS) winner = a;
        else winner = b;
        return winner;
    }

    //more complex comparisons

    //a generalized efficiency stat taking effective field goal percentage with other stats
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

    //how many ____ would they get in ____ minutes?

}
