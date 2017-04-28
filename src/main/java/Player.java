package com.company;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.HashMap;

/**
 * Created by franklong on 4/22/17.
 */

//TODO "set up all the shit method" that creates Player objects make the hashmap of players, take in CSV here or somewhere else
public class Player {

    public enum Stats {
        MP, FG, FGA, FGP, threeP, threePA, threePP, twoP, twoPA, twoPP, eFG, FT, FTA, FTP, ORB, DRB, TRB, AST, STL, BLK, TOV, PF, PTS
    }

    public String name;

    //standard counting stats
    //MP	FG	FGA	FG%	3P	3PA	3P%	2P	2PA	2P%	eFG%	FT	FTA	FT%	ORB	DRB	TRB	AST	STL	BLK	TOV	PF	PTS
    public double MP;
    public double FG;
    public double FGA;
    public double FGP;
    public double threeP;
    public double threePA;
    public double threePP;
    public double twoP;
    public double twoPA;
    public double twoPP;
    public double eFG;
    public double FT;
    public double FTA;
    public double FTP;
    public double ORB;
    public double DRB;
    public double TRB;
    public double AST;
    public double STL;
    public double BLK;
    public double TOV;
    public double PF;
    public double PTS;

    public Player()  {
    }

    public Player (File f) throws IOException {
        FileInputStream fis = new FileInputStream(f);
        //Note smh this only works with 1997-2003 excel docs .xls
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheetAt(1);
        Row row = sheet.getRow(0);

        Cell MPCell = row.getCell(0);
        MP = MPCell.getNumericCellValue();

        Cell FGCell = row.getCell(1);
        FG = FGCell.getNumericCellValue();

        Cell FGACell = row.getCell(2);
        FGA = FGACell.getNumericCellValue();

        Cell FGPCell = row.getCell(3);
        FGP = FGPCell.getNumericCellValue();

        Cell threePCell = row.getCell(4);
        threeP = threePCell.getNumericCellValue();

        Cell threePACell = row.getCell(5);
        threePA = threePACell.getNumericCellValue();

        Cell threePPCell = row.getCell(6);
        threePP = threePPCell.getNumericCellValue();

        Cell twoPCell = row.getCell(7);
        twoP = twoPCell.getNumericCellValue();

        Cell twoPACell = row.getCell(8);
        twoPA = twoPACell.getNumericCellValue();

        Cell twoPPCell = row.getCell(9);
        twoPP = twoPPCell.getNumericCellValue();

        Cell eFGCell = row.getCell(10);
        eFG = eFGCell.getNumericCellValue();

        Cell FTCell = row.getCell(11);
        FT = FTCell.getNumericCellValue();

        Cell FTACell = row.getCell(12);
        FTA = FTACell.getNumericCellValue();

        Cell FTPCell = row.getCell(13);
        FTP = FTPCell.getNumericCellValue();

        Cell ORBCell = row.getCell(14);
        ORB = ORBCell.getNumericCellValue();

        Cell DRBCell = row.getCell(15);
        DRB = DRBCell.getNumericCellValue();

        Cell TRBCell = row.getCell(16);
        TRB = TRBCell.getNumericCellValue();

        Cell ASTCell = row.getCell(17);
        AST = ASTCell.getNumericCellValue();

        Cell STLCell = row.getCell(18);
        STL = STLCell.getNumericCellValue();

        Cell BLKCell = row.getCell(19);
        BLK = BLKCell.getNumericCellValue();

        Cell TOVCell = row.getCell(20);
        TOV = TOVCell.getNumericCellValue();

        Cell PFCell = row.getCell(21);
        PF = PFCell.getNumericCellValue();

        Cell PTSCell = row.getCell(22);
        PTS = PTSCell.getNumericCellValue();

        Cell NameCell = row.getCell(23);
        name = NameCell.getStringCellValue();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(name);
        s.append(": ");

        s.append("FG: ");
        s.append(FG);
        s.append(", ");

        s.append("FGA: ");
        s.append(FGA);
        s.append(", ");

        s.append("FGP: ");
        s.append(FGP);
        s.append(", ");

        s.append("threeP: ");
        s.append(threeP);
        s.append(", ");

        s.append("threePA: ");
        s.append(threePA);
        s.append(", ");

        s.append("threePP: ");
        s.append(threePP);
        s.append(", ");

        s.append("twoP: ");
        s.append(twoP);
        s.append(", ");

        s.append("twoPA: ");
        s.append(twoPA);
        s.append(", ");

        s.append("twoPP: ");
        s.append(twoPP);
        s.append(", ");

        s.append("eFG: ");
        s.append(eFG);
        s.append(", ");

        s.append("FT: ");
        s.append(FT);
        s.append(", ");

        s.append("FTA: ");
        s.append(FTA);
        s.append(", ");

        s.append("FTP: ");
        s.append(FTP);
        s.append(", ");

        s.append("ORB: ");
        s.append(ORB);
        s.append(", ");

        s.append("DRB: ");
        s.append(DRB);
        s.append(", ");

        s.append("TRB: ");
        s.append(TRB);
        s.append(", ");

        s.append("AST: ");
        s.append(AST);
        s.append(", ");

        s.append("STL: ");
        s.append(STL);
        s.append(", ");

        s.append("BLK: ");
        s.append(BLK);
        s.append(", ");

        s.append("TOV: ");
        s.append(TOV);
        s.append(", ");

        s.append("PF: ");
        s.append(PF);
        s.append(", ");

        s.append("PTS: ");
        s.append(PTS);
        s.append(", ");

        return s.toString();
    }

    public static HashMap<String, Player> readInPlayers() throws IOException {
        HashMap<String,Player> playerDatabase =new HashMap<String, Player>();
        File resFolder = new File("./res");

        for(File child : resFolder.listFiles()) {
            Player p = new Player(child);
            playerDatabase.put(p.name, p);
        }
        return playerDatabase;
    }
}
