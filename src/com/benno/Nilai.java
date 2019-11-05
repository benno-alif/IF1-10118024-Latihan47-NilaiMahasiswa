package com.benno;

public class Nilai {
    private int quiz, uts, uas;

    public Nilai(int quiz, int uts, int uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getUts() {
        return uts;
    }

    public int getUas() {
        return uas;
    }

    public float nilaiAkhir(){
        return (float) ((0.2 * quiz) + (0.3 * uts) + (0.5 * uas));
    }

    public char index(float na){
        char id = 'A';
        if (na >= 80 && na <= 100){
            id = 'A';
        } else if (na >= 68 && na < 80){
            id = 'B';
        } else if (na >= 56 && na < 68){
            id = 'C';
        } else if (na >= 45 && na < 56){
            id = 'D';
        } else if (na >= 0 && na < 45){
            id = 'E';
        }
        return id;
    }

    public String keterangan(char index){
        String ket;

        switch (index){
            case 'A' : ket = "Sangat Baik";
                break;
            case 'B' : ket = "Baik";
                break;
            case 'C' : ket = "Cukup";
                break;
            case 'D' : ket = "Kurang";
                break;
            case 'E' : ket = "Sangat Kurang";
                break;
            default:
                ket = "Index tidak valid";
        }
        return ket;
    }
}