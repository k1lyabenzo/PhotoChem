package Reactions;

public class Reactions_Compare {
    public static final String[][] reaction_compare_H = {
        {"H2", "Li", "H2+2Li→2LiH"},//1
        {"H2", "Be", "H2+Be→BeH2"},//2
        {"H2", "B", "3H2+2B→B2H6"},//3
        {"H2", "C", "2H2+C→2HC2/2H2+C→CH4"},//4
        {"H2", "N2", "3H2+N2→2NH3"},//5
        {"H2", "O2", "2H2+O2→2H2O"},//6
        {"H2", "F2", "H2+F2→2HF"},//7
        {"H2", "Na", "H2+2Na→2NaH"},//8
        {"H2", "Mg", "H2+Mg→MgH2/H2+2Mg→2MgH/H2+Mg→H2Mg/H2+4Mg→2Mg2H/H2+2Mg→Mg2H2/3H2+2Mg→2MgH3"},//9
        {"H2", "Al", "3H2+2Al→2AlH3/H2+2Al→2AlH/H2+Al→AlH2"},//10
        {"H2", "Si", "2H2+Si→SiH4"},//11
        {"H2", "P", "3H2+P→2PH3/H2+2P→2HP"},//12
        {"H2", "S", "H2+S→H2S"},//13
        {"H2", "Cl2", "H2+Cl2→2HCl"},//14
        {"H2", "K", "H2+2K→2KH/2H2+K→KH4"},//15
        {"H2", "Ca", "H2+Ca→CaH2"},//16
        {"H2", "Fe", "3H2+2Fe→2FeH3/H2+Fe→H2Fe/H2+2Fe→2FeH"},//17
        {"H2", "Cu", "H2+4Cu→H2Cu"},//18
        {"H2", "Zn", "H2+Zn→ZnH2/H2+2Zn→2ZnH/H2+2Zn→2HZn"},//19
        {"H2", "Ga", "3H2+2Ga→Ga2H6/3H2+2Ga→2GaH3"},//20
        {"H2", "Ge", "H2+Ge→GeH2/H2+4Ge→2Ge2H"},//21
        {"H2", "As", "3H2+As→2AsH3"},//22
        {"H2", "Se", "H2+Se→H2Se"},//23
        {"H2", "Br2", "H2+Br2→2HBr"},//24
        {"H2", "Rb", "H2+2Rb→2RbH"},//25
        {"H2", "Sr", "H2+Sr→SrH2/H2+2Sr→2SrH"},//26
        {"H2", "Nb", "5H2+2Nb→2NbH5"},//27
        {"H2", "Ag", "H2+2Ag→2AgH"},//28
        {"H2", "Sn", "H2+Sn→SnH2/2H2+Sn→SnH4"},//29
        {"H2", "Te", "H2+Te→H2Te"},//30
        {"H2", "I2", "H2+I2→2HI"},//31
        {"H2", "Cs", "H2+2Cs→2CsH"},//32
        {"H2", "Ba", "H2+Ba→BaH2/H2+4Ba→2Ba2H/H2+2Ba→2BaH"},//33
        {"H2", "Pb", "H2+2Pb→2PbH"},//34
        {"H2", "Fr", "H2+2Fr→2FrH"},//35
        {"H2", "Ra", "H2+2Ra→2RaH/H2+Ra→RaH2"}//36
    };
    public static final String[][] reaction_compare_Li = {
        {"Li", "C", "Li+C→LiC/2Li+2C→Li2C2/4Li+C→Li4C"},//1
        {"Li", "N2", "6Li+N2→2Li3N"},//2
        {"Li", "O2", "4Li+O2→2Li2O"},//3
        {"Li", "F2", "2Li+F2→2LiF"},//4
        {"Li", "Si", "4Li+Si→Li4Si/Li+Si→LiSi"},//5
        {"Li", "P", "3Li+P→Li3P/Li+P→LiP"},//6
        {"Li", "S", "2Li+S→Li2S"},//7
        {"Li", "Cl2", "2Li+Cl2→2LiCl"},//8
        {"Li", "Br2", "2Li+Br2→2LiBr"},//9
        {"Li", "Te", "2Li+Te→Li2Te"},//10
        {"Li", "I2", "2Li+I2→2LiI"}//11
    };
    public static final String[][] reaction_compare_Be = {
        {"Be", "C", "Be+C→CBe/2Be+C→BE2C/Be+2C→BeC2/Be+C→BeC"},//1
        {"Be", "N2", "3Be+N2→Be3N2/Be+N2→BeN2"},//2
        {"Be", "O2", "2Be+O2→2BeO"},//3
        {"Be", "F2", "Be+F2→BeF2/2Be+F2→2BeF"},//4
        {"Be", "P", "3Be+2P→Be3P2"},//5
        {"Be", "S", "Be+S→BeS"},//6
        {"Be", "Cl2", "Be+Cl2→BeCl2"},//7
        {"Be", "I2", "Be+I2→BeI2"}//8
    };
    public static final String[][] reaction_compare_B = {
        {"B", "C", "B+C→BC"},//1
        {"B", "N2", "2B+N2→2BN"},//2
        {"B", "O2", "4B+3O2→2B2O3/2B+O2→2BO"},//3
        {"B", "F2", "2B+3F2→2BF3"},//4
        {"B", "Mg", "B+Mg→MgB"},//5
        {"B", "Al", "3B+Al→AlB3"},//6
        {"B", "S", "2B+3S→B2S3/B+S→BS"},//7
        {"B", "Cl2", "2B+3Cl2→2BCl3/B+2Cl2→BCl4"},//8
        {"B", "Ca", "B+Ca→CaB/2B+Ca→CaB2/2B+3Ca→Ca3B2"},//9
        {"B", "Br2", "2B+3Br2→2BBr3"},//10
        {"B", "Sr", "2B+3Sr→Sr3B2"},//11
        {"B", "I2", "2B+I2→2BI"}//12
    };
    public static final String[][] reaction_compare_C = {
        {"C", "N2", "2C+N2→C2N2/2C+N2→C2N2"},//1
        {"C", "O2", "C+O2→CO2/2C+O2→2CO"},//2
        {"C", "F2", "C+2F2→CF4"},//3
        {"C", "Na", "C+4Na→Na4C/2C+2Na→Na2C2/C+Na→NaC"},//4
        {"C", "Mg", "2C+Mg→MgC2/C+Mg→MgC/C+2Mg→Mg2C"},//5
        {"C", "Al", "3C+4Al→Al4C3/C+Al→AlC"},//6
        {"C", "Si", "C+Si→SiC"},//7
        {"C", "P", "3C+4P→P4C3"},//8
        {"C", "S", "C+2S→CS2"},//9
        {"C", "Cl2", "C+2Cl2→CCl4"},//10
        {"C", "K", "C+4K→K4C/C+K→KC/2C+2K→K2C2"},//11
        {"C", "Ca", "2C+Ca→CaC2"},//12
        {"C", "Ti", "C+Ti→TiC"},//13
        {"C", "Cr", "C+Cr→CrC"},//14
        {"C", "Fe", "C+3Fe→Fe3C/C+Fe→Fec/C+2Fe→Fe2C/4C+3Fe→Fe3C4/3C+4Fe→Fe4C3"},//15
        {"C", "Co", "C+4Co→Co4C"},//16
        {"C", "Cu", "C+4Cu→Cu4C"},//17
        {"C", "Zn", "C+Zn→ZnC/2C+Zn→ZnC2"},//18
        {"C", "Ge", "2C+Ge→C2Ge"},//19
        {"C", "Br2", "C+2Br2→CBr4"},//20
        {"C", "Ag", "5C+3Ag→C5Ag3"},//21
        {"C", "Sn", "C+2Sn→Sn2C"},//22
        {"C", "Ba", "C+Ba→BaC"}//23
    };
    public static final String[][] reaction_compare_N = {
        {"N2", "O2", "N2+O2→2NO/2N2+5O2→2N2O5/N2+2O2→2NO2/2N2+3O2→2N2O3/2N2+O2→2N2O/N2+O2→N2O2/N2+2O2→N2O4/5N2+2O2→2N5O2/3N2+2O2→2N3O2/6N2+O2→2N6O/2N2+O2→N4O2"},//1
        {"N2", "F2", "N2+3F2→2NF3"},//2
        {"N2", "Na", "N2+6Na→2Na3N"},//3
        {"N2", "Mg", "N2+3Mg→Mg3N2"},//4
        {"N2", "Al", "N2+2Al→2AlN"},//5
        {"N2", "Si", "2N2+3Si→Si3N4/N2+2Si→2SiN/N2+3Si→Si3N2/N2+Si→SiN2/2N2+Si→SiN4/N2+6Si→2Si3N"},//6
        {"N2", "P", "5N2+6P→2P3N5"},//7
        {"N2", "S", "N2+2S→2NS/N2+2S→2SN"},//8
        {"N2", "Cl2", "N2+4Cl2→2NCl4/N2+3Cl2→2NCl3/N2+5Cl2→2NCl5"},//9
        {"N2", "K", "N2+6K→2K3N/N2+2K→2KN/N2+4K→2K2N/3N2+2K→2KN3"},//10
        {"N2", "Ca", "N2+3Ca→Ca3N2"},//11
        {"N2", "Ti", "2N2+3Ti→Ti3N4/N2+2Ti→2TiN"},//12
        {"N2", "Cr", "N2+2Cr→2CrN"},//13
        {"N2", "Mn", "N2+3Mn→Mn3N2/5N2+6Mn→2Mn3N5"},//14
        {"N2", "Fe", "N2+4Fe→2Fe2N/N2+3Fe→Fe3N2/N2+2Fe→2FeN/N2+6Fe→2Fe3N"},//15
        {"N2", "Cu", "N2+3Cu→Cu3N2/N2+Cu→N2Cu"},//16
        {"N2", "Zn", "N2+2Zn→2ZnN/N2+3Zn→ZN3N2"},//17
        {"N2","Br2", "N2+3Br2→2NBr3"},//
        {"N2", "Rb", "N2+Rb→RbN2/N2+6Rb→2Rb3N"},//18
        {"N2", "Sr", "N2+3Sr→Sr3N2"},//19
        {"N2", "Ag", "N2+2Ag→2AgN"},//20
        {"N2", "I2", "N2+3I2→2NI3"},//21
        {"N2", "Cs", "N2+6Cs→2Cs3N"},//22
        {"N2", "Ba", "N2+3Ba→Ba3N2/N2+2Ba→2BaN/N2+6Ba→2Ba3N/N2+Ba→BaN2/N2+2Ba→2Ba2N2"},//23
        {"N2", "Hf", "2N2+3Hf→Hf3N4"},//24
        {"N2", "Ti", "2N2+3Ti→Ti3N4/N2+2Ti→2TiN"}//25
    };
    public static final String[][] reaction_compare_O = {
        {"O2", "F2", "O2+2F2=2OF2/O2+2F2=2F2O/02+F2=F2O2/O2+F2=O2F2/7O2+2F2=2F207/3O2+2F2=2F2O3"},//1
        {"O2", "Na", "O2+4Na=2Na2O/O2+2Na=Na2O2"},//2
        {"O2", "Mg", "O2+2Mg=2MgO"},//3
        {"O2", "Al", "3O2+4Al=2Al2O3"},//4
        {"O2", "Si", "O2+Si=SiO2/2O2+Si=SiO4/O2+2Si=2SiO/3O2+2Si=2SiO3"},//5
        {"O2", "P", "5O2+4P=2P2O5"},//6
        {"O2", "S", "O2+S=SO2"},//7
        {"O2", "Cl2", "7O2+2Cl2=2Cl2O7/O2+2Cl2=2Cl2O/5O2+2Cl2=2Cl2O5/O2+Cl2=2ClO/3O2+2Cl2=2Cl2O3/O2+Cl2=Cl2O2/2O2+Cl2=2ClO2/7O2+Cl2=2ClO7/3O2+Cl2=2ClO3/2O2+27Cl2=2Cl27O2/O2+2Cl2=2OCl2"},//8
        {"O2", "K", "O2+4K=2K2O/O2+K=KO2/O2+2K=K2O2/O2+2K=2KO/3O2+2K=2KO3/O2+4K=K4O2/2O2+2K=K2O4/5O2+4K=2K2O5"},//9
        {"O2", "Ca", "O2+2Ca=2CaO"},//10
        {"O2", "Sc", "3O2+4Sc=2Sc2O3"},//11
        {"O2", "Ti", "O2+Ti=TiO2"},//12
        {"O2", "V", "5O2+4V=2V2O5/O2+2V=2VO/O2+V=VO2/3O2+V=VO6/3O2+4V=2V2O3/O2+5V=V5O2"},//13
        {"O2", "Cr", "3O2+2Cr=2CrO3/3O2+4Cr=2Cr2O3/O2+2Cr=2CrO/O2+Cr=CrO2"},//14
        {"O2", "Mn","7O2+4Mn=2Mn2O7/O2+Mn=MnO2/O2+2Mn=2MnO/3O2+4Mn=2Mn2O3/5O2+4Mn=2Mn2O5/2O2+3Mn=Mn3O4/3O2+2Mn=2MnO3/O2+2Mn=Mn2O2/7O2+2Mn=2MnO7"},//15
        {"O2", "Fe", "3O2+4Fe=2Fe2O3"},//16
        {"O2", "Co", "3O2+4Co=2Co2O3/O2+2Co=2CoO/O2+2Co=2OCo"},//17
        {"O2", "Ni", "O2+2Ni=2NiO"},//18
        {"O2", "Cu", "O2+2Cu=2CuO"},//19
        {"O2", "Zn", "O2+2Zn=2ZnO"},//20
        {"O2", "Ga", "2O2+2Ga=Ga2O3O/3O2+4Ga=2Ga2O3"},//21
        {"O2", "Ge", "O2+Ge=GeO2/O2+2Ge=2GeO"},//22
        {"O2", "As", "5O2+4As=2As2O5/O2+As=AsO2/3O2+4As=2As2O3/5O2+2As=2AsO5/3O2+4As=As4O6/O2+2As=2AsO/3O2+2As=2AsO3"},//23
        {"O2", "Se", "O2+Se=SeO2/3O2+2Se=2SeO3/O2+2Se=2SeO"},//24
        {"O2", "Br", "5O2+2Br2=2Br2O5/7O2+2Br2=2Br2O7/2O2+Br2=2BrO2/O2+2Br2=2Br2O/3O2+2Br2=2Br2O3/O2+Br2=2BrO/4O2+3Br2=2O4Br3"},//25
        {"02", "Rb", "02+Rb=RbO2"},//26
        {"O2", "Sr", "O2+2Sr=2SrO"},//27
        {"O2", "Nb", "5O2+4Nb=2Nb2O5/O2+2Nb=NbO2"},//28
        {"O2", "Mo", "3O2+2Mo=2MoO3"},//29
        {"O2", "Tc", "7O2+4Tc=2Tc2O7"},//30
        {"O2", "Pd", "O2+2Pd=2PdO"},//31
        {"O2", "Ag", "O2+2Ag=2AgO/O2+4Ag=2Ag2O/3O2+Ag=AgO6"},//32
        {"O2", "Cd", "O2+2Cd=2CdO/O2+4Cd=2Cd20"},//33
        {"O2", "In", "3O2+4In=2In2O3"},//34
        {"O2", "Sn", "O2+Sn=SnO2/O2+2Sn=2SnO"},//35
        {"O2", "Sb", "3O2+4Sb=Sb4O6/3O2+4Sb=2Sb2O3/5O2+4Sb=2Sb2O5"},//36
        {"O2", "Te", "O2+Te=TeO2"},//37
        {"O2", "I", "7O2+2I2=2I2O7/5O2+2I2=2I2O5/O2+I2=2IO/O2+2I2=2I2O"},//38
        {"O2", "Cs", "O2+4Cs=2Cs2O/O2+Cs=CsO2/O2+2Cs=Cs2O2/O2+2Cs=2CsO/3O2+22Cs=2Cs11O3"},//39
        {"O2", "Ba", "O2+2Ba=2BaO"},//40
        {"O2", "La", "3O2+4La=2La2O3"},//41
        {"O2", "W", "3O2+2W=2WO3"},//42
        {"O2", "Pt", "O2+Pt=PtO2"},//43
        {"O2", "Au", "O2+Au=AuO2"},//44
        {"O2", "Hg", "O2+2Hg=2HgO"},//45
        {"O2", "Ti", "O2+Ti=TiO2"},//46
        {"O2", "Pb", "O2+Pb=PbO2"},//47
        {"O2", "Bi", "3O2+4Bi=2Bi2O3"},//48
        {"O2", "Po", "O2+2Po=2PoO/O2+Po=PoO2"},//49
        {"O2", "Fr", "O2+4Fr=2Fr2O"},//50
    };
}
