// Generated by delombok at Fri Jul 14 17:42:49 CEST 2023
package edu.uoc.lti.clientcredentials;

/**
 * @author Created by xaracil@uoc.edu
 */
public class ClientCredentialsRequest {
	private final String kid;
	private final String toolName;
	private final String clientId;
	private final String oauth2Url;

	@java.lang.SuppressWarnings("all")
	public ClientCredentialsRequest(final String kid, final String toolName, final String clientId, final String oauth2Url) {
		this.kid = kid;
		this.toolName = toolName;
		this.clientId = clientId;
		this.oauth2Url = oauth2Url;
	}

	@java.lang.SuppressWarnings("all")
	public String getKid() {
		return this.kid;
	}

	@java.lang.SuppressWarnings("all")
	public String getToolName() {
		return this.toolName;
	}

	@java.lang.SuppressWarnings("all")
	public String getClientId() {
		return this.clientId;
	}

	@java.lang.SuppressWarnings("all")
	public String getOauth2Url() {
		return this.oauth2Url;
	}
}
