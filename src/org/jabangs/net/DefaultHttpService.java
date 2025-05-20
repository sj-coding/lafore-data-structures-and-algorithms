package org.jabangs.net;

import java.io.IOException;

public class DefaultHttpService implements HttpService {

    @Override
    public String get(String url) throws IOException {
        // Simulate fetching data without making actual HTTP calls
        return "Successfully fetched data from " + url;
    }
}
