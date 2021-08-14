package src.com.github.M_western.cs3230.GUI;

import kong.unirest.JsonResponse;
import kong.unirest.json.JSONArray;
import src.com.github.M_western.cs3230.GUI.models.stats;
import src.com.github.M_western.cs3230.GUI.nbaGui;
import kong.unirest.JsonNode;
import kong.unirest.json.JSONObject;
import kong.unirest.Unirest;

public class httpClient {
    //do everything
    //
    public static int getIdNum(String firstName, String lastName){
        var ballDontResponse = Unirest.get("https://balldontlie.io/api/v1/players")
                .queryString("search",firstName + "_" + lastName)
                        .asJson();
        //var data = ballDontResponse.getBody().getObject(0).getString("data");
        JSONArray jsonarr = ballDontResponse.getBody().getObject().getJSONArray("data");
        String arrId = jsonarr.getJSONObject(0).getString("id");
        int id = Integer.parseInt(arrId);
        return id;
    }

    public static void main(String[] args) {
    }

    public static float getFgPct(int id1, int id2){
        var fgResponse = Unirest.get("https://www.balldontlie.io/api/v1/season_averages?season=2018&")
                .queryString("play_ids[]", id1)
                .queryString("player_ids[]", id2)
                .asJson();
        JSONArray jsonarr = fgResponse.getBody().getObject().getJSONArray("data");
        String arrFg = jsonarr.getJSONObject(0).getString("fg_pct");
        float fg = Float.parseFloat(arrFg);
        return fg;
    }
}


