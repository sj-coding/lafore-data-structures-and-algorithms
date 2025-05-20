package org.jabangs.net;

import java.io.IOException;

public interface HttpService {
    String get(String url) throws IOException;
}
