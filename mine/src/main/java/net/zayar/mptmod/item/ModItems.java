package net.zayar.mptmod.item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.zayar.mptmod.MptMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //item
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MODID);

    public static final RegistryObject<Item> APPLE = Items.register("apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> APPLE_ORE = Items.register("apple_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    //tool
    public static final RegistryObject<SwordItem> SWORD = Items.register("apple_sword",
            () -> new SwordItem(Tiers.IRON, 5, 3.5f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<PickaxeItem> PICKAXE = Items.register("apple_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 4, 3.5f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<ShovelItem> SHOVEL = Items.register("apple_shovel",
            () -> new ShovelItem(Tiers.IRON, 3, 3.5f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<AxeItem> AXE = Items.register("apple_axe",
            () -> new AxeItem(Tiers.IRON, 7, 3.5f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<HoeItem> HOE = Items.register("apple_hoe",
            () -> new HoeItem(Tiers.IRON, 1, 3.5f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    //armor
    public static final RegistryObject<Item> BOOTS = Items.register("apple_boots",
            () -> new ArmorItem(new NewArmorMaterials(), EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> LEGGINGS = Items.register("apple_leggings",
            () -> new ArmorItem(new NewArmorMaterials(), EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> CHEST = Items.register("apple_chestplate",
            () -> new ArmorItem(new NewArmorMaterials(), EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> HELMET = Items.register("apple_helmet",
            () -> new ArmorItem(new NewArmorMaterials(), EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    //multitool
    public static final RegistryObject<Item> APPLE_MULTITOOL = Items.register("apple_tool",
            () -> new AppleMultiToolItem(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    // da
    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }
}
