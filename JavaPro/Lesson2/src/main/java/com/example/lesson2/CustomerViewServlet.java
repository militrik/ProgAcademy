package com.example.lesson2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@WebServlet(name = "Customers", value = "/getCustomers")
public class CustomerViewServlet extends HttpServlet {

    private List<Customer> customerList = new ArrayList<>(List.of(
            new Customer("Alex", "Brown", 21, Customer.Gender.MALE, 56),
            new Customer("Nona", "Yellow", 18, Customer.Gender.FEMALE, 78),
            new Customer("Gerbert", "White", 55, Customer.Gender.MALE, 32),
            new Customer("Lusia", "Green", 35, Customer.Gender.FEMALE, 89),
            new Customer("Buba", "Blue", 29, Customer.Gender.OTHER, 45),
            new Customer("Boba", "Indigo", 29, Customer.Gender.OTHER, 21),
            new Customer("Mike", "Black", 38, Customer.Gender.MALE, 14),
            new Customer("Rita", "Red", 60, Customer.Gender.FEMALE, 88),
            new Customer("Alex", "Violet", 20, Customer.Gender.FEMALE, 32)
    ));

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            request.setAttribute("customerList", getCustomerTable(request.getParameterMap()));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        request.getRequestDispatcher("/customers.jsp").forward(request, response);

    }

    private List<Customer> getCustomerTable(Map<String, String[]> parametrs) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {

        String[] sortMethods = parametrs.get("sortBy");
        List<Comparator<Customer>> comparators = new ArrayList<>();
        if (sortMethods != null) {
            for (var sortMethod : sortMethods
            ) {
                Method method = Customer.class.getMethod(sortMethod);
                Comparator<Customer> comparing = Comparator.comparing(customer -> {
                    try {
                        return method.invoke(customer) + "";
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                });
                comparators.add(comparing);
            }
            Comparator<Customer> someDefaultComparator = null;
            Comparator<Customer> combined = comparators.stream()
                    .reduce(Comparator::thenComparing)
                    .orElse(null);

            customerList.sort(combined);
        }
        return customerList;
    }


    public void destroy() {
    }
}