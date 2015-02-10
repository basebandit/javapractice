//import java.util.ArrayList;
//import java.util.HashMap;
//import org.apache.http.NameValuePair;
//
//class LoadRecords {
//	JSONParser jsonParser = new JSONParser();
//	static ArrayList<HashMap<String, String>> recordsList;
//
//	// url to get all records
//	private static String url_all_records = "http://localhost/IoT/get_all_records.php";
//
//	// JSON Node names
//	private static final String TAG_SUCESS = "success";
//	private static final String TAG_RECORDS = "records";
//	private static final String TAG_ID = "id";
//	private static final String TAG_METER_NAME = "meter_name";
//	private static final String TAG_AMOUNT = "amount";
//
//	// records JSONArray
//	static JSONArray records = null;
//
//	// Activity activity = null;
//
//	/**
//	 * Before starting background thread show Progress Dialog
//	 * */
//
//	/*
//	 * protected void onPreExecute() { super.onPreExecute(); }
//	 */
//
//	/**
//	 * Getting All records from url
//	 * */
//	/*
//	 * protected String doInBackground(String... args) { // Building Parameters
//	 * List<NameValuePair> params = new ArrayList<NameValuePair>(); // getting
//	 * JSON String from URL JSONObject json =
//	 * jsonParser.makeHttpRequest(url_all_records, "GET", params);
//	 * 
//	 * // check your log cat for JSON response Log.d("All records: ",
//	 * json.toString()); try { // checking for SUCCESS TAG int success =
//	 * json.getInt(TAG_SUCESS); if (success == 1) { // records found // Getting
//	 * Array of products records = json.getJSONArray(TAG_RECORDS); // looping
//	 * through all records for (int i = 0; i < records.length(); i++) {
//	 * JSONObject recordsJsonObject = records.getJSONObject(i);
//	 * 
//	 * // Storing each json item in variable String id =
//	 * recordsJsonObject.getString(TAG_ID); String name =
//	 * recordsJsonObject.getString(TAG_METER_NAME); String amount =
//	 * recordsJsonObject.getString(TAG_AMOUNT);
//	 * 
//	 * // creating new HashMap HashMap<String, String> map = new HashMap<>();
//	 * 
//	 * // adding each child node to HashMap key => value map.put(TAG_ID, id);
//	 * map.put(TAG_METER_NAME, name); map.put(TAG_AMOUNT, amount);
//	 * 
//	 * // adding HashMap to ArrayList recordsList.add(map); } } else { // no
//	 * records found // Launch Add New Record Activity } } catch (JSONException
//	 * e) { e.printStackTrace(); } return null; }
//	 */
//	/**
//	 * After completing background task Dismiss the progress dialog
//	 * **/
//	/*
//	 * protected void onPostExecute(String file_url) { // updating UI from
//	 * Background Thread
//	 * 
//	 * }
//	 */
//
//	public static void main(String[] args) {
//		List<NameValuePair> params = new ArrayList<NameValuePair>();
//		JSONParser myParser = new JSONParser();
//		JSONObject json = myParser.makeHttpRequest(url_all_records, "GET",
//				params);
//		System.out.println(json.toString());
//		Log.d("All records: ", json.toString());
//		try {
//			// checking for SUCCESS TAG
//			int success = json.getInt(TAG_SUCESS);
//			if (success == 1) {
//				// records found
//				// Getting Array of products
//				records = json.getJSONArray(TAG_RECORDS);
//				// looping through all records
//				for (int i = 0; i < records.length(); i++) {
//					JSONObject recordsJsonObject = records.getJSONObject(i);
//
//					// Storing each json item in variable
//					String id = recordsJsonObject.getString(TAG_ID);
//					String name = recordsJsonObject.getString(TAG_METER_NAME);
//					String amount = recordsJsonObject.getString(TAG_AMOUNT);
//
//					// creating new HashMap
//					HashMap<String, String> map = new HashMap<>();
//
//					// adding each child node to HashMap key => value
//					map.put(TAG_ID, id);
//					map.put(TAG_METER_NAME, name);
//					map.put(TAG_AMOUNT, amount);
//
//					// adding HashMap to ArrayList
//					recordsList.add(map);
//				}
//			} else {
//				// no records found
//				// Launch Add New Record Activity
//			}
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}
