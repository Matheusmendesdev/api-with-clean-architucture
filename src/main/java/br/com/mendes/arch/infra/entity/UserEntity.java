package br.com.mendes.arch.infra.entity;

import java.util.UUID;

public class UserEntity {
    private UUID id;
    private String name;

    public UserEntity(){}

    public UserEntity(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
