package com.assignment.cabbooking.constants;

public class CabBookingConstant {

	public static boolean IS_POINTING_TO_PROD = false;

	/* OAUTH 2 CREDENTIALS */

	public static String OAUTH_USER_NAME_STAGE = "unifiedstageuser";
	public static String OAUTH_PASSWORD_STAGE = "$2a$10$Fh25wxgmbPok001n4WTEru0UMsk/9OnhlSwY4sq1.r9Qvqj29iz3K";

	public static String OAUTH_USER_NAME_PROD = "unifiedproduser";
	public static String OAUTH_PASSWORD_PROD = "$2a$10$Fh25wxgmbPok001n4WTEru0UMsk/9OnhlSwY4sq1.r9Qvqj29iz3K";

	public static String OAUTH_ROLE = "ADMIN";

	public static final String OAUTH_CLIEN_ID_STAGE = "unified-client-stage";
	public static final String OAUTH_CLIENT_SECRET_STAGE = "55bf0791-dsa4-4bb9-ad8c-7eb1da1801f9";

	public static final String OAUTH_CLIEN_ID_PROD = "unified-client-prod";
	public static final String OAUTH_CLIENT_SECRET_PROD = "55bf0791-dsa4-4bb9-ad8c-7eb1da1801f9";

	public static String getOauthUserName() {
		if (IS_POINTING_TO_PROD) {
			return OAUTH_USER_NAME_PROD;
		} else {
			return OAUTH_USER_NAME_STAGE;
		}
	}

	public static String getOauthPassword() {
		if (IS_POINTING_TO_PROD) {
			return OAUTH_PASSWORD_PROD;
		} else {
			return OAUTH_PASSWORD_STAGE;
		}
	}

	public static String getOauthClientId() {
		if (IS_POINTING_TO_PROD) {
			return OAUTH_CLIEN_ID_PROD;
		} else {
			return OAUTH_CLIEN_ID_STAGE;
		}
	}

	public static String getOauthSecret() {
		if (IS_POINTING_TO_PROD) {
			return OAUTH_CLIENT_SECRET_PROD;
		} else {
			return OAUTH_CLIENT_SECRET_STAGE;
		}
	}

}
