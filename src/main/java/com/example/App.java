package com.example;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class App {
    public static void main(String[] args) {
        String url = "http://localhost:8000/api/employees";
        ResClient client = new ResClient();

        SimpleEmployee emp = new SimpleEmployee("Réteg Ferenc", "Pécs", 398, 1);
        String json = ResConvert.toJson(emp);
        System.out.println(json);
        // String json = "{\"name\":\"Lapos Árpád\"}";
        client.post(url, json);
    }
}
