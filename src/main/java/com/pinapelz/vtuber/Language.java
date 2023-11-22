package com.pinapelz.vtuber;

/**
 * <p>Language class.</p>
 *
 * @author pinapelz
 * @version $Id: $Id
 */
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

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return code;
    }

    public boolean isLanguage(String language) {
        return this.code.equals(language);
    }

}
