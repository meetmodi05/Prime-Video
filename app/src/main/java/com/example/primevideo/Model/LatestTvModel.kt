package com.example.primevideo.Model

import com.google.gson.annotations.SerializedName

class LatestTvModel {
    @SerializedName("adult")
    val adult: Boolean? = null

    @SerializedName("backdrop_path")
    val backdrop_path: String? = null

    @SerializedName("created_by")
    val created_by: ArrayList<CreatedBy>? = null

    @SerializedName("episode_run_time")
    val episode_run_time: ArrayList<Any>? = null

    @SerializedName("first_air_date")
    val first_air_date: String? = null

    @SerializedName("genres")
    val genres: ArrayList<Any>? = null

    @SerializedName("homepage")
    val homepage: String? = null

    @SerializedName("id")
    val id: Long? = null

    @SerializedName("in_production")
    val in_production: Boolean? = null

    @SerializedName("languages")
    var languages: ArrayList<String> = arrayListOf()

    @SerializedName("last_air_date")
    var lastAirDate: String? = null

    @SerializedName("last_episode_to_air")
    var lastEpisodeToAir: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("next_episode_to_air")
    var nextEpisodeToAir: String? = null

    @SerializedName("networks")
    var networks: ArrayList<Networks> = arrayListOf()

    @SerializedName("number_of_episodes")
    var numberOfEpisodes: Int? = null

    @SerializedName("number_of_seasons")
    var numberOfSeasons: Int? = null

    @SerializedName("origin_country")
    var originCountry: ArrayList<String> = arrayListOf()

    @SerializedName("original_language")
    var originalLanguage: String? = null

    @SerializedName("original_name")
    var originalName: String? = null

    @SerializedName("overview")
    var overview: String? = null

    @SerializedName("popularity")
    var popularity: Int? = null

    @SerializedName("poster_path")
    var posterPath: String? = null

    @SerializedName("production_companies")
    var productionCompanies: ArrayList<ProductionCompanies> = arrayListOf()

    @SerializedName("production_countries")
    var productionCountries: ArrayList<ProductionCountries> = arrayListOf()

    @SerializedName("seasons")
    var seasons: ArrayList<Seasons> = arrayListOf()

    @SerializedName("spoken_languages")
    var spokenLanguages: ArrayList<SpokenLanguages> = arrayListOf()

    @SerializedName("status")
    var status: String? = null

    @SerializedName("tagline")
    var tagline: String? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("vote_average")
    var voteAverage: Int? = null

    @SerializedName("vote_count")
    var voteCount: Int? = null
}

class CreatedBy {
    @SerializedName("id")
    val id: Long? = null

    @SerializedName("credit_id")
    val credit_id: String? = null

    @SerializedName("name")
    val name: String? = null

    @SerializedName("gender")
    val gender: Int? = null

    @SerializedName("profile_path")
    val profile_path: String? = null
}

class Networks {


    @SerializedName("id")
    var id: Int? = null

    @SerializedName("logo_path")
    var logoPath: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("origin_country")
    var originCountry: String? = null

}

class ProductionCompanies {

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("logo_path")
    var logoPath: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("origin_country")
    var originCountry: String? = null
}

class ProductionCountries {

    @SerializedName("iso_3166_1")
    var iso31661: String? = null

    @SerializedName("name")
    var name: String? = null
}

class Seasons {

    @SerializedName("air_date")
    var airDate: String? = null

    @SerializedName("episode_count")
    var episodeCount: Int? = null

    @SerializedName("id")
    var id: Int? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("overview")
    var overview: String? = null

    @SerializedName("poster_path")
    var posterPath: String? = null

    @SerializedName("season_number")
    var seasonNumber: Int? = null
}

class SpokenLanguages {
    @SerializedName("english_name")
    var englishName: String? = null

    @SerializedName("iso_639_1")
    var iso6391: String? = null

    @SerializedName("name")
    var name: String? = null
}