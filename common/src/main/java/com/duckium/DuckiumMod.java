package com.duckium;

import com.duckium.items.DuckiumItems;
import com.duckium.tabs.DuckiumTabs;

import java.util.logging.Logger;

public final class DuckiumMod {
    public static final String MOD_ID = "duckium";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    public static void init() {
        LOGGER.info("duckium initialized!!!");
        DuckiumTabs.init();
        DuckiumItems.init();
    }
}
