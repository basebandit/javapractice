//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.List;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//
//
//public class JSONParser {
//
//    static InputStream is = null;
//    static JSONObject jObj = null;
//    static String json = "";
//
//    public JSONParser() {
//
//    }
//
//    /**
//     * Get json from url by making HTTP POST or GET method
//	 *
//     */
//    public JSONObject makeHttpRequest(String url, String method,
//            List<NameValuePair> params) {
//        // Make HTTP request
//        try {
//            // check for request method
//            switch (method) {
//                case "POST":
//
//                    DefaultHttpClient postHttpClient = new DefaultHttpClient();
//                    HttpPost httpPost = new HttpPost();
//                    httpPost.setEntity(new UrlEncodedFormEntity(params));
//
//                    HttpResponse postHttpResponse = postHttpClient
//                            .execute(httpPost);
//                    HttpEntity postHttpEntity = postHttpResponse.getEntity();
//                    is = postHttpEntity.getContent();
//                    break;
//                case "GET":
//                    DefaultHttpClient getHttpClient = new DefaultHttpClient();
//                    String paramString = URLEncodedUtils.format(params, "utf-8");
//                    url += "?" + paramString;
//                    HttpGet httpGet = new HttpGet(url);
//
//                    HttpResponse getHttpResponse = getHttpClient.execute(httpGet);
//                    HttpEntity getHttpEntity = getHttpResponse.getEntity();
//                    is = getHttpEntity.getContent();
//                    break;
//                default:
//                    break;
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(
//                    is, "iso-8859-1"), 8);
//            StringBuilder sb = new StringBuilder();
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                sb.append(line + " ");
//            }
//            is.close();
//            json = sb.toString();
//        } catch (Exception e) {
//            Log.e("Buffer Error", "Error Converting result" + e.toString());
//        }
//        // Try to parse the String to a JSON Object
//        try {
//            jObj = new JSONObject(json);
//        } catch (JSONException e) {
//            Log.e("JSON Parser", "Error parsing data" + e.toString());
//        }
//        // returns JSON String
//        return jObj;
//    }
//}
