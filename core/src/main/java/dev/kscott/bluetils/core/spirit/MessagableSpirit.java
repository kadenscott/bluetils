package dev.kscott.bluetils.core.spirit;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Represents a Spirit that can receive a message.
 */
public interface MessagableSpirit extends Audience {

    /**
     * Sends a message to this Spirit.
     *
     * @param message the message
     */
    void sendMessage(final @NonNull Component message);

    /**
     * Sends multiple messages to this Spirit.
     *
     * @param message the messages
     */
    default void sendMessage(final @NonNull Component... message) {
        for (int i = 0; i < message.length; i++) {
            this.sendMessage(message[i]);
        }
    }

}
