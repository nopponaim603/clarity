package skadistats.clarity.model;
import skadistats.clarity.wire.common.proto.DotaUserMessages;

import java.util.List;

public interface CombatLogEntry {
    boolean hasType();
    DotaUserMessages.DOTA_COMBATLOG_TYPES getType();
    boolean hasTargetName();
    String getTargetName();
    int getTargetNameIdx();
    boolean hasTargetSourceName();
    String getTargetSourceName();
    int getTargetSourceNameIdx();
    boolean hasAttackerName();
    String getAttackerName();
    int getAttackerNameIdx();
    boolean hasDamageSourceName();
    String getDamageSourceName();
    int getDamageSourceNameIdx();
    boolean hasInflictorName();
    String getInflictorName();
    int getInflictorNameIdx();
    boolean hasAttackerIllusion();
    boolean isAttackerIllusion();
    boolean hasAttackerHero();
    boolean isAttackerHero();
    boolean hasTargetIllusion();
    boolean isTargetIllusion();
    boolean hasTargetHero();
    boolean isTargetHero();
    boolean hasVisibleRadiant();
    boolean isVisibleRadiant();
    boolean hasVisibleDire();
    boolean isVisibleDire();
    boolean hasValue();
    int getValue();
    String getValueName();
    boolean hasHealth();
    int getHealth();
    boolean hasTimestamp();
    float getTimestamp();
    boolean hasStunDuration();
    float getStunDuration();
    boolean hasSlowDuration();
    float getSlowDuration();
    boolean hasAbilityToggleOn();
    boolean isAbilityToggleOn();
    boolean hasAbilityToggleOff();
    boolean isAbilityToggleOff();
    boolean hasAbilityLevel();
    int getAbilityLevel();
    boolean hasLocationX();
    float getLocationX();
    boolean hasLocationY();
    float getLocationY();
    boolean hasGoldReason();
    int getGoldReason();
    boolean hasTimestampRaw();
    float getTimestampRaw();
    boolean hasModifierDuration();
    float getModifierDuration();
    boolean hasXpReason();
    int getXpReason();
    boolean hasLastHits();
    int getLastHits();
    boolean hasAttackerTeam();
    int getAttackerTeam();
    boolean hasTargetTeam();
    int getTargetTeam();
    boolean hasObsWardsPlaced();
    int getObsWardsPlaced();
    boolean hasAssistPlayers();
    List<Integer> getAssistPlayers();
    boolean hasStackCount();
    int getStackCount();
    boolean hasHiddenModifier();
    boolean getHiddenModifier();
    boolean hasTargetBuilding();
    boolean isTargetBuilding();
    boolean hasNeutralCampType();
    int getNeutralCampType();
    boolean hasRuneType();
    int getRuneType();
    boolean hasHealSave();
    boolean isHealSave();
    boolean hasUltimateAbility();
    boolean isUltimateAbility();
    boolean hasAttackerHeroLevel();
    int getAttackerHeroLevel();
    boolean hasTargetHeroLevel();
    int getTargetHeroLevel();
    boolean hasXpm();
    int getXpm();
    boolean hasGpm();
    int getGpm();
    boolean hasEventLocation();
    int getEventLocation();
    boolean hasTargetSelf();
    boolean isTargetSelf();
    boolean hasDamageType();
    int getDamageType();
    boolean hasInvisibilityModifier();
    boolean isInvisibilityModifier();
    boolean hasDamageCategory();
    int getDamageCategory();
    boolean hasNetworth();
    int getNetworth();
    boolean hasBuildingType();
    int getBuildingType();
    boolean hasModifierElapsedDuration();
    float getModifierElapsedDuration();
    boolean hasSilenceModifier();
    boolean isSilenceModifier();
    boolean hasHealFromLifesteal();
    boolean isHealFromLifesteal();
    boolean hasModifierPurged();
    boolean isModifierPurged();
    boolean hasSpellEvaded();
    boolean isSpellEvaded();
    boolean hasMotionControllerModifier();
    boolean isMotionControllerModifier();
    boolean hasLongRangeKill();
    boolean isLongRangeKill();
    boolean hasModifierPurgeAbility();
    int getModifierPurgeAbility();
    boolean hasModifierPurgeNpc();
    int getModifierPurgeNpc();
    boolean hasRootModifier();
    boolean isRootModifier();
    boolean hasTotalUnitDeathCount();
    int getTotalUnitDeathCount();
    boolean hasAuraModifier();
    boolean isAuraModifier();
    boolean hasArmorDebuffModifier();
    boolean isArmorDebuffModifier();
    boolean hasNoPhysicalDamageModifier();
    boolean isNoPhysicalDamageModifier();
    boolean hasModifierAbility();
    int getModifierAbility();
    boolean hasModifierHidden();
    boolean isModifierHidden();
    boolean hasInflictorIsStolenAbility();
    boolean isInflictorIsStolenAbility();
    boolean hasKillEaterEvent();
    int getKillEaterEvent();
    boolean hasUnitStatusLabel();
    int getUnitStatusLabel();
    boolean hasSpellGeneratedAttack();
    boolean isSpellGeneratedAttack();
    boolean hasAtNightTime();
    boolean isAtNightTime();
    boolean hasAttackerHasScepter();
    boolean isAttackerHasScepter();
    boolean hasNeutralCampTeam();
    int getNeutralCampTeam();
    boolean hasRegeneratedHealth();
    float getRegeneratedHealth();
    boolean hasWillReincarnate();
    boolean isWillReincarnate();
    boolean hasUsesCharges();
    boolean isUsesCharges();
}
