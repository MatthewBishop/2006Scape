// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)

public final class Class36 {

	public static void method528(int i) {
		aClass36Array635 = new Class36[3000][0];
	}

	public static void method529(int file, byte[] array) {
		try {
			final Stream ay = new Stream(array);
			final Class18 b2 = new Class18(ay);
			final int n = ay.readUnsignedWord();
			;
			aClass36Array635[file] = new Class36[n * 3];
			final int[] ai = new int[500];
			final int[] ai1 = new int[500];
			final int[] ai2 = new int[500];
			final int[] ai3 = new int[500];
			for (int j = 0; j < n; ++j) {
				final int k = ay.readUnsignedWord();
				;
				final Class36[] array6 = aClass36Array635[file];
				final int n2 = k;
				final Class36 q = new Class36();
				array6[n2] = q;
				final Class36 class36 = q;
				q.aClass18_637 = b2;
				final int f = ay.readUnsignedByte();
				int l2 = 0;
				int n3 = -1;
				for (int l = 0; l < f; ++l) {
					final int f2;
					if ((f2 = ay.readUnsignedByte()) > 0) {
						if (b2.anIntArray342[l] != 0) {
							for (int n4 = l - 1; n4 > n3; --n4) {
								if (b2.anIntArray342[n4] == 0) {
									ai[l2] = n4;
									ai1[l2] = 0;
									ai3[l2] = (ai2[l2] = 0);
									++l2;
									break;
								}
							}
						}
						ai[l2] = l;
						int n4 = 0;
						if (b2.anIntArray342[l] == 3) {
							n4 = 128;
						}
						if ((f2 & 0x1) != 0x0) {
							ai1[l2] = ay.readSignedWord2();
						} else {
							ai1[l2] = n4;
						}
						if ((f2 & 0x2) != 0x0) {
							ai2[l2] = ay.readSignedWord2();
						} else {
							ai2[l2] = n4;
						}
						if ((f2 & 0x4) != 0x0) {
							ai3[l2] = ay.readSignedWord2();
						} else {
							ai3[l2] = n4;
						}
						n3 = l;
						++l2;
					}
				}
				class36.anInt638 = l2;
				class36.anIntArray639 = new int[l2];
				class36.anIntArray640 = new int[l2];
				class36.anIntArray641 = new int[l2];
				class36.anIntArray642 = new int[l2];
				for (int k3 = 0; k3 < l2; ++k3) {
					class36.anIntArray639[k3] = ai[k3];
					class36.anIntArray640[k3] = ai1[k3];
					class36.anIntArray641[k3] = ai2[k3];
					class36.anIntArray642[k3] = ai3[k3];
				}
			}
		} catch (Exception ex) {
			System.out.println("Bad anim: " +file);
	//		 ex.printStackTrace();
		}
	}

	public static void nullLoader() {
		aClass36Array635 = null;
	}

	public static Class36 method531(int frame) {
		try {

			int file = frame >> 16;
			int k = frame & 0xffff;

			if (aClass36Array635[file] == null || aClass36Array635[file].length == 0) {
				Game.instance.onDemandFetcher.method558(1, file);
				return null;
			}

			return aClass36Array635[file][k];
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static boolean method532(int i) {
		return i == -1;
	}

	private Class36() {
	}

	private static Class36[][] aClass36Array635;
	public int anInt636;
	public Class18 aClass18_637;
	public int anInt638;
	public int anIntArray639[];
	public int anIntArray640[];
	public int anIntArray641[];
	public int anIntArray642[];
}
