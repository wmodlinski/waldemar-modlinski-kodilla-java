package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Contractor implements OrderInterface {

    private String contractorName;
    private String isContractorAvaible;

    public Contractor(String contractorName) {
        this.contractorName = contractorName;
    }

    public String getContractorName() {
        return contractorName;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "contractorName='" + contractorName + '\'' +
                '}';
    }

    public String welcomeToTheShop() {
        if (contractorName != "" && contractorName != null) {
            isContractorAvaible = "Dziękuje za zamówienie! Pozdrawiamy: " + contractorName;
        } else {
            isContractorAvaible = "Przepraszamy, ten dostawca jeszcze nie współpracuje z nami!";
        }
        System.out.println(isContractorAvaible);
        return isContractorAvaible;
    }

    @Override
    public String process() {

        if (contractorName != "" && contractorName != null) {
            isContractorAvaible = "Dziękuje za zamówienie! Pozdrawiam: " + contractorName;
        } else {
            isContractorAvaible = "Przepraszamy, ten dostawca jeszcze nie współpracuje z nami!";
        }
        System.out.println(isContractorAvaible);
        return isContractorAvaible;
    }

    @Override
    public List orderList() {
        return null;
    }
}
