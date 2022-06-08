package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private Contractor contractor;
    private String product;
    private int quantity;


    public OrderDTO buyProcess(String contractorName, OrderDTO orderDTO) {

        CollectionContractors collectionContractors = new CollectionContractors();
        Contractor contractor = collectionContractors.getContractor(contractorName);
        
        contractor.orderList();


        if (contractor != null && contractor.getContractorName() != "") {
            System.out.println("Dziękuje, właśnie złożyłeś zamówienie w " + contractor.getContractorName() + ". Zamówiłeś  " + orderDTO.productName + " w następującej ilości " + orderDTO.productQuantity);
            contractor.process();
            return new OrderDTO("Bagietka", 30);
        } else {
            System.out.println("The order process crashed. Please select the right contractor.");
            return null;
        }

    }
}
