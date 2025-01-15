private val anions = arrayOf(
    arrayOf("OH", "1"), arrayOf("F", "1"), arrayOf("Cl", "1"), arrayOf("Br", "1"),
    arrayOf("I", "1"), arrayOf("S", "2"), arrayOf("HS", "1"), arrayOf("SO3", "2"),
    arrayOf("HSO3", "1"), arrayOf("SO4", "2"), arrayOf("HSO4", "1"), arrayOf("NO3", "1"),
    arrayOf("NO2", "1"), arrayOf("PO4", "3"), arrayOf("HPO4", "2"), arrayOf("H2PO4", "1"),
    arrayOf("CO3", "2"), arrayOf("HCO3", "1"), arrayOf("CH3COO", "1"), arrayOf("SiO3", "2"),
    arrayOf("MnO4", "1"), arrayOf("Cr2O7", "2"), arrayOf("CrO4", "2"), arrayOf("ClO3", "1"),
    arrayOf("ClO4", "1")
)

private val kations = arrayOf(
    arrayOf("H", "1"), arrayOf("Li", "1"), arrayOf("K", "1"), arrayOf("Na", "1"),
    arrayOf("NH4", "1"), arrayOf("Ag", "1"), arrayOf("Ba", "2"), arrayOf("Ca", "2"),
    arrayOf("Mg", "2"), arrayOf("Sr", "2"), arrayOf("Fe", "2"), arrayOf("Mn", "2"),
    arrayOf("Zn", "2"), arrayOf("Hg", "2"), arrayOf("Pb", "2"), arrayOf("Sn", "2"),
    arrayOf("Cu", "2"), arrayOf("Al", "3"), arrayOf("Fe", "3"), arrayOf("Cr", "3")
)

val table = arrayOf(
    //H
    arrayOf("HF","P"), arrayOf("HCl","P"), arrayOf("HBr","P"), arrayOf("HI","P"), arrayOf("H2S","P"), arrayOf("H2SO3","P"), arrayOf("H2SO4","P"), arrayOf("HNO3","P"), arrayOf("HNO2","P"), arrayOf("H3PO4","P"), arrayOf("H2CO3","P"), arrayOf("HCH3COO","P"), arrayOf("H2SiO3","H"), arrayOf("HMnO4","P"), arrayOf("H2Cr2O7","P"), arrayOf("H2CrO4","P"), arrayOf("HClO3","P"), arrayOf("HClO4","P"),
    //Li
    arrayOf("LiOH","P"), arrayOf("LiF","M"), arrayOf("LiCl","P"), arrayOf("LiBr","P"), arrayOf("LiI","P"), arrayOf("Li2S","P"), arrayOf("LiHS","P"), arrayOf("Li2SO3","-"), arrayOf("LiHSO3","P"), arrayOf("Li2SO4","P"), arrayOf("LiHSO4","P"), arrayOf("LiNO3","P"), arrayOf("LiNO2","P"), arrayOf("Li3PO4","H"), arrayOf("Li2HPO4","-"), arrayOf("LiH2PO4","P"), arrayOf("Li2CO3","P"), arrayOf("LiHCO3","P"), arrayOf("LiCH3COO","P"), arrayOf("Li2SiO3","H"), arrayOf("LiMnO4","P"), arrayOf("Li2Cr2O7","P"), arrayOf("Li2CrO4","P"), arrayOf("LiClO3","P"), arrayOf("LiClO4","P"),
    //K
    arrayOf("KOH","P"), arrayOf("KF","P"), arrayOf("KCl","P"), arrayOf("KBr","P"), arrayOf("KI","P"), arrayOf("K2S","P"), arrayOf("KHS","P"), arrayOf("K2SO3","P"), arrayOf("K2HSO3","P"), arrayOf("K2SO4","P"), arrayOf("KHSO4","P"), arrayOf("KNO3","P"), arrayOf("KNO2","P"), arrayOf("K3PO4","P"), arrayOf("K2HPO4","P"), arrayOf("K2HPO4","P"), arrayOf("K2CO3","P"), arrayOf("KHCO3","P"), arrayOf("KCH3COO","P"), arrayOf("K2SiO3","P"), arrayOf("KMnO4","P"), arrayOf("K2Cr2O7","P"), arrayOf("K2CrO4","P"), arrayOf("KClO3","P"), arrayOf("KClO4","P"),
    //Na
    arrayOf("NaOH","P"), arrayOf("NaF","P"), arrayOf("NaCl","P"), arrayOf("NaBr","P"), arrayOf("NaI","P"), arrayOf("Na2S","P"), arrayOf("NaHS","P"), arrayOf("Na2SO3","P"), arrayOf("Na2HSO3","P"), arrayOf("Na2SO4","P"), arrayOf("NaHSO4","P"), arrayOf("NaNO3","P"), arrayOf("NaNO2","P"), arrayOf("Na3PO4","P"), arrayOf("Na2HPO4","P"), arrayOf("NaH2PO4","P"), arrayOf("Na2CO3","P"), arrayOf("NaHCO3","P"), arrayOf("NaCH3COO","P"), arrayOf("Na2SiO3","P"), arrayOf("NaMnO4","P"), arrayOf("Na2Cr2O7","P"), arrayOf("Na2CrO4","P"), arrayOf("NaClO3","P"), arrayOf("NaClO4","P"),
    //NH4
    arrayOf("NH4OH","P"), arrayOf("NH4F","P"), arrayOf("NH4Cl","P"), arrayOf("NH4Br","P"), arrayOf("NH4I","P"), arrayOf("(NH4)2S","P"), arrayOf("NH4HS","P"), arrayOf("(NH4)2SO3","P"), arrayOf("(NH4)2HSO3","P"), arrayOf("(NH4)2SO4","P"), arrayOf("NH4HSO4","P"), arrayOf("NH4NO3","P"), arrayOf("NH4NO2","P"), arrayOf("(NH4)3PO4","-"), arrayOf("(NH4)2HPO4","P"), arrayOf("NH4H2PO4","P"), arrayOf("(NH4)2CO3","P"), arrayOf("NH4HCO3","P"), arrayOf("NH4CH3COO","P"), arrayOf("(NH4)2SiO3","-"), arrayOf("NH4MnO4","P"), arrayOf("(NH4)2Cr2O7","P"), arrayOf("(NH4)2CrO4","P"), arrayOf("NH4ClO3","P"), arrayOf("NH4ClO4","P"),
    //Ag
    arrayOf("AgOH","-"), arrayOf("AgF","P"), arrayOf("AgCl","H"), arrayOf("AgBr","H"), arrayOf("AgI","H"), arrayOf("Ag2S","H"), arrayOf("AgHS","-"), arrayOf("Ag2SO3","H"), arrayOf("Ag2HSO3","-"), arrayOf("Ag2SO4","M"), arrayOf("AgHSO4","-"), arrayOf("AgNO3","P"), arrayOf("AgNO2","M"), arrayOf("Ag3PO4","H"), arrayOf("Ag2HPO4","-"), arrayOf("AgH2PO4","P"), arrayOf("Ag2CO3","H"), arrayOf("AgHCO3","-"), arrayOf("AgCH3COO","P"), arrayOf("Ag2SiO3","-"), arrayOf("AgMnO4","-"), arrayOf("Ag2Cr2O7","H"), arrayOf("Ag2CrO4","H"), arrayOf("AgClO3","P"), arrayOf("AgClO4","P"),
    //Ba
    arrayOf("Ba(OH)2","P"), arrayOf("BaF2","M"), arrayOf("BaCl2","P"), arrayOf("BaBr2","P"), arrayOf("BaI2","P"), arrayOf("BaS","-"), arrayOf("Ba(HS)2","P"), arrayOf("BaSO3","H"), arrayOf("BaHSO3","P"), arrayOf("BaSO4","H"), arrayOf("Ba(HSO4)2","-"), arrayOf("Ba(NO3)2","P"), arrayOf("Ba(NO2)2","P"), arrayOf("Ba2(PO4)2","H"), arrayOf("BaHPO4","H"), arrayOf("Ba(H2PO4)2","P"), arrayOf("BaCO3","H"), arrayOf("Ba(HCO3)2","P"), arrayOf("Ba(CH3COO)2","P"), arrayOf("BaSiO3","H"), arrayOf("Ba(MnO4)2","P"), arrayOf("BaCr2O7","M"), arrayOf("BaCrO4","H"), arrayOf("Ba(ClO3)2","P"), arrayOf("Ba(ClO4)2","P"),
    //Ca
    arrayOf("Ca(OH)2","M"), arrayOf("CaF2","H"), arrayOf("CaCl2","P"), arrayOf("CaBr2","P"), arrayOf("CaI2","P"), arrayOf("CaS","-"), arrayOf("Ca(HS)2","P"), arrayOf("CaSO3","H"), arrayOf("CaHSO3","P"), arrayOf("CaSO4","M"), arrayOf("Ca(HSO4)2","-"), arrayOf("Ca(NO3)2","P"), arrayOf("Ca(NO2)2","P"), arrayOf("Ca3(PO4)2","H"), arrayOf("CaHPO4","H"), arrayOf("Ca(H2PO4)2","P"), arrayOf("CaCO3","H"), arrayOf("Ca(HCO3)2","P"), arrayOf("Ca(CH3COO)2","P"), arrayOf("CaSiO3","H"), arrayOf("Ca(MnO4)2","P"), arrayOf("CaCr2O7","P"), arrayOf("CaCrO4","P"), arrayOf("Ca(ClO3)2","P"), arrayOf("Ca(ClO4)2","P"),
    //Mg
    arrayOf("Mg(OH)2","H"), arrayOf("MgF2","H"), arrayOf("MgCl2","P"), arrayOf("MgBr2","P"), arrayOf("MgI2","P"), arrayOf("MgS","-"), arrayOf("Mg(HS)2","P"), arrayOf("MgSO3","M"), arrayOf("MgHSO3","P"), arrayOf("MgSO4","P"), arrayOf("Mg(HSO4)2","-"), arrayOf("MgNO3","P"), arrayOf("MgNO2","P"), arrayOf("Mg3(PO4)2","H"), arrayOf("MgHPO4","M"), arrayOf("Mg(H2PO4)2","P"), arrayOf("MgCO3","H"), arrayOf("Mg(HCO3)2","P"), arrayOf("Mg(CH3COO)2","P"), arrayOf("MgSiO3","H"), arrayOf("Mg(MnO4)2","P"), arrayOf("MgCr2O7","-"), arrayOf("MgCrO4","P"), arrayOf("Mg(ClO3)2","P"), arrayOf("Mg(ClO4)2","P"),
    //Sr
    arrayOf("Sr(OH)2","M"), arrayOf("SrF2","H"), arrayOf("SrCl2","P"), arrayOf("SrBr2","P"), arrayOf("SrI2","P"), arrayOf("SrS","H"), arrayOf("Sr(HS)2","P"), arrayOf("SrSO3","H"), arrayOf("SrHSO3","P"), arrayOf("SrSO4","H"), arrayOf("Sr(HSO4)2","-"), arrayOf("Sr(NO3)2","P"), arrayOf("Sr(NO2)2","P"), arrayOf("Sr3(PO4)2","H"), arrayOf("SrHPO4","H"), arrayOf("Sr(H2PO4)2","P"), arrayOf("SrCO3","H"), arrayOf("Sr(HCO3)2","P"), arrayOf("Sr(CH3COO)2","P"), arrayOf("SrSiO3","H"), arrayOf("Sr(MnO4)2","P"), arrayOf("SrCr2O7","H"), arrayOf("SrCrO4","H"), arrayOf("Sr(ClO3)2","P"), arrayOf("Sr(ClO4)2","P"),
    //Fe
    arrayOf("Fe(OH)2","H"), arrayOf("FeF2","H"), arrayOf("FeCl2","P"), arrayOf("FeBr2","P"), arrayOf("FeI2","P"), arrayOf("FeS","H"), arrayOf("Fe(HS)2","-"), arrayOf("FeSO3","H"), arrayOf("FeHSO3","-"), arrayOf("FeSO4","P"), arrayOf("Fe(HSO4)2","-"), arrayOf("Fe(NO3)2","P"), arrayOf("Fe(NO2)2","-"), arrayOf("Fe3(PO4)2","H"), arrayOf("FeHPO4","H"), arrayOf("Fe(H2PO4)2","P"), arrayOf("FeCO3","H"), arrayOf("Fe(HCO3)2","P"), arrayOf("Fe(CH3COO)2","P"), arrayOf("FeSiO3","H"), arrayOf("Fe(MnO4)2","-"), arrayOf("FeCr2O7","-"), arrayOf("FeCrO4","-"), arrayOf("Fe(ClO3)2","-"), arrayOf("Fe(ClO4)2","P"),
    //Mn
    arrayOf("Mn(OH)2","H"), arrayOf("MnF2","P"), arrayOf("MnCl2","P"), arrayOf("MnBr2","P"), arrayOf("MnI2","P"), arrayOf("MnS","H"), arrayOf("Mn(HS)2","-"), arrayOf("MnSO3","-"), arrayOf("MnHSO3","-"), arrayOf("MnSO4","P"), arrayOf("Mn(HSO4)2","-"), arrayOf("Mn(NO3)2","P"), arrayOf("Mn(NO2)2","-"), arrayOf("Mn3(PO4)2","H"), arrayOf("MnHPO4","H"), arrayOf("Mn(H2PO4)2","P"), arrayOf("MnCO3","H"), arrayOf("Mn(HCO3)2","-"), arrayOf("Mn(CH3COO)2","P"), arrayOf("MnSiO3","H"), arrayOf("Mn(MnO4)2","-"), arrayOf("MnCr2O7","-"), arrayOf("MnCrO4","H"), arrayOf("Mn(ClO3)2","P"), arrayOf("Mn(ClO4)2","P"),
    //Zn
    arrayOf("Zn(OH)2","H"), arrayOf("ZnF2","P"), arrayOf("ZnCl2","P"), arrayOf("ZnBr2","P"), arrayOf("ZnI2","P"), arrayOf("ZnS","H"), arrayOf("Zn(HS)2","-"), arrayOf("ZnSO3","M"), arrayOf("ZnHSO3","-"), arrayOf("ZnSO4","P"), arrayOf("Zn(HSO4)2","-"), arrayOf("Zn(NO3)2","P"), arrayOf("Zn(NO2)2","-"), arrayOf("Zn3(PO4)2","H"), arrayOf("ZnHPO4","-"), arrayOf("Zn(H2PO4)2","P"), arrayOf("ZnCO3","H"), arrayOf("Zn(HCO3)2","-"), arrayOf("Zn(CH3COO)2","P"), arrayOf("ZnSiO3","H"), arrayOf("Zn(MnO4)2","P"), arrayOf("ZnCr2O7","-"), arrayOf("ZnCrO4","H"), arrayOf("Zn(ClO3)2","P"), arrayOf("Zn(ClO4)2","P"),
    //Hg
    arrayOf("Hg(OH)2","-"), arrayOf("HgF2","-"), arrayOf("HgCl2","P"), arrayOf("HgBr2","M"), arrayOf("HgI2","H"), arrayOf("HgS","H"), arrayOf("Hg(HS)2","-"), arrayOf("HgSO3","H"), arrayOf("HgHSO3","-"), arrayOf("HgSO4","-"), arrayOf("Hg(HSO4)2","-"), arrayOf("Hg(NO3)2","P"), arrayOf("Hg(NO2)2","-"), arrayOf("Hg3(PO4)2","H"), arrayOf("HgHPO4","-"), arrayOf("Hg(H2PO4)2","-"), arrayOf("HgCO3","H"), arrayOf("Hg(HCO3)2","-"), arrayOf("Hg(CH3COO)2","P"), arrayOf("HgSiO3","-"), arrayOf("Hg(MnO4)2","-"), arrayOf("HgCr2O7","H"), arrayOf("HgCrO4","H"), arrayOf("Hg(ClO3)2","P"), arrayOf("Hg(ClO4)2","P"),
    //Pb
    arrayOf("Pb(OH)2","H"), arrayOf("PbF2","H"), arrayOf("PbCl2","M"), arrayOf("PbBr2","M"), arrayOf("PbI2","H"), arrayOf("PbS","H"), arrayOf("Pb(HS)2","-"), arrayOf("PbSO3","H"), arrayOf("PbHSO3","-"), arrayOf("PbSO4","H"), arrayOf("Pb(HSO4)2","H"), arrayOf("Pb(NO3)2","P"), arrayOf("Pb(NO2)2","-"), arrayOf("Pb3(PO4)2","H"), arrayOf("PbHPO4","M"), arrayOf("Pb(H2PO4)2","-"), arrayOf("PbCO3","H"), arrayOf("Pb(HCO3)2","P"), arrayOf("Pb(CH3COO)2","P"), arrayOf("PbSiO3","H"), arrayOf("Pb(MnO4)2","-"), arrayOf("PbCr2O7","M"), arrayOf("PbCrO4","H"), arrayOf("Pb(ClO3)2","P"), arrayOf("Pb(ClO4)2","P"),
    //Sn
    arrayOf("Sn(OH)2","H"), arrayOf("SnF2","P"), arrayOf("SnCl2","P"), arrayOf("SnBr2","P"), arrayOf("SnI2","M"), arrayOf("SnS","H"), arrayOf("Sn(HS)2","-"), arrayOf("SnSO3","-"), arrayOf("SnHSO3","-"), arrayOf("SnSO4","P"), arrayOf("Pb(HSO4)2","-"), arrayOf("Pb(NO3)2","-"), arrayOf("Pb(NO2)2","-"), arrayOf("Sn3(PO4)2","H"), arrayOf("SnHPO4","H"), arrayOf("Sn(H2PO4)2","-"), arrayOf("SnCO3","-"), arrayOf("Sn(HCO3)2","-"), arrayOf("Sn(CH3COO)2","-"), arrayOf("SnSiO3","-"), arrayOf("Sn(MnO4)2","-"), arrayOf("SnCr2O7","-"), arrayOf("SnCrO4","H"), arrayOf("Sn(ClO3)2","-"), arrayOf("Sn(ClO4)2","-"),
    //Cu
    arrayOf("Cu(OH)2","H"), arrayOf("CuF2","P"), arrayOf("CuCl2","P"), arrayOf("CuBr2","P"), arrayOf("CuI2","-"), arrayOf("CuS","H"), arrayOf("Cu(HS)2","-"), arrayOf("CuSO3","-"), arrayOf("CuHSO3","-"), arrayOf("CuSO4","P"), arrayOf("Cu(HSO4)2","-"), arrayOf("Cu(NO3)2","P"), arrayOf("Cu(NO2)2","-"), arrayOf("Cu3(PO4)2","H"), arrayOf("CuHPO4","-"), arrayOf("Cu(H2PO4)2","-"), arrayOf("CuCO3","H"), arrayOf("Cu(HCO3)2","-"), arrayOf("Cu(CH3COO)2","P"), arrayOf("CuSiO3","-"), arrayOf("Cu(MnO4)2","-"), arrayOf("CuCr2O7","P"), arrayOf("CuCrO4","H"), arrayOf("Cu(ClO3)2","P"), arrayOf("Cu(ClO4)2","P"),
    //Al
    arrayOf("Al(OH)3","H"), arrayOf("AlF3","M"), arrayOf("AlCl3","P"), arrayOf("AlBr3","P"), arrayOf("AlI3","P"), arrayOf("Al2S3","-"), arrayOf("Al(HS)3","-"), arrayOf("Al2(SO3)3","-"), arrayOf("Al2(HSO3)3","-"), arrayOf("Al2(SO4)3","P"), arrayOf("Al(HSO4)3","-"), arrayOf("Al(NO3)3","P"), arrayOf("Al(NO2)3","-"), arrayOf("AlPO4","H"), arrayOf("Al2(HPO4)3","-"), arrayOf("AlH2PO43","-"), arrayOf("Al2(CO3)3","-"), arrayOf("Al(HCO3)3","-"), arrayOf("Al(CH3COO)3","-"), arrayOf("Al2(SiO3)3","-"), arrayOf("Al(MnO4)3","P"), arrayOf("Al2(Cr2O7)3","-"), arrayOf("Al2(CrO4)3","-"), arrayOf("Al(ClO3)3","P"), arrayOf("Al(ClO4)3","P"),
    //Fe
    arrayOf("Fe(OH)3","H"), arrayOf("FeF3","H"), arrayOf("FeCl3","P"), arrayOf("FeBr3","P"), arrayOf("FeI3","-"), arrayOf("Fe2S3","-"), arrayOf("Fe(HS)3","-"), arrayOf("Fe2(SO3)3","-"), arrayOf("Fe2(HSO3)3","-"), arrayOf("Fe2(SO4)3","P"), arrayOf("Fe(HSO4)3","-"), arrayOf("Fe(NO3)3","P"), arrayOf("Fe(NO2)3","-"), arrayOf("FePO4","H"), arrayOf("Fe2(HPO4)3","-"), arrayOf("FeH2PO43","-"), arrayOf("Fe2(CO3)3","-"), arrayOf("Fe(HCO3)3","-"), arrayOf("Fe(CH3COO)3","-"), arrayOf("Fe2(SiO3)3","-"), arrayOf("Fe(MnO4)3","-"), arrayOf("Fe2(Cr2O7)3","P"), arrayOf("Fe2(CrO4)3","H"), arrayOf("Fe(ClO3)3","-"), arrayOf("Fe(ClO4)3","P"),
    //Cr
    arrayOf("Cr(OH)3","H"), arrayOf("CrF3","H"), arrayOf("CrCl3","P"), arrayOf("CrBr3","P"), arrayOf("CrI3","-"), arrayOf("Cr2S3","-"), arrayOf("Cr(HS)3","-"), arrayOf("Cr2(SO3)3","-"), arrayOf("Cr2(HSO3)3","-"), arrayOf("Cr2(SO4)3","P"), arrayOf("Cr(HSO4)3","-"), arrayOf("Cr(NO3)3","P"), arrayOf("Cr(NO2)3","-"), arrayOf("CrPO4","H"), arrayOf("Cr2(HPO4)3","-"), arrayOf("CrH2PO43","-"), arrayOf("Cr2(CO3)3","-"), arrayOf("Cr(HCO3)3","-"), arrayOf("Cr(CH3COO)3","P"), arrayOf("Cr2(SiO3)3","-"), arrayOf("Cr(MnO4)3","-"), arrayOf("Cr2(Cr2O7)3","-"), arrayOf("Cr2(CrO4)3","-"), arrayOf("Cr(ClO3)3","P"), arrayOf("Cr(ClO4)3","P"),
)

fun main(firstProduct: String, secondProduct: String) {
    var fpP = false
    var spP = false

    if (firstProduct != secondProduct) {
        for (reaction in table) {
            if (reaction[0] == firstProduct) {
                if (reaction[1] == "P") {
                    fpP = true
                    break
                }
            }
        }

        if (fpP) {
            for (reaction in table) {
                if (reaction[0] == secondProduct) {
                    if (reaction[1] == "P") {
                        spP = true
                        break
                    }
                }
            }
        } else {
            return
        }

        if (spP) {
            val anion1 = arrayOf("", "")
            val anion2 = arrayOf("", "")
            val kation1 = arrayOf("", "")
            val kation2 = arrayOf("", "")

            for (reaction in kations) {
                if (firstProduct.contains(reaction[0])) {
                    kation1[0] = reaction[0]
                    kation1[1] = reaction[1]
                }
                if (secondProduct.contains(reaction[0])) {
                    kation2[0] = reaction[0]
                    kation2[1] = reaction[1]
                }
            }

            val firstProductModified = firstProduct.replace(kation1[0], "")
            val secondProductModified = secondProduct.replace(kation2[0], "")

            for (reaction in anions) {
                if (firstProductModified.contains(reaction[0])) {
                    anion1[0] = reaction[0]
                    anion1[1] = reaction[1]
                }
                if (secondProductModified.contains(reaction[0])) {
                    anion2[0] = reaction[0]
                    anion2[1] = reaction[1]
                }
            }

            val newFirstProduct = "${kation1[0]}${if (kation1[1] == "1") "" else kation1[1]}${anion2[0]}${if (anion2[1] == "1") "" else anion2[1]}"
            val newSecondProduct = "${kation2[0]}${if (kation2[1] == "1") "" else kation2[1]}${anion1[0]}${if (anion1[1] == "1") "" else anion1[1]}"

            println("$firstProduct + $secondProduct = ${if (newFirstProduct.contains("HOH")) "H2O" else newFirstProduct} + ${if (newSecondProduct.contains("HOH")) "H2O" else newSecondProduct}")
        }
    }
}
