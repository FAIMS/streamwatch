#!/bin/bash

./makeElement.sh style_orientation_orientation "horizontal" input 1 false false false false false .
./makeElement.sh style_even_layout_weight "1" input 1 false false false false false .
./makeElement.sh style_large_layout_weight "3" input 1 false false false false false .
./makeElement.sh Login_Group_Login_Group_Name "Group Name" dropdown 1 false false false false false .
./makeElement.sh Login_Group_Login_Log_in "Log in" button 1 false false false false false .
./makeElement.sh Login_Group_Login_Sign_up "Sign up" button 1 false false false false false .
./makeElement.sh Control_Main_Add_New_Site "Add New Site" button 1 false false false false false .
./makeElement.sh Control_Main_Next_Site_Record_ID "Next Site Record ID" input 1 false false false true false .
./makeElement.sh Control_Main_List_of_Sites "List of Sites" list 1 false false false false false .
./makeElement.sh Control_Search_Search_Term "Search Term" input 2 false false false false false .
./makeElement.sh Control_Search_Search_Button "Search Button" button 2 false false false false false .
./makeElement.sh Control_Search_Entity_Types "Entity Types" input 1 false false false false false .
./makeElement.sh Control_Search_Entity_List "Entity List" list 1 false false false false false .
./makeElement.sh Site_Site_Info_Site_Site_Name "Site Name" input 1 false false true false false .
./makeElement.sh Site_Site_Info_Latitude "Latitude" input 2 false false true false false .
./makeElement.sh Site_Site_Info_Longitude "Longitude" input 2 false false true false false .
./makeElement.sh Site_Site_Info_Northing "Northing" input 3 false false true false false .
./makeElement.sh Site_Site_Info_Easting "Easting" input 3 false false true false false .
./makeElement.sh Site_Site_Info_Accuracy "Accuracy" input 3 false false true false false .
./makeElement.sh Site_Site_Info_Comments "Comments" input 1 false false true false false .
./makeElement.sh Site_Site_Info_Add_New_Record "Add New Record" button 1 false false false false false .
./makeElement.sh Site_Site_Info_Existing_Records "Existing Records" dropdown 1 false false false false false .
./makeElement.sh Site_Record_Record_Site_Record_Site_Name "Site Name" input 2 false false true false false .
./makeElement.sh Site_Record_Record_Site_Record_ID "Site Record ID" input 2 false false true false false .
./makeElement.sh Site_Record_Record_Site_Record_author "Recorded by Group" input 2 false false true false false .
./makeElement.sh Site_Record_Record_Data_recorded_by "Data recorded by" input 2 false false true false false .
./makeElement.sh Site_Record_Record_Check_in "Check in" button 1 false false false false false .
./makeElement.sh Site_Record_Record_Time_Checked_in "Time Checked in" input 1 false false true false false .
./makeElement.sh Site_Record_Record_Last_Rainfall "Last Rainfall" dropdown 1 false false true false false .
./makeElement.sh Site_Record_Record_Rainfall_Description "Rainfall Description" dropdown 1 false false true false false .
./makeElement.sh Site_Record_Record_Flow_magnitude "Flow magnitude" dropdown 1 false false true false false .
./makeElement.sh Site_Record_Record_Observation "Observation" input 1 false false true false false .
./makeElement.sh Site_Record_Parameters_Available_Phosphate_mg_L "Available Phosphate (mg/L)" input 2 false false true true false .
./makeElement.sh Site_Record_Parameters_AP_Exception "AP Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Dissolved_Oxygen_mh_L "Dissolved Oxygen (mh/L)" input 2 false false true true false .
./makeElement.sh Site_Record_Parameters_DO_Exception "DO Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Ecoli_Petrifilm_CFU_100mL "Ecoli - Petrifilm (CFU/100mL)" input 2 false false true true false .
./makeElement.sh Site_Record_Parameters_Ecoli_Exception "Ecoli Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Electrical_Conductivity "Electrical Conductivity" input 2 false false true true false .
./makeElement.sh Site_Record_Parameters_EC_Units "EC Units" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_EC_Exception "EC Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Turbidity_NTU "Turbidity (NTU)" input 2 false false true true false .
./makeElement.sh Site_Record_Parameters_Turb_NTU_Exception "Turb. NTU Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Turbidity_FTU_FAU "Turbidity (FTU/FAU)" input 2 false false true true false .
./makeElement.sh Site_Record_Parameters_Turb_FTU_FAU_Exception "Turb. FTU/FAU Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Temperature_C "Temperature (C)" input 2 false false true true false .
./makeElement.sh Site_Record_Parameters_Temp_Exception "Temp. Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_pH "pH" input 2 false false true true false .
./makeElement.sh Site_Record_Parameters_pH_Exception "pH Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Nitrate_mg_L "Nitrate (mg/L)" input 2 false false true true false .
./makeElement.sh Site_Record_Parameters_NO3_Exception "NO3 Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Other_Test_Name "Other Test Name" input 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Other_Test_Values "Other Test Values" input 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Other_Test_Exception "Other Test Exception" checkbox 2 false false true false false .
./makeElement.sh Site_Record_Parameters_Comments "Comments" input 1 false false true false false .
./makeElement.sh Site_Record_Parameters_Check_out "Check out" button 1 false false false false false .
./makeElement.sh Site_Record_Parameters_Time_Checked_out "Time Checked out" input 1 false false true false false .

dot -Tsvg datastruct.gv > wireframe.svg
#rm *.xml
#rm *.datastruct.gv
#rm *.wireframeElements.sh

