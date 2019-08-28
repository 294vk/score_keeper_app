package com.example.android.CRICKET_SCORE_KEEPER;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.CRICKET_SCORE_KEEPER.R;

public class MainActivity<runsb> extends AppCompatActivity {
    int aruns = 0;
    int wkta = 0;
    int ovra = 0;
    int bruns = 0;
    int wktb = 0;
    int ovrb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int scorea) {
        TextView scoreView = findViewById(R.id.run_a);
        scoreView.setText("RUN   " + scorea);
    }

    public void displayForTeamAA(int scorea) {
        TextView scoreView = (TextView) findViewById(R.id.wicket_aa);
        scoreView.setText("WICKETS  : " + scorea);
    }

    public void displayForTeamAAA(int scorea) {
        TextView scoreView = (TextView) findViewById(R.id.over_a);
        scoreView.setText("OVERS  :" + scorea);
    }

    public void displayForTeamB(int scoreb) {
        TextView scoreView = (TextView) findViewById(R.id.run_b);
        scoreView.setText("RUNS  : " + scoreb);
    }

    public void displayForTeamBB(int scorea) {
        TextView scoreView = (TextView) findViewById(R.id.wicket_bb);
        scoreView.setText("WICKETS  : " + scorea);
    }

    @SuppressLint("SetTextI18n")
    public void displayForTeamBBB(int scorea) {
        TextView scoreView = (TextView) findViewById(R.id.over_b);
        scoreView.setText("OVERS  : " + scorea);
    }

    public void wicketa(View view) {
        if (wkta <= 10)
            wkta += 1;
        displayForTeamAA(wkta);
    }

    public void basix(View view) {
        aruns += 6;
        displayForTeamA(aruns);
    }

    public void bafour(View view) {
        aruns += 4;
        displayForTeamA(aruns);
    }

    public void bathree(View view) {
        aruns += 3;
        displayForTeamA(aruns);
    }

    public void batwo(View view) {
        aruns += 2;
        displayForTeamA(aruns);
    }

    public void baone(View view) {
        aruns += 1;
        displayForTeamA(aruns);
    }

    public void nbaone(View view) {
        aruns += 1;
        displayForTeamA(aruns);
    }

    public void waone(View view) {
        aruns += 1;
        displayForTeamA(aruns);
    }

    public void exaone(View view) {
        aruns += 1;
        displayForTeamA(aruns);
    }

    public void exafour(View view) {
        aruns += 4;
        displayForTeamA(aruns);
    }

    public void exathree(View view) {
        aruns += 3;
        displayForTeamA(aruns);
    }

    public void exatwo(View view) {
        aruns += 2;
        displayForTeamA(aruns);
    }

    public void overa(View view) {
        ovra += 1;
        displayForTeamAAA(ovra);
    }

    public void bbsix(View view) {
        bruns += 6;
        displayForTeamB(bruns);
    }

    public void bbfour(View view) {
        bruns += 4;
        displayForTeamB(bruns);
    }

    public void bbthree(View view) {
        bruns += 3;
        displayForTeamB(bruns);
    }

    public void bbtwo(View view) {
        bruns += 6;
        displayForTeamB(bruns);
    }

    public void bbone(View view) {
        bruns += 1;
        displayForTeamB(bruns);
    }

    public void nbbone(View view) {
        bruns += 1;
        displayForTeamB(bruns);
    }

    public void wbone(View view) {
        bruns += 1;
        displayForTeamB(bruns);
    }

    public void exbone(View view) {
        bruns += 1;
        displayForTeamB(bruns);
    }

    public void exbthree(View view) {
        bruns += 3;
        displayForTeamB(bruns);
    }

    public void exbfour(View view) {
        bruns += 4;
        displayForTeamB(bruns);
    }

    public void exbtwo(View view) {
        bruns += 2;
        displayForTeamB(bruns);
    }

    public void overb(View view) {
        ovrb += 1;
        displayForTeamBBB(ovrb);
    }

    public void wicketb(View view) {
        if (wktb <= 10)
            wktb += 1;
        displayForTeamBB(wktb);
    }

    public void reset(View view) {
        bruns = 0;
        displayForTeamB(bruns);
        aruns = 0;
        displayForTeamA(aruns);
        ovra = 0;
        displayForTeamAAA(ovra);
        ovrb = 0;
        displayForTeamBBB(ovrb);
        wktb = 0;
        displayForTeamBB(wktb);
        wkta = 0;
        displayForTeamAA(wkta);
    }
}
