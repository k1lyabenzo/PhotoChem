public class Exchange {
    //Массив анионов
    static String[][] anions = {
            {"OH","-"},
            {"F","-"},
            {"Cl","-"},
            {"Br","-"},
            {"I","-"},
            {"S","2-"},
            {"HS","-"},
            {"SO3","2-"},
            {"HSO3","-"},
            {"SO4","2-"},
            {"HSO4","-"},
            {"NO3","-"},
            {"NO2","-"},
            {"PO4","3-"},
            {"HPO4","2-"},
            {"H2PO4","-"},
            {"CO3","2-"},
            {"HCO3","-"},
            {"CH3COO","-"},
            {"SiO3","2-"},
            {"MnO4","-"},
            {"Cr2O7","2-"},
            {"CrO4","2-"},
            {"ClO3","-"},
            {"ClO4","-"}
    };
    //Массив катионов
    static String[][] kations = {
            {"H","+"},
            {"Li","+"},
            {"K","+"},
            {"Na","+"},
            {"NH4","+"},
            {"Ag","+"},
            {"Ba","2+"},
            {"Ca","2+"},
            {"Mg","2+"},
            {"Sr","2+"},
            {"Fe","2+"},
            {"Mn","2+"},
            {"Zn","2+"},
            {"Hg","2+"},
            {"Pb","2+"},
            {"Sn","2+"},
            {"Cu","2+"},
            {"Al","3+"},
            {"Fe","3+"},
            {"Cr","3+"}
    };
    //Таблица растворимости
    static String[][] table = {
            //H
            {"HF","P"}, {"HCl","P"}, {"HBr","P"}, {"HI","P"}, {"H2S","P"}, {"H2SO3","P"}, {"H2SO4","P"}, {"HNO3","P"}, {"HNO2","P"}, {"H3PO4","P"}, {"H2CO3","P"}, {"HCH3COO","P"}, {"H2SiO3","H"}, {"HMnO4","P"}, {"H2Cr2O7","P"}, {"H2CrO4","P"}, {"HClO3","P"}, {"HClO4","P"},
            //Li
            {"LiOH","P"}, {"LiF","M"}, {"LiCl","P"}, {"LiBr","P"}, {"LiI","P"}, {"Li2S","P"}, {"LiHS","P"}, {"Li2SO3","-"}, {"LiHSO3","P"}, {"Li2SO4","P"}, {"LiHSO4","P"}, {"LiNO3","P"}, {"LiNO2","P"}, {"Li3PO4","H"}, {"Li2HPO4","-"}, {"LiH2PO4","P"}, {"Li2CO3","P"}, {"LiHCO3","P"}, {"LiCH3COO","P"}, {"Li2SiO3","H"}, {"LiMnO4","P"}, {"Li2Cr2O7","P"}, {"Li2CrO4","P"}, {"LiClO3","P"}, {"LiClO4","P"},
            //K
            {"KOH","P"}, {"KF","P"}, {"KCl","P"}, {"KBr","P"}, {"KI","P"}, {"K2S","P"}, {"KHS","P"}, {"K2SO3","P"}, {"K2HSO3","P"}, {"K2SO4","P"}, {"KHSO4","P"}, {"KNO3","P"}, {"KNO2","P"}, {"K3PO4","P"}, {"K2HPO4","P"}, {"K2HPO4","P"}, {"K2CO3","P"}, {"KHCO3","P"}, {"KCH3COO","P"}, {"K2SiO3","P"}, {"KMnO4","P"}, {"K2Cr2O7","P"}, {"K2CrO4","P"}, {"KClO3","P"}, {"KClO4","P"},
            //Na
            {"NaOH","P"}, {"NaF","P"}, {"NaCl","P"}, {"NaBr","P"}, {"NaI","P"}, {"Na2S","P"}, {"NaHS","P"}, {"Na2SO3","P"}, {"Na2HSO3","P"}, {"Na2SO4","P"}, {"NaHSO4","P"}, {"NaNO3","P"}, {"NaNO2","P"}, {"Na3PO4","P"}, {"Na2HPO4","P"}, {"NaH2PO4","P"}, {"Na2CO3","P"}, {"NaHCO3","P"}, {"NaCH3COO","P"}, {"Na2SiO3","P"}, {"NaMnO4","P"}, {"Na2Cr2O7","P"}, {"Na2CrO4","P"}, {"NaClO3","P"}, {"NaClO4","P"},
            //NH4
            {"NH4OH","P"}, {"NH4F","P"}, {"NH4Cl","P"}, {"NH4Br","P"}, {"NH4I","P"}, {"(NH4)2S","P"}, {"NH4HS","P"}, {"(NH4)2SO3","P"}, {"(NH4)2HSO3","P"}, {"(NH4)2SO4","P"}, {"NH4HSO4","P"}, {"NH4NO3","P"}, {"NH4NO2","P"}, {"(NH4)3PO4","-"}, {"(NH4)2HPO4","P"}, {"NH4H2PO4","P"}, {"(NH4)2CO3","P"}, {"NH4HCO3","P"}, {"NH4CH3COO","P"}, {"(NH4)2SiO3","-"}, {"NH4MnO4","P"}, {"(NH4)2Cr2O7","P"}, {"(NH4)2CrO4","P"}, {"NH4ClO3","P"}, {"NH4ClO4","P"},
            //Ag
            {"AgOH","-"}, {"AgF","P"}, {"AgCl","H"}, {"AgBr","H"}, {"AgI","H"}, {"Ag2S","H"}, {"AgHS","-"}, {"Ag2SO3","H"}, {"Ag2HSO3","-"}, {"Ag2SO4","M"}, {"AgHSO4","-"}, {"AgNO3","P"}, {"AgNO2","M"}, {"Ag3PO4","H"}, {"Ag2HPO4","-"}, {"AgH2PO4","P"}, {"Ag2CO3","H"}, {"AgHCO3","-"}, {"AgCH3COO","P"}, {"Ag2SiO3","-"}, {"AgMnO4","-"}, {"Ag2Cr2O7","H"}, {"Ag2CrO4","H"}, {"AgClO3","P"}, {"AgClO4","P"},
            //Ba
            {"Ba(OH)2","P"}, {"Ba(F)2","M"}, {"Ba(Cl)2","P"}, {"Ba(Br)2","P"}, {"Ba(I)2","P"}, {"BaS","-"}, {"Ba(HS)2","P"}, {"BaSO3","H"}, {"BaHSO3","P"}, {"BaSO4","H"}, {"Ba(HSO4)2","-"}, {"Ba(NO3)2","P"}, {"Ba(NO2)2","P"}, {"Ba2(PO4)2","H"}, {"BaHPO4","H"}, {"Ba(H2PO4)2","P"}, {"BaCO3","H"}, {"Ba(HCO3)2","P"}, {"Ba(CH3COO)2","P"}, {"BaSiO3","H"}, {"Ba(MnO4)2","P"}, {"BaCr2O7","M"}, {"BaCrO4","H"}, {"Ba(ClO3)2","P"}, {"Ba(ClO4)2","P"},
            //Ca
            {"Ca(OH)2","M"}, {"Ca(F)2","H"}, {"Ca(Cl)2","P"}, {"Ca(Br)2","P"}, {"Ca(I)2","P"}, {"CaS","-"}, {"Ca(HS)2","P"}, {"CaSO3","H"}, {"CaHSO3","P"}, {"CaSO4","M"}, {"Ca(HSO4)2","-"}, {"Ca(NO3)2","P"}, {"Ca(NO2)2","P"}, {"Ca3(PO4)2","H"}, {"CaHPO4","H"}, {"Ca(H2PO4)2","P"}, {"CaCO3","H"}, {"Ca(HCO3)2","P"}, {"Ca(CH3COO)2","P"}, {"CaSiO3","H"}, {"Ca(MnO4)2","P"}, {"CaCr2O7","P"}, {"CaCrO4","P"}, {"Ca(ClO3)2","P"}, {"Ca(ClO4)2","P"},
            //Mg
            {"Mg(OH)2","H"}, {"Mg(F)2","H"}, {"Mg(Cl)2","P"}, {"Mg(Br)2","P"}, {"Mg(I)2","P"}, {"MgS","-"}, {"Mg(HS)2","P"}, {"MgSO3","M"}, {"MgHSO3","P"}, {"MgSO4","P"}, {"Mg(HSO4)2","-"}, {"MgNO3","P"}, {"MgNO2","P"}, {"Mg3(PO4)2","H"}, {"MgHPO4","M"}, {"Mg(H2PO4)2","P"}, {"MgCO3","H"}, {"Mg(HCO3)2","P"}, {"Mg(CH3COO)2","P"}, {"MgSiO3","H"}, {"Mg(MnO4)2","P"}, {"MgCr2O7","-"}, {"MgCrO4","P"}, {"Mg(ClO3)2","P"}, {"Mg(ClO4)2","P"},
            //Sr
            {"Sr(OH)2","M"}, {"Sr(F)2","H"}, {"Sr(Cl)2","P"}, {"Sr(Br)2","P"}, {"Sr(I)2","P"}, {"SrS","H"}, {"Sr(HS)2","P"}, {"SrSO3","H"}, {"SrHSO3","P"}, {"SrSO4","H"}, {"Sr(HSO4)2","-"}, {"Sr(NO3)2","P"}, {"Sr(NO2)2","P"}, {"Sr3(PO4)2","H"}, {"SrHPO4","H"}, {"Sr(H2PO4)2","P"}, {"SrCO3","H"}, {"Sr(HCO3)2","P"}, {"Sr(CH3COO)2","P"}, {"SrSiO3","H"}, {"Sr(MnO4)2","P"}, {"SrCr2O7","H"}, {"SrCrO4","H"}, {"Sr(ClO3)2","P"}, {"Sr(ClO4)2","P"},
            //Fe
            {"Fe(OH)2","H"}, {"Fe(F)2","H"}, {"Fe(Cl)2","P"}, {"Fe(Br)2","P"}, {"Fe(I)2","P"}, {"FeS","H"}, {"Fe(HS)2","-"}, {"FeSO3","H"}, {"FeHSO3","-"}, {"FeSO4","P"}, {"Fe(HSO4)2","-"}, {"Fe(NO3)2","P"}, {"Fe(NO2)2","-"}, {"Fe3(PO4)2","H"}, {"FeHPO4","H"}, {"Fe(H2PO4)2","P"}, {"FeCO3","H"}, {"Fe(HCO3)2","P"}, {"Fe(CH3COO)2","P"}, {"FeSiO3","H"}, {"Fe(MnO4)2","-"}, {"FeCr2O7","-"}, {"FeCrO4","-"}, {"Fe(ClO3)2","-"}, {"Fe(ClO4)2","P"},
            //Mn
            {"Mn(OH)2","H"}, {"Mn(F)2","P"}, {"Mn(Cl)2","P"}, {"Mn(Br)2","P"}, {"Mn(I)2","P"}, {"MnS","H"}, {"Mn(HS)2","-"}, {"MnSO3","-"}, {"MnHSO3","-"}, {"MnSO4","P"}, {"Mn(HSO4)2","-"}, {"Mn(NO3)2","P"}, {"Mn(NO2)2","-"}, {"Mn3(PO4)2","H"}, {"MnHPO4","H"}, {"Mn(H2PO4)2","P"}, {"MnCO3","H"}, {"Mn(HCO3)2","-"}, {"Mn(CH3COO)2","P"}, {"MnSiO3","H"}, {"Mn(MnO4)2","-"}, {"MnCr2O7","-"}, {"MnCrO4","H"}, {"Mn(ClO3)2","P"}, {"Mn(ClO4)2","P"},
            //Zn
            {"Zn(OH)2","H"}, {"Zn(F)2","P"}, {"Zn(Cl)2","P"}, {"Zn(Br)2","P"}, {"Zn(I)2","P"}, {"ZnS","H"}, {"Zn(HS)2","-"}, {"ZnSO3","M"}, {"ZnHSO3","-"}, {"ZnSO4","P"}, {"Zn(HSO4)2","-"}, {"Zn(NO3)2","P"}, {"Zn(NO2)2","-"}, {"Zn3(PO4)2","H"}, {"ZnHPO4","-"}, {"Zn(H2PO4)2","P"}, {"ZnCO3","H"}, {"Zn(HCO3)2","-"}, {"Zn(CH3COO)2","P"}, {"ZnSiO3","H"}, {"Zn(MnO4)2","P"}, {"ZnCr2O7","-"}, {"ZnCrO4","H"}, {"Zn(ClO3)2","P"}, {"Zn(ClO4)2","P"},
            //Hg
            {"Hg(OH)2","-"}, {"Hg(F)2","-"}, {"Hg(Cl)2","P"}, {"Hg(Br)2","M"}, {"Hg(I)2","H"}, {"HgS","H"}, {"Hg(HS)2","-"}, {"HgSO3","H"}, {"HgHSO3","-"}, {"HgSO4","-"}, {"Hg(HSO4)2","-"}, {"Hg(NO3)2","P"}, {"Hg(NO2)2","-"}, {"Hg3(PO4)2","H"}, {"HgHPO4","-"}, {"Hg(H2PO4)2","-"}, {"HgCO3","H"}, {"Hg(HCO3)2","-"}, {"Hg(CH3COO)2","P"}, {"HgSiO3","-"}, {"Hg(MnO4)2","-"}, {"HgCr2O7","H"}, {"HgCrO4","H"}, {"Hg(ClO3)2","P"}, {"Hg(ClO4)2","P"},
            //Pb
            {"Pb(OH)2","H"}, {"Pb(F)2","H"}, {"Pb(Cl)2","M"}, {"Pb(Br)2","M"}, {"Pb(I)2","H"}, {"PbS","H"}, {"Pb(HS)2","-"}, {"PbSO3","H"}, {"PbHSO3","-"}, {"PbSO4","H"}, {"Pb(HSO4)2","H"}, {"Pb(NO3)2","P"}, {"Pb(NO2)2","-"}, {"Pb3(PO4)2","H"}, {"PbHPO4","M"}, {"Pb(H2PO4)2","-"}, {"PbCO3","H"}, {"Pb(HCO3)2","P"}, {"Pb(CH3COO)2","P"}, {"PbSiO3","H"}, {"Pb(MnO4)2","-"}, {"PbCr2O7","M"}, {"PbCrO4","H"}, {"Pb(ClO3)2","P"}, {"Pb(ClO4)2","P"},
            //Sn
            {"Sn(OH)2","H"}, {"Sn(F)2","P"}, {"Sn(Cl)2","P"}, {"Sn(Br)2","P"}, {"Sn(I)2","M"}, {"SnS","H"}, {"Sn(HS)2","-"}, {"SnSO3","-"}, {"SnHSO3","-"}, {"SnSO4","P"}, {"Pb(HSO4)2","-"}, {"Pb(NO3)2","-"}, {"Pb(NO2)2","-"}, {"Sn3(PO4)2","H"}, {"SnHPO4","H"}, {"Sn(H2PO4)2","-"}, {"SnCO3","-"}, {"Sn(HCO3)2","-"}, {"Sn(CH3COO)2","-"}, {"SnSiO3","-"}, {"Sn(MnO4)2","-"}, {"SnCr2O7","-"}, {"SnCrO4","H"}, {"Sn(ClO3)2","-"}, {"Sn(ClO4)2","-"},
            //Cu
            {"Cu(OH)2","H"}, {"Cu(F)2","P"}, {"Cu(Cl)2","P"}, {"Cu(Br)2","P"}, {"Cu(I)2","-"}, {"CuS","H"}, {"Cu(HS)2","-"}, {"CuSO3","-"}, {"CuHSO3","-"}, {"CuSO4","P"}, {"Cu(HSO4)2","-"}, {"Cu(NO3)2","P"}, {"Cu(NO2)2","-"}, {"Cu3(PO4)2","H"}, {"CuHPO4","-"}, {"Cu(H2PO4)2","-"}, {"CuCO3","H"}, {"Cu(HCO3)2","-"}, {"Cu(CH3COO)2","P"}, {"CuSiO3","-"}, {"Cu(MnO4)2","-"}, {"CuCr2O7","P"}, {"CuCrO4","H"}, {"Cu(ClO3)2","P"}, {"Cu(ClO4)2","P"},
            //Al
            {"Al(OH)3","H"}, {"Al(F)3","M"}, {"Al(Cl)3","P"}, {"Al(Br)3","P"}, {"Al(I)3","P"}, {"Al2(S)3","-"}, {"Al(HS)3","-"}, {"Al2(SO3)3","-"}, {"Al2(HSO3)3","-"}, {"Al2(SO4)3","P"}, {"Al(HSO4)3","-"}, {"Al(NO3)3","P"}, {"Al(NO2)3","-"}, {"AlPO4","H"}, {"Al2(HPO4)3","-"}, {"AlH2PO43","-"}, {"Al2(CO3)3","-"}, {"Al(HCO3)3","-"}, {"Al(CH3COO)3","-"}, {"Al2(SiO3)3","-"}, {"Al(MnO4)3","P"}, {"Al2(Cr2O7)3","-"}, {"Al2(CrO4)3","-"}, {"Al(ClO3)3","P"}, {"Al(ClO4)3","P"},
            //Fe
            {"Fe(OH)3","H"}, {"Fe(F)3","H"}, {"Fe(Cl)3","P"}, {"Fe(Br)3","P"}, {"Fe(I)3","-"}, {"Fe2(S)3","-"}, {"Fe(HS)3","-"}, {"Fe2(SO3)3","-"}, {"Fe2(HSO3)3","-"}, {"Fe2(SO4)3","P"}, {"Fe(HSO4)3","-"}, {"Fe(NO3)3","P"}, {"Fe(NO2)3","-"}, {"FePO4","H"}, {"Fe2(HPO4)3","-"}, {"FeH2PO43","-"}, {"Fe2(CO3)3","-"}, {"Fe(HCO3)3","-"}, {"Fe(CH3COO)3","-"}, {"Fe2(SiO3)3","-"}, {"Fe(MnO4)3","-"}, {"Fe2(Cr2O7)3","P"}, {"Fe2(CrO4)3","H"}, {"Fe(ClO3)3","-"}, {"Fe(ClO4)3","P"},
            //Cr
            {"Cr(OH)3","H"}, {"Cr(F)3","H"}, {"Cr(Cl)3","P"}, {"Cr(Br)3","P"}, {"Cr(I)3","-"}, {"Cr2(S)3","-"}, {"Cr(HS)3","-"}, {"Cr2(SO3)3","-"}, {"Cr2(HSO3)3","-"}, {"Cr2(SO4)3","P"}, {"Cr(HSO4)3","-"}, {"Cr(NO3)3","P"}, {"Cr(NO2)3","-"}, {"CrPO4","H"}, {"Cr2(HPO4)3","-"}, {"CrH2PO43","-"}, {"Cr2(CO3)3","-"}, {"Cr(HCO3)3","-"}, {"Cr(CH3COO)3","P"}, {"Cr2(SiO3)3","-"}, {"Cr(MnO4)3","-"}, {"Cr2(Cr2O7)3","-"}, {"Cr2(CrO4)3","-"}, {"Cr(ClO3)3","P"}, {"Cr(ClO4)3","P"},
    };
}
