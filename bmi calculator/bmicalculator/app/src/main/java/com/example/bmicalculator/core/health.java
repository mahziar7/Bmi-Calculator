package com.example.bmicalculator.core;

public class health {
    private String errormessages;
    private String getErrormessages;

    public double calculatorBmi(double heightcm, double weightKG) {
        double bmiIndex = -1;
        if (heightcm <= 0 && weightKG <= 0) {
            errormessages = "vazn va ghad nemitavannad kamtar az sefr ya yek bashand";
        } else {
            bmiIndex = weightKG / ((heightcm / 100) * (heightcm / 100));
        }
        return bmiIndex;
    }

    public String determinecategory(double bmiIndex) {
        String bmicategory = "";
        if (bmiIndex < 16) {
            bmicategory = "severe Thinness";
        } else if (bmiIndex >= 17 && bmiIndex < 18.5) {
            bmicategory = "mild thinness";
        } else if (bmiIndex >= 18.5 && bmiIndex < 25) {
            bmicategory = "Normal";
        } else if (bmiIndex >= 25 && bmiIndex < 30) {
            bmicategory = "overWeight";
        } else if (bmiIndex >= 30 && bmiIndex < 35) {
            bmicategory = "obese class I";
        } else if (bmiIndex >= 35 && bmiIndex < 40) {
            bmicategory = "obese class II";
        } else if (bmiIndex >= 40) {
            bmicategory = "obese class III";
        }
        return bmicategory;
    }
}
