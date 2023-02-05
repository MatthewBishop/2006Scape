package org.apollo.net;

import java.math.BigInteger;

/**
 * Holds various network-related constants such as port numbers.
 *
 * @author Graham
 * @author Major
 */
public final class NetworkConstants {

	/**
	 * The number of seconds before a connection becomes idle.
	 */
	public static final int IDLE_TIME = 15;

	/**
	 * The exponent used when decrypting the RSA block.
	 */
	public static BigInteger RSA_EXPONENT;

	/**
	 * The modulus used when decrypting the RSA block.
	 */
	public static BigInteger RSA_MODULUS;

	/**
	 * Sole private constructor to prevent instantiation.
	 */
	private NetworkConstants() {

	}

}