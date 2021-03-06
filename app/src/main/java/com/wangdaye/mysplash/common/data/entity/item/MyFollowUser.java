package com.wangdaye.mysplash.common.data.entity.item;

import com.wangdaye.mysplash.common.data.entity.unsplash.User;

/**
 * My follow user.
 *
 * The item model for {@link com.wangdaye.mysplash.common.ui.adapter.MyFollowAdapter}.
 *
 * */

public class MyFollowUser {
    // data
    public boolean requesting;
    public boolean switchTo;
    public User user;

    /** <br> life cycle. */

    public MyFollowUser(User u) {
        this.requesting = false;
        this.switchTo = false;
        this.user = u;
    }
}
