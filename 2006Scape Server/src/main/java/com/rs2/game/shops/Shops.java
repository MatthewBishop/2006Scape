package com.rs2.game.shops;

import java.util.HashMap;

import com.rs2.game.content.randomevents.RandomEventHandler;
import com.rs2.game.players.Player;
import static com.rs2.game.content.StaticNpcList.*;

/**
 * Shops
 * @author Andrew (I'm A Boss on Rune-Server, Mr Extremez on Moparscape & Runelocus)
 */

public class Shops {

	public enum Shop {
		SHOP1(DAVON, 2), SHOP2(LOWE, 3), SHOP3(HICKTON, 4), SHOP4(DALLDAV, 5),
		SHOP5(SQUIRE_3796, 6), SHOP6(BRIAN_1860, 7), SHOP7(BRIAN, 9), SHOP8(CANDLE_MAKER, 10),
		SHOP9(WAYNE, 11), SHOP10(THESSALIA, 12), SHOP11(FANCY_DRESS_SHOP_OWNER, 13), SHOP12(ROMETTI, 14),
		SHOP13(YRSA, 15), SHOP14(BARKER, 16), SHOP15(ORONWEN, 17), SHOP16(MIKE, 18),
		SHOP17(AGMUNDI, 19), SHOP18(VERMUNDI, 20), SHOP19(HUDO, 21), SHOP20(HECKEL_FUNCH, 22),
		SHOP21(FRENITA, 23), SHOP22(DOMMIK, 24), SHOP23(ROMMIK, 25), SHOP24(VANESSA, 26),
		SHOP25(ALICE, 27), SHOP26(SARAH, 28), SHOP27(RICHARD_2306, 29), SHOP28(FERNAHEI, 30),
		SHOP29(GERRANT, 31),	SHOP30(HARRY, 32), SHOP31(FISHMONGER, 33), SHOP32(RUFUS, 35),
		SHOP33(SOLIHIB, 36), SHOP34(HERQUIN, 37), SHOP35(GEM_TRADER, 38), SHOP36(HERVI, 39),
		SHOP37(PEKSA, 40), SHOP38(SKULGRIMEN, 41), SHOP39(FRINCOS, 42), SHOP40(JATIX, 43),
		SHOP41(GARDENER_GUNNHILD, 44), SHOP42(GRUM, 45), SHOP43(ALI_THE_KEBAB_SELLER, 46), SHOP44(KARIM, 47),
		SHOP45(KJUT, 48), SHOP46(FLYNN, 49), SHOP47(ALI_MORRISANE, 50), SHOP48(BETTY, 51),
		SHOP49(AUBURY, 52), SHOP50(MAGIC_STORE_OWNER, 53),	SHOP51(LUNDAIL, 54), SHOP52(MAGE_OF_ZAMORAK, 55),
		SHOP53(TUTAB, 56), SHOP54(SQUIRE_3800, 57), SHOP55(TZHAARMEJROH, 58), SHOP56(NURMOF, 59),
		SHOP57(DROGO_DWARF, 60), SHOP58(TATI, 61), SHOP59(SUNE, 61), SHOP60(ZENESHA, 62),
		SHOP61(HORVIK, 63), SHOP62(LOUIE_LEGS, 64), SHOP63(SEDDU, 65), SHOP64(RANAEL, 66),
		SHOP65(ZEKE, 67), SHOP66(DAGA, 68), SHOP67(CASSIE, 69), SHOP68(SILK_TRADER, 70),
		SHOP69(EMBALMER, 71), SHOP70(ZAFF, 72), SHOP71(DWARF_382, 73), SHOP72(AUREL, 74),
		SHOP73(SHOP_KEEPER, 75), SHOP74(SHOP_ASSISTANT, 75), SHOP75(IFABA, 76), SHOP76(AEMAD, 77),
		SHOP77(CHADWELL, 78), SHOP78(BANDIT_SHOPKEEPER, 79), SHOP79(FIDELIO, 80), SHOP80(ARHEIN, 81),
		SHOP81(SHOP_KEEPER_522, 82), SHOP82(SHOP_ASSISTANT_523, 82), SHOP83(SHOP_KEEPER_524, 83), SHOP84(SHOP_ASSISTANT_525, 83),
		SHOP85(SHOP_KEEPER_526, 84), SHOP86(SHOP_ASSISTANT_527, 84), SHOP87(GUNSLIK, 85), SHOP88(JOSSIK, 86),
		SHOP89(EUDAV, 87), SHOP90(SHOP_KEEPER_528, 88), SHOP91(SHOP_ASSISTANT_529, 88), SHOP92(RAZMIRE_KEELGAN, 89),
		SHOP93(KAZGAR, 90), SHOP94(ARNOLD_LYDSPOR, 91), SHOP95(MARKET_SELLER, 92), SHOP96(GHOST_SHOPKEEPER, 93),
		SHOP97(SIGMUND_THE_MERCHANT, 94), SHOP98(SHOP_KEEPER_530, 95), SHOP99(SHOP_ASSISTANT_531, 95), SHOP100(OBLI, 96),
		SHOP101(JIMINUA, 97), SHOP102(BOLKOY, 98), SHOP103(QUARTERMASTER, 99), SHOP104(SHOP_KEEPER_532, 100),
		SHOP105(SHOP_ASSISTANT_533, 100), SHOP106(SQUIRE, 101), SHOP107(SQUIRE_3797, 101), SHOP108(FAIRY_SHOP_KEEPER, 102),
		SHOP109(FAIRY_SHOP_ASSISTANT, 102), SHOP110(SHANTAY, 103), SHOP111(SHOP_KEEPER_551, 104), SHOP112(SHOP_ASSISTANT_552, 104),
		SHOP113(GAIUS, 105), SHOP114(JUKAT, 106), SHOP115(OZIACH, 107), SHOP116(FUR_TRADER, 108),
		SHOP117(FUR_TRADER_1316, 108), SHOP118(SAM_1787, 110), SHOP119(LANTHUS, 112), SHOP120(ZAMBO, 113),
		SHOP121(RASOLO, 226), SHOP122(WISTAN, 114), SHOP123(BARTENDER_735, 115), SHOP124(ALFONSE_THE_WAITER, 116),
		SHOP125(CHARLIE_THE_COOK, 116), SHOP126(TOSTIG, 117), SHOP127(ARMOUR_SALESMAN, 119), SHOP128(BOW_AND_ARROW_SALESMAN, 120),
		SHOP129(TRIBAL_WEAPON_SALESMAN, 121), SHOP130(ROBE_STORE_OWNER, 122), SHOP131(MAGIC_STORE_OWNER, 123), SHOP132(CHAMBER_GUARDIAN, 126),
		SHOP133(SANTIRI, 127), SHOP134(SARO, 128), SHOP135(VIGR, 129), SHOP136(NOLAR, 130),
		SHOP137(RANDIVOR, 131), SHOP138(GULLDAMAR, 132), SHOP139(GNOME_WAITER, 133), SHOP140(GULLUCK, 134),
		SHOP141(FAT_TONY, 135), SHOP142(NOTERAZZO, 136), SHOP143(NEIL, 137), SHOP144(TZHAARHURTEL, 138),
		SHOP145(TZHAARHURLEK, 139), SHOP146(WILLIAM, 140), 	SHOP147(EDWARD, 141), SHOP148(BARMAN_849, 142),
		SHOP149(DIANGO, 145), SHOP150(UGLUG_NAR, 165), SHOP151(ROACHEY, 190), SHOP152(SHOP_KEEPER_555, 220),
		SHOP153(AKHARANU, 284);


		private final int npcId, shopId;
		
		public static HashMap<Integer, Shop> npc = new HashMap<Integer, Shop>();

		public static Shop forId(int id) {
			return npc.get(id);
		}

		static {
			for (Shop f : Shop.values())
				npc.put(f.getNpc(), f);
		}

		private Shop(int npcId, int shopId) {
			this.npcId = npcId;
			this.shopId = shopId;
		}

		public int getNpc() {
			return npcId;
		}

		public int getShop() {
			return shopId;
		}
		
	}

	public static void dialogueShop(Player c, int npcClick) {
		final Shop shops = Shop.forId(npcClick);
		if (shops == null)
			return;
		if (npcClick == shops.getNpc()) {
			c.getDialogueHandler().sendDialogues(1322, shops.getNpc());
		}
	}

	public static void openShop(Player c, int npcClickId) {
		final Shop shops = Shop.forId(npcClickId);
		if (shops == null)
			return;
		if (npcClickId == shops.getNpc()) {
			c.getShopAssistant().openShop(shops.getShop());
			RandomEventHandler.addRandom(c);
		}
	}
	
}
