
package com.example;

import hu.szit.resclient.ResClient;

public class Delete {
    public static void main(String[] args) {
        String url = "http://localhost:8000/api/employees";
        ResClient client = new ResClient();

        client.delete(url + "/" + 8);
    }
}