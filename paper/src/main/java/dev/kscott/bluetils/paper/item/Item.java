package dev.kscott.bluetils.paper.item;

import dev.kscott.bluetils.core.text.Styles;
import org.bukkit.inventory.ItemStack;
import org.checkerframework.checker.nullness.qual.NonNull;

public interface Item {

    @NonNull ItemStack asItem();

}
