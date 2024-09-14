package com.pinapelz.vtuber;

/**
 * <p>Organization class.</p>
 *
 * @author pinapelz
 * @version $Id: $Id
 */
public enum Organization {
    HOLOLIVE("Hololive"),
    NIJISANJI("Nijisanji"),
    INDEPENDENT("Independent"),
    DOT_LIVE(".LIVE"),
    INC_774("774inc"),
    AOGIRI_HIGHSCHOOL("Aogiri Highschool"),
    ATELIER_LIVE("Atelier Live"),
    AXEL_V("Axel-V"),
    AETHERIA("Aetheria"),
    AKIO_AIR("AkioAir"),
    ALGORHYTHM_PROJECT("Algorhythm Project"),
    CHUKORARA("Chukorara"),
    CLOUD_HORIZON("Cloud Horizon"),
    CONNECTOPIA("Connectopia"),
    EILENE_FAMILY("Eilene Family"),
    EMOECHI("Emoechi"),
    EIEN_PROJECT("Eien Project"),
    FIRST_STAGE_PRODUCTION("FIRST STAGE PRODUCTION"),
    GUILD_CQ("Guild CQ"),
    GLOBIE("globie"),
    HOSHIMEGURI_GAKUEN("Hoshimeguri Gakuen"),
    HDOT_LIVE("H.Live"),
    IRIDORI("Iridori"),
    IDOL_CORP("idol Corp"),
    KAMITSUBAKI("KAMITSUBAKI"),
    KIZUNA_AI("Kizuna AI Inc."),
    KAWAII_MUSIC("KAWAII MUSIC"),
    KEMOMIMI_REFLEX("KEMOMIMI REFLE"),
    KEMONO_FRIENDS("Kemono Friends"),
    LA_PECHE_PARTY("La Peche Party"),
    MARBL_S("Marbl_s"),
    MASQUERADE("Masquerade"),
    MAHA5("MAHA5"),
    MYHOLO_TV("MyHolo TV"),
    MERIDIAN_PROJECT("Meridian Project"),
    MILLION_PRODUCTION("Million Production"),
    M_ENTERTAINMENT("M.Entertainment"),
    MIXSTGIRLS("Mixstgirls"),
    NORI_PRO("Nori Pro"),
    NIJIGEN("NIJIGEN"),
    NEO_PORTE("Neo-Porte"),
    NKSHOUJO("NKShouji"),
    NANAHOLIC("Nanaholic"),
    PRODUCTION_KAWAII("Production Kawaii"),
    POLYGON("Polygon"),
    PHASE_CONNECT("Phase Connect"),
    PIXELA_PROJECT("Pixela Project"),
    PRISM("PRISM"),
    PROPRO("ProPro"),
    PINK_PUNK_PRO("Pink Punk Pro"),
    PIXEL_LINK("PixelLink"),
    RIOT_MUSIC("Riot Music"),
    REACT("ReAcT"),
    REMEMORIES("ReMemories"),
    REVOLUTION_HEART("Revolution Heart"),
    RENEW_LIVE("RenewLive"),
    SLEEP_MONSTER("Sleep Monster"),
    SQUARE_LIVE("Square Live"),
    SNACKNILIVE("Snacknili"),
    SHINSOGUMI("Shinosogumi"),
    SHEERMUSICV("SheerMusicV (シアーミュージックV)"),
    SEDAI_ONE("Sedai One"),
    TSUNDERIA("Tsunderia"),
    TWITCH_INDEPENDENTS("Twitch Independents"),
    THE_BOX("The Box"),
    UNREAL_NIGHT_GIRLS("Unreal Night Girls"),
    V_DIMENSION_DOT_CREATORS("V Dimension.Creators"),
    VOICE_ORE("VOICE-ORE"),
    V_AND_U("V&U"),
    VIVID("ViViD"),
    VOMS("VOMS"),
    VSHOJO("VShojo"),
    VSPO("VSpo"),
    VARIUM("Varium"),
    VREVERIE("VReverie"),
    VEE("VEE"),
    V4MIRAI("V4Mirai"),
    WACTOR("WACTOR"),
    WAK_ENTERTAINMENT("WAK Entertainment"),
    X_ENCOUNT("X enc'ount"),
    XTREME_DEEP_FIELD_PROJECT("Xtreme Deep Field Project"),
    YUNI_CREATE("Yuni Create"),
    YUMELIVE("YumeLive");

    public final String name;

    Organization(String name) {
        this.name = name;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return name;
    }

    public boolean isOrg(String org) {
        return this.name.equals(org);
    }




}
