package org.jabangs.net;

import java.io.IOException;
// Removed placeholder HttpService interface

// Import the formal HttpService interface
import org.jabangs.net.HttpService;

public class DataFetcher {
    private final HttpService httpService;

    public DataFetcher(HttpService httpService) {
        this.httpService = httpService;
    }

    public String fetchData(String url) {
        try {
            return this.httpService.get(url);
        } catch (IOException e) {
            // Handle exception, e.g., log it or return a specific error message
            return "Error fetching data: " + e.getMessage();
        }
    }
}
