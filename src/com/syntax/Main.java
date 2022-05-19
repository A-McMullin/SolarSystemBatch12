package com.syntax;

public class Main {
    public static void main(String[] args) {
        // write your code here
        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Star="10000";

        FeatureSun xFact = new FeatureSun();
        xFact.Color = "green";
        xFact.Heat  = "1500000000F";
        xFact.Radius = "654818098138M";

        Stars star = new Stars();
        star.stars = "100000";

        Planet2 norway = new Planet2();
        norway.color = "green";
        norway.size = "8420234234M";
        norway.name = "death star";
    }
}


