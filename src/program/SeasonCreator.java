package program;

import elements.Driver;
import elements.Team;
import elements.TeamPrinciple;

import pitbox.PitboxNewSeason;

public class SeasonCreator {


    public SeasonCreator() {
        //Red Bull
        Driver maxVer = new Driver("Max", "Verstappen", 33);
        Driver sergioPer = new Driver("Sergio", "Perez", 13);
        TeamPrinciple christianHor = new TeamPrinciple("Christian", "Horner", 47);
        Team redBull = new Team("Red Bull", 2005, 1, 1, christianHor, maxVer, sergioPer);

        //Mercedes
        Driver lewisHam = new Driver("Lewis", "Hamilton", 44);
        Driver georgeRus = new Driver("George", "Russel", 63);
        TeamPrinciple totoWolf = new TeamPrinciple("Toto", "Wolf", 49);
        Team mercedes = new Team("Mercedes", 2010, 1, 1, totoWolf, lewisHam, georgeRus);

        //Ferrari
        Driver charlesLec = new Driver("Charles", "Leclerc", 16);
        Driver carlosSai = new Driver("Carlos", "Sainz", 55);
        TeamPrinciple mattiaBin = new TeamPrinciple("Mattia", "Binotto", 51);
        Team ferrari = new Team("Ferrari", 1950, 1, 1, mattiaBin, charlesLec, carlosSai);

        //McLaren
        Driver landoNor = new Driver("Lando", "Norris", 4);
        Driver oscarPia = new Driver("Oscar", "Piastri", 31);
        TeamPrinciple andreasSei = new TeamPrinciple("Andreas", "Seidl", 45);
        Team mclaren = new Team("McLaren", 1966, 1, 1, andreasSei, landoNor, oscarPia);

        //Alpine
        Driver pierreGas = new Driver("Pierre", "Gasly", 10);
        Driver estebanOco = new Driver("Esteban", "Ocon", 31);
        TeamPrinciple marcinBud = new TeamPrinciple("Marcin", "Budkowski", 45);
        Team alpine = new Team("Alpine", 1977, 1, 1, marcinBud, pierreGas, estebanOco);

        //AlphaTauri
        Driver yukiTsu = new Driver("Yuki", "Tsunoda", 22);
        Driver danielRic = new Driver("Daniel", "Ricciardo", 3);
        TeamPrinciple franzTos = new TeamPrinciple("Franz", "Tost", 65);
        Team alphaTauri = new Team("AlphaTauri", 2006, 1, 1, franzTos, yukiTsu, danielRic);

        //Aston Martin
        Driver fernandoAlo = new Driver("Fernando", "Alonso", 14);
        Driver lanceStr = new Driver("Lance", "Stroll", 18);
        TeamPrinciple otmarSzaf = new TeamPrinciple("Otmar", "Szafnauer", 57);
        Team astonMartin = new Team("Aston Martin", 2018, 1, 1, otmarSzaf, fernandoAlo, lanceStr);

        //Alfa Romeo
        Driver valteriBot = new Driver("Valteri", "Bottas", 77);
        Driver gyanuZhou = new Driver("Gyanu", "Zhou", 47);
        TeamPrinciple fredVas = new TeamPrinciple("Fred", "Vasseur", 53);
        Team alfaRomeo = new Team("Alfa Romeo", 2019, 1, 1, fredVas, valteriBot, gyanuZhou);

        //Williams
        Driver alexAlb = new Driver("Alex", "Albon", 23);
        Driver loganSar = new Driver("Logan", "Sargeant", 88);
        TeamPrinciple jostCap = new TeamPrinciple("Jost", "Capito", 62);
        Team williams = new Team("Williams", 1977, 1, 1, jostCap, alexAlb, loganSar);

        //Haas
        Driver kevinMag = new Driver("Kevin", "Magnussen", 20);
        Driver nikoHul = new Driver("Niko", "Hulkenberg", 27);
        TeamPrinciple guntherSte = new TeamPrinciple("Gunther", "Steiner", 56);
        Team haas = new Team("Haas", 2016, 1, 1, guntherSte, kevinMag, nikoHul);

        Team[] teams =
            {redBull, mercedes, ferrari, mclaren, alpine, alphaTauri, astonMartin, alfaRomeo, williams, haas};

        SeasonCreator newSeason = new SeasonCreator(teams);
    }

    public SeasonCreator(Team[] teams) {
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < teams.length - 1; j++)
                teams[j].setTeamPoints(Math.random() * 100);
        }
        for (int i = 0; i < teams.length - 1; i++) {

            System.out.println("Team " + teams[i].getTeamName() + " has " + teams[i].getTeamPoints() + " points.");
        }

        PitboxNewSeason pitboxNewSeason = new PitboxNewSeason(teams);
    }

}
