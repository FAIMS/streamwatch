package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Login
     */
    public static View get_Login(Solo solo) {
        String ref = "Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Site
     */
    public static View get_Site(Solo solo) {
        String ref = "Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Site_Visit
     */
    public static View get_SiteVisit(Solo solo) {
        String ref = "Site_Visit";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Main
     */
    public static View get_Control_Main(Solo solo) {
        String ref = "Control/Main";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Login/Group_Login
     */
    public static View get_Login_GroupLogin(Solo solo) {
        String ref = "Login/Group_Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Site/Site_Info
     */
    public static View get_Site_SiteInfo(Solo solo) {
        String ref = "Site/Site_Info";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Site_Visit/Parameters
     */
    public static View get_SiteVisit_Parameters(Solo solo) {
        String ref = "Site_Visit/Parameters";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Site_Visit/Record
     */
    public static View get_SiteVisit_Record(Solo solo) {
        String ref = "Site_Visit/Record";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Main/Add_New_Site
     */
    public static View get_Control_Main_AddNewSite(Solo solo) {
        String ref = "Control/Main/Add_New_Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/Group_Login/Log_in
     */
    public static View get_Login_GroupLogin_Login(Solo solo) {
        String ref = "Login/Group_Login/Log_in";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/Group_Login/Sign_up
     */
    public static View get_Login_GroupLogin_Signup(Solo solo) {
        String ref = "Login/Group_Login/Sign_up";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Site/Site_Info/Add_New_Visit
     */
    public static View get_Site_SiteInfo_AddNewVisit(Solo solo) {
        String ref = "Site/Site_Info/Add_New_Visit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Site/Site_Info/Take_From_GPS_1
     */
    public static View get_Site_SiteInfo_TakeFromGPS1(Solo solo) {
        String ref = "Site/Site_Info/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Site_Visit/Parameters/Check_out
     */
    public static View get_SiteVisit_Parameters_Checkout(Solo solo) {
        String ref = "Site_Visit/Parameters/Check_out";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Site_Visit/Record/Check_in
     */
    public static View get_SiteVisit_Record_Checkin(Solo solo) {
        String ref = "Site_Visit/Record/Check_in";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Search/Entity_Types
     */
    public static View get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Login/Group_Login/Group_Name
     */
    public static View get_Login_GroupLogin_GroupName(Solo solo) {
        String ref = "Login/Group_Login/Group_Name";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Site_Visit/Record/Flow_magnitude
     */
    public static View get_SiteVisit_Record_Flowmagnitude(Solo solo) {
        String ref = "Site_Visit/Record/Flow_magnitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Site_Visit/Record/Last_Rainfall
     */
    public static View get_SiteVisit_Record_LastRainfall(Solo solo) {
        String ref = "Site_Visit/Record/Last_Rainfall";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Site_Visit/Record/Rainfall_Description
     */
    public static View get_SiteVisit_Record_RainfallDescription(Solo solo) {
        String ref = "Site_Visit/Record/Rainfall_Description";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Main/Next_Site_Visit_ID
     */
    public static EditText get_Control_Main_NextSiteVisitID(Solo solo) {
        String ref = "Control/Main/Next_Site_Visit_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site_Info/Accuracy
     */
    public static View get_Site_SiteInfo_Accuracy(Solo solo) {
        String ref = "Site/Site_Info/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site_Info/Comments
     */
    public static EditText get_Site_SiteInfo_Comments(Solo solo) {
        String ref = "Site/Site_Info/Comments";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site_Info/Easting
     */
    public static View get_Site_SiteInfo_Easting(Solo solo) {
        String ref = "Site/Site_Info/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site_Info/Latitude
     */
    public static View get_Site_SiteInfo_Latitude(Solo solo) {
        String ref = "Site/Site_Info/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site_Info/Longitude
     */
    public static View get_Site_SiteInfo_Longitude(Solo solo) {
        String ref = "Site/Site_Info/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site_Info/Northing
     */
    public static View get_Site_SiteInfo_Northing(Solo solo) {
        String ref = "Site/Site_Info/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site/Site_Info/Site_Site_Name
     */
    public static EditText get_Site_SiteInfo_SiteSiteName(Solo solo) {
        String ref = "Site/Site_Info/Site_Site_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Available_Phosphate_mg_L
     */
    public static EditText get_SiteVisit_Parameters_AvailablePhosphatemgL(Solo solo) {
        String ref = "Site_Visit/Parameters/Available_Phosphate_mg_L";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Comments
     */
    public static EditText get_SiteVisit_Parameters_Comments(Solo solo) {
        String ref = "Site_Visit/Parameters/Comments";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Dissolved_Oxygen_mh_L
     */
    public static EditText get_SiteVisit_Parameters_DissolvedOxygenmhL(Solo solo) {
        String ref = "Site_Visit/Parameters/Dissolved_Oxygen_mh_L";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Ecoli_Petrifilm_CFU_100mL
     */
    public static EditText get_SiteVisit_Parameters_EcoliPetrifilmCFU100mL(Solo solo) {
        String ref = "Site_Visit/Parameters/Ecoli_Petrifilm_CFU_100mL";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Electrical_Conductivity
     */
    public static EditText get_SiteVisit_Parameters_ElectricalConductivity(Solo solo) {
        String ref = "Site_Visit/Parameters/Electrical_Conductivity";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Nitrate_mg_L
     */
    public static EditText get_SiteVisit_Parameters_NitratemgL(Solo solo) {
        String ref = "Site_Visit/Parameters/Nitrate_mg_L";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Other_Test_Name
     */
    public static EditText get_SiteVisit_Parameters_OtherTestName(Solo solo) {
        String ref = "Site_Visit/Parameters/Other_Test_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Other_Test_Values
     */
    public static EditText get_SiteVisit_Parameters_OtherTestValues(Solo solo) {
        String ref = "Site_Visit/Parameters/Other_Test_Values";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Temperature_C
     */
    public static EditText get_SiteVisit_Parameters_TemperatureC(Solo solo) {
        String ref = "Site_Visit/Parameters/Temperature_C";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Time_Checked_out
     */
    public static EditText get_SiteVisit_Parameters_TimeCheckedout(Solo solo) {
        String ref = "Site_Visit/Parameters/Time_Checked_out";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Turbidity_FTU_FAU
     */
    public static EditText get_SiteVisit_Parameters_TurbidityFTUFAU(Solo solo) {
        String ref = "Site_Visit/Parameters/Turbidity_FTU_FAU";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/Turbidity_NTU
     */
    public static EditText get_SiteVisit_Parameters_TurbidityNTU(Solo solo) {
        String ref = "Site_Visit/Parameters/Turbidity_NTU";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Parameters/pH
     */
    public static EditText get_SiteVisit_Parameters_pH(Solo solo) {
        String ref = "Site_Visit/Parameters/pH";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Record/Data_recorded_by
     */
    public static EditText get_SiteVisit_Record_Datarecordedby(Solo solo) {
        String ref = "Site_Visit/Record/Data_recorded_by";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Record/Observation
     */
    public static EditText get_SiteVisit_Record_Observation(Solo solo) {
        String ref = "Site_Visit/Record/Observation";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Record/Site_Visit_ID
     */
    public static EditText get_SiteVisit_Record_SiteVisitID(Solo solo) {
        String ref = "Site_Visit/Record/Site_Visit_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Record/Site_Visit_Site_Name
     */
    public static EditText get_SiteVisit_Record_SiteVisitSiteName(Solo solo) {
        String ref = "Site_Visit/Record/Site_Visit_Site_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Site_Visit/Record/Time_Checked_in
     */
    public static EditText get_SiteVisit_Record_TimeCheckedin(Solo solo) {
        String ref = "Site_Visit/Record/Time_Checked_in";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Main/List_of_Sites
     */
    public static View get_Control_Main_ListofSites(Solo solo) {
        String ref = "Control/Main/List_of_Sites";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Site/Site_Info/Existing_Site_Visits
     */
    public static View get_Site_SiteInfo_ExistingSiteVisits(Solo solo) {
        String ref = "Site/Site_Info/Existing_Site_Visits";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/AP_Exception
     */
    public static View get_SiteVisit_Parameters_APException(Solo solo) {
        String ref = "Site_Visit/Parameters/AP_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/DO_Exception
     */
    public static View get_SiteVisit_Parameters_DOException(Solo solo) {
        String ref = "Site_Visit/Parameters/DO_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/EC_Exception
     */
    public static View get_SiteVisit_Parameters_ECException(Solo solo) {
        String ref = "Site_Visit/Parameters/EC_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/EC_Units
     */
    public static View get_SiteVisit_Parameters_ECUnits(Solo solo) {
        String ref = "Site_Visit/Parameters/EC_Units";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/Ecoli_Exception
     */
    public static View get_SiteVisit_Parameters_EcoliException(Solo solo) {
        String ref = "Site_Visit/Parameters/Ecoli_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/NO3_Exception
     */
    public static View get_SiteVisit_Parameters_NO3Exception(Solo solo) {
        String ref = "Site_Visit/Parameters/NO3_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/Other_Test_Exception
     */
    public static View get_SiteVisit_Parameters_OtherTestException(Solo solo) {
        String ref = "Site_Visit/Parameters/Other_Test_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/Temp_Exception
     */
    public static View get_SiteVisit_Parameters_TempException(Solo solo) {
        String ref = "Site_Visit/Parameters/Temp_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/Turb_FTU_FAU_Exception
     */
    public static View get_SiteVisit_Parameters_TurbFTUFAUException(Solo solo) {
        String ref = "Site_Visit/Parameters/Turb_FTU_FAU_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/Turb_NTU_Exception
     */
    public static View get_SiteVisit_Parameters_TurbNTUException(Solo solo) {
        String ref = "Site_Visit/Parameters/Turb_NTU_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Site_Visit/Parameters/pH_Exception
     */
    public static View get_SiteVisit_Parameters_pHException(Solo solo) {
        String ref = "Site_Visit/Parameters/pH_Exception";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Login/Group_Login/Signup_Guide_1
     */
    public static View get_Login_GroupLogin_SignupGuide1(Solo solo) {
        String ref = "Login/Group_Login/Signup_Guide_1";
        return (android.view.View) solo.getView((Object) ref);
    }
}
