package com.app;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
  public static void main(String[] args) {
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
    System.out.println("=== Ứng dụng To-Do List đã khởi động ===");
    System.out.println("Trạng thái: Sẵn sàng thực thi mà không cần IDE.");
  }

  public String getAppStatus() {
    return "Running";
  }
}