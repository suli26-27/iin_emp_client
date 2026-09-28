package com.example;

import java.util.ArrayList;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class Main {
    public static void main(String[] args) {
        System.out.println("REST API elérés...");

        String url = "http://localhost:8000/api/employees";
        ResClient client = new ResClient();
        String json = client.get(url);
        

        EmployeeListResponse res = ResConvert.toObject(json, EmployeeListResponse.class);
        // System.out.println(res.data);
        ArrayList<Employee> empList = res.data;
        empList.forEach(emp -> {
            System.out.println(emp.getName());
        });
    }
}