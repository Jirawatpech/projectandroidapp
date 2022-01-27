package com.e.jirawat.correct_word;

public class Question {
    public Integer imq[] = {
            R.drawable.imq_1, R.drawable.imq_2, R.drawable.imq_3, R.drawable.imq_4, R.drawable.imq_5
            ,R.drawable.imq_6};
    public String Answer[][] = {
            {"ผัดกะเพรา", "ผัดกระเพรา"},
            {"แกงพะแนง", "ผแกงพแนง"},
            {"ศรีษะ", "ศีรษะ"},
            {"ลำใย", "ลำไย"},
            {"สับปรส", "สับปะรด"},
            {"แอปพลิเคชัน", "แอพพลิเคชัน"},
            {"ผัดไท", "ผัดไทย"},

    };

    public String correctans[] = {"ผัดกะเพรา", "แกงพะแนง", "ศีรษะ", "ลำไย", "สับปะรด","แอปพลิเคชัน", "ผัดไทย"};
    public Integer getquiz (int a){
        Integer quiz = imq[a];
        return quiz;
    }
    public String getans (int a){
        String ans = Answer[a][0];
        return ans;
    }
    public String getans2 (int a){
        String ans = Answer[a][1];
        return ans;
    }
    public String getCorans (int a){
        String corans = correctans[a];
        return corans;
    }
}