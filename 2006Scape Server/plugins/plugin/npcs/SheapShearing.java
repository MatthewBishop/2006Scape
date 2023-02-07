package plugin.npcs;

import com.rs2.event.CycleEvent;
import com.rs2.event.CycleEventContainer;
import com.rs2.event.CycleEventHandler;
import com.rs2.event.EventContext;
import com.rs2.event.EventSubscriber;
import com.rs2.event.SubscribesTo;
import com.rs2.event.impl.ItemOnNpcEvent;
import static com.rs2.game.content.StaticItemList.*;

import org.apollo.cache.def.ItemDefinition;

import com.rs2.game.items.DeprecatedItems;
import com.rs2.game.npcs.Npc;
import com.rs2.game.npcs.NpcHandler;
import com.rs2.game.players.Player;

@SubscribesTo(ItemOnNpcEvent.class)
public class SheapShearing implements EventSubscriber<ItemOnNpcEvent> {

	private static final int[] ID = { 42, 43, 1529, 1762, 1763, 1764, 1765, 3310, 3311, 3579, 5148, 5149, 5150, 5151, 5152, 5153, 5154, 5155, 5156, 5157, 5158, 5159, 5160, 5161, 5162, 5163, 5164, 5165, 5172, 5173 };

	//sheep, sheep, golden sheep
	@Override
	public void subscribe(EventContext context, Player player, ItemOnNpcEvent event) {
		if(event.getNpc() == 43) {
			shearSheep(player, NpcHandler.npcs[event.getNpcClicked()], 43, 42);
		}
	}

	private static void shearSheep(Player player, Npc npc, final int currentId, final int newId) {
		if (!player.getItemAssistant().playerHasItem(SHEARS)) {
			player.getPacketSender().sendMessage("You need " + ItemDefinition.lookup(SHEARS).getName().toLowerCase() + " to do that.");
			return;
		}
		if (npc.transformId == newId) {
			player.getPacketSender().sendMessage("This sheep has already been shorn.");
			return;
		}
		if (npc.isTransformed) {
			return;
		}
		player.startAnimation(893);
		npc.requestTransform(newId);
		player.getItemAssistant().addItem(WOOL, 1);
		player.getPacketSender().sendMessage("You get some " + ItemDefinition.lookup(WOOL).getName().toLowerCase() + ".");
		CycleEventHandler.getSingleton().addEvent(player, new CycleEvent() {

			@Override
			public void execute(CycleEventContainer container) {
				npc.requestTransform(currentId);
				container.stop();
			}

			@Override
			public void stop() {
				npc.isTransformed = false;
			}
		}, 50);
	}
}
