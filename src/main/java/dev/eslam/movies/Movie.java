package dev.eslam.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Collection;
import java.util.List;

@Document(collection = "movies")
@Data//instead of making getters and setter for all of these vars  (lombok)
@AllArgsConstructor//it is clear
@NoArgsConstructor
public class Movie {
    @Id//it is unique for each movie
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;
    @DocumentReference//this is for creating relationships in mongodb search it
    private List<Review> reviewIds;//embedded relationship but there is good annotation here
}
