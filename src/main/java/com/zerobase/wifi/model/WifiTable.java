package com.zerobase.wifi.model;

public class WifiTable {
    private String ManageNumber;
    private String District;
    private String WifiName;
    private String Address;
    private String Address2;
    private String InstallPlace;
    private String InstallType;
    private String InstallAgency;
    private String InstallDepart;
    private String ServiceType;
    private String WebType;
    private Integer Year;
    private String InOut;
    private String ConnStatus;
    private Double X;
    private Double Y;
    private String Date;

    public WifiTable(String ManageNumber, String District, String WifiName, String Address, String Address2,
                     String InstallPlace, String InstallType, String InstallAgency, String InstallDepart,
                     String ServiceType, String WebType, Integer Year, String InOut, String ConnStatus,
                     Double X, Double Y, String Date){
        this.ManageNumber = ManageNumber;
        this.District = District;
        this.WifiName = WifiName;
        this.Address = Address;
        this.Address2 = Address2;
        this.InstallPlace = InstallPlace;
        this.InstallType = InstallType;
        this.InstallAgency = InstallAgency;
        this.InstallDepart = InstallDepart;
        this.ServiceType = ServiceType;
        this.WebType = WebType;
        this.Year = Year;
        this.InOut = InOut;
        this.ConnStatus = ConnStatus;
        this.X = X;
        this.Y = Y;
        this.Date = Date;
    }
}
