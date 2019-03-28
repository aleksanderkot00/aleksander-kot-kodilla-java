package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"123131", "Aleksander", "Kot"},
            {"234633", "Wojciech", "Szczesny"},
            {"934282", "Kamil", "Glik"},
            {"141231", "Jan", "Bdnarek"},
            {"143535", "Bartosz", "Bereszynski"}
    };
    private double[] salareis = {
            12332.11,
            23422.00,
            456456.44,
            345353.33,
            234444.44
    };

    public String getWorker(int n) {
        if (n > salareis.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][1] + ", " + salareis[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalareis() {
        return salareis;
    }
}
