package hu.petrik.emberekoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emberek {
    private List<Ember> emberek;

    public Emberek(Ember[] emberTomb){
        this.emberek = new ArrayList<>();
        this.emberek.addAll(Arrays.asList(emberTomb));
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(String.format("%30s %10s %20s (%3s év)","Név", "Szül.dátum","Szül.hely", "Kor" ));
        for (int i = 0; i<this.emberek.size(); i++){
            s.append(System.lineSeparator()).append(this.emberek.get(i));
        }
        return s.toString();
    }
}
