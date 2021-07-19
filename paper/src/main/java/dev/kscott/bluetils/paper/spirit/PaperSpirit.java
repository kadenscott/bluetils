package dev.kscott.bluetils.paper.spirit;

import dev.kscott.bluetils.core.spirit.MessagableSpirit;
import dev.kscott.bluetils.core.spirit.NamedSpirit;
import dev.kscott.bluetils.core.spirit.Spirit;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.UUID;

/**
 * A Spirit representing a Paper Player.
 */
public class PaperSpirit implements Spirit, NamedSpirit, MessagableSpirit {

    private final @NonNull Player player;

    /**
     * Constructs {@code PaperSpirit}.
     *
     * @param player the player
     */
    public PaperSpirit(final @NonNull Player player) {
        this.player = player;
    }

    @Override
    public void sendMessage(@NonNull Component message) {
        this.player.sendMessage(message);
    }

    @Override
    public @NonNull Component name() {
        return this.player.displayName();
    }

    /**
     * Sets the display name of the player.
     *
     * @param component the name
     */
    public void name(final @NonNull Component component) {
        this.player.displayName(component);
    }

    @Override
    public @NonNull UUID uuid() {
        return this.player.getUniqueId();
    }
}
