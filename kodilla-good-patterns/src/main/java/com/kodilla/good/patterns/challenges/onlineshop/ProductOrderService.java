package com.kodilla.good.patterns.challenges.onlineshop;

import com.kodilla.good.patterns.challenges.onlineshop.InformationService;
import com.kodilla.good.patterns.challenges.onlineshop.OrderRepository;
import com.kodilla.good.patterns.challenges.onlineshop.OrderService;

public class ProductOrderService {

    //private MailService mailService; //Klasa z powiadomieniami do klienta
    //private OrderService orderService; //Zrobienie zakupów, produkt i jego ilość
    //private OrderRepository orderRepository; //Dostępność w magazynie tego produktu

    //public ProductOrderService(final MailService mailService,
                               //final OrderService orderService,
                               //final OrderRepository orderRepository) {
        //this.mailService = mailService;
        //this.orderService = orderService;
       // this.orderRepository = orderRepository;
    //}

    //public RentalDto process(final RentRequest rentRequest) {
        //boolean isRented = orderService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                //rentRequest.getTo());

        //if (isRented) {
            //informationService.inform(rentRequest.getUser());
            //orderRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            //return new RentalDto(rentRequest.getUser(), true);
        //} else {
            //return new RentalDto(rentRequest.getUser(), false);
        //}
    //}
}
