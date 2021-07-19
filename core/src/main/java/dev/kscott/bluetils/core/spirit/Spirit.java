package dev.kscott.bluetils.core.spirit;

import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.UUID;

/**
 * Represents a user.
 */
public interface Spirit {

    /**
     * Returns the uuid of this spirit.
     *
     * @return the uuid
     */
    @NonNull UUID uuid();

}
