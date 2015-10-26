package com.example.casey.assignment6b.colordata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ColorContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<ColorItem> ITEMS = new ArrayList<ColorItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, ColorItem> ITEM_MAP = new HashMap<String, ColorItem>();

    static {
        // Add 2 colors
        addItem(new ColorItem("1", "Blue"));
        addItem(new ColorItem("2", "Green"));

    }

    private static void addItem(ColorItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ColorItem {
        public String id;
        public String content;

        public ColorItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
