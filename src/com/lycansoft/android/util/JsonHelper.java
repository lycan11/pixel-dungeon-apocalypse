package com.lycansoft.android.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHelper {
	static public JSONObject readFile(String fileName) {
		try {
			InputStream stream = ModdingMode.getInputStream(fileName);
			StringBuilder animationDef = new StringBuilder();

			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

			String line = reader.readLine();

			while (line != null) {
				animationDef.append(line);
				line = reader.readLine();
			}
			reader.close();
			return (JSONObject) new JSONTokener(animationDef.toString()).nextValue();
		} catch (JSONException e) {
//			Game.toast(e.getLocalizedMessage());
			throw new RuntimeException(e);
		} catch (IOException e) {
//			Game.toast(e.getLocalizedMessage());
			throw new RuntimeException(e);
		}
	}
}
