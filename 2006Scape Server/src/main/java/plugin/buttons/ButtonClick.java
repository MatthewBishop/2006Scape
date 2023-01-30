package plugin.buttons;

import com.rs2.event.Event;
import com.rs2.event.EventContext;
import com.rs2.event.EventSubscriber;
import com.rs2.event.impl.ButtonActionEvent;
import com.rs2.game.players.Player;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 6, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b&\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\002H&J \020\t\032\0020\0052\006\020\n\032\0020\0132\006\020\006\032\0020\0072\006\020\b\032\0020\002H\026¨\006\f"}, d2 = {"Lplugin/buttons/ButtonClick;", "Lcom/rs2/event/EventSubscriber;", "Lcom/rs2/event/impl/ButtonActionEvent;", "()V", "execute", "", "player", "Lcom/rs2/game/players/Player;", "event", "subscribe", "context", "Lcom/rs2/event/EventContext;", "server"})
public abstract class ButtonClick implements EventSubscriber<ButtonActionEvent> {
  public abstract void execute(@NotNull Player paramPlayer, @NotNull ButtonActionEvent paramButtonActionEvent);
  
  public void subscribe(@NotNull EventContext context, @NotNull Player player, @NotNull ButtonActionEvent event) {
    Intrinsics.checkNotNullParameter(context, "context");
    Intrinsics.checkNotNullParameter(player, "player");
    Intrinsics.checkNotNullParameter(event, "event");
    execute(player, event);
  }
}
