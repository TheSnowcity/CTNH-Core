package io.github.cpearl0.ctnhcore.data.lang;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.machines.GTMachineUtils;
import io.github.cpearl0.ctnhcore.registry.*;
import net.minecraftforge.common.data.LanguageProvider;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.Map;

import static com.gregtechceu.gtceu.api.GTValues.*;

public class ChineseLangHandler {
    public static void init(RegistrateCNLangProvider provider) {
        replace(provider, CTNHTagPrefixes.oreHolystone.getUnlocalizedName(), "圣石%s矿石");
        replace(provider, CTNHTagPrefixes.oreMossyHolystone.getUnlocalizedName(), "覆苔圣石%s矿石");

        replace(provider, CTNHMaterials.Moonstone.getUnlocalizedName(), "月石");
        replace(provider, CTNHMaterials.Marsstone.getUnlocalizedName(), "火星石");
        replace(provider, CTNHMaterials.Venusstone.getUnlocalizedName(), "金星石");
        replace(provider, CTNHMaterials.Mercurystone.getUnlocalizedName(), "水星石");
        replace(provider, CTNHMaterials.Glaciostone.getUnlocalizedName(), "霜原石");

        replace(provider, CTNHMaterials.Holystone.getUnlocalizedName(), "圣石");
        replace(provider, CTNHMaterials.Zanite.getUnlocalizedName(), "紫晶石");
        replace(provider, CTNHMaterials.Ambrosium.getUnlocalizedName(), "神能晶");
        replace(provider, CTNHMaterials.Skyjade.getUnlocalizedName(), "穹玉");
        replace(provider, CTNHMaterials.Stratus.getUnlocalizedName(), "云母钢");
        replace(provider, CTNHMaterials.Zenith_essence.getUnlocalizedName(), "§5天顶源质§r");
        replace(provider, CTNHMaterials.Ignitium.getUnlocalizedName(), "腾炎");
        provider.add("gtceu.phase_inversion","反相蚀刻");
        provider.add("gtceu.underfloor_heating_system", "地暖");
        provider.add("gtceu.astronomical_observatory", "天文台");
        provider.add("gtceu.photovoltaic_power", "光伏发电");
        provider.add("gtceu.slaughter_house", "屠宰场");
        provider.add("gtceu.big_dam", "三峡大坝");
        provider.add("gtceu.coke_oven", "焦化塔");
        provider.add("gtceu.demon_will_generator", "恶魔意志发电");
        provider.add("gtceu.meadow","牧场养殖");
        provider.add("gtceu.chemical_generator","化学能发电");
        provider.add("gtceu.void_miner","虚空采矿");
        provider.add("gtceu.sintering_kiln","烧结");
        provider.add("gtceu.chemical_vapor_deposition","化学气相沉积");
        provider.add("gtceu.martial_morality_eye","武德之眼");
        provider.add("gtceu.advanced_coke_oven","高级焦炉");
        provider.add("gtceu.dimensional_gas_collection_chamber","维度集气");
        provider.add("gtceu.condensing_discrete","冷凝离散");
        provider.add("gtceu.ion_exchanger","离子交换");
        provider.add("gtceu.large_steel_furnace","大型钢制熔炉");
        provider.add("gtceu.large_steel_alloy_furnace","大型钢制合金炉");
        provider.add("gtceu.fuel_refining", "燃料精炼");
        provider.add("gtceu.water_power", "水力发电");
        provider.add("gtceu.bio_reactor", "生物反应");
        provider.add("gtceu.resonant_assemble","振动共鸣组装");
        provider.add("gtceu.wind_power_array", "风力发电阵列");
        provider.add("gtceu.crystallizer", "结晶反应");
        provider.add("gtceu.mana_generator", "魔力发电");
        provider.add("gtceu.season_steam","季节共鸣器");
        provider.add("gtceu.naq_mk1", "超能燃料");
        provider.add("gtceu.bedrock_drilling_rigs", "基岩钻机");
        provider.add("gtceu.plasma_condenser", "等离子冷凝");
        provider.add("gtceu.vacuum_sintering", "真空烧结");
        provider.add("gtceu.dimensional_gas_collection", "维度集气");
        provider.add("gtceu.silica_rock_fuel_refinery", "硅岩燃料精炼");
        provider.add("gtceu.hellforge", "狱火锻炉");
        provider.add("gtceu.digital_well_of_suffer", "数字化苦难之井");
        provider.add("gtceu.machine.parallel_hatch_mk9.tooltip", "允许同时处理至多1024个配方。") ;
        provider.add("gtceu.machine.parallel_hatch_mk10.tooltip", "允许同时处理至多4096个配方。");
        provider.add("gtceu.machine.parallel_hatch_mk11.tooltip", "允许同时处理至多16384个配方。");
        provider.add("gtceu.machine.parallel_hatch_mk12.tooltip", "允许同时处理至多65536个配方。");
        provider.add("gtceu.machine.parallel_hatch_mk13.tooltip", "允许同时处理至多262144个配方。");
        provider.add("gtceu.machine.parallel_hatch_mk14.tooltip", "允许同时处理至多1048576个配方。");
        provider.add("block.ctnhcore.luv_compressed_fusion_reactor", "压缩核聚变反应堆控制电脑 MK-I");
        provider.add("block.ctnhcore.zpm_compressed_fusion_reactor", "压缩核聚变反应堆控制电脑 MK-II");
        provider.add("block.ctnhcore.uv_compressed_fusion_reactor", "压缩核聚变反应堆控制电脑 MK-III");
        provider.add("gtceu.eye_of_quasar","§5类星体§r§1之§c眼");
        provider.add("ctnh.eye_consumption","启动消耗:%.1f");
        provider.add("gtceu:quasar_eye","类星体发电");
        provider.add("gtceu.multiblock.laser.tooltip", "允许使用激光仓");
        provider.add("ctnh.multiblock.parallelize.tooltip", "自带无损超频且可以使用并行仓");
        provider.add("ctnh.multiblock.underfloor_heating_system.efficiency", "效率：%d");
        provider.add("ctnh.multiblock.underfloor_heating_system.rate", "速率：%s");
        provider.add("ctnh.multiblock.underfloor_heating_system.rate.tooltip", "减少蒸汽的消耗来降低地暖的发热功率");
        provider.add("ctnh.multiblock.underfloor_heating_system.rate_modify", "调节速率：");
        provider.add("ctnh.multiblock.underfloor_heating_system.steam_consumption", "蒸汽消耗速率：%d");
        provider.add("ctnh.multiblock.photovoltaic_power_station_invalid", "有方块阻挡");
        provider.add("ctnh.multiblock.photovoltaic_power_station_night", "光照过于微弱");
        provider.add("ctnh.multiblock.photovoltaic_power_station1", "发电效率：%s%%");
        provider.add("ctnh.multiblock.photovoltaic_power_station2", "产能功率：%s/%s EU/t");
        provider.add("info.ctnhcore.network_machine", "发电网络机器数：%d");
        provider.add("info.ctnhcore.network_machine_efficiency", "发电效率：%d");
        provider.add("ctnh.multiblock.slaughter_house.mobcount", "怪物种类：%d (%s)");
        provider.add("ctnh.stress_output", "产出应力：%ssu");
        provider.add("ctnh.stress_input", "输入应力：%ssu");
        provider.add("ctnh.fermenting_tank.growing_temperature", "生长温度：§2%d°C§r");
        provider.add("ctnh.fermenting_tank.growth_efficiency", "生长效率：%d%%");
        provider.add("ctnh.machine.eut_multiplier.tooltip", "耗能倍数：%s");
        provider.add("ctnh.machine.duration_multiplier.tooltip", "耗时倍数：%s");
        provider.add("ctnh.manaturbine.efficiency", "发电效率：%d%%");
        provider.add("ctnh.manaturbine.consumption_rate", "消耗倍率：%d");
        provider.add("ctnh.machine.chemical_plant.tooltip.0","线圈等级每高出白铜一级能耗与速度x5%");
        provider.add("ctnh.multiblock.naq_reactor_machine.boost_disallowed", "§b升级你的动力仓以激活等离子体加速");
        provider.add("ctnh.multiblock.naq_reactor_machine.oxygen_plasma_boosted","§b氧等离子体加速中");
        provider.add("ctnh.multiblock.naq_reactor_machine.supply_oxygen_plasma_to_boost","提供氧等离子体以加速");
        provider.add("ctnh.multiblock.naq_reactor_machine.iron_plasma_boosted","§b铁等离子体加速中");
        provider.add("ctnh.multiblock.naq_reactor_machine.supply_iron_plasma_to_boost","提供铁等离子体以加速");
        provider.add("ctnh.multiblock.naq_reactor_machine.nickel_plasma_boosted","§b镍等离子体加速中");
        provider.add("ctnh.multiblock.naq_reactor_machine.supply_nickel_plasma_to_boost","提供镍等离子体以加速");
        provider.add("ctnh.machine.naq_reactor_machine.tooltip.boost_mk1","提供§f20 mB/s§7的氧等离子体，并消耗§f四倍§7燃料以产生高达§f%s§7EU/t的功率。");
        provider.add("ctnh.machine.naq_reactor_machine.tooltip.boost_mk2","提供§f20 mB/s§7的铁等离子体，并消耗§f四倍§7燃料以产生高达§f%s§7EU/t的功率。");
        provider.add("ctnh.machine.naq_reactor_machine.tooltip.boost_mk3","提供§f20 mB/s§7的镍等离子体，并消耗§f四倍§7燃料以产生高达§f%s§7EU/t的功率。");
        provider.add("ctnh.test_terminal.lack_error","在%s处缺少");
        provider.add("ctnh.test_terminal.wrong_error","在%s处应为");
        provider.add("ctnh.test_terminal.position","(%s,%s,%s)");
        provider.add("ctnh.test_terminal.error_info","(%s)");
        provider.add("ctnh.test_terminal.success","一切正常！");
        provider.add("ctnh.testing_terminal.tooltip.1","用于检测多方块搭建时产生的错误");
        provider.add("ctnh.testing_terminal.tooltip.2","右键多方块的主方块以显示错误信息");
        provider.add("ctnh.simple_nutritious_meal.tooltip.1","能维持机体基本的生理功能");
        provider.add("ctnh.plasma_condenser.tooltips.1", "氤氲之气，凝为霜露");
        provider.add("ctnh.sweat_shop.tooltips.1","生产资料与剩余价值");
        provider.add("ctnh.sweat_shop.tooltips.2","工厂内的村民数量决定了工作效率，配方耗时x(1/村民数量)");
        provider.add("ctnh.sweat_shop.tooltips.3","工厂内的有效员工数量受限于工厂大小，初始上限为4，工厂长度每增加4格上限+1");
        provider.add("ctnh.sweat_shop.tooltips.4","放入的生产资料(机器)决定了可以工作的配方：\n动力辊压机----卷板机配方\n动力搅拌机----搅拌机配方\n车床----车床配方\n离心机----离心机配方\n烈焰人燃烧室----提取机配方\n工作盆----流体成型配方\n粉碎轮----研磨机配方\n动力锯----线材轧机配方\n激光加工器----激光蚀刻配方\n==============================");
        provider.add("ctnh.sweat_shop.tooltips.5","放入的生产资料(机器)数量决定了对应工作配方的并行数：并行数 = sqrt(机器数)");
        provider.add("ctnh.sweat_shop.tooltips.6","放入机械手可以提高整体配方运行速度，配方耗时x (1/1 + sqrt(机械手数))");
        provider.add("ctnh.sweat_shop.tooltips.7","放入机器的多样性会提高配方运行速度");
        provider.add("ctnh.sweat_shop.tooltips.8","每5秒机器会消耗(员工数量)份简易员工餐");
        provider.add("ctnh.demon_will_generator.tooltips.1","借用恶魔之力");
        provider.add("ctnh.demon_will_generator.tooltips.2","利用机器两侧的区块内的恶魔意志浓度差发电，浓度差与发电量呈指数关系");
        provider.add("ctnh.demon_will_generator.tooltips.3","以机器两侧的恶魔合金方块处的意志浓度为基准进行计算");
        provider.add("ctnh.demon_will_generator.tooltips.4","两侧区块中的各种恶魔意志的多样性会影响发电效率");
        provider.add("ctnh.demon_will_generator.tooltips.5","机器内可以放入意志核心，将机器转化为对于某种意志专精的模式");
        provider.add("ctnh.demon_will_generator.tooltips.6","机器内的符文方块可替换，从而起到不同的增益效果:\n§4献祭符文和牺牲符文----提高生命源质强化模式的发电倍率§r\n§3速度符文----提升一次配方运行的时长（节省恶魔意志消耗）§r\n§e增容符文----每一个符文增加2点恶魔意志浓度差§r\n§c超容符文----每一个符文增加百分之2的恶魔意志浓度差（叠乘）§r\n==============================");
        provider.add("ctnh.demon_will_generator.tooltips.7","输入§4生命源质§r开启强化模式，发电量翻倍，每秒消耗§a100mb§r的生命源质");
        provider.add("ctnh.multiblock.sweat_shop.villager_count","员工数量：%s");
        provider.add("ctnh.multiblock.sweat_shop.basic_rate","基础效率：x%s");
        provider.add("ctnh.multiblock.demon_generator.info.default","专精强化：无");
        provider.add("ctnh.multiblock.demon_generator.info.vengeful","专精强化：复仇");
        provider.add("ctnh.multiblock.demon_generator.info.corrosive","专精强化：腐蚀");
        provider.add("ctnh.multiblock.demon_generator.info.steadfast","专精强化：坚韧");
        provider.add("ctnh.multiblock.demon_generator.info.destructive","专精强化：破坏");
        provider.add("ctnh.multiblock.demon_generator.info.1","浓度差异：%s");
        provider.add("ctnh.multiblock.demon_generator.info.boosted","§b生命源质强化中");
        provider.add("meadow", "自动化放牧");
        provider.add("ctnh.meadow.basic", "只能养鸡牛羊猪，牛会产生皮革，羊会产生羊毛，鸡会产生鸡蛋，猪会产生猪肉");
        provider.add("ctnh.meadow.mechanism", "牧场里每多一只动物，产生的排泄物数量就会提升，养的动物越多，产物越多");
        provider.add("ctnh.fermenting_tank.bio_growth_mechanism", "发酵罐的生物生长机制：");
        provider.add("ctnh.fermenting_tank.bio_growth_temperature", "当发酵罐温度处于§236§r至§238§r度之间时为最适生长温度，配方获得1.2倍效率，越偏离最适生长温度，配方效率越低，最低为三分之一");
        provider.add("ctnh.fermenting_tank.bio_growth", "微生物的生长符合逻辑斯蒂方程，当输入仓内液体体积为容量的一半时，§2生长效率达到两倍§r，而满仓和空仓时生长效率最低，保底为20%");
        provider.add("subtick_overclock", "当配方运行时间小于1t时,会自动计算并行");
        provider.add("void_miner", "取天材，掘地精");
        provider.add("ctnh.void_miner.tooltip.0", "虚空采矿场自动生成并提取矿石");
        provider.add("ctnh.void_miner.tooltip.1", "生成各种矿石，无需依赖周围区块");
        provider.add("ctnh.void_miner.tooltip.2", "需要充足的能量和流体来维持运行");
        provider.add("ctnh.void_miner.tooltip.3", "温度过高时进入强制降温模式,建议控制流量交替输入烈焰之炽焱或者极寒之凛冰");
        provider.add("ctnh.void_miner.tooltip.4", "最大温度为 25000K，降温到 300K 方可恢复工作");
        provider.add("ctnh.void_miner.tooltip.5", "每消耗 10mB 的烈焰之炽焱或者极寒之凛冰，温度增加10K或降低6K");
        provider.add("ctnh.void_miner.tooltip.6", "当进入强制降温模式时，只能消耗极寒之凛冰，且消耗量为每降温3K/10mb");
        provider.add("ctnh.void_miner.tooltip.7", "温度越高，虚空采矿场的工作效率越高");
        provider.add("ctnh.void_miner.tooltip.8", "矿石生成随机，生成速率可调节");
        provider.add("ctnh.void_miner.tooltip.9", "矿石生成可通过配置文件控制，支持自定义矿石种类");
        provider.add("large_steel_furnaces", "钢质熔炉");
        provider.add("ctnh.large_steel_furnaces.tooltip.0", "只能使用HV级能源仓及以下等级");
        provider.add("ctnh.large_steel_furnaces.tooltip.1", "最大并行为32");
        provider.add("ctnh.large_steel_furnaces.tooltip.2", "无损超频");
        provider.add("large_steel_alloy_furnace", "钢质合金炉");
        provider.add("advanced_blast_furnace", "高级焦炉");
        provider.add("ctnh.advanced_blast_furnace.tooltip.0", "§6§l自带32并行");
        provider.add("ctnh.advanced_blast_furnace.tooltip.1", "只可运行焦炉配方,且运行配方时间固定为15s");
        provider.add("ctnh.advanced_blast_furnace.tooltip.2", "产生大量的焦化产物与杂酚油");
        provider.add("ctnh.advanced_blast_furnace.tooltip.3", "§c§l不能使用焦炉仓");
        provider.add("large_gas_collection_chamber", "全维度集气");
        provider.add("ctnh.large_gas_collection_chamber.tooltip.0", "这台机器可以收集任意维度的气体");
        provider.add("ctnh.large_gas_collection_chamber.tooltip.1", "由于它的产量较大，建议你用ME输出总成来收集产物");
        provider.add("ctnh.large_gas_collection_chamber.tooltip.2", "无损超频");
        provider.add("fermenting_introduction", "一个专为微生物提供的生长罐，注意时刻关注他！");
        provider.add("large_fermenting_tank", "高效工业化发酵生产");
        provider.add("ctnh.large_fermenting_tank.bio_growth", "可接入附属结构，在对应位置连接上一个大发酵瓶后，可以根据发酵瓶中的液体种类提升保底效率：水(50%)，简易培养基(150%)，无菌培养基(200%)");
        provider.add("large_bottle", "真是一个大罐子");
        provider.add("ctnh.large_bottle.basic", "可以存储10000桶液体");
        provider.add("ctnh.large_bottle.consume", "与大型发酵罐一起使用时，其中的液体会以§e100mb/s§r的速度消耗");
        provider.add("digestion_tank_introduction", "其实产生的是很有价值的原料......");
        provider.add("ctnh.digestion_tank.bio_growth_mechanism", "化粪池堆肥机制：");
        provider.add("ctnh.digestion_tank.bio_growth_temperature", "当化粪池温度处于§236§r至§238§r度之间时为最适生长温度，配方获得1.2倍效率，越偏离最适生长温度，配方效率越低，最低为三分之一");
        provider.add("ctnh.blaze_blast_furnace.pyrotheum", "烈焰之炽焱：%d mB");
        provider.add("ctnh.void_miner.cryotheum", "极寒之凛冰：%d mB");
        provider.add("ctnh.blaze_blast_furnace.consume", "每秒基础消耗§a10mB§r烈焰之炽焱，电压每超过§6HV§r一级，消耗量变为原来的两倍");
        provider.add("ctnh.blaze_blast_furnace.energy", "运行耗能x0.75");
        provider.add("ctnh.blaze_blast_furnace.parallel", "允许一次性处理8个配方");
        provider.add("blaze_blast_furnace", "比电力高炉快");
        provider.add("mana_machine", "魔法，神奇吧");
        provider.add("zenith_machine","§5超越魔法");
        provider.add("ctnh.zenith_laser","机器类型：§e激光蚀刻机§r,§5反相蚀刻§r");
        provider.add("ctnh.zenith_laser_sp","允许使用§5反相蚀刻§r，消耗§5天顶源质§r来将芯片制成晶圆");
        provider.add("ctnh.zenith_circut_assember","机器类型：§e电路组装机§r,§5魔力共振电路组装§r");
        provider.add("ctnh.zenith_circut_assember_sp","允许使用§5魔力共振电路组装§r，以更低电压和特殊材料组装共振电路");
        provider.add("ctnh.zenith_machine_tip","在达到LUV电压后，如果§5天顶源质§r足够，每次运行会消耗(60*(当前电压等级-6))的天顶源质，获得2^(当前电压等级-6)的并行数，最大并行数取决于当前电压。但是不输入天顶源质会损失4并行数。");
        provider.add("ctnh.zenith_waring","注意，源质的消耗与当前你输入的物品数无关，即使没有并行，我也会克扣你的天顶源质，当并行达到上限后仍然会消耗天顶源质，但是消耗量固定为60");
        provider.add("ctnh.basic_mana_machine.mana_consume", "每秒基础消耗4mB液态魔力，电压每超过§7LV§r一级，消耗量变为原来的两倍");
        provider.add("ctnh.advanced_mana_machine.mana_consume", "每秒基础消耗10mB液态魔力，电压每超过§7LV§r一级，消耗量变为原来的两倍");
        provider.add("ctnh.super_mana_machine.mana_consume", "每秒基础消耗12mB液态魔力，电压每超过§7LV§r一级，消耗量变为原来的两倍");
        provider.add("ctnh.mana_macerator", "机器类型：§e研磨机§r");
        provider.add("ctnh.mana_bender", "机器类型：§e卷板机§r");
        provider.add("ctnh.mana_lathe", "机器类型：§e车床§r");
        provider.add("ctnh.mana_assembler", "机器类型：§e组装机§r");
        provider.add("ctnh.mana_wiremill", "机器类型：§e线材轧机§r");
        provider.add("ctnh.mana_mixer", "机器类型：§e搅拌机§r");
        provider.add("ctnh.perfect_overclock", "§a无损超频！§r");
        provider.add("mana_generator_turbine_tier1", "简易魔力转换器");
        provider.add("ctnh.mana_generator_turbine_tier1.basic_power", "§e基础产能功率：§r256 EU/t");
        provider.add("ctnh.mana_generator_turbine_tier1.restriction", "转子支架等级不能超过§bMV§r");
        provider.add("mana_generator_turbine_tier2", "进阶魔力转换器");
        provider.add("ctnh.mana_generator_turbine_tier2.basic_power", "§e基础产能功率：§r256 EU/t");
        provider.add("ctnh.mana_generator_turbine_tier2.restriction", "转子支架等级不能超过§5EV§r");
        provider.add("mana_generator_turbine_tier3", "精密魔力转换器");
        provider.add("ctnh.mana_generator_turbine_tier3.basic_power", "§e基础产能功率：§r1024 EU/t");
        provider.add("ctnh.mana_generator_turbine_tier3.restriction", "转子支架等级不能超过§dLuV§r");
        provider.add("mana_generator_turbine_tier4", "神奇的能量守恒");
        provider.add("ctnh.mana_generator_turbine_tier4.basic_power", "§e基础产能功率：§r4096 EU/t");
        provider.add("ctnh.mana_generator_turbine_tier4.restriction", "转子支架等级不能超过§3ZPM§r");
        provider.add("ctnh.mana_generator_turbine_rune", "在机器内放入符文可以提升发电效率：\n  一级符文：发电量x1.5，消耗量x0.9\n  二级符文：发电量x2，消耗量x0.75\n  三级符文：发电量x3，消耗量x0.6\n  四级符文：发电量x4，消耗量x0.4");
        provider.add("ctnh.machine.super_ebf.tooltip1", "所有配方耗时减半");
        provider.add("ctnh.mega_lcr.recipe_type","化学反应釜 / 大型化学反应釜");
        provider.add("ctnh.mega_oil_cracker.recipe_type", "裂化机");
        provider.add("ctnh.super_ebf.recipe_type","电力高炉");
        provider.add("ctnh.slaughter_house.mechanism", "输入总线放入电动刷怪笼后，机器会自动输出对应怪物的战利品，可放入多个电动刷怪笼");
        provider.add("ctnh.slaughter_house.parallel", "电压每升高1级，虚拟刷怪量会增加4（HV为4）");
        provider.add("ctnh.slaughter_house.health", "§a怪物血量和护甲值越高，配方运行所需时间越长§r");
        provider.add("slaughter_house", "无情的杀戮机器");
        provider.add("ctnh.industrial_primitive_blast_furnace.parallel_count", "并行数：%d");
        provider.add("industrial_primitive_blast_furnace_introduction", "更强大的土高炉，你的炼钢好帮手");
        provider.add("ctnh.industrial_primitive_blast_furnace.temperature", "工业土高炉在持续运行配方时，会不断升温，而一旦中止，则会迅速冷却");
        provider.add("ctnh.industrial_primitive_blast_furnace.parallel", "温度越高，工业土高炉的并行数越高，最高为8并行");
        provider.add("ctnh.industrial_primitive_blast_furnace.efficiency", "温度越高，工业土高炉的效率越高，最高为两倍效率");
        provider.add("sintering_kiln_introduction", "需要通入8192应力使其内部活塞压实待加工料");
        provider.add("decay_pools_machine", "衰变");
        provider.add("ctnh.decay_pools_machine.tooltip.0", "当电路板为0时为不通电状态---不启用世界加速");
        provider.add("ctnh.decay_pools_machine.tooltip.1", "当电路板为1时为通电状态---启用世界加速");
        provider.add("ctnh.decay_pools_machine.tooltip.2", "加速衰变过程");
        provider.add("vacuum_sintering_tower", "真空烧结");
        provider.add("crystallizer", "专业结晶");
        provider.add("ctnh.crystallizer.basic", "结晶器能更加快速的完成晶体配方");
        provider.add("ctnh.crystallizer.coolant", "随着线圈等级上升，工作效率逐级提升");
        provider.add("ctnh.crystallizer.overclock", "可以运行化学气相沉积的配方和部分高压釜的配方");
        provider.add("ctnh.crystallizer.safe", "省材料的最佳帮手");
        provider.add("desalting_introduction", "从海水中烘干出盐，很环保不是吗？");
        provider.add("multiblock.ctnh.water_power_station1", "水量：%d");
        provider.add("multiblock.ctnh.water_power_station.efficiency", "线圈效率：%d%%");
        provider.add("multiblock.ctnh.water_power_station2", "产能功率：%d/%d EU/t");
        provider.add("ctnh.water_power_station.mechanism", "发电量和以控制器为中心，机器长度为半径，高为4的范围内的水量成正比");
        provider.add("ctnh.water_power_station.random", "发电量随机在0.6至1的倍率间波动");
        provider.add("ctnh.zenith_max_parallel","最大并行数：%d");
        provider.add("ctnh.zenith_now_parallel","当前并行数：%d");
        provider.add("ctpp.stress_output","应力输出：%dsu");
        provider.add("water_power_station", "环保能源！");
        provider.add("bio_reactor", "一个大罐子");
        provider.add("ctnh.zenith_tower", "机器类型:蒸馏塔");
        provider.add("ctnh.computer.a1","§c一切伟大之作都需要§4牺牲§r§j来铸就。其他生物或许不能理解，但他们必将§4服从§r。");
        provider.add("ctnh.computer.a2","机器类型:§c突触凝练机");
        provider.add("ctnh.computer.a3","将其他智慧生物作为§4湿件§r来进行运算，获得大量算力，甚至直接做成湿件");
        provider.add("ctnh.computer.a4","机制介绍占位符");
        provider.add("ctnh.computer.a5","该机器会超载所有智慧生物体的大脑。§4不可避免§r地§4永久损坏§r智慧生物的大脑，§4不会留下§r任何掉落物");
        provider.add("ctnh.computer.a6","诸如村民这种§7低智慧§r的新人类的生命与智慧太低了，我们需要§c更加聪明，可爱和生命更高的生物§r");
        provider.add("ctnh.computer.a7","为了无尽的知识，我们必须§4做出一切必要的牺牲§4");
        provider.add("ctnh.season.a1","§9利用季节共振的力量");
        provider.add("ctnh.season.a2","基础应力效率：8192su/t");
        provider.add("ctnh.season.a3","只可放入季节符文\n季节符文与季节相同时，效率和持续时间*8,如果与季节互斥，则效率和持续时间*0.25\n§7注意:由于我水平菜菜，没找到按照配方类型改变效率代码，所以必须在运行一次后机器才能调整效率");
        provider.add("martial_morality_eye", "丐版鸿蒙之眼");
        provider.add("ctnh.martial_morality_eye.tooltip.0", "原始时代时消耗64000mb的蒸汽和64个原石");
        provider.add("ctnh.martial_morality_eye.tooltip.1", "产出主世界和暮色森林以及月球的矿");
        provider.add("ctnh.martial_morality_eye.tooltip.2", "随着电压等级提高能够解锁更多配方");
        provider.add("ctnh.martial_morality_eye.tooltip.3", "在前期比坠星好用");
        provider.add("ctnh.martial_morality_eye.tooltip.4", "结构来源:Twist Space Technology");
        provider.add("ctnh.lp_now","当前含有lp量:%d");
        provider.add("ctnh.lp_max","最大lp量:%d");
        provider.add("ctnh.lp_consumption","消耗/输入的lp量:%.1f");
        provider.add("ctnh.alter.tips1","§4血魔法，就在你家门口！");
        provider.add("ctnh.alter.tips2","与血祭坛相同，该结构有输入LP上限，同时你§4必须通过特定配方来增加其lp§r\n详见JEI以查询增加的配方");
        provider.add("ctnh.alter.tips3","电压每超过HV一级，就增加10000可存储LP上限，达到LUV后每级额外增加30000");
        provider.add("ctnh.alter.tips4","每一个增容符文增加2500LP上限，强化增容符文增加5000,达到LUV后每级额外增加10000/20000LP上限");
        provider.add("ctnh.tier5_rune","五级符文");
        provider.add("ctnh.rune_energy","符文能量：%.2f");
        provider.add("ctnh.rune_consumption","当前消耗符文能量速率:%.2f /100tick");
        provider.add("ctnh.mana_model","当前魔力燃料等级:%d");
        provider.add("ctnh.mana_production","当前发电效率:%.2f");
        provider.add("ctnh.quarsar.tips1","§9魔力§r的§c终极奥秘§r，足以制造§5类星体§r的装置掌握在§6你§r的手中");
        provider.add("ctnh.quarsar.tips2","该机器启动需要§r初始魔力燃料消耗§R，查阅JEI以查找消耗量");
        provider.add("ctnh.quarsar.tips3","§5符文能量§r控制着输出的强度，输入§b五级符文§r来增强符文能量，以加强你的输出,使用§5类星体符文§r产生大量符文能量");
        provider.add("ctnh.quarsar.tips4","§c注意§r：符文能量越高，其消耗速度就§c越快§r，且符文能量低于50时§c效率将会减半！§r");
        provider.add("ctnh.quarsar.tips5","§b好消息§r：这个机器不会爆炸，§c但我不保证未来它不会爆炸！§r");
        provider.add("ctnh.quarsar.tips6","在能量等级高时启动能量等级低的配方§b不需要启动花费§r");
        provider.add("ctnh.quarsar.tips7","该机器能量效率为log((符文能量)/50)+1，最大能量效率为1+1*能量等级");
        provider.add("ctnh.quarsar.tips8","该机器获取符文能量逻辑为：在§5启动前§r读取并消耗每类可消耗符文§c最多各一个§r");
        provider.add("ctnh.quarsar.tips9","该机器拥有时间并行，消耗并行量倍数持续并行量时间");
        provider.add("ctnh.quarsar.tips10","该机器并行量为效率*5");
        provider.add("ctnh.quarsar.tips11","该机器燃料消耗量为1-0.05*Math.max((rune_energy-50)/50,0.75)");
        provider.add("ctnh.quasar_parallel","时间并行:%.2f");
        provider.add("ctnh.consumption_parallel","能源消耗率:%.2f");
        provider.add("ctnh.machine.large_miner.zpm.tooltip", "听说你很担心矿物的来源？");
        provider.add("ctnh.gtceu:eternal_well_of_suffer.0", "机器类型：§e数字化苦难之井§r");
        provider.add("ctnh.gtceu:eternal_well_of_suffer.1", "§8撒旦一觉醒来发现自己掉到榜二了§r");
        provider.add("ctnh.gtceu:eternal_well_of_suffer.2", "享受生灵痛苦的嘶吼吧。§r");
        provider.add("ctnh.gtceu:eternal_well_of_suffer.3", "配方时间始终固定在1s。提高电压等级会提高产出生命源质的产出，等效于无损超频。§r");
        provider.add("ctnh.gtceu:eternal_well_of_suffer.4", "使用残缺的数据模型不会产出任何东西，模型等级越高，产出越多");
        provider.add("ctnh.gtceu:eternal_well_of_suffer.5", "§b灵魂模式：§r");
        provider.add("ctnh.gtceu:eternal_well_of_suffer.6", "灵魂模式下，机器不生产生命源质，而是为下方的§b工业狱火锻炉§r提供意志。");
        provider.add("ctnh.gtceu:eternal_well_of_suffer.7", "两台机器需要共用岩浆池，且控制器必须位于狱火锻炉的正上方。请查阅JEI以获得更多信息。");
        provider.add("ctnh.gtceu:eternal_well_of_suffer.8", "产出生命源质量（mB）/100000的意志。");
        provider.add("ctnh.gtceu:hellforge.0", "机器类型：§e狱火锻炉§r");
        provider.add("ctnh.gtceu:hellforge.1", "§8机器也会有灵魂吗？§r");
        provider.add("ctnh.gtceu:hellforge.2", "运行狱火锻炉的配方，需要满足配方的最小意志条件。§r");
        provider.add("ctnh.gtceu:hellforge.3", "如何向机器内填充意志：§r");
        provider.add("ctnh.gtceu:hellforge.4", "1.在控制器附近用§b感知之剑§r杀死一只浸泡于§c生命源质§r的怪物。获得基于怪物最大生命值的意志。");
        provider.add("ctnh.gtceu:hellforge.5", "§8到控制器的曼哈顿距离小于8即可，不用非得是中间的血杯§r");
        provider.add("ctnh.gtceu:hellforge.6", "2.在控制器附近丢出一块魂石。机器会自动吸取其中的意志。");
        provider.add("ctnh.gtceu:hellforge.7", "3.使用§4永恒苦难之井§r。请查阅对应机器的tooltip§r");
        provider.add("ctnh.gtceu.hellforge.will", "意志：%s");
        provider.add("ctnh.gtceu.hellforge.drain", "最少：%s意志");
        provider.add("ctnh.gtceu.hellforge.minimumdrain", "消耗：%s意志");

        provider.add("ctnh.beams_overload","§c警告：机器过载！！！");
        provider.add("ctnh.beams_crash","§c机器已损坏");
        provider.add("ctnh.beams_mana","当前魔力量:%.2f");
        provider.add("ctnh.twist_consumption","扭曲符文消耗概率:%.2f");
        provider.add("ctnh.starlight_consumption","星光符文消耗概率:%.2f");
        provider.add("ctnh.beams_overload_1","§c机器过载度:%d/%d");
        provider.add("ctnh.beams_overload_2","§c！！！警告：能量溢出！！！");
        provider.add("ctnh.beams_max_mana","魔力上限:%.2f");
        provider.add("ctnh.beams_mana_required","魔力需求:%.2f");
        provider.add("ctnh.beams_mana_consumption","消耗魔力:%.2f");
        provider.add("ctnh.beams_time","运行时间倍率:%.2f");
        provider.add("ctnh.beams_eut_consumption","消耗能量倍率:%.2f");
        provider.add("ctnh.beams_stable","魔力稳定值:%.2f");
        provider.add("ctnh.beams.story1","以往对魔力的研究表明，这种特殊元素有着不同于以往物理体系的机理。魔力与§a硅岩§r一同蕴含极大的能量，但是魔力的能量却很难完全输出，而通过某种效应而消失");
        provider.add("ctnh.beams.story2","同时，魔力的空间扭曲能力会随着魔力的浓度而增大，§l如果能把大量魔力聚集在一起§r，则可以以极高的能量和特殊的空间扭曲能力来模拟另一种特殊的§c“聚变”§r");
        provider.add("ctnh.beams.story3","与三体文明战争中的超级武器戴森光束给予了你启发。虽然魔力无法达到§6恒星§r级别的能量，但是对戴森光束的聚焦模拟也可以使魔力的能量达到§6难以想象§r的水平");
        provider.add("ctnh.beams.story4","末影珍珠的§5量子隧穿效应§r作为该巨构的虫洞，则也许可以绕过三体舰队的§6天枢圣盾§r进行打击，而不需要以往戴森光束的超级能量来过载护盾。");
        provider.add("ctnh.beams.story5","§9那些愚蠢的精灵还在彩虹桥玩他们的过家家，而真正的大魔导师早已经超越了物理与魔法的浅薄认知。");
        provider.add("ctnh.beams.story0","配方类型：§9高能魔力扭曲聚变§r，§c跨纬度打击超级武器");
        provider.add("ctnh.beams.tips1","插入机器的几种§9五级符文§r决定了该机器的各种能力");
        provider.add("ctnh.beams.tips2","§9星空符文§r的能量降低了能源消耗并增强乐机器稳定性");
        provider.add("ctnh.beams.tips3","§c扭曲符文§r的能量降低了所用时间，§c但会让机器更加不稳定");
        provider.add("ctnh.beams.tips4","§d视域符文§r的能量增大了魔力上限和魔力使用效率");
        provider.add("ctnh.beams.tips5","§5类星体符文§r的能量太过强大，§c会直接让机器爆炸！");
        provider.add("ctnh.beams.tips6","§c扭曲§r与§9星空§r的对抗决定了机器的稳定性");
        provider.add("ctnh.beams.tips7","稳定性公式:-((twist_power/3)+((mana/100000)*(Math.max(twist_power/3,1))))+starlight_power*2+10+tier*2),当稳定性低于0时机器会开始过载！");
        provider.add("ctnh.beams.tips8","§c过载度§r每秒提升1且在机器拥有过载度时下§c配方时间会翻4倍§r，当过载度大于一半时会发生§c机器能量泄漏§r，你只能通入魔力稳定剂来稳定过载");
        provider.add("ctnh.beams.tips9","在不处于过载状态下每3秒减少1过载度，§c过载度积累满时机器将会爆炸§r");
        provider.add("ctnh.beams.tips10","§c扭曲符文§r消耗概率公式:每次运行有Math.max((twist_power-3)/3,1)*0.01+(Math.max(starlight_power-twist_power,0)*0.01)+(Math.max((100-mana/100000)*0.0005,0))概率消耗");
        provider.add("ctnh.beams.tips11","§9星空符文§r消耗概率公式:每次运行有Math.max((starlight_power-3)/3,1)*0.01+(Math.max(twist_power-starlight_power,0)*0.01)+(mana/100000*0.005)概率消耗");
        provider.add("ctnh.beams.tips12","该机器无法超频");
        provider.add("ctnh.magic.parrel","当前并行数:%.2f");


        for (var tier : GTMachineUtils.ALL_TIERS) {
            provider.add(CTNHMachines.CIRCUIT_BUS[tier].getBlock(), GTValues.VNF[tier] + "§r芯片总线");
        }
        for (var tier : GTMachineUtils.ELECTRIC_TIERS) {
            provider.add(CTNHMachines.PERSONAL_COMPUTER[tier].getBlock(), GTValues.VNF[tier] + "§r个人计算机");
        }
        for (int tier = GTValues.UHV; tier <= GTValues.MAX; tier++){
            provider.add(CTNHMachines.PARALLEL_HATCH[tier].getBlock(),GTValues.VNF[tier] + "§r并行控制仓");
        }
        for (int tier : GTValues.tiersBetween(LV, HV)){
            provider.add(CTNHMachines.ENERGY_OUTPUT_HATCH_4A_LOWER[tier].getBlock(), "4安" + GTValues.VNF[tier] + "§r动力仓");
        }
        for (int tier : GTValues.tiersBetween(ULV, MV)){
            provider.add(CTNHMachines.ROTOR_HOLDER_EXTEND[tier].getBlock(), GTValues.VNF[tier] + "§r转子支架");
        }

        provider.add(CTNHCreativeModeTabs.MACHINE.get(), "CTNH机器");
        provider.add(CTNHCreativeModeTabs.ITEM.get(), "CTNH物品");
        provider.add(CTNHCreativeModeTabs.BLOCK.get(), "CTNH方块");

        provider.addItem(CTNHItems.GREAT_ASTRONOMY_CIRCUIT_1, "完善的一阶航天数据芯片");
        provider.addItem(CTNHItems.ASTRONOMY_CIRCUIT_1, "一阶航天数据芯片");
        provider.addItem(CTNHItems.TESTING_TERMINAL, "检测终端");
        provider.addItem(CTNHItems.SIMPLE_NUTRITIOUS_MEAL, "简易营养餐");
        provider.addItem(CTNHItems.ANIMAL_EXCRETA, "动物排泄物");
        provider.addItem(CTNHItems.TUMOR, "肿瘤");
        provider.addItem(CTNHItems.HORIZEN_RUNE, "视域符文");
        provider.addItem(CTNHItems.REFINED_IRON_INGOT, "精炼铁方坯");
        provider.addItem(CTNHItems.CORROSIVE_CORE, "腐蚀核心");
        provider.addItem(CTNHItems.VENGEFUL_CORE, "复仇核心");
        provider.addItem(CTNHItems.DESTRUCTIVE_CORE, "破坏核心");
        provider.addItem(CTNHItems.STEADFAST_CORE, "坚毅核心");
        provider.add(CTNHItems.TWIST_RUNE.get(), "扭曲符文");
        provider.add(CTNHItems.STARLIGHT_RUNE.get(), "星光符文");
        provider.add(CTNHItems.QUASAR_RUNE.get(), "§5类星体§r符文");
        provider.add(CTNHItems.PROLIFERATION_RUNE.get(), "增殖符文");
        provider.addBlock(CTNHBlocks.CASING_REFLECT_LIGHT, "反光机械方块");
        provider.addBlock(CTNHBlocks.CASING_OSMIRIDIUM, "铱锇合金机械方块");
        provider.addBlock(CTNHBlocks.CASING_TUNGSTENCU_DIAMOND_PLATING, "W-Cu覆膜金刚石机械方块");
        provider.addBlock(CTNHBlocks.ENERGETIC_PHOTOVOLTAIC_BLOCK, "充能光伏方块");
        provider.addBlock(CTNHBlocks.ZENITH_CASING_BLOCK, "天顶强化机械方块");
        provider.addBlock(CTNHBlocks.ZENITH_EYE, "§5天顶之眼");
        provider.addBlock(CTNHBlocks.ZENITH_CASING_GEARBOX,"天顶强化魔力齿轮箱机械方块");
        provider.addBlock(CTNHBlocks.PULSATING_PHOTOVOLTAIC_BLOCK, "脉冲光伏方块");
        provider.addBlock(CTNHBlocks.VIBRANT_PHOTOVOLTAIC_BLOCK, "振动光伏方块");
        provider.addBlock(CTNHBlocks.PLASMA_COOLED_CORE,"等离子交换热线圈方块");
        provider.addBlock(CTNHBlocks.CASING_NAQUADAH_BLOCK,"铿铀强化硅岩铕机械方块");
        provider.addBlock(CTNHBlocks.CASING_NAQUADAH_ALLOY_BLOCK,"三钛强化中子素硅岩合金机械方块");
        provider.addBlock(CTNHBlocks.CASING_ANTIFREEZE_HEATPROOF_MACHINE,"等离子冷凝机械方块");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKI,"反应堆核心 MKI");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKII,"反应堆核心 MKII");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKIII,"反应堆核心 MKIII");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKIV,"反应堆核心 MKIV");
        provider.addBlock(CTNHBlocks.ANNIHILATE_CORE_MKV,"反应堆核心 MKV");
        provider.addBlock(CTNHBlocks.CASING_ADVANCED_HYPER,"暗物质强化超能硅岩机械方块");
        provider.addBlock(CTNHBlocks.CASING_HYPER,"黑钚强化硅岩合金机械方块");
        provider.addBlock(CTNHBlocks.COIL_ABYSALALLOY, "渊狱合金线圈");
        provider.addBlock(CTNHBlocks.COIL_TITANSTEEL, "泰坦钢线圈");
        provider.addBlock(CTNHBlocks.COIL_PIKYONIUM, "皮卡优线圈");
        provider.addBlock(CTNHBlocks.COIL_BLACKTITANIUM, "黑钛合金线圈");
        provider.addBlock(CTNHBlocks.COIL_STARMETAL, "星辉线圈");
        provider.addBlock(CTNHBlocks.COIL_INFINITY, "无尽线圈");
        provider.addBlock(CTNHBlocks.CASING_SPACE_ELEVATOR_MECHANICAL, "太空电梯机械方块");
        provider.addBlock(CTNHBlocks.HIGH_GRADE_COKE_OVEN_BRICKS, "高级焦炉砖");
        provider.addBlock(CTNHBlocks.SPACE_ELEVATOR_POWER_CORE, "太空电梯维持反应堆核心");
        provider.addBlock(CTNHBlocks.BLAZE_BLAST_FURNACE_CASING, "炽焱高炉机械外壳");
        provider.addBlock(CTNHBlocks.MANA_STEEL_CASING,"魔力钢机械外壳");
        provider.addBlock(CTNHBlocks.TERRA_STEEL_CASING,"泰拉钢机械外壳");
        provider.addBlock(CTNHBlocks.ELEMENTIUM_CASING,"源质钢机械外壳");
        provider.addBlock(CTNHBlocks.ALF_STEEL_CASING,"精灵钢机械外壳");
        provider.addBlock(CTNHBlocks.DEPTH_FORCE_FIELD_STABILIZING_CASING,"深度力场稳定外壳");
        provider.addBlock(CTNHBlocks.BRONZE_FRAMED_GLASS, "青铜镶边玻璃");
        provider.addBlock(CTNHBlocks.BIO_REACTOR_CASING, "生物反应器外壳");
        provider.addBlock(CTNHBlocks.ELEMENTIUM_NORMAL_FLUID_PIPE,"源质管道方块");
        provider.addBlock(CTNHBlocks.CASING_MANASTEEL_GEARBOX,"魔力钢齿轮箱方块");
        provider.addBlock(CTNHBlocks.RESERVOIR_COMPUTING_CASING,"高能突触机器外壳");
        provider.addBlock(CTNHBlocks.CASING_NAQUADAH_GEARBOX, "硅岩合金齿轮箱机械方块");
        provider.addBlock(CTNHBlocks.CASING_ULTIMATE_ENGINE_INTAKE, "无尽引擎进气机械方块");
        provider.addBlock((CTNHBlocks.COIL_ULTRA_MANA),"类星体魔力线圈方块");
        provider.addBlock(CTNHBlocks.ELEMENTIUM_PIPE_CASING, "源质钢管道机械方块");
        // provider.addBlock(CTNHBlocks.COMPUTER_HEAT_VENT_SIDE2,"高能机器散热口");
        provider.addBlock(CTNHBlocks.QUASAR_ENERGY_STABILIZATION_CASING,"类星体能量稳定机械外壳");
        provider.add(CTNHMultiblockMachines.UNDERFLOOR_HEATING_SYSTEM.getBlock(), "地暖");
        provider.add(CTNHMultiblockMachines.ASTRONOMICAL_OBSERVATORY.getBlock(), "天文台");
        provider.add(CTNHMultiblockMachines.PHOTOVOLTAIC_POWER_STATION_ENERGETIC.getBlock(), "充能光伏发电站");
        provider.add(CTNHMultiblockMachines.PHOTOVOLTAIC_POWER_STATION_PULSATING.getBlock(), "脉冲光伏发电站");
        provider.add(CTNHMultiblockMachines.PHOTOVOLTAIC_POWER_STATION_VIBRANT.getBlock(), "振动光伏发电站");
        provider.add(CTNHMultiblockMachines.WIND_POWER_ARRAY.getBlock(), "风力发电阵列");
        provider.add(CTNHMultiblockMachines.ADVANCED_WIND_POWER_ARRAY.getBlock(), "进阶风力发电阵列");
        provider.add(CTNHMultiblockMachines.SUPER_WIND_POWER_ARRAY.getBlock(), "超级风力发电阵列");
        provider.add(CTNHMultiblockMachines.SLAUGHTER_HOUSE.getBlock(), "屠宰场");
        provider.add(CTNHMultiblockMachines.BIG_DAM.getBlock(), "三峡大坝");
        provider.add(CTNHMultiblockMachines.COKE_OVEN.getBlock(), "焦化塔");
        provider.add(CTNHMultiblockMachines.PLASMA_CONDENSER.getBlock(),"等离子冷凝器");
        provider.add(CTNHMultiblockMachines.ZENITH_LASER.getBlock(), "§5天顶激光蚀刻机");
        provider.add(CTNHMultiblockMachines.BEDROCK_DRILLING_RIGS.getBlock(), "基岩钻机");
        provider.add(CTNHMultiblockMachines.NAQ_REACTOR_MK1.getBlock(),"超能反应堆 MKI");
        provider.add(CTNHMultiblockMachines.NAQ_REACTOR_MK2.getBlock(),"超能反应堆 MKII");
        provider.add(CTNHMultiblockMachines.NAQ_REACTOR_MK3.getBlock(),"超能反应堆 MKIII");
        provider.add(CTNHMultiblockMachines.SWEATSHOP.getBlock(),"§4血汗工厂");
        provider.add(CTNHMultiblockMachines.DEMON_WILL_GENERATOR.getBlock(),"§b恶魔意志发电机");
        provider.add(CTNHMultiblockMachines.MEADOW.getBlock(),"§6牧场");
        provider.add(CTNHMultiblockMachines.FERMENTING_TANK.getBlock(), "发酵罐");
        provider.add(CTNHMultiblockMachines.LARGE_FERMENTING_TANK.getBlock(), "大型发酵罐");
        provider.add(CTNHMultiblockMachines.DIGESTION_TANK.getBlock(),"化粪池");
        provider.add(CTNHMultiblockMachines.BLAZE_BLAST_FURNACE.getBlock(), "§c炽焱高炉");
        provider.add(CTNHMultiblockMachines.MANA_MACERATOR.getBlock(),"§b魔力粉碎机");
        provider.add(CTNHMultiblockMachines.MANA_BENDER.getBlock(),"§b魔力卷板机");
        provider.add(CTNHMultiblockMachines.MANA_WIREMILL.getBlock(),"§b魔力线材轧机");
        provider.add(CTNHMultiblockMachines.MANA_LATHE.getBlock(),"§b魔力车床");
        provider.add(CTNHMultiblockMachines.MANA_ASSEMBLER.getBlock(),"§b魔力组装机");
        provider.add(CTNHMultiblockMachines.LARGE_BOTTLE.getBlock(), "发酵瓶");
        provider.add(CTNHMultiblockMachines.MANA_GENERATOR_TIER1.getBlock(), "魔力涡轮发电机MK1");
        provider.add(CTNHMultiblockMachines.MANA_GENERATOR_TIER2.getBlock(), "魔力涡轮发电机MK2");
        provider.add(CTNHMultiblockMachines.MANA_GENERATOR_TIER3.getBlock(), "魔力涡轮发电机MK3");
        provider.add(CTNHMultiblockMachines.MANA_GENERATOR_TIER4.getBlock(), "魔力涡轮发电机MK4");
        provider.add(CTNHMultiblockMachines.SUPER_EBF.getBlock(),"超级电力高炉");
        provider.add(CTNHMultiblockMachines.MEGA_LCR.getBlock(), "巨型化学反应釜");
        provider.add(CTNHMultiblockMachines.EV_CHEMICAL_GENERATOR.getBlock(), "化学能发电机");
        provider.add(CTNHMultiblockMachines.IV_CHEMICAL_GENERATOR.getBlock(), "化学能吞噬者");
        provider.add(CTNHMultiblockMachines.MEGA_OIL_CRACKING_UNIT.getBlock(), "巨型原油裂解厂");
        provider.add(CTNHMultiblockMachines.INDUSTRIAL_PRIMITIVE_BLAST_FURNACE.getBlock(), "工业土高炉");
        provider.add(CTNHMultiblockMachines.VOID_MINER.getBlock(), "虚空采矿场");
        provider.add(CTNHMultiblockMachines.SINTERING_KILN.getBlock(), "烧结窑");
        provider.add(CTNHMultiblockMachines.CHEMICAL_VAPOR_DEPOSITION_MACHINE.getBlock(), "化学气相沉积器");
        provider.add(CTNHMultiblockMachines.MARTIAL_MORALITY_EYE.getBlock(),"武德之眼");
        provider.add(CTNHMultiblockMachines.ADVANCED_COKE_OVEN.getBlock(),"高级焦炉");
        provider.add(CTNHMultiblockMachines.DIMENSIONAL_GAS_COLLECTION_CHAMBER.getBlock(),"维度集气室");
        provider.add(CTNHMultiblockMachines.CONDENSING_DISCRETE.getBlock(),"冷凝离散塔");
        provider.add(CTNHMultiblockMachines.ION_EXCHANGER.getBlock(),"离子交换机");
        provider.add(CTNHMultiblockMachines.LARGE_STEEL_FURNACE.getBlock(),"大型钢制熔炉");
        provider.add(CTNHMultiblockMachines.LARGE_STEEL_ALLOY_FURNACE.getBlock(),"大型钢制合金炉");
        provider.add(CTNHMultiblockMachines.ZPM_LARGE_MINER.getBlock(),"§c精英大型采矿机 III§r");
        provider.add(CTNHMultiblockMachines.DECAY_POOLS.getBlock(), "衰变罐");
        provider.add(CTNHMultiblockMachines.FUEL_REFINING_FACTORY.getBlock(), "燃料精炼厂");
        provider.add(CTNHMultiblockMachines.VACUUM_SINTERING_TOWER.getBlock(), "真空烧结厂");
        provider.add(CTNHMultiblockMachines.CRYSTALLIZER.getBlock(), "结晶器");
        provider.add(CTNHMultiblockMachines.WATER_POWER_STATION.getBlock(), "水电站");
        provider.add(CTNHMultiblockMachines.SEAWATER_DESALTING_FACTORY.getBlock(), "海水晒盐工厂");
        provider.add(CTNHMultiblockMachines.BIO_REACTOR.getBlock(), "生物反应器");
        provider.add(CTNHMultiblockMachines.MANA_MIXER.getBlock(),"§b魔力搅拌机");
        provider.add(CTNHMultiblockMachines.ZENITH_CIRCUIT_ASSEMBLER.getBlock(), "§5天顶电路组装机§r");
        provider.add(CTNHMultiblockMachines.ZENITH_DISTILLATION_TOWER.getBlock(),"§5天顶聚焦蒸馏塔");
        provider.add(CTNHMultiblockMachines.SCALABLE_RESERVOIR_COMPUTING.getBlock(), "§j突触凝练机");
        provider.add(CTNHMultiblockMachines.SEASON_REACTOR.getBlock(), "§b季节共振器");
        provider.add(CTNHMultiblockMachines.SILICA_ROCK_FUEL_REFINERY.getBlock(),"硅岩燃料精炼厂");
        provider.add(CTNHMultiblockMachines.ULTIMATE_COMBUSTION_ENGINE.getBlock(), "无尽内燃引擎");
        provider.add(CTNHMultiblockMachines.ALTER.getBlock(), "§b工业血之祭坛");
        provider.add(CTNHMultiblockMachines.EYE_OF_QUASAR.getBlock(), "§5类星体§r§1之§c眼");
        provider.add(CTNHMultiblockMachines.ETERNAL_WELL_OF_SUFFER.getBlock(), "§4永恒苦难之井§r");
        provider.add(CTNHMultiblockMachines.HELLFORGE.getBlock(), "§b工业狱火锻炉§r");
        provider.add(CTNHMultiblockMachines.NICOLL_DYSON_BEAMS.getBlock(), "§9尼魔尔—戴森光束");





    }
    public static void replace(@NotNull RegistrateCNLangProvider provider, @NotNull String key,
                               @NotNull String value) {
        try {
            // the regular lang mappings
            Field field = LanguageProvider.class.getDeclaredField("data");
            field.setAccessible(true);
            // noinspection unchecked
            Map<String, String> map = (Map<String, String>) field.get(provider);
            map.put(key, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Error replacing entry in datagen.", e);
        }
    }
}
