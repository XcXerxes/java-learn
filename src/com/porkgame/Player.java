package com.porkgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Player {
    private String id;
    private String name;
    public List<PorkNum> ownPorks;

    public Player(String id, String name) {
        this.ownPorks = new ArrayList<PorkNum>();
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
