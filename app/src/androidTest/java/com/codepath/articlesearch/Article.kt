package com.codepath.articlesearch

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable



@Keep
@Serializable
data class Article (
    @SerialName("abstract")
    val abstract: String?,

    @SerialName("byline")
    val byLine: Byline?,

    @SerialName("headline")
    val headline: Headline?,

    @SerialName("multimedia")
    val multimedia: List<MultiMedia>?
) : java.io.Serializable {
    val mediaImageUrl = "https://www.nytimes.com/${multimedia?.firstOrNull { it.url != null }?.url ?: ""}"
}

@Keep
@Serializable
data class Headline(
    @SerialName("main")
    val main: String?,

    @SerialName("kicker")
    val kicker: String?,

    @SerialName("content_kicker")
    val content_kicker: String?,

    @SerialName("print_headline")
    val print_headline: String?,

    @SerialName("name")
    val name: String?,

    @SerialName("seo")
    val seo: String?,

    @SerialName("sub")
    val sub: String?
) : java.io.Serializable

@Keep
@Serializable
data class Byline(
    @SerialName("original")
    val original: String?
) : java.io.Serializable

@Keep
@Serializable
data class MultiMedia(
    @SerialName("url")
    val url: String?
): java.io.Serializable