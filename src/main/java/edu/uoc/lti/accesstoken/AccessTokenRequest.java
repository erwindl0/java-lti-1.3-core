// Generated by delombok at Fri Jul 14 17:42:49 CEST 2023
package edu.uoc.lti.accesstoken;

/**
 * @author Created by xaracil@uoc.edu
 */
public class AccessTokenRequest {
	private String grant_type;
	private String client_assertion_type;
	private String scope;
	private String client_assertion;

	@java.lang.SuppressWarnings("all")
	AccessTokenRequest(final String grant_type, final String client_assertion_type, final String scope, final String client_assertion) {
		this.grant_type = grant_type;
		this.client_assertion_type = client_assertion_type;
		this.scope = scope;
		this.client_assertion = client_assertion;
	}


	@java.lang.SuppressWarnings("all")
	public static class AccessTokenRequestBuilder {
		@java.lang.SuppressWarnings("all")
		private String grant_type;
		@java.lang.SuppressWarnings("all")
		private String client_assertion_type;
		@java.lang.SuppressWarnings("all")
		private String scope;
		@java.lang.SuppressWarnings("all")
		private String client_assertion;

		@java.lang.SuppressWarnings("all")
		AccessTokenRequestBuilder() {
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public AccessTokenRequest.AccessTokenRequestBuilder grant_type(final String grant_type) {
			this.grant_type = grant_type;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public AccessTokenRequest.AccessTokenRequestBuilder client_assertion_type(final String client_assertion_type) {
			this.client_assertion_type = client_assertion_type;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public AccessTokenRequest.AccessTokenRequestBuilder scope(final String scope) {
			this.scope = scope;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public AccessTokenRequest.AccessTokenRequestBuilder client_assertion(final String client_assertion) {
			this.client_assertion = client_assertion;
			return this;
		}

		@java.lang.SuppressWarnings("all")
		public AccessTokenRequest build() {
			return new AccessTokenRequest(this.grant_type, this.client_assertion_type, this.scope, this.client_assertion);
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "AccessTokenRequest.AccessTokenRequestBuilder(grant_type=" + this.grant_type + ", client_assertion_type=" + this.client_assertion_type + ", scope=" + this.scope + ", client_assertion=" + this.client_assertion + ")";
		}
	}

	@java.lang.SuppressWarnings("all")
	public static AccessTokenRequest.AccessTokenRequestBuilder builder() {
		return new AccessTokenRequest.AccessTokenRequestBuilder();
	}

	@java.lang.SuppressWarnings("all")
	public String getGrant_type() {
		return this.grant_type;
	}

	@java.lang.SuppressWarnings("all")
	public String getClient_assertion_type() {
		return this.client_assertion_type;
	}

	@java.lang.SuppressWarnings("all")
	public String getScope() {
		return this.scope;
	}

	@java.lang.SuppressWarnings("all")
	public String getClient_assertion() {
		return this.client_assertion;
	}
}
