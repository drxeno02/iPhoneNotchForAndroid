package com.app.framework.sharedpref;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by LJTat on 2/23/2017.
 */
public class SharedPref {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor prefsEditor;

    /**
     * @param context  Interface to global information about an application environment
     * @param prefName : Name of Preference
     */
    public SharedPref(Context context, String prefName) {
        this.sharedPreferences = context.getSharedPreferences(prefName, Activity.MODE_PRIVATE);
        this.prefsEditor = sharedPreferences.edit();
    }

    /**
     * Method for clearing all data of preference.
     */
    public void clearAllPreferences() {
        prefsEditor.clear();
        prefsEditor.commit();
    }

    /**
     * Method for remove data of preference
     *
     * @param key Key for value retrieval
     */
    public void removePreference(String key) {
        prefsEditor.remove(key);
        prefsEditor.commit();
    }

    /**
     * @param key   Key for value retrieval
     * @param value : String Value
     */
    public void setPref(String key, String value) {
        prefsEditor.putString(key, value);
        prefsEditor.commit();
    }

    /**
     * @param key   Key for value retrieval
     * @param value : int Value
     */
    public void setPref(String key, int value) {
        prefsEditor.putInt(key, value);
        prefsEditor.commit();
    }

    /**
     * @param key   Key for value retrieval
     * @param value : long value
     */
    public void setPref(String key, long value) {
        prefsEditor.putLong(key, value);
        prefsEditor.commit();
    }

    /**
     * @param key   Key for value retrieval
     * @param value : boolean value
     */
    public void setPref(String key, boolean value) {
        prefsEditor.putBoolean(key, value);
        prefsEditor.commit();
    }

    /**
     * @param key      Key for value retrieval
     * @param defValue The default value
     * @return String Type
     */
    public String getStringPref(String key, String defValue) {
        return sharedPreferences.getString(key, defValue);
    }

    /**
     * @param key      Key for value retrieval
     * @param defValue The default value
     * @return int Type
     */
    public int getIntPref(String key, int defValue) {
        return sharedPreferences.getInt(key, defValue);
    }

    /**
     * @param key Key for value retrieval
     * @return boolean type
     */
    public boolean getBooleanPref(String key, boolean defValue) {
        return sharedPreferences.getBoolean(key, defValue);
    }

    /**
     * @param key      Key for value retrieval
     * @param defValue The default value
     * @return long Type
     */
    public long getLongPref(String key, long defValue) {
        return sharedPreferences.getLong(key, defValue);
    }
}
