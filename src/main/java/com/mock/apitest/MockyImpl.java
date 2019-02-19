package com.mock.apitest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;

public class MockyImpl implements MockyInterface {

	@Override
	public String getStringResponse() {

//		try {
//			HttpClient httpClient = getNewHttpClient1();
//			HttpGet getRequest = new HttpGet("https://www.mocky.io/v2/5185415ba171ea3a00704eed");
//			HttpResponse response = httpClient.execute(getRequest);
//			if (response.getStatusLine().getStatusCode() != 200) {
//				System.out.println("Error Occured");
//				return null;
//			}
//			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
//			StringBuilder output = new StringBuilder();
//			String line = "";
//			while ((line = br.readLine()) != null) {
//				output.append(line);
//			}
//
//			httpClient.getConnectionManager().shutdown();
//			return output.toString();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		return null;
	}

	public HttpClient getNewHttpClient1() throws Exception {
		try {
			SSLContextBuilder builder = new SSLContextBuilder();
			builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
			SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(builder.build(),
					NoopHostnameVerifier.INSTANCE);
			Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory> create()
					.register("http", new PlainConnectionSocketFactory()).register("https", sslConnectionSocketFactory)
					.build();

			PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);
			cm.setMaxTotal(100);
			CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory)
					.setDefaultCookieStore(new BasicCookieStore()).setConnectionManager(cm).build();
			return httpclient;
		} catch (Exception e) {
			e.printStackTrace();
			return HttpClients.createDefault();
		}
	}
}
