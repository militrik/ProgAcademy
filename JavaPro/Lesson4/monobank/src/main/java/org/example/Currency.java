package org.example;

import java.util.Map;

public class Currency {
    private int currencyCodeA;
    private int currencyCodeB;
    private long date;
    private Double rateSell;
    private Double rateBuy;
    private Double rateCross;

    static final Map<String, Integer> countryCurrencyCodes = Map.<String, Integer>ofEntries(
            Map.entry("AFN", 971),
            Map.entry("ALL", 8),
            Map.entry("DZD", 12),
            Map.entry("USD", 840),
            Map.entry("EUR", 978),
            Map.entry("AOA", 973),
            Map.entry("XCD", 951),
            Map.entry("ARS", 32),
            Map.entry("AMD", 51),
            Map.entry("AWG", 533),
            Map.entry("AUD", 36),
            Map.entry("AZN", 944),
            Map.entry("BSD", 44),
            Map.entry("BHD", 48),
            Map.entry("BDT", 50),
            Map.entry("BBD", 52),
            Map.entry("BYN", 933),
            Map.entry("BZD", 84),
            Map.entry("XOF", 952),
            Map.entry("BMD", 60),
            Map.entry("BTN", 64),
            Map.entry("INR", 356),
            Map.entry("BOB", 68),
            Map.entry("BOV", 984),
            Map.entry("BAM", 977),
            Map.entry("BWP", 72),
            Map.entry("NOK", 578),
            Map.entry("BRL", 986),
            Map.entry("BND", 96),
            Map.entry("BGN", 975),
            Map.entry("BIF", 108),
            Map.entry("CVE", 132),
            Map.entry("KHR", 116),
            Map.entry("XAF", 950),
            Map.entry("CAD", 124),
            Map.entry("KYD", 136),
            Map.entry("CLF", 990),
            Map.entry("CLP", 152),
            Map.entry("CNY", 156),
            Map.entry("COP", 170),
            Map.entry("COU", 970),
            Map.entry("KMF", 174),
            Map.entry("CDF", 976),
            Map.entry("NZD", 554),
            Map.entry("CRC", 188),
            Map.entry("HRK", 191),
            Map.entry("CUC", 931),
            Map.entry("CUP", 192),
            Map.entry("ANG", 532),
            Map.entry("CZK", 203),
            Map.entry("DKK", 208),
            Map.entry("DJF", 262),
            Map.entry("DOP", 214),
            Map.entry("EGP", 818),
            Map.entry("SVC", 222),
            Map.entry("ERN", 232),
            Map.entry("ETB", 230),
            Map.entry("FKP", 238),
            Map.entry("FJD", 242),
            Map.entry("XPF", 953),
            Map.entry("GMD", 270),
            Map.entry("GEL", 981),
            Map.entry("GHS", 936),
            Map.entry("GIP", 292),
            Map.entry("GTQ", 320),
            Map.entry("GBP", 826),
            Map.entry("GNF", 324),
            Map.entry("GYD", 328),
            Map.entry("HTG", 332),
            Map.entry("HNL", 340),
            Map.entry("HKD", 344),
            Map.entry("HUF", 348),
            Map.entry("ISK", 352),
            Map.entry("IDR", 360),
            Map.entry("XDR", 960),
            Map.entry("IRR", 364),
            Map.entry("IQD", 368),
            Map.entry("ILS", 376),
            Map.entry("JMD", 388),
            Map.entry("JPY", 392),
            Map.entry("JOD", 400),
            Map.entry("KZT", 398),
            Map.entry("KES", 404),
            Map.entry("KPW", 408),
            Map.entry("KRW", 410),
            Map.entry("KWD", 414),
            Map.entry("KGS", 417),
            Map.entry("LAK", 418),
            Map.entry("LBP", 422),
            Map.entry("LSL", 426),
            Map.entry("ZAR", 710),
            Map.entry("LRD", 430),
            Map.entry("LYD", 434),
            Map.entry("CHF", 756),
            Map.entry("MOP", 446),
            Map.entry("MGA", 969),
            Map.entry("MWK", 454),
            Map.entry("MYR", 458),
            Map.entry("MVR", 462),
            Map.entry("MRU", 929),
            Map.entry("MUR", 480),
            Map.entry("XUA", 965),
            Map.entry("MXN", 484),
            Map.entry("MXV", 979),
            Map.entry("MDL", 498),
            Map.entry("MNT", 496),
            Map.entry("MAD", 504),
            Map.entry("MZN", 943),
            Map.entry("MMK", 104),
            Map.entry("NAD", 516),
            Map.entry("NPR", 524),
            Map.entry("NIO", 558),
            Map.entry("NGN", 566),
            Map.entry("OMR", 512),
            Map.entry("PKR", 586),
            Map.entry("PAB", 590),
            Map.entry("PGK", 598),
            Map.entry("PYG", 600),
            Map.entry("PEN", 604),
            Map.entry("PHP", 608),
            Map.entry("PLN", 985),
            Map.entry("QAR", 634),
            Map.entry("MKD", 807),
            Map.entry("RON", 946),
            Map.entry("RUB", 643),
            Map.entry("RWF", 646),
            Map.entry("SHP", 654),
            Map.entry("WST", 882),
            Map.entry("STN", 930),
            Map.entry("SAR", 682),
            Map.entry("RSD", 941),
            Map.entry("SCR", 690),
            Map.entry("SLE", 925),
            Map.entry("SGD", 702),
            Map.entry("XSU", 994),
            Map.entry("SBD", 90),
            Map.entry("SOS", 706),
            Map.entry("SSP", 728),
            Map.entry("LKR", 144),
            Map.entry("SDG", 938),
            Map.entry("SRD", 968),
            Map.entry("SZL", 748),
            Map.entry("SEK", 752),
            Map.entry("CHE", 947),
            Map.entry("CHW", 948),
            Map.entry("SYP", 760),
            Map.entry("TWD", 901),
            Map.entry("TJS", 972),
            Map.entry("TZS", 834),
            Map.entry("THB", 764),
            Map.entry("TOP", 776),
            Map.entry("TTD", 780),
            Map.entry("TND", 788),
            Map.entry("TRY", 949),
            Map.entry("TMT", 934),
            Map.entry("UGX", 800),
            Map.entry("UAH", 980),
            Map.entry("AED", 784),
            Map.entry("USN", 997),
            Map.entry("UYI", 940),
            Map.entry("UYU", 858),
            Map.entry("UZS", 860),
            Map.entry("VUV", 548),
            Map.entry("VEF", 937),
            Map.entry("VED", 926),
            Map.entry("VND", 704),
            Map.entry("YER", 886),
            Map.entry("ZMW", 967),
            Map.entry("ZWL", 932)

    );

    public int getCurrencyCodeA() {
        return currencyCodeA;
    }

    public int getCurrencyCodeB() {
        return currencyCodeB;
    }

    public long getDate() {
        return date;
    }

    public Double getRateSell() {
        return rateSell;
    }

    public Double getRateBuy() {
        return rateBuy;
    }

    public Double getRateCross() {
        return rateCross;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currencyCodeA=" + currencyCodeA +
                ", currencyCodeB=" + currencyCodeB +
                ", date=" + date +
                ", rateSell=" + rateSell +
                ", rateBuy=" + rateBuy +
                ", rateCross=" + rateCross +
                '}';
    }
}
