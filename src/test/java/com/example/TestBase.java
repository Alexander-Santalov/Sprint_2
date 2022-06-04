package com.example;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

public class TestBase {
    @Before
    public void initMocks() throws Exception {
        MockitoAnnotations.openMocks(this).close();
    }
}
