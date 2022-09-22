package hu.petrik.emberekoop;

import java.time.LocalDate;
import java.util.Date;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }
    public int getSzuletesiEv(){
        return Integer.parseInt(this.szulDatum.substring(0,4));
    }
    public int getSzulHonap(){
        String[] szuletesiAdatok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[1]);
    }
    public int getSzulNap(){
        String[] szuletesiAdatok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdatok[2]);
    }

    public int getEletkor(){
        return LocalDate.now().getYear() - this.getSzuletesiEv();
    }

    @Override
    public String toString() {
        return String.format("%30s %10s %20s (%3d év)", this.nev, this.szulDatum,this.szulHely, this.getEletkor());
    }
}
