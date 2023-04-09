package edu.wpi.teamR.mapdb;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PACKAGE)
public class LocationName {
    private String longName, shortName, nodeType;

    public LocationName(String longName, String shortName, String nodeType){
        this.longName = longName;
        this.shortName = shortName;
        this.nodeType = nodeType;
    }
}