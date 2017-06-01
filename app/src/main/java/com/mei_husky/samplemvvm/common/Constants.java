package com.mei_husky.samplemvvm.common;

import com.mei_husky.samplemvvm.BuildConfig;

/**
 * Created by fcn-mq on 2017/5/31.
 */

public interface Constants {

    boolean DEBUG = BuildConfig.DEBUG;

    interface SP {

        String DEFAULT_SP_NAME = "preferences";

    }

    interface API {

        String BASE_DOUBAN = "https://api.douban.com";
        // GET 电影信息
        String DOUBAN_MOVIE_INFO = "/v2/movie/subject";

    }
}
