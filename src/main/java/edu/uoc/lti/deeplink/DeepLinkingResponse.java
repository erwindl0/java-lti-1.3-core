// Generated by delombok at Fri Jul 14 17:42:49 CEST 2023
package edu.uoc.lti.deeplink;

import java.util.List;

import edu.uoc.lti.deeplink.content.Item;

/**
 * @author Created by xaracil@uoc.edu
 */
public class DeepLinkingResponse {
	private final String platformName;
	private final String clientId;
	private final String kid;
	private final String azp;
	private final String deploymentId;
	private final String nonce;
	private final String data;
	private final List<Item> itemList;
	private String message;
	private String log;
	private String errorMessage;
	private String errorLog;

	@java.lang.SuppressWarnings("all")
	public DeepLinkingResponse(final String platformName, final String clientId, String kid, final String azp, final String deploymentId, final String nonce, final String data, final List<Item> itemList) {
		this.platformName = platformName;
		this.clientId = clientId;
		this.kid = kid;
		this.azp = azp;
		this.deploymentId = deploymentId;
		this.nonce = nonce;
		this.data = data;
		this.itemList = itemList;
	}

	@java.lang.SuppressWarnings("all")
	public String getPlatformName() {
		return this.platformName;
	}

	@java.lang.SuppressWarnings("all")
	public String getClientId() {
		return this.clientId;
	}
	
	public String getKid() {
    return kid;
  }

	@java.lang.SuppressWarnings("all")
	public String getAzp() {
		return this.azp;
	}

	@java.lang.SuppressWarnings("all")
	public String getDeploymentId() {
		return this.deploymentId;
	}

	@java.lang.SuppressWarnings("all")
	public String getNonce() {
		return this.nonce;
	}

	@java.lang.SuppressWarnings("all")
	public String getData() {
		return this.data;
	}

	@java.lang.SuppressWarnings("all")
	public List<Item> getItemList() {
		return this.itemList;
	}

	@java.lang.SuppressWarnings("all")
	public String getMessage() {
		return this.message;
	}

	@java.lang.SuppressWarnings("all")
	public String getLog() {
		return this.log;
	}

	@java.lang.SuppressWarnings("all")
	public String getErrorMessage() {
		return this.errorMessage;
	}

	@java.lang.SuppressWarnings("all")
	public String getErrorLog() {
		return this.errorLog;
	}

	@java.lang.SuppressWarnings("all")
	public void setMessage(final String message) {
		this.message = message;
	}

	@java.lang.SuppressWarnings("all")
	public void setLog(final String log) {
		this.log = log;
	}

	@java.lang.SuppressWarnings("all")
	public void setErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@java.lang.SuppressWarnings("all")
	public void setErrorLog(final String errorLog) {
		this.errorLog = errorLog;
	}
}
