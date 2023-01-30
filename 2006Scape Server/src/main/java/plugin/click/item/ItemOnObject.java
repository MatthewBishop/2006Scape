package plugin.click.item;

import com.rs2.event.Event;
import com.rs2.event.EventContext;
import com.rs2.event.EventSubscriber;
import com.rs2.event.SubscribesTo;
import com.rs2.event.impl.ItemOnObjectEvent;
import com.rs2.game.items.impl.Fillables;
import com.rs2.game.players.Player;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SubscribesTo(ItemOnObjectEvent.class)
@Metadata(mv = {1, 6, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\007\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\002H\026¨\006\013"}, d2 = {"Lplugin/click/item/ItemOnObject;", "Lcom/rs2/event/EventSubscriber;", "Lcom/rs2/event/impl/ItemOnObjectEvent;", "()V", "subscribe", "", "context", "Lcom/rs2/event/EventContext;", "player", "Lcom/rs2/game/players/Player;", "event", "server"})
public final class ItemOnObject implements EventSubscriber<ItemOnObjectEvent> {
  public void subscribe(@NotNull EventContext context, @NotNull Player player, @NotNull ItemOnObjectEvent event) {
    Intrinsics.checkNotNullParameter(context, "context");
    Intrinsics.checkNotNullParameter(player, "player");
    Intrinsics.checkNotNullParameter(event, "event");
    if (player.playerRights >= 3)
      player.getPacketSender().sendMessage("[ItemOnObject] - itemId:  " + event.getItem() + " objectId: " + event.getGameObject() + " Location: x: " + player.objectX + ", x: " + player.objectY); 
    if (Fillables.canFill(event.getItem(), event.getGameObject()) && player.getItemAssistant().playerHasItem(event.getItem())) {
      player.getItemAssistant().deleteItem(event.getItem(), 1);
      player.getItemAssistant().addItem(Fillables.counterpart(event.getItem()), 1);
      player.getPacketSender().sendMessage(Fillables.fillMessage(event.getItem(), event.getGameObject()));
      player.startAnimation(832);
      return;
    } 
  }
}
