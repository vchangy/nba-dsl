package com.company;

/**
 * Created by franklong on 4/22/17.
 */
public class Comparisons {
    //TODO this is a less dumb version that I should probably figure out, still some jank but it works
    public static Player compareBasicStat(Player a, Player b, String stat) throws IllegalArgumentException {
        double aStat = 0;
        double bStat = 0;
        Player winner;

        if(stat.equals("PTS")) {
            aStat = a.PTS;
            bStat = b.PTS;
        }

        else if (stat.equals("MP")) {
            aStat = a.MP;
            bStat = b.MP;
        }

        else if (stat.equals("FG")) {
            aStat = a.FG;
            bStat = b.FG;
        }

        else if (stat.equals("FGA")) {
            aStat = a.FGA;
            bStat = b.FGA;
        }

        else if (stat.equals("FGP")) {
            aStat = a.FGP;
            bStat = b.FGP;
        }

        else if (stat.equals("threeP")) {
            aStat = a.threeP;
            bStat = b.threeP;
        }

        else if (stat.equals("threePA")) {
            aStat = a.threePA;
            bStat = b.threePA;
        }

        else if (stat.equals("threePP")) {
            aStat = a.threePP;
            bStat = b.threePP;
        }

        else if (stat.equals("twoP")) {
            aStat = a.twoP;
            bStat = b.twoP;
        }

        else if (stat.equals("twoPP")) {
            aStat = a.twoPP;
            bStat = b.twoPP;
        }

        else if (stat.equals("eFG")) {
            aStat = a.eFG;
            bStat = b.eFG;
        }

        else if (stat.equals("FT")) {
            aStat = a.FT;
            bStat = b.FT;
        }

        else if (stat.equals("FTA")) {
            aStat = a.FTA;
            bStat = b.FTA;
        }

        else if (stat.equals("FTP")) {
            aStat = a.FTP;
            bStat = b.FTP;
        }

        else if (stat.equals("ORB")) {
            aStat = a.ORB;
            bStat = b.ORB;
        }

        else if (stat.equals("DRB")) {
            aStat = a.DRB;
            bStat = b.DRB;
        }

        else if (stat.equals("TRB")) {
            aStat = a.TRB;
            bStat = b.TRB;
        }

        else if (stat.equals("AST")) {
            aStat = a.AST;
            bStat = b.AST;
        }

        else if (stat.equals("STL")) {
            aStat = a.STL;
            bStat = b.STL;
        }

        else if (stat.equals("BLK")) {
            aStat = a.BLK;
            bStat = b.BLK;
        }

        else if (stat.equals("TOV")) {
            aStat = a.TOV;
            bStat = b.TOV;
        }

        else if (stat.equals("PF")) {
            aStat = a.PF;
            bStat = b.PF;
        }

        else if (stat.equals("PTS")) {
            aStat = a.PTS;
            bStat = b.PTS;
        }
        else throw new IllegalArgumentException("not a supported stat");

        if(aStat > bStat) winner = a;
        else winner = b;
        if (aStat != 0 && bStat != 0)return winner;
        else return new Player();
    }

    //

    //what if <Player> played X minutes, how many points?
    //TODO other categories
    public static double whatIfPoints(Player a, double minutes, String stat) {

        double aStat;

        if(stat.equals("PTS"))  aStat = a.PTS;

        else if (stat.equals("MP")) aStat = a.MP;

        else if (stat.equals("FG")) aStat = a.FG;

        else if (stat.equals("FGA")) aStat = a.FGA;

        else if (stat.equals("FGP")) aStat = a.FGP;

        else if (stat.equals("threeP")) aStat = a.threeP;

        else if (stat.equals("threePA")) aStat = a.threePA;

        else if (stat.equals("threePP")) aStat = a.threePP;

        else if (stat.equals("twoP")) aStat = a.twoP;

        else if (stat.equals("twoPP")) aStat = a.twoPP;

        else if (stat.equals("eFG")) aStat = a.eFG;

        else if (stat.equals("FT")) aStat = a.FT;

        else if (stat.equals("FTA")) aStat = a.FTA;

        else if (stat.equals("FTP"))  aStat = a.FTP;

        else if (stat.equals("ORB")) aStat = a.ORB;

        else if (stat.equals("DRB")) aStat = a.DRB;

        else if (stat.equals("TRB")) aStat = a.TRB;

        else if (stat.equals("AST")) aStat = a.AST;

        else if (stat.equals("STL")) aStat = a.STL;

        else if (stat.equals("BLK")) aStat = a.BLK;

        else if (stat.equals("TOV")) aStat = a.TOV;

        else if (stat.equals("PF")) aStat = a.PF;

        else if (stat.equals("PTS")) aStat = a.PTS;

        else throw new IllegalArgumentException("not a supported stat");

        return aStat / a.MP * minutes;
    }


    //weighted comparison based on the 3 main categories
    public static Player betterPlayer(Player aplayer, Player bplayer, double ptsWeight, double rebWeight, double astWeight) {
        Player winner;
        double aScore = aplayer.PTS*ptsWeight + aplayer.TRB*rebWeight + aplayer.AST+astWeight;
        double bScore = bplayer.PTS*ptsWeight + bplayer.TRB*rebWeight + bplayer.AST+astWeight;
        if(aScore > bScore) winner = aplayer;
        else winner = bplayer;
        return winner;
    }
}
