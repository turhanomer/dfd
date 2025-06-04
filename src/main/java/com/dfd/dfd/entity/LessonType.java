package com.dfd.dfd.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;

public enum LessonType {
    MANDATORY(1, "Zorunlu"), ELECTIVE(2, "Seçmeli");

    private final int id;
    private final String name;

    LessonType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonCreator
    public static LessonType fromJson(JsonNode node) {
        int id = node.get("id").asInt();
        for (LessonType type : LessonType.values()) {
            if (type.getId() == id) return type;
        }
        throw new IllegalArgumentException("Geçersiz id: " + id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonValue
    public Object toJson() {
        return new LessonTypeJson(id, name);
    }

    public static class LessonTypeJson {
        public int id;
        public String name;

        public LessonTypeJson(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }


}
