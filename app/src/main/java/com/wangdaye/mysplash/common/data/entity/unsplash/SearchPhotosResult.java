package com.wangdaye.mysplash.common.data.entity.unsplash;

import java.util.List;

/**
 * Search photos result.
 * */

public class SearchPhotosResult {

    /**
     * total : 237
     * total_pages : 12
     */
    public int total;
    public int total_pages;

    public List<Photo> results;
}
