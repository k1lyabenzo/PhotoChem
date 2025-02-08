package Reactions;

public class Reactions_Compound {
    public static final String[][] reaction_compound_H = {
        {"H2", "Li", "H2+2Li=2LiH"},//1
        {"H2", "Be", "H2+Be=BeH2"},//2
        {"H2", "B", "3H2+2B=B2H6"},//3
        {"H2", "C", "2H2+C=2HC2/2H2+C=CH4"},//4
        {"H2", "N2", "3H2+N2=2NH3"},//5
        {"H2", "O2", "2H2+O2=2H2O"},//6
        {"H2", "F2", "H2+F2=2HF"},//7
        {"H2", "Na", "H2+2Na=2NaH"},//8
        {"H2", "Mg", "H2+Mg=MgH2/H2+2Mg=2MgH/H2+Mg=H2Mg/H2+4Mg=2Mg2H/H2+2Mg=Mg2H2/3H2+2Mg=2MgH3"},//9
        {"H2", "Al", "3H2+2Al=2AlH3/H2+2Al=2AlH/H2+Al=AlH2"},//10
        {"H2", "Si", "2H2+Si=SiH4"},//11
        {"H2", "P", "3H2+P=2PH3/H2+2P=2HP"},//12
        {"H2", "S", "H2+S=H2S"},//13
        {"H2", "Cl2", "H2+Cl2=2HCl"},//14
        {"H2", "K", "H2+2K=2KH/2H2+K=KH4"},//15
        {"H2", "Ca", "H2+Ca=CaH2"},//16
        {"H2", "Fe", "3H2+2Fe=2FeH3/H2+Fe=H2Fe/H2+2Fe=2FeH"},//17
        {"H2", "Cu", "H2+4Cu=H2Cu"},//18
        {"H2", "Zn", "H2+Zn=ZnH2/H2+2Zn=2ZnH/H2+2Zn=2HZn"},//19
        {"H2", "Ga", "3H2+2Ga=Ga2H6/3H2+2Ga=2GaH3"},//20
        {"H2", "Ge", "H2+Ge=GeH2/H2+4Ge=2Ge2H"},//21
        {"H2", "As", "3H2+As=2AsH3"},//22
        {"H2", "Se", "H2+Se=H2Se"},//23
        {"H2", "Br2", "H2+Br2=2HBr"},//24
        {"H2", "Rb", "H2+2Rb=2RbH"},//25
        {"H2", "Sr", "H2+Sr=SrH2/H2+2Sr=2SrH"},//26
        {"H2", "Nb", "5H2+2Nb=2NbH5"},//27
        {"H2", "Ag", "H2+2Ag=2AgH"},//28
        {"H2", "Sn", "H2+Sn=SnH2/2H2+Sn=SnH4"},//29
        {"H2", "Te", "H2+Te=H2Te"},//30
        {"H2", "I2", "H2+I2=2HI"},//31
        {"H2", "Cs", "H2+2Cs=2CsH"},//32
        {"H2", "Ba", "H2+Ba=BaH2/H2+4Ba=2Ba2H/H2+2Ba=2BaH"},//33
        {"H2", "Pb", "H2+2Pb=2PbH"},//34
        {"H2", "Fr", "H2+2Fr=2FrH"},//35
        {"H2", "Ra", "H2+2Ra=2RaH/H2+Ra=RaH2"}//36
    };
    public static final String[][] reaction_compound_Li = {
        {"Li", "C", "Li+C=LiC/2Li+2C=Li2C2/4Li+C=Li4C"},//1
        {"Li", "N2", "6Li+N2=2Li3N"},//2
        {"Li", "O2", "4Li+O2=2Li2O"},//3
        {"Li", "F2", "2Li+F2=2LiF"},//4
        {"Li", "Si", "4Li+Si=Li4Si/Li+Si=LiSi"},//5
        {"Li", "P", "3Li+P=Li3P/Li+P=LiP"},//6
        {"Li", "S", "2Li+S=Li2S"},//7
        {"Li", "Cl2", "2Li+Cl2=2LiCl"},//8
        {"Li", "Br2", "2Li+Br2=2LiBr"},//9
        {"Li", "Te", "2Li+Te=Li2Te"},//10
        {"Li", "I2", "2Li+I2=2LiI"}//11
    };
    public static final String[][] reaction_compound_Be = {
        {"Be", "C", "Be+C=CBe/2Be+C=BE2C/Be+2C=BeC2/Be+C=BeC"},//1
        {"Be", "N2", "3Be+N2=Be3N2/Be+N2=BeN2"},//2
        {"Be", "O2", "2Be+O2=2BeO"},//3
        {"Be", "F2", "Be+F2=BeF2/2Be+F2=2BeF"},//4
        {"Be", "P", "3Be+2P=Be3P2"},//5
        {"Be", "S", "Be+S=BeS"},//6
        {"Be", "Cl2", "Be+Cl2=BeCl2"},//7
        {"Be", "I2", "Be+I2=BeI2"}//8
    };
    public static final String[][] reaction_compound_B = {
        {"B", "C", "B+C=BC"},//1
        {"B", "N2", "2B+N2=2BN"},//2
        {"B", "O2", "4B+3O2=2B2O3/2B+O2=2BO"},//3
        {"B", "F2", "2B+3F2=2BF3"},//4
        {"B", "Mg", "B+Mg=MgB"},//5
        {"B", "Al", "3B+Al=AlB3"},//6
        {"B", "S", "2B+3S=B2S3/B+S=BS"},//7
        {"B", "Cl2", "2B+3Cl2=2BCl3/B+2Cl2=BCl4"},//8
        {"B", "Ca", "B+Ca=CaB/2B+Ca=CaB2/2B+3Ca=Ca3B2"},//9
        {"B", "Br2", "2B+3Br2=2BBr3"},//10
        {"B", "Sr", "2B+3Sr=Sr3B2"},//11
        {"B", "I2", "2B+I2=2BI"}//12
    };
    public static final String[][] reaction_compound_C = {
        {"C", "N2", "2C+N2=C2N2/2C+N2=C2N2"},//1
        {"C", "O2", "C+O2=CO2/2C+O2=2CO"},//2
        {"C", "F2", "C+2F2=CF4"},//3
        {"C", "Na", "C+4Na=Na4C/2C+2Na=Na2C2/C+Na=NaC"},//4
        {"C", "Mg", "2C+Mg=MgC2/C+Mg=MgC/C+2Mg=Mg2C"},//5
        {"C", "Al", "3C+4Al=Al4C3/C+Al=AlC"},//6
        {"C", "Si", "C+Si=SiC"},//7
        {"C", "P", "3C+4P=P4C3"},//8
        {"C", "S", "C+2S=CS2"},//9
        {"C", "Cl2", "C+2Cl2=CCl4"},//10
        {"C", "K", "C+4K=K4C/C+K=KC/2C+2K=K2C2"},//11
        {"C", "Ca", "2C+Ca=CaC2"},//12
        {"C", "Ti", "C+Ti=TiC"},//13
        {"C", "Cr", "C+Cr=CrC"},//14
        {"C", "Fe", "C+3Fe=Fe3C/C+Fe=Fec/C+2Fe=Fe2C/4C+3Fe=Fe3C4/3C+4Fe=Fe4C3"},//15
        {"C", "Co", "C+4Co=Co4C"},//16
        {"C", "Cu", "C+4Cu=Cu4C"},//17
        {"C", "Zn", "C+Zn=ZnC/2C+Zn=ZnC2"},//18
        {"C", "Ge", "2C+Ge=C2Ge"},//19
        {"C", "Br2", "C+2Br2=CBr4"},//20
        {"C", "Ag", "5C+3Ag=C5Ag3"},//21
        {"C", "Sn", "C+2Sn=Sn2C"},//22
        {"C", "Ba", "C+Ba=BaC"}//23
    };
    public static final String[][] reaction_compound_N = {
        {"N2", "O2", "N2+O2=2NO/2N2+5O2=2N2O5/N2+2O2=2NO2/2N2+3O2=2N2O3/2N2+O2=2N2O/N2+O2=N2O2/N2+2O2=N2O4/5N2+2O2=2N5O2/3N2+2O2=2N3O2/6N2+O2=2N6O/2N2+O2=N4O2"},//1
        {"N2", "F2", "N2+3F2=2NF3"},//2
        {"N2", "Na", "N2+6Na=2Na3N"},//3
        {"N2", "Mg", "N2+3Mg=Mg3N2"},//4
        {"N2", "Al", "N2+2Al=2AlN"},//5
        {"N2", "Si", "2N2+3Si=Si3N4/N2+2Si=2SiN/N2+3Si=Si3N2/N2+Si=SiN2/2N2+Si=SiN4/N2+6Si=2Si3N"},//6
        {"N2", "P", "5N2+6P=2P3N5"},//7
        {"N2", "S", "N2+2S=2NS/N2+2S=2SN"},//8
        {"N2", "Cl2", "N2+4Cl2=2NCl4/N2+3Cl2=2NCl3/N2+5Cl2=2NCl5"},//9
        {"N2", "K", "N2+6K=2K3N/N2+2K=2KN/N2+4K=2K2N/3N2+2K=2KN3"},//10
        {"N2", "Ca", "N2+3Ca=Ca3N2"},//11
        {"N2", "Ti", "2N2+3Ti=Ti3N4/N2+2Ti=2TiN"},//12
        {"N2", "Cr", "N2+2Cr=2CrN"},//13
        {"N2", "Mn", "N2+3Mn=Mn3N2/5N2+6Mn=2Mn3N5"},//14
        {"N2", "Fe", "N2+4Fe=2Fe2N/N2+3Fe=Fe3N2/N2+2Fe=2FeN/N2+6Fe=2Fe3N"},//15
        {"N2", "Cu", "N2+3Cu=Cu3N2/N2+Cu=N2Cu"},//16
        {"N2", "Zn", "N2+2Zn=2ZnN/N2+3Zn=ZN3N2"},//17
        {"N2","Br2", "N2+3Br2=2NBr3"},//
        {"N2", "Rb", "N2+Rb=RbN2/N2+6Rb=2Rb3N"},//18
        {"N2", "Sr", "N2+3Sr=Sr3N2"},//19
        {"N2", "Ag", "N2+2Ag=2AgN"},//20
        {"N2", "I2", "N2+3I2=2NI3"},//21
        {"N2", "Cs", "N2+6Cs=2Cs3N"},//22
        {"N2", "Ba", "N2+3Ba=Ba3N2/N2+2Ba=2BaN/N2+6Ba=2Ba3N/N2+Ba=BaN2/N2+2Ba=2Ba2N2"},//23
        {"N2", "Hf", "2N2+3Hf=Hf3N4"},//24
        {"N2", "Ti", "2N2+3Ti=Ti3N4/N2+2Ti=2TiN"}//25
    };
    public static final String[][] reaction_compound_O = {
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
        {"O2", "Br2", "5O2+2Br2=2Br2O5/7O2+2Br2=2Br2O7/2O2+Br2=2BrO2/O2+2Br2=2Br2O/3O2+2Br2=2Br2O3/O2+Br2=2BrO/4O2+3Br2=2O4Br3"},//25
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
        {"O2", "I2", "7O2+2I2=2I2O7/5O2+2I2=2I2O5/O2+I2=2IO/O2+2I2=2I2O"},//38
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
    public static final String[][] reaction_compound_F = {
        {"F2", "Na", "F2+2Na=2NaF"},//1
        {"F2", "Mg", "F2+Mg=MgF2/F2+2Mg=2MgF/F2+2Mg=Mg2F2"},//2
        {"F2", "Al", "3F2+2Al=2AlF3"},//3
        {"F2", "Si", "2F2+Si=SiF4"},//4
        {"F2", "P", "5F2+2P=2PF5/F2+2P=2PF/F2+2P=2FP/F2+P=PF2/3F2+P=PF6"},//5
        {"F2", "S", "3F2+S=SF6"},//6
        {"F2", "Cl2", "F2+Cl2=2ClF/3F2+Cl2=2ClF3"},//7
        {"F2", "K", "F2+2K=2KF/F2+K=KF2"},//8
        {"F2", "Ca", "F2+Ca=CaF2"},//9
        {"F2", "Cr", "F2+Cr=CrF2/3F2+Cr=CrF6"},//10
        {"F2", "Fe", "3F2+2Fe=2FeF3/F2+2Fe=2FeF"},//11
        {"F2", "Co", "3F2+2Co=2CoF3"},//12
        {"F2", "Cu", "F2+Cu=CuF2"},//13
        {"F2", "Zn", "F2+Zn=ZnF2"},//14
        {"F2", "Ge", "2F2+Ge=GeF4"},//15
        {"F2", "Se", "2F2+Se=SeF4"},//16
        {"F2", "Br2", "F2+Br2=2BrF"},//17
        {"F2", "Kr", "F2+Kr=KrF2"},//18
        {"F2", "Y", "3F2+2Y=2YF3"},//19
        {"F2", "Mo", "3F2+Mo=MoF6/F2+2Mo=2MoF"},//20
        {"F2", "Ag", "F2+2Ag=2AgF"},//21
        {"F2", "Sn", "2F2+Sn=SnF4"},//22
        {"F2", "I2", "7F2+I2=2IF7/F2+I2=2IF/5F2+I2=2IF5"},//23
        {"F2", "Xe", "3F2+Xe=XeF6/2F2+Xe=XeF4/F2+Xe=XeF2"},//24
        {"F2", "Cs", "F2+2Cs=2CsF"},//25
        {"F2", "Ba", "F2+2Ba=2BaF"},//26
        {"F2", "Pt", "F2+2Pt=2PtF/2F2+Pt=PtF4"},//27
        {"F2", "Au", "3F2+2Au=2AuF3"},//28
        {"F2", "Bi", "3F2+2Bi=2BiF3"},//29
        {"F2", "Fr", "F2+2Fr=2FrF"},//30
    };
    public static final String[][] reaction_compound_Na = {
        {"Na", "Al", "Na+Al=AlNa"},//1
        {"Na", "Si", "2Na+Si=Na2Si/4Na+Si=Na4Si/Na+Si=NaSi"},//2
        {"Na", "P", "3Na+P=Na3P/Na+P=NaP"},//3
        {"Na", "S", "2Na+S=Na2S"},//4
        {"Na", "Cl2", "2Na+Cl2=2NaCl"},//5
        {"Na", "Fe", "Na+Fe=FeNa/2Na+Fe=FeNa2"},//6
        {"Na", "As", "3Na+As=Na3As/Na+As=NaAs"},//7
        {"Na", "Se", "2Na+Se=Na2Se"},//8
        {"Na", "Br2", "2Na+Br2=2NaBr"},//9
        {"Na", "I2", "2Na+I2=2NaI"},//10
    };
    public static final String[][] reaction_compound_Mg = {
        {"Mg", "Al", "Mg+Al=MgAl/Mg+Al=AlMg"},//1
        {"Mg", "Si", "2Mg+Si=Mg2Si"},//2
        {"Mg", "P", "3Mg+2P=Mg3P2"},//3
        {"Mg", "S", "Mg+S=MgS"},//4
        {"Mg", "Cl2", "Mg+Cl2=MgCl2"},//5
        {"Mg", "Ca", "6Mg+2Ca=Mg6Ca2"},//6
        {"Mg", "As", "Mg+As=MgAs"},//7
        {"Mg", "Br2", "Mg+Br2=MgBr2"},//8
        {"Mg", "I2", "Mg+I2=MgI2"},//9
    };
    public static final String[][] reaction_compound_Al = {
        {"Al", "Si", "4Al+3Si=Al4Si3/Al+Si=AlSi/2Al+Si=Al2Si/Al+3Si=AlSi3"},//1
        {"Al","P", "Al+P=AlP"},//2
        {"Al", "S", "2Al+3S=Al2S3"},//3
        {"Al", "Cl2", "2Al+3Cl2=2AlCl3"},//4
        {"Al", "Cu", "Al+Cu=CuAl"},//5
        {"Al", "Se", "2Al+3Se=Al2Se3"},//6
        {"Al", "Br2", "2Al+3Br2=2AlBr3"},//7
        {"Al", "I2", "2Al+3I2=2AlI3"},//8
    };
    public static final String[][] reaction_compound_Si = {
            {"Si", "P", "3Si+2P=P2Si3"},//1
            {"Si", "S", "Si+2S=SiS2"},//2
            {"Si", "Cl2", "Si+2Cl2=SiCl4"},//3
            {"Si", "K", "Si+K=KSi/Si+4K=K4Si"},//4
            {"Si", "Ca", "Si+2Ca=Ca2Si"},//5
            {"Si", "Fe", "Si+3Fe=Fe3Si"},//6
            {"Si", "Ni", "2Si+Ni=NiSi2/Si+Ni=NiSi"},//7
            {"Si", "Zn", "Si+Zn=ZnSi"},//8
            {"Si", "Se", "Si+Se=SeSi"},//9
            {"Si", "Br2", "Si+2Br2=SiBr4/2Si+Br2=2SiBr/Si+Br2=SiBr2"},//10
            {"Si", "I2", "Si+2I2=SiI4"},//11
            {"Si", "Cs", "Si+4Cs=Cs4Si"},//12
            {"Si", "Ba", "Si+Ba=BaSi/Si+2Ba=Ba2Si"},//13
            {"Si", "Hg", "Si+Hg=HgSi"},//14
    };
    public static final String[][] reaction_compound_P = {
            {"P", "S", "2P+3S=P2S3/P+S=PS/2P+5S=P2S5"},//1
            {"P", "Cl2", "2P+5Cl2=2PCl5"},//2
            {"P", "K", "P+K=KP/P+3K=K3P"},//3
            {"P", "Ca", "2P+3Ca=Ca3P2"},//4
            {"P", "V", "5P+3V=V3P5"},//5
            {"P", "Cr", "P+Cr=CrP"},//6
            {"P", "Mn", "2P+Mn=MnP2"},//7
            {"P", "Fe", "P+3Fe=Fe3P/P+Fe=FeP/2P+3Fe=Fe3P2"},//8
            {"P", "Cu", "2P+3Cu=Cu3P2/P+Cu=CuP/2P+Cu=CuP2/P+3Cu=Cu3P/P+Cu=PCu"},//9
            {"P", "Zn", "2P+3Zn=Zn3P2/P+Zn=ZnP/2P+Zn=ZnP2"},//10
            {"P", "Br2", "2P+3Br2=2PBr3/2P+5Br2=2PBr5/2P+Br2=2PBr"},//11
            {"P", "Rb", "P+3Rb=Rb3P"},//12
            {"P", "Sr", "P+Sr=SrP/2P+3Sr=Sr3P2"},//13
            {"P", "I2", "2P+3I2=2PI3"},//14
            {"P", "Cs", "P+3Cs=Cs3P"},//15
            {"P", "Ba", "P+Ba=BaP/2P+3Ba=Ba3P2"},//16
            {"P", "Hg", "2P+3Hg=Hg3P2"},//17
    };
    public static final String[][] reaction_compound_S = {
            {"S", "Cl2", "S+2Cl2=SCl4"},//1
            {"S", "K", "S+2K=K2S/S+K=KS"},//2
            {"S", "Ca", "S+Ca=CaS"},//3
            {"S", "Ti", "2S+Ti=TiS2"},//4
            {"S", "Cr", "3S+2Cr=Cr2S3"},//5
            {"S", "Mn", "S+Mn=MnS"},//6
            {"S", "Fe", "S+Fe=FeS"},//7
            {"S", "Co", "S+Co=CoS"},//8
            {"S", "Ni", "S+Ni=NiS"},//9
            {"S", "Cu", "S+2Cu=Cu2S"},//10
            {"S", "Zn", "S+Zn=ZnS"},//11
            {"S", "Ga", "3S+2Ga=Ga2S3"},//12
            {"S", "As", "3S+2As=As2S3"},//13
            {"S", "Br2", "2S+Br2=S2Br2/2S+Br2=2SBr/8S+3Br2=2S4Br3/S+Br2=SBr2/8S+Br2=2BrS4"},//14
            {"S", "Rb", "S+2Rb=Rb2S/S+Rb=RbS"},//15
            {"S", "Sr", "S+Sr=SrS"},//16
            {"S", "Cs", "S+2Cs=Cs2S"},//17
            {"S", "Ba", "S+Ba=BaS"},//18
            {"S", "Au", "3S+2Au=Au2S3/S+2Au=Au2S"},//19
            {"S", "Hg", "S+Hg=HgS"},//20
            {"S", "Pb", "S+Pb=PbS"},//21
            {"S", "Ra", "S+Ra=RaS"},//22
            {"S", "Ag", "S+2Ag=Ag2S"},//23
    };
    public static final String[][] reaction_compound_Cl2 = {
            {"Cl2", "K", "Cl2+2K=2KCl"},//1
            {"Cl2", "Ca", "Cl2+Ca=CaCl2"},//2
            {"Cl2", "Ti", "2Cl2+Ti=TiCl4"},//3
            {"Cl2", "V", "3Cl2+2V=2VCl3"},//4
            {"Cl2", "Cr", "3Cl2+2Cr=2CrCl3/2Cl2+Cr=CrCl4/Cl2+Cr=CrCl2/Cl2+2Cr=2CrCl/3Cl2+4Cr=2Cr2Cl3"},//5
            {"Cl2", "Mn", "Cl2+Mn=MnCl2/7Cl2+4Mn=2Mn2Cl7/2Cl2+Mn=MnCl4"},//6
            {"Cl2", "Fe", "3Cl2+2Fe=2FeCl3"},//7
            {"Cl2", "Co", "3Cl2+2Co=2CoCl3"},//8
            {"Cl2", "Ni", "Cl2+Ni=NiCl2"},//9
            {"Cl2", "Cu", "Cl2+Cu=CuCl2"},//10
            {"Cl2", "Zn", "Cl2+Zn=ZnCl2"},//11
            {"Cl2", "Ga", "Cl2+Ga=GaCl2"},//12
            {"Cl2", "As", "3Cl2+2As=2AsCl3/5Cl2+2As=2AsCl5"},//13
            {"Cl2", "Br2", "Cl2+Br2=2BrCl"},//14
            {"Cl2", "Rb", "Cl2+2Rb=2RbCl"},//15
            {"Cl2", "Sr", "Cl2+2Sr=2SrCl"},//16
            {"Cl2", "Ag", "Cl2+2Ag=2AgCl"},//17
            {"Cl2", "I2", "Cl2+2I2=2I2Cl/Cl2+I2=2ICl/5Cl2+2I2=2I2Cl5/3Cl2+I2=2ICl3/3Cl2+I2=I2Cl6/5Cl2+I2=2ICl5"},//18
            {"Cl2", "Cs", "Cl2+2Cs=2CsCl/Cl2+Cs=CsCl2"},//19
            {"Cl2", "Ba", "Cl2+Ba=BaCl2"},//20
            {"Cl2", "Au", "3Cl2+2Au=2AuCl3"},//21
            {"Cl2", "Hg", "Cl2+2Hg=Hg2Cl2"},//22
            {"Cl2", "Pb", "2Cl2+Pb=PbCl4"},//23
    };
    public static final String[][] reaction_compound_K = {
            {"K", "Fe", "K+Fe=FeK/K+Fe=KFe"},//1
            {"K", "Zn", "K+Zn=ZnK"},//2
            {"K", "Br2", "2K+Br2=2KBr"},//3
            {"K", "I2", "2K+I2=2KI"},//4
    };
    public static final String[][] reaction_compound_Ca = {
            {"Ca", "Co", "Ca+Co=CaCo"},//1
            {"Ca", "Br2", "Ca+Br2=CaBr2"},//2
            {"Ca", "I2", "Ca+I2=CaI2"},//3
    };

}
