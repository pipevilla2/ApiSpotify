package com.jelp.spoticar.modelresponses;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.jelp.spoticar.models.Artists.ExternalUrls;
import com.jelp.spoticar.models.Artists.Followers;
import com.jelp.spoticar.models.Artists.Images;


public class ArtistsResponse {

   @SerializedName("external_urls")
   ExternalUrls externalUrls;

   @SerializedName("followers")
   Followers followers;

   @SerializedName("genres")
   List<String> genres;

   @SerializedName("href")
   String href;

   @SerializedName("id")
   String id;

   @SerializedName("images")
   List<Images> images;

   @SerializedName("name")
   String name;

   @SerializedName("popularity")
   int popularity;

   @SerializedName("type")
   String type;

   @SerializedName("uri")
   String uri;


    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }
    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }
    
    public void setFollowers(Followers followers) {
        this.followers = followers;
    }
    public Followers getFollowers() {
        return followers;
    }
    
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
    public List<String> getGenres() {
        return genres;
    }
    
    public void setHref(String href) {
        this.href = href;
    }
    public String getHref() {
        return href;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    public void setImages(List<Images> images) {
        this.images = images;
    }
    public List<Images> getImages() {
        return images;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }
    public int getPopularity() {
        return popularity;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setUri(String uri) {
        this.uri = uri;
    }
    public String getUri() {
        return uri;
    }
    
}