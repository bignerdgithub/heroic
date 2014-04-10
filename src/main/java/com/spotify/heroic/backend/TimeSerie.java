package com.spotify.heroic.backend;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(of = { "key", "tags" })
@EqualsAndHashCode(of = { "key", "tags" })
public class TimeSerie {
    @Getter
    private final String key;
    @Getter
    private final Map<String, String> tags;

    public TimeSerie(String key, Map<String, String> tags) {
        this.key = key;
        this.tags = tags;
    }
}
