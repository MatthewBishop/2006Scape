package plugin.buttons.gameframe;

import com.rs2.event.Event;
import com.rs2.event.SubscribesTo;
import com.rs2.event.impl.ButtonActionEvent;
import com.rs2.game.items.impl.LightSources;
import com.rs2.game.players.Player;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import plugin.buttons.ButtonClick;

@SubscribesTo(ButtonActionEvent.class)
@Metadata(mv = {1, 6, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\007\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\020\020\t\032\0020\n2\006\020\007\032\0020\bH\026¨\006\013"}, d2 = {"Lplugin/buttons/gameframe/BrightnessButtons;", "Lplugin/buttons/ButtonClick;", "()V", "execute", "", "player", "Lcom/rs2/game/players/Player;", "event", "Lcom/rs2/event/impl/ButtonActionEvent;", "test", "", "server"})
public final class BrightnessButtons extends ButtonClick {
  public void execute(@NotNull Player player, @NotNull ButtonActionEvent event) {
    Intrinsics.checkNotNullParameter(player, "player");
    Intrinsics.checkNotNullParameter(event, "event");
    switch (event.getButton()) {
      case 3138:
        LightSources.brightness1(player);
        break;
      case 3140:
        LightSources.brightness2(player);
        break;
      case 3142:
        LightSources.brightness3(player);
        break;
      case 3144:
        LightSources.brightness4(player);
        break;
    } 
  }
  
  public boolean test(@NotNull ButtonActionEvent event) {
    Intrinsics.checkNotNullParameter(event, "event");
    return (event.getButton() == 3138 || event.getButton() == 3140 || event.getButton() == 3142 || event.getButton() == 912);
  }
}
