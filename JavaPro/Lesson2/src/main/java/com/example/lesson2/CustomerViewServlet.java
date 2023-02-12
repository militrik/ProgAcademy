package com.example.lesson2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@WebServlet(name = "Customers", value = "/getCustomers")
public class CustomerViewServlet extends HttpServlet {

    private List<Customer> customerList = new ArrayList<>(List.of(
            new Customer("Alex", "Brown", 21, Customer.Gender.MALE, 56),
            new Customer("Nona", "Yellow", 18, Customer.Gender.FEMALE, 78),
            new Customer("Gerbert", "White", 55, Customer.Gender.MALE, 32),
            new Customer("Lusia", "Green", 35, Customer.Gender.FEMALE, 89),
            new Customer("Buba", "Blue", 43, Customer.Gender.OTHER, 45),
            new Customer("Boba", "Indigo", 29, Customer.Gender.OTHER, 21),
            new Customer("Mike", "Black", 38, Customer.Gender.MALE, 14),
            new Customer("Rita", "Red", 60, Customer.Gender.FEMALE, 88),
            new Customer("Alex", "Violet", 20, Customer.Gender.FEMALE, 32)
    ));

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", getCustomerTable(request.getParameterMap()));
        request.getRequestDispatcher("/customers.jsp").forward(request, response);
    }

    private List<Customer> getCustomerTable(Map<String, String[]> parametrs) {

        String[] sortMethod = parametrs.get("sortingMethod");
        if (sortMethod != null) {
            List<String> headerFields = Arrays.asList(Customer.class.getDeclaredFields())
                    .stream().map(Field::getName).collect(Collectors.toList());

            customerList.sort(Comparator.comparing(Customer::getName).thenComparing(Customer::getAge));
        }
        return customerList;
    }


    public void destroy() {
    }
}