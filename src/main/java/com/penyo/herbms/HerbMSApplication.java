package com.penyo.herbms;

import com.penyo.herbms.util.Bootloader;

/**
 * 整个应用程序从这里启动。
 * 
 * @author Penyo
 */
public class HerbMSApplication {
  public static void main(String[] args) {
    Bootloader.boot("0.0.2");
  }
}