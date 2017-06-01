package com.mei_husky.samplemvvm.model;

import java.util.List;

/**
 * Created by fcn-mq on 2017/4/25.
 * 电影条目信息Model
 */

public class MovieInfoModel {
    private Rating rating;

    private int reviews_count;

    private int wish_count;

    private String douban_site;

    private String year;

    private Images images;

    private String alt;

    private String id;

    private String mobile_url;

    private String title;

    private String do_count;

    private String share_url;

    private String seasons_count;

    private String schedule_url;

    private String episodes_count;

    private List<String> countries;

    private List<String> genres;

    private int collect_count;

    private List<Casts> casts;

    private String current_season;

    private String original_title;

    private String summary;

    private String subtype;

    private List<Directors> directors;

    private int comments_count;

    private int ratings_count;

    private List<String> aka;

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Rating getRating() {
        return this.rating;
    }

    public void setReviews_count(int reviews_count) {
        this.reviews_count = reviews_count;
    }

    public int getReviews_count() {
        return this.reviews_count;
    }

    public void setWish_count(int wish_count) {
        this.wish_count = wish_count;
    }

    public int getWish_count() {
        return this.wish_count;
    }

    public void setDouban_site(String douban_site) {
        this.douban_site = douban_site;
    }

    public String getDouban_site() {
        return this.douban_site;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return this.year;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Images getImages() {
        return this.images;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getAlt() {
        return this.alt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setMobile_url(String mobile_url) {
        this.mobile_url = mobile_url;
    }

    public String getMobile_url() {
        return this.mobile_url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDo_count(String do_count) {
        this.do_count = do_count;
    }

    public String getDo_count() {
        return this.do_count;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public void setSeasons_count(String seasons_count) {
        this.seasons_count = seasons_count;
    }

    public String getSeasons_count() {
        return this.seasons_count;
    }

    public void setSchedule_url(String schedule_url) {
        this.schedule_url = schedule_url;
    }

    public String getSchedule_url() {
        return this.schedule_url;
    }

    public void setEpisodes_count(String episodes_count) {
        this.episodes_count = episodes_count;
    }

    public String getEpisodes_count() {
        return this.episodes_count;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getCountries() {
        return this.countries;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getGenres() {
        return this.genres;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public int getCollect_count() {
        return this.collect_count;
    }

    public void setCasts(List<Casts> casts) {
        this.casts = casts;
    }

    public List<Casts> getCasts() {
        return this.casts;
    }

    public void setCurrent_season(String current_season) {
        this.current_season = current_season;
    }

    public String getCurrent_season() {
        return this.current_season;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOriginal_title() {
        return this.original_title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public void setDirectors(List<Directors> directors) {
        this.directors = directors;
    }

    public List<Directors> getDirectors() {
        return this.directors;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public int getComments_count() {
        return this.comments_count;
    }

    public void setRatings_count(int ratings_count) {
        this.ratings_count = ratings_count;
    }

    public int getRatings_count() {
        return this.ratings_count;
    }

    public void setString(List<String> aka) {
        this.aka = aka;
    }

    public List<String> getString() {
        return this.aka;
    }

    public class Aka {

    }

    public class Directors {
        private String alt;

        private Avatars avatars;

        private String name;

        private String id;

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getAlt() {
            return this.alt;
        }

        public void setAvatars(Avatars avatars) {
            this.avatars = avatars;
        }

        public Avatars getAvatars() {
            return this.avatars;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }

    }

    public class Avatars {
        private String small;

        private String large;

        private String medium;

        public void setSmall(String small) {
            this.small = small;
        }

        public String getSmall() {
            return this.small;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getLarge() {
            return this.large;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getMedium() {
            return this.medium;
        }

    }

    public class Casts {
        private String alt;

        private Avatars avatars;

        private String name;

        private String id;

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getAlt() {
            return this.alt;
        }

        public void setAvatars(Avatars avatars) {
            this.avatars = avatars;
        }

        public Avatars getAvatars() {
            return this.avatars;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }

    }

    public class Genres {

    }

    public class Countries {

    }

    public class Images {
        private String small;

        private String large;

        private String medium;

        public void setSmall(String small) {
            this.small = small;
        }

        public String getSmall() {
            return this.small;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getLarge() {
            return this.large;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getMedium() {
            return this.medium;
        }

    }

    public class Rating {
        private int max;

        private double average;

        private String stars;

        private int min;

        public void setMax(int max) {
            this.max = max;
        }

        public int getMax() {
            return this.max;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public double getAverage() {
            return this.average;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public String getStars() {
            return this.stars;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMin() {
            return this.min;
        }

    }

}
