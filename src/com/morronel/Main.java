package com.morronel;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<String, String>();

	map.put("matti", "mage");
	map.put("mikael", "mixu");
	map.put("arto", "arppa");

        System.out.println(map.get("matti"));
    }
}
