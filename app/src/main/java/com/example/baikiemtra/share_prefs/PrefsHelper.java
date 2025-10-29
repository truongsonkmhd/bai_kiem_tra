package com.example.baikiemtra.share_prefs;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefsHelper {
    private static final String PREF_NAME = "contacts_pref";
    private static final String KEY_CONTACTS = "contacts_json";

    public static void saveContacts(Context context, String json) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        prefs.edit().putString(KEY_CONTACTS, json).apply();
    }

    public static String getContacts(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return prefs.getString(KEY_CONTACTS, "[]");
    }
}