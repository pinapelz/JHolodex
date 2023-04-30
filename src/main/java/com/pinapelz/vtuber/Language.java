package com.pinapelz.vtuber;

public enum Language {
    ENGLISH("en"),
    JAPANESE("jp"),
    SPANISH("es"),
    CHINESE("zh"),
    KOREAN("ko"),
    FRENCH("fr"),
    INDONESIAN("id"),
    RUSSIAN("ru");

    private final String code;

    Language(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

}
