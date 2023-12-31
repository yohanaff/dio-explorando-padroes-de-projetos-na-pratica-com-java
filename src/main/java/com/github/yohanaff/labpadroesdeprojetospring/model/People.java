package com.github.yohanaff.labpadroesdeprojetospring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.yohanaff.labpadroesdeprojetospring.dto.PeopleDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String height;
    private String mass;
    @JsonProperty("hair_color")
    private String hairColor;
    @JsonProperty("skin_color")
    private String skinColor;
    @JsonProperty("eye_color")
    private String eyeColor;
    @JsonProperty("birth_year")
    private String birthYear;
    private String gender;

    private String homeworld;

    @ElementCollection
    private List<String> films;

    @ElementCollection
    private List<String> species;

    @ElementCollection
    private List<String> vehicles;

    @ElementCollection
    private List<String> starships;

    private String created;
    private String edited;
    private String url;
}
