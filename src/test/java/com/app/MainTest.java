package com.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
  @Test
  void testAppStatus() {
    Main app = new Main();
    assertEquals("Running", app.getAppStatus());
  }
}