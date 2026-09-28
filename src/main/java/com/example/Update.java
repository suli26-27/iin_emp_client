package com.example;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class Update {
    public static void main(String[] args) {
        String url = "http://localhost:8000/api/employees";
        ResClient client = new ResClient();

        Employee emp = new Employee(7, "Tar Gábor", "Hatvan", 392, 3);
        String json = ResConvert.toJson(emp);
        System.out.println(json);
        client.put(url + "/" + emp.getId(), json);
    }
    
}
