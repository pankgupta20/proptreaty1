package treaty_constants;

public class ConstantParameters {
	public int Scenario_ID = 0;
	public int Scenario_Desc = 1;
	public int CheckBox = 2;
	public int Status_Table = 3;
	public int UMR = 4;
	public int Treaty_Number = 5;
	public int Company_Stamp = 6;
	public int UW_Year = 7;
	public int Reinsured_Name = 8;
	public int Contract_Section_ref = 9;
	public int Orig_ccy = 10;
	public int Net_Premium_Balance = 11;
	public int Net_Claim_Balance = 12;
	public int Statement_Balance = 13;
	public int Outstanding_LossAmount = 14;
	public int Group_Ref = 15;
	public int Broker_Group_ref = 16;
	public int Cedant_presentation_date = 17;
	public int Broker_Submission_Date = 18;
	public int Lead_carrier_presentation_date = 19;
	public int Presentation_Date = 20;
	public int Days_until_auto_agreed = 21;
	public int Status_Filter = 22;

	/*
	 * public static Object getExcelColName(String colName) { Field fld[] =
	 * ConstantParameters.class.getDeclaredFields(); for (int i = 0; i <
	 * fld.length; i++) { String actFieldName = fld[i].getName(); if
	 * (actFieldName.equalsIgnoreCase(colName)) {
	 * System.out.println("Variable Name is: " + actFieldName); //actFieldValue
	 * = fld[i]. return actFieldName; } } return null; }
	 */

	/*
	 * public static void main(String args[]) {
	 * 
	 * String cname = Integer.toString(getExcelColName(UMR));
	 * System.out.println(cname);
	 * 
	 * Object obj = getExcelColName(UMR); System.out.println(obj); }
	 */

}
