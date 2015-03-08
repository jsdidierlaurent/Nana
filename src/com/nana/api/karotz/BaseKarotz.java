package com.nana.api.karotz;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import com.nana.utils.tools;

public abstract class BaseKarotz {
	public void sendUrlKarotz(final String urlString)
	{
		URL url=null;
		InputStream resultSendMessage;

		try {
			url = tools.UTF8URL(urlString);
		} catch (UnsupportedEncodingException | MalformedURLException
				| URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			resultSendMessage = url.openStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}