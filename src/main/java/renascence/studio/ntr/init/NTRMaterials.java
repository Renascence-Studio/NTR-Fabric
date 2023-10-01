package renascence.studio.ntr.init;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NTRMaterials implements ToolMaterial {
    public static final ToolMaterial TRANSMISSITE;

    static {
        TRANSMISSITE = new NTRMaterials(2, 514, 6.0F, 2.0F, 8,
                Ingredient.ofItems(NTRItems.TRANSMISSITE_INGOT.get(), NTRItems.TRANSMISSITE_DUST.get()));
    }

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;

    private NTRMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Ingredient repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
