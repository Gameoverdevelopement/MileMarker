package com.example.lathe.milemarker;

/**
 * Created by lathe on 11/26/2017.
 */

public class GoogleApiSupport {

    private static final String BASE_ULR  = "https//www.google.com/%s";

    private static final String URL = "https://www.google.com/maps/search/?api=1&parameters \n"; //Searching for places
    private static final String PIPE = "%7C";
    private static final String COMMNA = "%2C";
    private static final String SPACE = "+";

    /**
     * Map features that can be applied to the URL.
     *
     * Example of the URL that should be formed when searching for a location
     *
     * City+Hall%2C+New+York%2C+NY
     *
     *
     */
    private static final String SEARCH = "search";
    private static final String DIRECTIONS = "direct";
    private static final String DISPLAY_MAP = "displayamap";






}
