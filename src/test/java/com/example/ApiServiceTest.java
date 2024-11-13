package com.example;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    public void testFetchData() throws IOException {
        ApiService apiService = mock(ApiService.class);

        when(apiService.fetchData("http://example.com")).thenReturn(200);

        int responseCode = apiService.fetchData("http://example.com");
        assertEquals(200, responseCode);
    }
}
