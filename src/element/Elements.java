package element;

public class Elements {

    private static final Element HYDROGÈNE = new Element(1, 1.007975);
    private static final Element HELIUM = new Element(2, 4.002602);
    private static final Element LITHIUM = new Element(3, 6.9395);
    private static final Element BÉRYLLIUM = new Element(4, 9.0121831);
    private static final Element BORE = new Element(5, 10.8135);
    private static final Element CARBONE = new Element(6, 12.0106);
    private static final Element AZOTE = new Element(7, 14.006855);
    private static final Element OXYGÈNE = new Element(8, 15.99940);
    private static final Element FLUOR = new Element(9, 18.99840316);
    private static final Element NÉON = new Element(10, 20.1797);
    private static final Element SODIUM = new Element(11, 22.98976928);
    private static final Element MAGNÉSIUM = new Element(12, 24.3055);
    private static final Element ALUMINIUM = new Element(13, 26.9815385);
    private static final Element SILICIUM = new Element(14, 28.085);
    private static final Element PHOSPHORE = new Element(15, 30.97376200);
    private static final Element SOUFRE = new Element(16, 32.0675);
    private static final Element CHLORE = new Element(17, 35.4515);
    private static final Element ARGON = new Element(18, 39.948);
    private static final Element POTATIUM = new Element(19, 39.0983);
    private static final Element CALCIUM = new Element(20, 40.078);
    private static final Element SCANDIUM = new Element(21, 44.955908);
    private static final Element TITANE = new Element(22, 47.867);
    private static final Element VANADIUM = new Element(23, 50.9415);
    private static final Element CHROME = new Element(24, 51.9961);
    private static final Element MANGANÈSE = new Element(25, 54.938044);
    private static final Element FER = new Element(26, 55.845);
    private static final Element COBALT = new Element(27, 58.933194);
    private static final Element NICKEL = new Element(28, 58.6934);
    private static final Element CUIVRE = new Element(29, 63.546);
    private static final Element ZINC = new Element(30, 65.38);
    private static final Element GALLIUM = new Element(31, 69.723);
    private static final Element GERMANIUM = new Element(32, 72.630);
    private static final Element ARSENIC = new Element(33, 74.921595);
    private static final Element SÉLÉNIUM = new Element(34, 78.971);
    private static final Element BROME = new Element(35, 79.904);
    private static final Element KRYPTON = new Element(36, 83.798);
    private static final Element RUBIDIUM = new Element(37, 85.4678);
    private static final Element STRONTIUM = new Element(38, 87.62);
    private static final Element YTTRIUM = new Element(39, 88.90584);
    private static final Element ZIRCONIUM = new Element(40, 91.224);
    private static final Element NIOBIUM = new Element(41, 92.90637);
    private static final Element MOLYDÈNE = new Element(42, 95.95);
    private static final Element TECHNÉTIUM = new Element(43, 98);
    private static final Element RUTHÉNIUM = new Element(44, 101.07);
    private static final Element RHODIUM = new Element(45, 102.90550);
    private static final Element PALLADIUM = new Element(46, 106.42);
    private static final Element ARGENT = new Element(47, 107.8682);
    private static final Element CADMIUM = new Element(48, 112.414);
    private static final Element INDIUM = new Element(49, 114.818);
    private static final Element ÉTAIN = new Element(50, 118.710);
    private static final Element ANTIMOINE = new Element(51, 121.760);
    private static final Element TELLURE = new Element(52, 127.60);
    private static final Element IODE = new Element(53, 126.90447);
    private static final Element XÉNON = new Element(54, 131.293);
    private static final Element CÉSIUM = new Element(55, 132.905452);
    private static final Element BARYUM = new Element(56, 137.327);
    private static final Element LANTHANE = new Element(57, 138.90547);
    private static final Element CÉRIUM = new Element(58, 140.116);
    private static final Element PRASÉODYNE = new Element(59, 140.90766);
    private static final Element NÉODYME = new Element(60, 144.242);
    private static final Element PROMÉTHIUM = new Element(61, 145);
    private static final Element SAMARIUM = new Element(62, 150.36);
    private static final Element EUROPIUM = new Element(63, 151.964);
    private static final Element GADOLINIUM = new Element(64, 157.25);
    private static final Element TERBIUM = new Element(65, 158.92535);
    private static final Element DYSPROSIUM = new Element(66, 162.500);
    private static final Element HOLMIUM = new Element(67, 164.93033);
    private static final Element ERBIUM = new Element(68, 167.259);
    private static final Element THULIUM = new Element(69, 168.93422);
    private static final Element YTTERBIUM = new Element(70, 173.045);
    private static final Element LUTÉCIUM = new Element(71, 174.9668);
    private static final Element HALNIUM = new Element(72, 178.49);
    private static final Element TANTALE = new Element(73, 180.94788);
    private static final Element TUNGSTÈNE = new Element(74, 183.84);
    private static final Element RHÉNIUM = new Element(75, 186.207);
    private static final Element OSMIUM = new Element(76, 190.23);
    private static final Element IRIDIUM = new Element(77, 192.217);
    private static final Element PLATINE = new Element(78, 195.084);
    private static final Element OR = new Element(79, 196.966569);
    private static final Element MERCURE = new Element(80, 200.592);
    private static final Element THALLIUM = new Element(81, 204.3835);
    private static final Element PLOMB = new Element(82, 207.2);
    private static final Element BISMUTH = new Element(83, 208.98040);
    private static final Element POLONIUM = new Element(84, 209);
    private static final Element ASTATE = new Element(85, 210);
    private static final Element RADON = new Element(86, 222);
    private static final Element FRANCIUM = new Element(87, 223);
    private static final Element RADIUM = new Element(88, 226);

    public static Element[] listElement = { HYDROGÈNE, HELIUM, LITHIUM, BÉRYLLIUM, BORE, CARBONE, AZOTE, OXYGÈNE, FLUOR, NÉON,
            SODIUM, MAGNÉSIUM, ALUMINIUM, SILICIUM, PHOSPHORE, SOUFRE, CHLORE, ARGON,
            POTATIUM, CALCIUM, SCANDIUM, TITANE, VANADIUM, CHROME, MANGANÈSE, FER, COBALT, NICKEL, CUIVRE, ZINC, GALLIUM, GERMANIUM, ARSENIC, SÉLÉNIUM, BROME, KRYPTON,
            RUBIDIUM, STRONTIUM, YTTRIUM, ZIRCONIUM, NIOBIUM, MOLYDÈNE, TECHNÉTIUM, RUTHÉNIUM, RHODIUM, PALLADIUM, ARGENT, CADMIUM, INDIUM, ÉTAIN, ANTIMOINE, TELLURE, IODE, XÉNON,
            CÉSIUM, BARYUM, LANTHANE, CÉRIUM, PRASÉODYNE, NÉODYME, PROMÉTHIUM, SAMARIUM, EUROPIUM, GADOLINIUM, TERBIUM, DYSPROSIUM, HOLMIUM, ERBIUM, THULIUM, YTTERBIUM, LUTÉCIUM, HALNIUM, TANTALE, TUNGSTÈNE, RHÉNIUM, OSMIUM, IRIDIUM, PLATINE, OR, MERCURE, THALLIUM, PLOMB, BISMUTH, POLONIUM, ASTATE, RADON,
            FRANCIUM, RADIUM
    };

    public static String[] symbolElement = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S",
            "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se",
            "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I",
            "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu",
            "Hf", "Ta", "W", "Re", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra"
    };

    public static String[] fullNameElement = {"hydrogène", "helium", "lithium", "béryllium", "bore", "carbone", "azote", "oxygène",
            "fluor", "néon", "sodium", "magnésium", "aluminium", "silicium", "phosphore", "soufre", "chlore", "argon",
            "potatium", "calcium", "scandium", "titane", "vanadium", "chrome", "manganèse", "fer", "cobalt", "nickel",
            "cuivre", "zinc", "gallium", "germanium", "arsenic", "sélénium", "brome", "krypton", "rubidium", "strontium",
            "yttrium", "zirconium", "niobium", "molydène", "technétium", "ruthénium", "rhodium", "palladium", "argent",
            "cadmium", "indium", "étain", "antimoine", "tellure", "iode", "xénon", "césium", "baryum", "lanthane",
            "cérium", "praséodyne", "néodyme", "prométhium", "samarium", "europium", "gadolinium", "terbium", "dysprosium",
            "holmium", "erbium", "thulium", "ytterbium", "lutécium", "halnium", "tantale", "tungstène", "rhénium",
            "osmium", "iridium", "platine", "or", "mercure", "thallium", "plomb", "bismuth", "polonium", "astate",
            "radon", "francium", "radium"
    };
}
