package com.company.http;

import java.util.Map;

public interface HTTPAdapter {
    void post(String URL, Map<String, Object> dados);
}
