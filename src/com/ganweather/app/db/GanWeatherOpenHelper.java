package com.ganweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * appkey:1d056748b20ec
 * appSecret:325f7d9181c16906f6422d2fc3d14c9e
 * @author wang
 *
 */
public class GanWeatherOpenHelper extends SQLiteOpenHelper{

	
	/**
	 * Province ±ÌΩ®±Ì”Ôæ‰
	 * @param context
	 * @param name
	 * @param factory
	 * @param version
	 */
	public static final String CREATE_PROVINCE ="create table Province ("
			+"id integer primary key autoincrement, "
			+"province_name text, "
			+"province_code text";
	public static final String CREATE_CITY ="create table Province ("
			+"id integer primary key autoincrement, "
			+"city_name text, "
			+"city_code text";
	public static final String CREATE_COUNTY ="create table Province ("
			+"id integer primary key autoincrement, "
			+"county_name text, "
			+"county_code text";
	public GanWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
