package plugin.click.magic;

import com.rs2.event.Event;
import com.rs2.event.EventContext;
import com.rs2.event.EventSubscriber;
import com.rs2.event.SubscribesTo;
import com.rs2.event.impl.MagicOnItemEvent;
import com.rs2.game.content.skills.smithing.Superheat;
import com.rs2.game.players.Player;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SubscribesTo(MagicOnItemEvent.class)
@Metadata(mv = {1, 6, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\007\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\002H\026¨\006\013"}, d2 = {"Lplugin/click/magic/MagicOnItem;", "Lcom/rs2/event/EventSubscriber;", "Lcom/rs2/event/impl/MagicOnItemEvent;", "()V", "subscribe", "", "context", "Lcom/rs2/event/EventContext;", "player", "Lcom/rs2/game/players/Player;", "event", "server"})
public final class MagicOnItem implements EventSubscriber<MagicOnItemEvent> {
  public void subscribe(@NotNull EventContext context, @NotNull Player player, @NotNull MagicOnItemEvent event) {
    Intrinsics.checkNotNullParameter(context, "context");
    Intrinsics.checkNotNullParameter(player, "player");
    Intrinsics.checkNotNullParameter(event, "event");
    if (player.playerRights >= 3)
      player.getPacketSender().sendMessage("[MagicOnItem] - ItemId: " + event.getItemId() + " Slot: " + event.getSlot() + " SpellId: " + event.getSpellId()); 
    if (event.getSpellId() == 
      1173 && !Superheat.superHeatItem(player, event.getItemId()))
      return; 
  }
}
