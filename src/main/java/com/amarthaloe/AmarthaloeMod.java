package com.amarthaloe;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod(AmarthaloeMod.MODID)
public class AmarthaloeMod {
    // Уникальный системный идентификатор мода
    public static final String MODID = "amarthaloe";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AmarthaloeMod(IEventBus modEventBus, ModContainer modContainer) {
        // Подписываемся на событие общей инициализации
        modEventBus.addListener(this::commonSetup);

        // --- ЗДЕСЬ МЫ БУДЕМ ПОДКЛЮЧАТЬ МОДУЛИ AMARTHALOE ---
        // AmarthaloeAttachments.register(modEventBus); // Данные игрока: Репутация, Фракция, Статус
        // AmarthaloeItems.register(modEventBus);       // Предметы, валюта, оружие
        // AmarthaloeNetwork.register(modEventBus);     // Сетевые пакеты для чата, гильдий и торговли

        LOGGER.info("Мир Amarthaloe пробуждается! Инициализация систем...");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Базовая настройка Amarthaloe успешно завершена.");
    }
}