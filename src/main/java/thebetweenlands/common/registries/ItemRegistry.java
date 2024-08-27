package thebetweenlands.common.registries;

import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import thebetweenlands.common.TheBetweenlands;
import thebetweenlands.common.datagen.tags.EntityTagProvider;
import thebetweenlands.common.herblore.elixir.ElixirEffectRegistry;
import thebetweenlands.common.items.*;

public class ItemRegistry {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheBetweenlands.ID);

	public static final DeferredItem<Item> CRIMSON_SNAIL_SHELL = ITEMS.register("crimson_snail_shell", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> OCHRE_SNAIL_SHELL = ITEMS.register("ochre_snail_shell", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> COMPOST = ITEMS.register("compost", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> DRAGONFLY_WING = ITEMS.register("dragonfly_wing", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> LURKER_SKIN = ITEMS.register("lurker_skin", () -> new HoverTextItem(new Item.Properties()));
	public static final DeferredItem<Item> DRIED_SWAMP_REED = ITEMS.register("dried_swamp_reed", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> REED_ROPE = ITEMS.register("reed_rope", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> MUD_BRICK = ITEMS.register("mud_brick", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SYRMORITE_INGOT = ITEMS.register("syrmorite_ingot", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> DRY_BARK = ITEMS.register("dry_bark", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SLIMY_BONE = ITEMS.register("slimy_bone", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SNAPPER_ROOT = ITEMS.register("snapper_root", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> STALKER_EYE = ITEMS.register("stalker_eye", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SULFUR = ITEMS.register("sulfur", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> VALONITE_SHARD = ITEMS.register("valonite_shard", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> WEEDWOOD_STICK = ITEMS.register("weedwood_stick", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ANGLER_TOOTH = ITEMS.register("angler_tooth", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> WEEDWOOD_BOWL = ITEMS.register("weedwood_bowl", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> RUBBER_BALL = ITEMS.register("rubber_ball", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> TAR_BEAST_HEART = ITEMS.register("tar_beast_heart", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> ANIMATED_TAR_BEAST_HEART = ITEMS.register("animated_tar_beast_heart", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> TAR_DRIP = ITEMS.register("tar_drip", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> LIMESTONE_FLUX = ITEMS.register("limestone_flux", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> INANIMATE_TARMINION = ITEMS.register("inanimate_tarminion", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> POISON_GLAND = ITEMS.register("poison_gland", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> AMATE_PAPER = ITEMS.register("amate_paper", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SHOCKWAVE_SWORD_PIECE_1 = ITEMS.register("shockwave_sword_piece_1", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SHOCKWAVE_SWORD_PIECE_2 = ITEMS.register("shockwave_sword_piece_2", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SHOCKWAVE_SWORD_PIECE_3 = ITEMS.register("shockwave_sword_piece_3", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SHOCKWAVE_SWORD_PIECE_4 = ITEMS.register("shockwave_sword_piece_4", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> AMULET_SOCKET = ITEMS.register("amulet_socket", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
	public static final DeferredItem<Item> SCABYST = ITEMS.register("scabyst", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ITEM_SCROLL = ITEMS.register("item_scroll", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> SYRMORITE_NUGGET = ITEMS.register("syrmorite_nugget", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> OCTINE_NUGGET = ITEMS.register("octine_nugget", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> VALONITE_SPLINTER = ITEMS.register("valonite_splinter", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> CREMAINS = ITEMS.register("cremains", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> UNDYING_EMBERS = ITEMS.register("undying_embers", () -> new UndyingEmberItem(new Item.Properties()));
	public static final DeferredItem<Item> INANIMATE_ANGRY_PEBBLE = ITEMS.register("inanimate_angry_pebble", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ANCIENT_REMNANT = ITEMS.register("ancient_remnant", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> LOOT_SCRAPS = ITEMS.register("loot_scraps", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
	public static final DeferredItem<Item> FABRICATED_SCROLL = ITEMS.register("fabricated_scroll", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
	public static final DeferredItem<Item> ANADIA_SWIM_BLADDER = ITEMS.register("anadia_swim_bladder", () -> new HoverTextItem(new Item.Properties()));
	public static final DeferredItem<Item> ANADIA_EYE = ITEMS.register("anadia_eye", () -> new HoverTextItem(new Item.Properties()));
	public static final DeferredItem<Item> ANADIA_GILLS = ITEMS.register("anadia_gills", () -> new HoverTextItem(new Item.Properties()));
	public static final DeferredItem<Item> ANADIA_SCALES = ITEMS.register("anadia_scales", () -> new HoverTextItem(new Item.Properties()));
	public static final DeferredItem<Item> ANADIA_BONES = ITEMS.register("anadia_bones", () -> new HoverTextItem(new Item.Properties()));
	public static final DeferredItem<Item> ANADIA_REMAINS = ITEMS.register("anadia_remains", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ANADIA_FINS = ITEMS.register("anadia_fins", () -> new HoverTextItem(new Item.Properties()));
	public static final DeferredItem<Item> SNOT = ITEMS.register("snot", () -> new HoverTextItem(new Item.Properties()));
	public static final DeferredItem<Item> URCHIN_SPIKE = ITEMS.register("urchin_spike", () -> new HoverTextItem(new Item.Properties()));
	public static final DeferredItem<Item> FISHING_FLOAT_AND_HOOK = ITEMS.register("fishing_float_and_hook", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> OLMLETTE_MIXTURE = ITEMS.register("olmlette_mixture", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SILK_COCOON = ITEMS.register("silk_grub_cocoon", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SILK_THREAD = ITEMS.register("silk_thread", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> DIRTY_SILK_BUNDLE = ITEMS.register("dirty_silk_bundle", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> PHEROMONE_THORAXES = ITEMS.register("pheromone_thoraxes", () -> new PheromoneThoraxItem(new Item.Properties()));
	public static final DeferredItem<Item> SWAMP_TALISMAN = ITEMS.register("swamp_talisman", () -> new SwampTalismanItem(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SWAMP_TALISMAN_PIECE_1 = ITEMS.register("swamp_talisman_piece_1", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SWAMP_TALISMAN_PIECE_2 = ITEMS.register("swamp_talisman_piece_2", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SWAMP_TALISMAN_PIECE_3 = ITEMS.register("swamp_talisman_piece_3", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SWAMP_TALISMAN_PIECE_4 = ITEMS.register("swamp_talisman_piece_4", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> WEEDWOOD_ROWBOAT = ITEMS.register("weedwood_rowboat", () -> new WeedwoodRowboatItem(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ORANGE_DENTROTHYST_SHARD = ITEMS.register("orange_dentrothyst_shard", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GREEN_DENTROTHYST_SHARD = ITEMS.register("green_dentrothyst_shard", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> FISH_BAIT = ITEMS.register("fish_bait", () -> new FishBaitItem(new Item.Properties().stacksTo(1).durability(64)));
	public static final DeferredItem<Item> FUMIGANT = ITEMS.register("fumigant", () -> new FumigantItem(new Item.Properties()));
	public static final DeferredItem<Item> SAP_BALL = ITEMS.register("sap_ball", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().build())));
	public static final DeferredItem<Item> ROTTEN_FOOD = ITEMS.register("rotten_food", () -> new RottenFoodItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(-1).saturationModifier(-1.0F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200, 1), 1.0F).effect(() -> new MobEffectInstance(MobEffects.POISON, 200, 1), 1.0F).build())));
	//seeds
	public static final DeferredItem<Item> SPORES = ITEMS.register("spores", () -> new Item(new Item.Properties()));

	public static final DeferredItem<Item> MIRE_SNAIL_EGG = ITEMS.register("mire_snail_egg", () -> new MireSnailEggItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F).build())));
	public static final DeferredItem<Item> COOKED_MIRE_SNAIL_EGG = ITEMS.register("cooked_mire_snail_egg", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.0F).build())));
	public static final DeferredItem<Item> RAW_FROG_LEGS = ITEMS.register("raw_frog_legs", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build())));
	public static final DeferredItem<Item> COOKED_FROG_LEGS = ITEMS.register("cooked_frog_legs", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> RAW_SNAIL_FLESH = ITEMS.register("raw_snail_flesh", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.4F).build())));
	public static final DeferredItem<Item> COOKED_SNAIL_FLESH = ITEMS.register("cooked_snail_flesh", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.7F).build())));
	public static final DeferredItem<Item> REED_DONUT = ITEMS.register("reed_donut", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> JAM_DONUT = ITEMS.register("jam_donut", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> GERTS_DONUT = ITEMS.register("gerts_donut", () -> new GertsDonutItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> PUFFSHROOM_TENDRIL = ITEMS.register("puffshroom_tendril", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> KRAKEN_TENTACLE = ITEMS.register("kraken_tentacle", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(0.9F).build())));
	public static final DeferredItem<Item> KRAKEN_CALAMARI = ITEMS.register("kraken_calamari", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(14).saturationModifier(1.0F).build())));
	public static final DeferredItem<Item> MIDDLE_FRUIT = ITEMS.register("middle_fruit", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> MINCE_PIE = ITEMS.register("mince_pie", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.0F).build())));
	public static final DeferredItem<Item> CHRISTMAS_PUDDING = ITEMS.register("christmas_pudding", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.95F).build())));
	public static final DeferredItem<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.85F).build())));
	public static final DeferredItem<Item> WEEPING_BLUE_PETAL = ITEMS.register("weeping_blue_petal", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(1.0F).effect(() -> ElixirEffectRegistry.EFFECT_RIPENING.get().createEffect(600, 2), 1.0F).build())));
	public static final DeferredItem<Item> WIGHT_HEART = ITEMS.register("wight_heart", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().build())));
	public static final DeferredItem<Item> YELLOW_DOTTED_FUNGUS = ITEMS.register("yellow_dotted_fungus", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> SILT_CRAB_CLAW = ITEMS.register("crab_claw", () -> new ShearsItem(new Item.Properties().component(DataComponents.TOOL, ShearsItem.createToolProperties()).food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> CRAB_STICK = ITEMS.register("crab_stick", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(0.9F).build())));
	public static final DeferredItem<Item> SLUDGE_JELLO = ITEMS.register("sludge_jello", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.9F).build())));
	public static final DeferredItem<Item> MIDDLE_FRUIT_JELLO = ITEMS.register("middle_fruit_jello", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(1.0F).build())));
	public static final DeferredItem<Item> SAP_JELLO = ITEMS.register("sap_jello", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.9F).alwaysEdible().build())));
	public static final DeferredItem<Item> GREEN_MARSHMALLOW = ITEMS.register("green_marshmallow", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 1), 1.0F).build())));
	public static final DeferredItem<Item> PINK_MARSHMALLOW = ITEMS.register("pink_marshmallow", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).effect(() -> new MobEffectInstance(MobEffects.JUMP, 400, 1), 1.0F).build())));
	public static final DeferredItem<Item> FLATHEAD_MUSHROOM = ITEMS.register("flathead_mushroom_item", () -> new PlantableFoodItem(BlockRegistry.FLATHEAD_MUSHROOM.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> BLACK_HAT_MUSHROOM = ITEMS.register("black_hat_mushroom_item", () -> new PlantableFoodItem(BlockRegistry.BLACK_HAT_MUSHROOM.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> BULB_CAPPED_MUSHROOM = ITEMS.register("bulb_capped_mushroom_item", () -> new PlantableFoodItem(BlockRegistry.BLACK_HAT_MUSHROOM.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> FRIED_SWAMP_KELP = ITEMS.register("fried_swamp_kelp", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> FORBIDDEN_FIG = ITEMS.register("forbidden_fig", () -> new HoverTextItem(new Item.Properties().rarity(Rarity.RARE).food(new FoodProperties.Builder().nutrition(20).saturationModifier(0.6F).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 1), 1.0F).effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 1200, 1), 1.0F).build())));
	public static final DeferredItem<Item> BLUE_CANDY = ITEMS.register("blue_candy", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(1.0F).build())));
	public static final DeferredItem<Item> RED_CANDY = ITEMS.register("red_candy", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(1.0F).build())));
	public static final DeferredItem<Item> YELLOW_CANDY = ITEMS.register("yellow_candy", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(1.0F).build())));
	public static final DeferredItem<Item> CHIROMAW_WING = ITEMS.register("chiromaw_wing", () -> new ChiromawWingItem(new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().build())));
	public static final DeferredItem<Item> TANGLED_ROOT = ITEMS.register("tangled_root", () -> new TangledRootItem(new Item.Properties().food(new FoodProperties.Builder().build())));
	public static final DeferredItem<Item> MIRE_SCRAMBLE = ITEMS.register("mire_scramble", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationModifier(1.0F).usingConvertsTo(WEEDWOOD_BOWL).build())));
	public static final DeferredItem<Item> WEEPING_BLUE_PETAL_SALAD = ITEMS.register("weeping_blue_petal_salad", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F).alwaysEdible().usingConvertsTo(WEEDWOOD_BOWL).effect(() -> ElixirEffectRegistry.EFFECT_RIPENING.get().createEffect(4200, 2), 1.0F).build())));
	public static final DeferredItem<Item> NIBBLESTICK = ITEMS.register("nibblestick", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build())));
	public static final DeferredItem<Item> SPIRIT_FRUIT = ITEMS.register("spirit_fruit", () -> new Item(new Item.Properties().rarity(Rarity.RARE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true).food(new FoodProperties.Builder().nutrition(4).saturationModifier(1.2F).alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400), 1.0F).build())));
	public static final DeferredItem<Item> SUSHI = ITEMS.register("sushi", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationModifier(1.0F).build())));
	public static final DeferredItem<Item> ROCK_SNOT_PEARL = ITEMS.register("rock_snot_pearl", () -> new XPGivingFoodItem(10, new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().build())));
	public static final DeferredItem<Item> PEARLED_PEAR = ITEMS.register("pearled_pear", () -> new XPGivingFoodItem(80, new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F).alwaysEdible().build())));
	public static final DeferredItem<Item> RAW_ANADIA_MEAT = ITEMS.register("raw_anadia_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F).build())));
	public static final DeferredItem<Item> COOKED_ANADIA_MEAT = ITEMS.register("cooked_anadia_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F).build())));
	public static final DeferredItem<Item> SMOKED_ANADIA_MEAT = ITEMS.register("smoked_anadia_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build())));
	public static final DeferredItem<Item> BARNACLE = ITEMS.register("barnacle", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F).build())));
	public static final DeferredItem<Item> COOKED_BARNACLE = ITEMS.register("cooked_barnacle", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build())));
	public static final DeferredItem<Item> SMOKED_BARNACLE = ITEMS.register("smoked_barnacle", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F).build())));
	public static final DeferredItem<Item> SMOKED_CRAB_STICK = ITEMS.register("smoked_crab_stick", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationModifier(1.0F).build())));
	public static final DeferredItem<Item> SMOKED_FROG_LEGS = ITEMS.register("smoked_frog_legs", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.8F).build())));
	public static final DeferredItem<Item> SMOKED_PUFFSHROOM_TENDRIL = ITEMS.register("smoked_puffshroom_tendril", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F).build())));
	public static final DeferredItem<Item> SMOKED_SILT_CRAB_CLAW = ITEMS.register("smoked_silt_crab_claw", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F).build())));
	public static final DeferredItem<Item> SMOKED_SNAIL_FLESH = ITEMS.register("smoked_snail_flesh", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationModifier(0.9F).build())));
	public static final DeferredItem<Item> RAW_OLM_EGG = ITEMS.register("raw_olm_egg", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.2F).build())));
	public static final DeferredItem<Item> COOKED_OLM_EGG = ITEMS.register("cooked_olm_egg", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F).build())));
	public static final DeferredItem<Item> OLMLETTE = ITEMS.register("olmlette", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(0.6F).build())));
	public static final DeferredItem<Item> SILK_GRUB = ITEMS.register("silk_grub", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.2F).build())));
	//drinkable brew
	//herblore book
	public static final DeferredItem<Item> CRIMSON_MIDDLE_GEM = ITEMS.register("crimson_middle_gem", () -> new MiddleGemItem(new Item.Properties()));
	public static final DeferredItem<Item> AQUA_MIDDLE_GEM = ITEMS.register("aqua_middle_gem", () -> new MiddleGemItem(new Item.Properties()));
	public static final DeferredItem<Item> GREEN_MIDDLE_GEM = ITEMS.register("green_middle_gem", () -> new MiddleGemItem(new Item.Properties()));
	public static final DeferredItem<Item> LIFE_CRYSTAL = ITEMS.register("life_crystal", () -> new LifeCrystalItem(true, new Item.Properties().stacksTo(1).durability(128)));
	//pyrad flame
	//critters :)
	public static final DeferredItem<Item> SLUDGE_WORM_EGG_SAC = ITEMS.register("sludge_worm_egg_sac", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<MobItem> TINY_SLUDGE_WORM = ITEMS.register("tiny_sludge_worm", () -> new MobItem(new Item.Properties().stacksTo(1), null, null));
	public static final DeferredItem<MobItem> TINY_SLUDGE_WORM_HELPER = ITEMS.register("tiny_sludge_worm_helper", () -> new MobItem(new Item.Properties().stacksTo(1), null, null));
	public static final DeferredItem<MobItem> ANADIA = ITEMS.register("anadia", () -> new AnadiaMobItem(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<MobItem> BUBBLER_CRAB = ITEMS.register("bubbler_crab", () -> new MobItem(new Item.Properties().stacksTo(1), EntityRegistry.BUBBLER_CRAB.get(), null));
	public static final DeferredItem<MobItem> SILT_CRAB = ITEMS.register("silt_crab", () -> new MobItem(new Item.Properties().stacksTo(1), EntityRegistry.SILT_CRAB.get(), null));
	public static final DeferredItem<Item> SHIMMER_STONE = ITEMS.register("shimmer_stone", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1)));
	public static final DeferredItem<Item> TARMINION = ITEMS.register("tarminion", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1)));
	//sludge ball
	//rope
	public static final DeferredItem<Item> ANGRY_PEBBLE = ITEMS.register("angry_pebble", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1)));
	public static final DeferredItem<Item> OCTINE_INGOT = ITEMS.register("octine_ingot", () -> new OctineIngotItem(new Item.Properties()));
	public static final DeferredItem<Item> SAP_SPIT = ITEMS.register("sap_spit", () -> new SapSpitItem(new Item.Properties()));
	public static final DeferredItem<Item> RUNE_DOOR_KEY = ITEMS.register("rune_door_key", () -> new Item(new Item.Properties().stacksTo(1)));
	//draeton things
	public static final DeferredItem<Item> AMATE_NAME_TAG = ITEMS.register("amate_name_tag", () -> new Item(new Item.Properties()));
	//dye bowls
	//frames
	//thorax
	public static final DeferredItem<Item> MOSS_FILTER = ITEMS.register("moss_filter", () -> new Item(new Item.Properties().stacksTo(1).durability(400)));
	public static final DeferredItem<Item> SILK_FILTER = ITEMS.register("silk_filter", () -> new Item(new Item.Properties().stacksTo(1).durability(2000)));
	//silky pebble

	//TODO durability/attribute checks on tools and and armors
	public static final DeferredItem<Item> BONE_HELMET = ITEMS.register("bone_helmet", () -> new ArmorItem(ArmorMaterialRegistry.BONE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(6)).stacksTo(1)));
	public static final DeferredItem<Item> BONE_CHESTPLATE = ITEMS.register("bone_chestplate", () -> new ArmorItem(ArmorMaterialRegistry.BONE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(6)).stacksTo(1)));
	public static final DeferredItem<Item> BONE_LEGGINGS = ITEMS.register("bone_leggings", () -> new ArmorItem(ArmorMaterialRegistry.BONE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(6)).stacksTo(1)));
	public static final DeferredItem<Item> BONE_BOOTS = ITEMS.register("bone_boots", () -> new ArmorItem(ArmorMaterialRegistry.BONE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(6)).stacksTo(1)));
	public static final DeferredItem<Item> LURKER_SKIN_HELMET = ITEMS.register("lurker_skin_helmet", () -> new LurkerSkinArmorItem(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(12)).stacksTo(1)));
	public static final DeferredItem<Item> LURKER_SKIN_CHESTPLATE = ITEMS.register("lurker_skin_chestplate", () -> new LurkerSkinArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(12)).stacksTo(1)));
	public static final DeferredItem<Item> LURKER_SKIN_LEGGINGS = ITEMS.register("lurker_skin_leggings", () -> new LurkerSkinArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(12)).stacksTo(1)));
	public static final DeferredItem<Item> LURKER_SKIN_BOOTS = ITEMS.register("lurker_skin_boots", () -> new LurkerSkinArmorItem(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(12)).stacksTo(1)));
	public static final DeferredItem<Item> SYRMORITE_HELMET = ITEMS.register("syrmorite_helmet", () -> new ArmorItem(ArmorMaterialRegistry.SYRMORITE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(16)).stacksTo(1)));
	public static final DeferredItem<Item> SYRMORITE_CHESTPLATE = ITEMS.register("syrmorite_chestplate", () -> new ArmorItem(ArmorMaterialRegistry.SYRMORITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16)).stacksTo(1)));
	public static final DeferredItem<Item> SYRMORITE_LEGGINGS = ITEMS.register("syrmorite_leggings", () -> new ArmorItem(ArmorMaterialRegistry.SYRMORITE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(16)).stacksTo(1)));
	public static final DeferredItem<Item> SYRMORITE_BOOTS = ITEMS.register("syrmorite_boots", () -> new ArmorItem(ArmorMaterialRegistry.SYRMORITE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(16)).stacksTo(1)));
	public static final DeferredItem<Item> VALONITE_HELMET = ITEMS.register("valonite_helmet", () -> new ArmorItem(ArmorMaterialRegistry.VALONITE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35)).stacksTo(1)));
	public static final DeferredItem<Item> VALONITE_CHESTPLATE = ITEMS.register("valonite_chestplate", () -> new ArmorItem(ArmorMaterialRegistry.VALONITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35)).stacksTo(1)));
	public static final DeferredItem<Item> VALONITE_LEGGINGS = ITEMS.register("valonite_leggings", () -> new ArmorItem(ArmorMaterialRegistry.VALONITE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35)).stacksTo(1)));
	public static final DeferredItem<Item> VALONITE_BOOTS = ITEMS.register("valonite_boots", () -> new ArmorItem(ArmorMaterialRegistry.VALONITE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35)).stacksTo(1)));
	public static final DeferredItem<Item> ANCIENT_HELMET = ITEMS.register("ancient_helmet", () -> new AncientArmorItem(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35)).rarity(Rarity.EPIC).stacksTo(1)));
	public static final DeferredItem<Item> ANCIENT_CHESTPLATE = ITEMS.register("ancient_chestplate", () -> new AncientArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35)).rarity(Rarity.EPIC).stacksTo(1)));
	public static final DeferredItem<Item> ANCIENT_LEGGINGS = ITEMS.register("ancient_leggings", () -> new AncientArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35)).rarity(Rarity.EPIC).stacksTo(1)));
	public static final DeferredItem<Item> ANCIENT_BOOTS = ITEMS.register("ancient_boots", () -> new AncientArmorItem(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35)).rarity(Rarity.EPIC).stacksTo(1)));
//	public static final DeferredItem<Item> AMPHIBIOUS_HELMET = ITEMS.register("amphibious_helmet", () -> new AmphibiousArmorItem(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(12)).stacksTo(1)));
//	public static final DeferredItem<Item> AMPHIBIOUS_CHESTPLATE = ITEMS.register("amphibious_chestplate", () -> new AmphibiousArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(12)).stacksTo(1)));
//	public static final DeferredItem<Item> AMPHIBIOUS_LEGGINGS = ITEMS.register("amphibious_leggings", () -> new AmphibiousArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(12)).stacksTo(1)));
//	public static final DeferredItem<Item> AMPHIBIOUS_BOOTS = ITEMS.register("amphibious_boots", () -> new AmphibiousArmorItem(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(12)).stacksTo(1)));
	public static final DeferredItem<Item> RUBBER_BOOTS = ITEMS.register("rubber_boots", () -> new RubberBootsItem(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10)).stacksTo(1)));
	public static final DeferredItem<Item> MARSH_RUNNER_BOOTS = ITEMS.register("marsh_runner_boots", () -> new MarshRunnerBootsItem(new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10)).stacksTo(1)));
	public static final DeferredItem<Item> WEEDWOOD_SWORD = ITEMS.register("weedwood_sword", () -> new SwordItem(ToolMaterialRegistry.WEEDWOOD, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> WEEDWOOD_PICKAXE = ITEMS.register("weedwood_pickaxe", () -> new PickaxeItem(ToolMaterialRegistry.WEEDWOOD, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> WEEDWOOD_AXE = ITEMS.register("weedwood_axe", () -> new AxeItem(ToolMaterialRegistry.WEEDWOOD, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> WEEDWOOD_SHOVEL = ITEMS.register("weedwood_shovel", () -> new ShovelItem(ToolMaterialRegistry.WEEDWOOD, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> BONE_SWORD = ITEMS.register("bone_sword", () -> new SwordItem(ToolMaterialRegistry.BONE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe", () -> new PickaxeItem(ToolMaterialRegistry.BONE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> BONE_AXE = ITEMS.register("bone_axe", () -> new AxeItem(ToolMaterialRegistry.BONE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> BONE_SHOVEL = ITEMS.register("bone_shovel", () -> new ShovelItem(ToolMaterialRegistry.BONE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> OCTINE_SWORD = ITEMS.register("octine_sword", () -> new SwordItem(ToolMaterialRegistry.OCTINE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> OCTINE_PICKAXE = ITEMS.register("octine_pickaxe", () -> new PickaxeItem(ToolMaterialRegistry.OCTINE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> OCTINE_AXE = ITEMS.register("octine_axe", () -> new AxeItem(ToolMaterialRegistry.OCTINE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> OCTINE_SHOVEL = ITEMS.register("octine_shovel", () -> new ShovelItem(ToolMaterialRegistry.OCTINE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> VALONITE_SWORD = ITEMS.register("valonite_sword", () -> new SwordItem(ToolMaterialRegistry.VALONITE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> VALONITE_PICKAXE = ITEMS.register("valonite_pickaxe", () -> new PickaxeItem(ToolMaterialRegistry.VALONITE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> VALONITE_AXE = ITEMS.register("valonite_axe", () -> new AxeItem(ToolMaterialRegistry.VALONITE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> VALONITE_GREATAXE = ITEMS.register("valonite_greataxe", () -> new AxeItem(ToolMaterialRegistry.VALONITE, new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> VALONITE_SHOVEL = ITEMS.register("valonite_shovel", () -> new ShovelItem(ToolMaterialRegistry.VALONITE, new Item.Properties().stacksTo(1)));
	//shields
	//shears
	//sickle
	//shockwave sword
	//arrows
	public static final DeferredItem<Item> SLUDGE_WORM_ARROW = ITEMS.register("sludge_worm_arrow", () -> new Item(new Item.Properties().stacksTo(1)));
	//bows
	//ancient weapons
	public static final DeferredItem<Item> PESTLE = ITEMS.register("pestle", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> NET = ITEMS.register("net", () -> new NetItem(new Item.Properties().stacksTo(1).durability(32)));
	//pouches
	//caving rope
	//grapples
	//volarkite
	//slingshot
	public static final DeferredItem<Item> WEEDWOOD_FISHING_ROD = ITEMS.register("weedwood_fishing_rod", () -> new BLFishingRodItem(new Item.Properties().stacksTo(1).durability(256)));
	//spears
	//buckets
	public static final DeferredItem<Item> ELECTRIC_UPGRADE = ITEMS.register("electric_upgrade", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> GLIDE_UPGRADE = ITEMS.register("glide_upgrade", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> ASCENT_UPGRADE = ITEMS.register("ascent_upgrade", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> URCHIN_SPIKE_UPGRADE = ITEMS.register("urchin_spike_upgrade", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> FISH_VORTEX_UPGRADE = ITEMS.register("fish_vortex_upgrade", () -> new Item(new Item.Properties().stacksTo(1)));
	//stones
	public static final DeferredItem<Item> SILK_BUNDLE = ITEMS.register("silk_bundle", () -> new Item(new Item.Properties().stacksTo(1)));

	public static final DeferredItem<Item> SKULL_MASK = ITEMS.register("skull_mask", () -> new ArmorItem(ArmorMaterialRegistry.SKULL_MASK, ArmorItem.Type.HELMET, new Item.Properties()));
	//explorer hat
	public static final DeferredItem<Item> SMALL_SPIRIT_TREE_FACE_MASK = ITEMS.register("small_spirit_tree_face_mask", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1)));
	public static final DeferredItem<Item> ANIMATED_SMALL_SPIRIT_TREE_FACE_MASK = ITEMS.register("animated_small_spirit_tree_face_mask", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1)));
	//gallery frames
	//silk mask
	public static final DeferredItem<Item> WIGHTS_BANE = ITEMS.register("wights_bane", () -> new InstakillWeaponItem(ToolMaterialRegistry.WEEDWOOD, EntityTagProvider.WIGHTS_BANE_INSTAKILLS, new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));
	public static final DeferredItem<Item> SLUDGE_SLICER = ITEMS.register("sludge_slicer", () -> new InstakillWeaponItem(ToolMaterialRegistry.WEEDWOOD, EntityTagProvider.SLUDGE_SLICER_INSTAKILLS, new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));
	public static final DeferredItem<Item> CRITTER_CRUNCHER = ITEMS.register("critter_cruncher", () -> new InstakillWeaponItem(ToolMaterialRegistry.WEEDWOOD, EntityTagProvider.CRITTER_CRUNCHER_INSTAKILLS, new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));
	public static final DeferredItem<Item> HAG_HACKER = ITEMS.register("hag_hacker", () -> new HagHackerItem(new Item.Properties().rarity(Rarity.RARE).setNoRepair().stacksTo(1)));
	public static final DeferredItem<Item> VOODOO_DOLL = ITEMS.register("voodoo_doll", () -> new VoodooDollItem(new Item.Properties().rarity(Rarity.RARE).durability(24).stacksTo(1)));
	public static final DeferredItem<Item> SWIFT_PICK = ITEMS.register("swift_pick", () -> new SwiftPickItem(ToolMaterialRegistry.VALONITE, new Item.Properties().rarity(Rarity.EPIC).setNoRepair().durability(2500).stacksTo(1)));
	//barb erupters
	public static final DeferredItem<Item> MIST_STAFF = ITEMS.register("mist_staff", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SHADOW_STAFF = ITEMS.register("shadow_staff", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> RECORD_ASTATOS = ITEMS.register("music_disc_astatos", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.ASTATOS)));
	public static final DeferredItem<Item> RECORD_BETWEEN_YOU_AND_ME = ITEMS.register("music_disc_between_you_and_me", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.BETWEEN_YOU_AND_ME)));
	public static final DeferredItem<Item> RECORD_CHRISTMAS_ON_THE_MARSH = ITEMS.register("music_disc_christmas_on_the_marsh", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.CHRISTMAS_ON_THE_MARSH)));
	public static final DeferredItem<Item> RECORD_THE_EXPLORER = ITEMS.register("music_disc_the_explorer", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.THE_EXPLORER)));
	public static final DeferredItem<Item> RECORD_HAG_DANCE = ITEMS.register("music_disc_hag_dance", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.HAG_DANCE)));
	public static final DeferredItem<Item> RECORD_LONELY_FIRE = ITEMS.register("music_disc_lonely_fire", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.LONELY_FIRE)));
	public static final DeferredItem<Item> MYSTERIOUS_RECORD = ITEMS.register("mysterious_record", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.MYSTERIOUS_RECORD)));
	public static final DeferredItem<Item> RECORD_ANCIENT = ITEMS.register("music_disc_ancient", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.ANCIENT)));
	public static final DeferredItem<Item> RECORD_BENEATH_A_GREEN_SKY = ITEMS.register("music_disc_beneath_a_green_sky", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.BENEATH_A_GREEN_SKY)));
	public static final DeferredItem<Item> RECORD_DJ_WIGHTS_MIXTAPE = ITEMS.register("dj_wights_mixtape", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.DJ_WIGHTS_MIXTAPE)));
	public static final DeferredItem<Item> RECORD_ONWARDS = ITEMS.register("music_disc_onwards", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.ONWARDS)));
	public static final DeferredItem<Item> RECORD_STUCK_IN_THE_MUD = ITEMS.register("music_disc_stuck_in_the_mud", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.STUCK_IN_THE_MUD)));
	public static final DeferredItem<Item> RECORD_WANDERING_WISPS = ITEMS.register("music_disc_wandering_wisps", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.WANDERING_WISPS)));
	public static final DeferredItem<Item> RECORD_WATERLOGGED = ITEMS.register("music_disc_waterlogged", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.WATERLOGGED)));
	public static final DeferredItem<Item> RECORD_DEEP_WATER_THEME = ITEMS.register("deep_water_theme", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(MusicRegistry.DEEP_WATER_THEME)));
	//amulets
	//rings
	public static final DeferredItem<Item> RING_OF_POWER = ITEMS.register("ring_of_power", () -> new Item(new Item.Properties().stacksTo(1)));
	//scraps
	//mummy bait
	public static final DeferredItem<Item> BARK_AMULET = ITEMS.register("bark_amulet", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> AMATE_MAP = ITEMS.register("amate_map", () -> new EmptyAmateMapItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	public static final DeferredItem<Item> FILLED_AMATE_MAP = ITEMS.register("filled_amate_map", () -> new AmateMapItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
	//bone wayfinder
	public static final DeferredItem<Item> MAGIC_ITEM_MAGNET = ITEMS.register("magic_item_magnet", () -> new Item(new Item.Properties().stacksTo(1)));
	//gem singer
	public static final DeferredItem<Item> SNOT_POD = ITEMS.register("snot_pod", () -> new Item(new Item.Properties().stacksTo(1)));

	public static final DeferredItem<Item> GROUND_LEAF = ITEMS.register("ground_leaf", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_CATTAIL = ITEMS.register("ground_cattail", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_SWAMP_GRASS = ITEMS.register("ground_swamp_grass", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_SHOOTS = ITEMS.register("ground_shoots", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_ARROW_ARUM = ITEMS.register("ground_arrow_arum", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BUTTON_BUSH = ITEMS.register("ground_button_bush", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_MARSH_HIBUSCUS = ITEMS.register("ground_marsh_hibiscus", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_PICKERELWEED = ITEMS.register("ground_pickerelweed", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_SOFT_RUSH = ITEMS.register("ground_soft_rush", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_MARSH_MALLOW = ITEMS.register("ground_marsh_mallow", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_MILKWEED = ITEMS.register("ground_milkweed", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BLUE_IRIS = ITEMS.register("ground_blue_iris", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_COPPER_IRIS = ITEMS.register("ground_copper_iris", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BLUE_EYED_GRASS = ITEMS.register("ground_blue_eyed_grass", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BONESET = ITEMS.register("ground_boneset", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BOTTLE_BRUSH_GRASS = ITEMS.register("ground_bottle_brush_grass", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_WEEDWOOD_BARK = ITEMS.register("ground_weedwood_bark", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_DRIED_SWAMP_REED = ITEMS.register("ground_dried_swamp_reed", () -> new DriedSwampReedItem(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_ALGAE = ITEMS.register("ground_algae", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_ANGLER_TOOTH = ITEMS.register("ground_angler_tooth", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BLACKHAT_MUSHROOM = ITEMS.register("ground_blackhat_mushroom", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_CRIMSON_SNAIL_SHELL = ITEMS.register("ground_crimson_snail_shell", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BOG_BEAN = ITEMS.register("ground_bog_bean", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BROOMSEDGE = ITEMS.register("ground_broomsedge", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BULB_CAPPED_MUSHROOM = ITEMS.register("ground_bulb_capped_mushroom", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_CARDINAL_FLOWER = ITEMS.register("ground_cardinal_flower", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_CAVE_GRASS = ITEMS.register("ground_cave_grass", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_CAVE_MOSS = ITEMS.register("ground_cave_moss", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_CRIMSON_MIDDLE_GEM = ITEMS.register("ground_crimson_middle_gem", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_DEEP_WATER_CORAL = ITEMS.register("ground_deep_water_coral", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_FLATHEAD_MUSHROOM = ITEMS.register("ground_flathead_mushroom", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_GOLDEN_CLUB = ITEMS.register("ground_golden_club", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_GREEN_MIDDLE_GEM = ITEMS.register("ground_green_middle_gem", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_HANGER = ITEMS.register("ground_hanger", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_LICHEN = ITEMS.register("ground_lichen", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_MARSH_MARIGOLD = ITEMS.register("ground_marsh_marigold", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_MIRE_CORAL = ITEMS.register("ground_mire_coral", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_OCHRE_SNAIL_SHELL = ITEMS.register("ground_ochre_snail_shell", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_MOSS = ITEMS.register("ground_moss", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_NETTLE = ITEMS.register("ground_nettle", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_PHRAGMITES = ITEMS.register("ground_phragmites", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_SLUDGECREEP = ITEMS.register("ground_sludgecreep", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_SUNDEW = ITEMS.register("ground_sundew", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_SWAMP_KELP = ITEMS.register("ground_swamp_kelp", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_ROOTS = ITEMS.register("ground_roots", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_AQUA_MIDDLE_GEM = ITEMS.register("ground_aqua_middle_gem", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_PITCHER_PLANT = ITEMS.register("ground_pitcher_plant", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_WATER_WEEDS = ITEMS.register("ground_water_weeds", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_VENUS_FLY_TRAP = ITEMS.register("ground_venus_fly_trap", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_VOLARPAD = ITEMS.register("ground_volarpad", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_THORNS = ITEMS.register("ground_thorns", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_POISON_IVY = ITEMS.register("ground_poison_ivy", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BLADDERWORT_FLOWER = ITEMS.register("ground_bladderwort_flower", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BLADDERWORT_STALK = ITEMS.register("ground_bladderwort_stalk", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_EDGE_SHROOM = ITEMS.register("ground_edge_shroom", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_EDGE_MOSS = ITEMS.register("ground_edge_moss", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_EDGE_LEAF = ITEMS.register("ground_edge_leaf", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_ROTBULB = ITEMS.register("ground_rotbulb", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_PALE_GRASS = ITEMS.register("ground_pale_grass", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_STRING_ROOTS = ITEMS.register("ground_string_roots", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_CRYPTWEED = ITEMS.register("ground_cryptweed", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GROUND_BETWEENSTONE_PEBBLE = ITEMS.register("ground_betweenstone_pebble", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> LEAF = ITEMS.register("leaf", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ALGAE_CLUMP = ITEMS.register("algae_clump", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ARROW_ARUM_LEAF = ITEMS.register("arrow_arum_leaf", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BLUE_EYED_GRASS_FLOWERS = ITEMS.register("blue_eyed_grass_flowers", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BLUE_IRIS_PETAL = ITEMS.register("blue_iris_petal", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> MIRE_CORAL_STALK = ITEMS.register("mire_coral_stalk", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> DEEP_WATER_CORAL_STALK = ITEMS.register("deep_water_coral_stalk", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BOG_BEAN_FLOWER_DROP = ITEMS.register("bog_bean_flower_drop", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BONESET_FLOWERS = ITEMS.register("boneset_flowers", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BOTTLE_BRUSH_GRASS_BLADES = ITEMS.register("bottle_brush_grass_blades", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BROOMSEDGE_LEAVES = ITEMS.register("broomsedge_leaves", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BUTTON_BUSH_FLOWERS = ITEMS.register("button_bush_flowers", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> CARDINAL_FLOWER_PETALS = ITEMS.register("cardinal_flower_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> CATTAIL_HEAD = ITEMS.register("cattail_head", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> CAVE_GRASS_BLADES = ITEMS.register("cave_grass_blades", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> COPPER_IRIS_PETALS = ITEMS.register("copper_iris_petals", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> GOLDEN_CLUB_FLOWERS = ITEMS.register("golden_club_flowers", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> LICHEN_CLUMP = ITEMS.register("lichen_clump", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> MARSH_HIBISCUS_FLOWER = ITEMS.register("marsh_hibiscus_flower", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> MARSH_MALLOW_FLOWER = ITEMS.register("marsh_mallow_flower", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> MARSH_MARIGOLD_FLOWER_DROP = ITEMS.register("marsh_marigold_flower_drop", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> NETTLE_LEAF = ITEMS.register("nettle_leaf", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> PHRAGMITE_STEMS = ITEMS.register("phragmite_stems", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> PICKERELWEED_FLOWER = ITEMS.register("pickerelweed_flower", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SHOOT_LEAVES = ITEMS.register("shoot_leaves", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SLUDGECREEP_LEAVES = ITEMS.register("sludgecreep_leaves", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SOFT_RUSH_LEAVES = ITEMS.register("soft_rush_leaves", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SUNDEW_HEAD = ITEMS.register("sundew_head", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> SWAMP_GRASS_BLADES = ITEMS.register("swamp_grass_blades", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> CAVE_MOSS_CLUMP = ITEMS.register("cave_moss_clump", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> MOSS_CLUMP = ITEMS.register("moss_clump", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> MILKWEED_FLOWER = ITEMS.register("milkweed_flower", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> HANGER_DROP = ITEMS.register("hanger_drop", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> PITCHER_PLANT_TRAP = ITEMS.register("pitcher_plant_trap", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> WATER_WEEDS_DROP = ITEMS.register("water_weeds_drop", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> VENUS_FLY_TRAP_HEAD = ITEMS.register("venus_fly_trap_head", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> VOLARPAD_LEAF = ITEMS.register("volarpad_leaf", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> THORN_BRANCH = ITEMS.register("thorn_branch", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> POISON_IVY_LEAF = ITEMS.register("poison_ivy_leaf", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BLADDERWORT_STALK_DROP = ITEMS.register("bladderwort_stalk_drop", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> BLADDERWORT_FLOWER_DROP = ITEMS.register("bladderwort_flower_drop", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> EDGE_SHROOM_GILLS = ITEMS.register("edge_shroom_gills", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> EDGE_MOSS_CLUMP = ITEMS.register("edge_moss_clump", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> EDGE_LEAF_DROP = ITEMS.register("edge_leaf_drop", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ROTBULB_STALK = ITEMS.register("rotbulb_stalk", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> PALE_GRASS_BLADES = ITEMS.register("pale_grass_blades", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> STRING_ROOT_FIBERS = ITEMS.register("string_root_fibers", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> CRYPTWEED_BLADES = ITEMS.register("cryptweed_blades", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ASPECTRUS_FRUIT = ITEMS.register("apsectrus_fruit", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ELIXIR = ITEMS.register("elixir", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> GREEN_DENTROTHYST_VIAL = ITEMS.register("green_dentothyst_vial", () -> new DentrothystVialItem(ItemRegistry.GREEN_ASPECT_VIAL, new Item.Properties()));
	public static final DeferredItem<Item> DIRTY_DENTROTHYST_VIAL = ITEMS.register("dirty_dentothyst_vial", () -> new Item(new Item.Properties()));
	public static final DeferredItem<Item> ORANGE_DENTROTHYST_VIAL = ITEMS.register("orange_dentothyst_vial", () -> new DentrothystVialItem(ItemRegistry.ORANGE_ASPECT_VIAL, new Item.Properties()));
	public static final DeferredItem<Item> GREEN_ASPECT_VIAL = ITEMS.register("green_aspect_vial", () -> new AspectVialItem(new Item.Properties().craftRemainder(GREEN_DENTROTHYST_VIAL.get())));
	public static final DeferredItem<Item> ORANGE_ASPECT_VIAL = ITEMS.register("orange_aspect_vial", () -> new AspectVialItem(new Item.Properties().craftRemainder(ORANGE_DENTROTHYST_VIAL.get())));

	//debug items
	public static final DeferredItem<Item> GLUE = ITEMS.register("glue", () -> new GlueItem(new Item.Properties()));

	public static final DeferredItem<Item> SWAMP_WATER_BUCKET = ITEMS.register("swamp_water_bucket", () -> new BucketItem(FluidRegistry.SWAMP_WATER_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> STAGNANT_WATER_BUCKET = ITEMS.register("stagnant_water_bucket", () -> new BucketItem(FluidRegistry.STAGNANT_WATER_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> TAR_BUCKET = ITEMS.register("tar_bucket", () -> new BucketItem(FluidRegistry.TAR_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> RUBBER_BUCKET = ITEMS.register("rubber_bucket", () -> new BucketItem(FluidRegistry.RUBBER_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> DYE_BUCKET = ITEMS.register("dye_bucket", () -> new BucketItem(FluidRegistry.DYE_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> CLEAN_WATER_BUCKET = ITEMS.register("clean_water_bucket", () -> new BucketItem(FluidRegistry.CLEAN_WATER_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> FISH_OIL_BUCKET = ITEMS.register("fish_oil_bucket", () -> new BucketItem(FluidRegistry.FISH_OIL_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> PLANT_TONIC_BUCKET = ITEMS.register("plant_tonic_bucket", () -> new Item(new Item.Properties().stacksTo(1)));

	public static final DeferredItem<Item> NETTLE_SOUP_BUCKET = ITEMS.register("nettle_soup_bucket", () -> new BucketItem(FluidRegistry.NETTLE_SOUP_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> NETTLE_TEA_BUCKET = ITEMS.register("nettle_tea_bucket", () -> new BucketItem(FluidRegistry.NETTLE_TEA_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> PHEROMONE_EXTREACT_BUCKET = ITEMS.register("pheromone_extract_bucket", () -> new BucketItem(FluidRegistry.PHEROMONE_EXTRACT_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SWAMP_BROTH_BUCKET = ITEMS.register("swamp_broth_bucket", () -> new BucketItem(FluidRegistry.SWAMP_BROTH_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> STURDY_STOCK_BUCKET = ITEMS.register("sturdy_stock_bucket", () -> new BucketItem(FluidRegistry.STURDY_STOCK_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> PEAR_CORDIAL_BUCKET = ITEMS.register("pear_cordial_bucket", () -> new BucketItem(FluidRegistry.PEAR_CORDIAL_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SHAMANS_BREW_BUCKET = ITEMS.register("shamans_brew_bucket", () -> new BucketItem(FluidRegistry.SHAMANS_BREW_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> LAKE_BROTH_BUCKET = ITEMS.register("lake_broth_bucket", () -> new BucketItem(FluidRegistry.LAKE_BROTH_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> SHELL_STOCK_BUCKET = ITEMS.register("shell_stock_bucket", () -> new BucketItem(FluidRegistry.SHELL_STOCK_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> FROG_LEG_EXTRACT_BUCKET = ITEMS.register("frog_leg_extract_bucket", () -> new BucketItem(FluidRegistry.FROG_LEG_EXTRACT_STILL.get(), new Item.Properties().stacksTo(1)));
	public static final DeferredItem<Item> WITCH_TEA_BUCKET = ITEMS.register("witch_tea_bucket", () -> new BucketItem(FluidRegistry.WITCH_TEA_STILL.get(), new Item.Properties().stacksTo(1)));

	public static final DeferredItem<Item> DAMP_TORCH = ITEMS.register("damp_torch", () -> new StandingAndWallBlockItem(BlockRegistry.DAMP_TORCH.get(), BlockRegistry.DAMP_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
	public static final DeferredItem<Item> SULFUR_TORCH = ITEMS.register("sulfur_torch", () -> new StandingAndWallBlockItem(BlockRegistry.SULFUR_TORCH.get(), BlockRegistry.SULFUR_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
	public static final DeferredItem<Item> EXTINGUISHED_SULFUR_TORCH = ITEMS.register("extinguished_sulfur_torch", () -> new StandingAndWallBlockItem(BlockRegistry.EXTINGUISHED_SULFUR_TORCH.get(), BlockRegistry.EXTINGUISHED_SULFUR_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
	public static final DeferredItem<Item> WEEDWOOD_SIGN = ITEMS.register("weedwood_sign", () -> new SignItem(new Item.Properties(), BlockRegistry.WEEDWOOD_SIGN.get(), BlockRegistry.WEEDWOOD_WALL_SIGN.get()));
}