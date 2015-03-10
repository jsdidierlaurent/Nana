/*
* Copyright (c) 2015 - Seb&Lulu
* Author(s) : Lulu
* Date : 10 mars 2015
*/
package com.nana.api.karotz.functions;

import com.nana.api.APIResponseCodeEnum;
import com.nana.api.karotz.FunctionKarotz;

public class ClockKarotz extends FunctionKarotz {
	private final String _urlTTS;
	private final String _loc = "apps/";
	private final String _command = "clock";
	private final String _hour = "?hour=";

	public ClockKarotz(final String beginUrl) {
		_urlTTS = beginUrl + _loc + _command;
	}

	public APIResponseCodeEnum currentHourKarotz() {
		return sendUrlKarotz(_urlTTS);
	}

	public APIResponseCodeEnum chosenHourKarotz(final int hour) {
		String strHour = Integer.toString(hour % 24);

		return sendUrlKarotz(_urlTTS + _hour + strHour);
	}
}