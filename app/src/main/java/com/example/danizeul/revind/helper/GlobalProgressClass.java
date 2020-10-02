package com.example.danizeul.revind.helper;

import android.app.Application;


public class GlobalProgressClass extends Application {

    private int CauzeIntro=0,CauzeEtim=0,CauzeMB=0,CauzeEU=0;

    public int getCauzeIntro() {
        return CauzeIntro;
    }

    public void setCauzeIntro(int cauzeIntro) {
        CauzeIntro = cauzeIntro;
    }

    public int getCauzeEtim() {
        return CauzeEtim;
    }

    public void setCauzeEtim(int cauzeEtim) {
        CauzeEtim = cauzeEtim;
    }

    public int getCauzeMB() {
        return CauzeMB;
    }

    public void setCauzeMB(int cauzeMB) {
        CauzeMB = cauzeMB;
    }

    public int getCauzeEU() {
        return CauzeEU;
    }

    public void setCauzeEU(int cauzeEU) {
        CauzeEU = cauzeEU;
    }

    /**********************************************************/

    private int corect;

    public int getCorect() {
        return corect;
    }

    public void setCorect(int corect) {
        this.corect = corect;
    }

    private int scor,total;

    public int getScor() {
        return scor;
    }

    public void setScor(int scor) {
        this.scor = scor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    /**************************************************************/

    private int DescopeririManufactura=0,DescopeririFier=0,DescopeririAbur=0,DescopeririChimicale=0,DescopeririGaz=0,DescopeririSticla=0,DescopeririPapetarie=0,DescopeririAgricultura=0,DescopeririMinat=0,DescopeririTransport=0;

    public int getDescopeririManufactura() {
        return DescopeririManufactura;
    }

    public void setDescopeririManufactura(int descopeririManufactura) {
        DescopeririManufactura = descopeririManufactura;
    }

    public int getDescopeririFier() {
        return DescopeririFier;
    }

    public void setDescopeririFier(int descopeririFier) {
        DescopeririFier = descopeririFier;
    }

    public int getDescopeririAbur() {
        return DescopeririAbur;
    }

    public void setDescopeririAbur(int descopeririAbur) {
        DescopeririAbur = descopeririAbur;
    }

    public int getDescopeririChimicale() {
        return DescopeririChimicale;
    }

    public void setDescopeririChimicale(int descopeririChimicale) {
        DescopeririChimicale = descopeririChimicale;
    }

    public int getDescopeririGaz() {
        return DescopeririGaz;
    }

    public void setDescopeririGaz(int descopeririGaz) {
        DescopeririGaz = descopeririGaz;
    }

    public int getDescopeririSticla() {
        return DescopeririSticla;
    }

    public void setDescopeririSticla(int descopeririSticla) {
        DescopeririSticla = descopeririSticla;
    }

    public int getDescopeririPapetarie() {
        return DescopeririPapetarie;
    }

    public void setDescopeririPapetarie(int descopeririPapetarie) {
        DescopeririPapetarie = descopeririPapetarie;
    }

    public int getDescopeririAgricultura() {
        return DescopeririAgricultura;
    }

    public void setDescopeririAgricultura(int descopeririAgricultura) {
        DescopeririAgricultura = descopeririAgricultura;
    }

    public int getDescopeririMinat() {
        return DescopeririMinat;
    }

    public void setDescopeririMinat(int descopeririMinat) {
        DescopeririMinat = descopeririMinat;
    }

    public int getDescopeririTransport() {
        return DescopeririTransport;
    }

    public void setDescopeririTransport(int descopeririTransport) {
        DescopeririTransport = descopeririTransport;
    }

    /**********************************************************/

    private int AltePart1=0,AltePart2=0,AltePart3=0,AltePart4=0,AltePart5=0,AltePart6=0;

    public int getAltePart1() {
        return AltePart1;
    }

    public void setAltePart1(int altePart1) {
        AltePart1 = altePart1;
    }

    public int getAltePart2() {
        return AltePart2;
    }

    public void setAltePart2(int altePart2) {
        AltePart2 = altePart2;
    }

    public int getAltePart3() {
        return AltePart3;
    }

    public void setAltePart3(int altePart3) {
        AltePart3 = altePart3;
    }

    public int getAltePart4() {
        return AltePart4;
    }

    public void setAltePart4(int altePart4) {
        AltePart4 = altePart4;
    }

    public int getAltePart5() {
        return AltePart5;
    }

    public void setAltePart5(int altePart5) {
        AltePart5 = altePart5;
    }

    public int getAltePart6() {
        return AltePart6;
    }

    public void setAltePart6(int altePart6) {
        AltePart6 = altePart6;
    }

    /****************************************************************/

    private String sugestia;

    public String getSugestia() {
        return sugestia;
    }

    public void setSugestia(String sugestia) {
        this.sugestia = sugestia;
    }

    /*********************************************************************************/

    public int recordTotal,recordScor,record;

    public int getRecordTotal() {
        return recordTotal;
    }

    public void setRecordTotal(int recordTotal) {
        this.recordTotal = recordTotal;
    }

    public int getRecordScor() {
        return recordScor;
    }

    public void setRecordScor(int recordScor) {
        this.recordScor = recordScor;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public boolean gataTest;

    public boolean isGataTest() {
        return gataTest;
    }

    public void setGataTest(boolean gataTest) {
        this.gataTest = gataTest;
    }
}
